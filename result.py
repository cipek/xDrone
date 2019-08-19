#! /usr/bin/env python
import sys
sys.path.append('/opt/ros/indigo/lib/python2.7/dist-packages')
import rospy
import math

from std_msgs.msg import Empty
from ardrone_autonomy.msg import Navdata
from geometry_msgs.msg import Twist
PI = 3.1415926535897
DISTANCE_ONE_AND_HALF_SECOND = 85
DISTANCE_TWO_SECONDS = 120
DISTANCE_TWO_AND_HALF_SECONDS = 165

state = -1
dronePosition = {
	'x': 0,
	'y': 0,
	'z': 0
}
currentAngle = 0.0 #Navdata
currentDroneAngle = 0 #Real Life


objects = {}


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

	if position['x'] && position['z']:
		x = math.abs(dronePosition['x'] - obPosition['x'])
		y = math.abs(dronePosition['y'] - obPosition['y'])

		return {
			'x': math.sqrt( x*x + y*y ),
			'z': getDistance(dronePosition['z'], obPosition['z'])
		}
	else:
		return {'x': 0, 'z': 0}


def getDistance(dronePos, obPos):
  if(dronePos > obPos)
    return - math.abs(dronePos - obPos);
  else
    return math.abs(dronePos - obPos);


def getRotationToObject(objectName):
	global objects
	obPosition = {}
	if objects[objectName]:
		obPosition = objects[objectName]

	if position['x'] && position['z']:
		angleToObject = math.atan2(dronePosition['x'] - obPosition['x'], dronePosition['y'] - obPosition['y']) * 180 / math.pi

	    angleToObject = angleTo360(angleToObject)
	    isPositive = true;
	    if currentDroneAngle > angleToObject:
	      isPositive = False

	    angleToObject = math.abs(currentDroneAngle - angleToObject)
	    ifangleToObject > 180:
	      angleToObject = 360 - angleToObject;
	      isPositive = !isPositive;

	    return (isPositive ? angleToObject : -angleToObject)
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
	clockwise = True
	if angle > 0:
		clockwise = False

	vel_msg = Twist()

	angular_speed = speed*PI/360
	relative_angle = angle*PI/360

	vel_msg.linear.x=0
	vel_msg.linear.y=0
	vel_msg.linear.z=0
	vel_msg.angular.x = 0
	vel_msg.angular.y = 0

	if clockwise:
		vel_msg.angular.z = -abs(angular_speed)
	else:
		vel_msg.angular.z = abs(angular_speed)

	while velocity_publisher.get_num_connections() < 1:
		rospy.sleep(0.1)

	while(angleDone < angle-accuracy_modificator):
		if oppositeSigns(lastAngle, currentAngle) and abs(currentAngle > 90):
			angleDone += abs(abs(currentAngle)-180 + (abs(lastAngle)-180))
		else:
			angleDone += abs(currentAngle - lastAngle)

		lastAngle = currentAngle
		velocity_publisher.publish(vel_msg)

	vel_msg.angular.z = 0
	velocity_publisher.publish(vel_msg)


def moveBaseOnTime(distane, x ,y):
	global velocity_publisher

	while velocity_publisher.get_num_connections() < 1:
		rospy.sleep(0.1)

	vel_msg = Twist()
	vel_msg.linear.x=x
	vel_msg.linear.y=y  #y+ is left
	vel_msg.linear.z=0
	vel_msg.angular.x = 0
	vel_msg.angular.y = 0
	vel_msg.angular.z = 0

	tStart = rospy.Time.now().to_sec()
	tEnd = tStart;
  	timeRequired = getTimeFromDistance(distane)

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

takeoff.publish(empty)
moveBaseOnTime(5, 0, 0)

if 2 != 0:
	dronePosition.z += 2
	moveUpAndDown(2)
if -1.5 != 0:
	dronePosition.x += -1.5
	moveBaseOnTime(-1.5, 0.15, 0)
	moveBaseOnTime(1, 0, 0)
if -2.5 != 0:
	dronePosition.y += -2.5
	moveBaseOnTime(-2.5, 0, 0.15)
	moveBaseOnTime(1, 0, 0)
currentDroneAngle += -90
rotate(30, 90);
if 0 != 0:
	dronePosition.z += 0
	moveUpAndDown(0)
if 3 != 0:
	dronePosition.x += 3
	moveBaseOnTime(3, 0.15, 0)
	moveBaseOnTime(1, 0, 0)
if 6 != 0:
	dronePosition.y += 6
	moveBaseOnTime(6, 0, 0.15)
	moveBaseOnTime(1, 0, 0)
currentDroneAngle += --90
rotate(30, -90);

land = rospy.Publisher('/ardrone/land', Empty, queue_size=1)

while land.get_num_connections() < 1:
	rospy.sleep(0.1)

land.publish(empty)
rospy.sleep(3)
