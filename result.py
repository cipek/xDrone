#! /usr/bin/env python
import sys
sys.path.append('/opt/ros/indigo/lib/python2.7/dist-packages')
import rospy
import math  

from std_msgs.msg import Empty
from ardrone_autonomy.msg import Navdata	
from geometry_msgs.msg import Twist	
PI = 3.1415926535897
#Constants
ACCEPTED_DISTANCE_ERROR = 20
ACCEPTED_ALTITUDE_ERROR = 50
DISTANCE_ONE_AND_HALF_SECOND = 0.85
DISTANCE_TWO_SECONDS = 1.20
DISTANCE_TWO_AND_HALF_SECONDS = 1.65

state = -1
dronePosition = {
	'x': 0,
	'y': 0,
	'z': 0
}
currentAngle = 0.0 #Navdata
currentDroneAngle = 270.0 #Real Life


objects = {}

objects['TABLE1'] = {
	'x': -1,
	'y': 5,
	'z': 0.84 + 1.68/2
}
objects['TABLE2'] = {
	'x': 2.5,
	'y': 2,
	'z': 0.738 + 1.476/2
}
objects['TABLE3'] = {
	'x': 2,
	'y': 5,
	'z': 0.5 + 1/2
}
objects['PLANT'] = {
	'x': -1.5,
	'y': -3.5,
	'z': 1 + 2/2
}

#RotY:		RotX:
#+ forward 	+ right
#- backwards	- left
def ReceiveNavdata(data):
	global state
	global currentAngle
	global currentAltitude
	
	currentAngle = data.rotZ
	state = data.state
	currentAltitude = data.altd


def getTimeFromDistance(distance):
	global DISTANCE_ONE_AND_HALF_SECOND
	global DISTANCE_TWO_SECONDS
	global DISTANCE_TWO_AND_HALF_SECONDS
	if distance <= DISTANCE_ONE_AND_HALF_SECOND:
		return 1.5 * distance /DISTANCE_ONE_AND_HALF_SECOND
	elif distance <= DISTANCE_TWO_SECONDS:
		return 1.5 + ((distance- DISTANCE_ONE_AND_HALF_SECOND) * 0.5 / (DISTANCE_TWO_SECONDS-DISTANCE_ONE_AND_HALF_SECOND))
	else:
		return 2 + ((distance- DISTANCE_TWO_SECONDS) * 0.5 / (DISTANCE_TWO_AND_HALF_SECONDS-DISTANCE_TWO_SECONDS))
		
def getDistanceToObject(objectName):
	global objects
	obPosition = {}
	if objects[objectName]:
		obPosition = objects[objectName]
	
	if 'x' in obPosition and 'z' in obPosition:
		x = abs(dronePosition['x'] - obPosition['x'])
		y = abs(dronePosition['y'] - obPosition['y'])
		
		return {
			'x': math.sqrt( x*x + y*y ),
			'z': getDistance(dronePosition['z'], obPosition['z'])
		}
	else:
		return {'x': 0, 'z': 0}
		
		
def getDistance(dronePos, obPos):
  if dronePos > obPos:
    return - abs(dronePos - obPos);
  else:
    return abs(dronePos - obPos);


def getRotationToObject(objectName):
	global objects
	obPosition = {}
	if objects[objectName]:
		obPosition = objects[objectName]
		
	if 'x' in obPosition and 'z' in obPosition:
		angleToObject = math.atan2(dronePosition['x'] - obPosition['x'], dronePosition['y'] - obPosition['y']) * 180 / math.pi
		
		angleToObject = angleTo360(angleToObject)
		isPositive = True;
		if currentDroneAngle > angleToObject:
			isPositive = False
			
		angleToObject = abs(currentDroneAngle - angleToObject)
		
		if angleToObject > 180:
			angleToObject = 360 - angleToObject;
			isPositive = not isPositive;
		
		return angleToObject if isPositive else -angleToObject
	else:
		return 0

def angleTo360(angle):
  while angle < 0:
    angle = 360 + angle
  return angle


def checkAngle(angle):
  angle = angle%360
  while angle < 0:
    angle = 360 + angle;
  return angle

	
def oppositeSigns(x, y): 
	return (x < 0) if (y >= 0) else (y < 0)

def rotate(speed, angle):
	global currentAngle
	lastAngle = currentAngle
	angleDone = 0.0
	accuracy_modificator = 5
	
	vel_msg = Twist()

	angular_speed = speed*PI/360

	clockwise = False
	if angle < 0:
		clockwise = True

	vel_msg.linear.x=0
	vel_msg.linear.y=0
	vel_msg.linear.z=0
	vel_msg.angular.x = 0
	vel_msg.angular.y = 0

	if clockwise:
		vel_msg.angular.z = -angular_speed
	else:
		vel_msg.angular.z = angular_speed*2 #For some reason rotates slower to left

	while velocity_publisher.get_num_connections() < 1:
		rospy.sleep(0.1)

	while(angleDone < abs(angle)-accuracy_modificator):
		if oppositeSigns(lastAngle, currentAngle) and abs(currentAngle > 90):
			angleDone += abs(abs(currentAngle)-180 + (abs(lastAngle)-180))
			
		else:
			angleDone += abs(currentAngle - lastAngle)

		lastAngle = currentAngle	
		velocity_publisher.publish(vel_msg)


	vel_msg.angular.z = 0
	velocity_publisher.publish(vel_msg)


def moveBaseOnTime(distance, x ,y):
	global velocity_publisher

	while velocity_publisher.get_num_connections() < 1:
		rospy.sleep(0.1)

	vel_msg = Twist()
	vel_msg.linear.x= x if distance > 0 else -x
	vel_msg.linear.y= y if distance > 0 else -y  #y+ is left
	vel_msg.linear.z=0
	vel_msg.angular.x = 0
	vel_msg.angular.y = 0
	vel_msg.angular.z = 0
	
	tStart = rospy.Time.now().to_sec()
	tEnd = tStart;
  	timeRequired = getTimeFromDistance(abs(distance))
  
	while(tEnd-tStart) < timeRequired:
		velocity_publisher.publish(vel_msg)
		tEnd = rospy.Time.now().to_sec()	

	vel_msg.linear.x=0
	vel_msg.linear.y=0
	velocity_publisher.publish(vel_msg)
		
def moveUpAndDown(distance):
	global zLocation
	global velocity_publisher

	vel_msg = Twist()
	vel_msg.linear.x=0
	vel_msg.linear.y=0
	vel_msg.angular.x = 0
	vel_msg.angular.y = 0
	vel_msg.angular.z = 0
	goalDistance = currentAltitude + (distance*1000)
	
	while abs(abs(currentAltitude) - abs(goalDistance)) > ACCEPTED_ALTITUDE_ERROR:
		if(goalDistance > currentAltitude):
			vel_msg.linear.z=0.15
		else:
			vel_msg.linear.z=-0.15
		print(currentAltitude, goalDistance)
		velocity_publisher.publish(vel_msg)

	vel_msg.linear.z=0
	velocity_publisher.publish(vel_msg)
	
def noMove(timeRequired):
	global velocity_publisher

	while velocity_publisher.get_num_connections() < 1:
		rospy.sleep(0.1)

	vel_msg = Twist()
	vel_msg.linear.x=0
	vel_msg.linear.y=0
	vel_msg.linear.z=0
	vel_msg.angular.x = 0
	vel_msg.angular.y = 0
	vel_msg.angular.z = 0
	
	tStart = rospy.Time.now().to_sec()
	tEnd = tStart;

	while(tEnd-tStart) < timeRequired:
		velocity_publisher.publish(vel_msg)
		tEnd = rospy.Time.now().to_sec()
		
#Main
rospy.init_node('test_node')
empty = Empty()
rospy.Subscriber('/ardrone/navdata', Navdata, ReceiveNavdata)
velocity_publisher = rospy.Publisher('/cmd_vel', Twist, queue_size=1)

while state == -1:
	rospy.sleep(0.1)

if state == 0:
	reset = rospy.Publisher('/ardrone/reset', Empty, queue_size=1)
	while reset.get_num_connections() < 1:
		rospy.sleep(0.1)
	reset.publish(empty)

while state == 0:
	rospy.sleep(0.1)

takeoff = rospy.Publisher('/ardrone/takeoff', Empty, queue_size=1)

while takeoff.get_num_connections() < 1:
	rospy.sleep(0.1)

dronePosition['z'] += 0.7
takeoff.publish(empty)
noMove(5)

dronePosition['z'] += 2.5
moveUpAndDown(2.5)
dronePosition['x'] += -1.5
moveBaseOnTime(-1.5, 0.15, 0)
noMove(1)
dronePosition['y']  += -3.5
moveBaseOnTime(-3.5, 0, 0.15)
noMove(1)
vector = getDistanceToObject("TABLE1");
angle = getRotationToObject("TABLE1");
currentDroneAngle += angle
rotate(30, angle);
dronePosition['z'] += vector['z']
moveUpAndDown(vector['z'])
dronePosition['x'] += vector['x']
moveBaseOnTime(vector['x'], 0.15, 0)
noMove(1)

land = rospy.Publisher('/ardrone/land', Empty, queue_size=1)
			
while land.get_num_connections() < 1:
	rospy.sleep(0.1)

land.publish(empty)
rospy.sleep(3)

