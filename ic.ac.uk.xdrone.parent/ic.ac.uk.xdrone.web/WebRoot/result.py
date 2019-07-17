#! /usr/bin/env python
import sys
sys.path.append('/opt/ros/indigo/lib/python2.7/dist-packages')
import rospy

from std_msgs.msg import Empty
from ardrone_autonomy.msg import Navdata	
from geometry_msgs.msg import Twist	
PI = 3.1415926535897

state = -1;

def ReceiveNavdata(data):
	global state
	state = data.state
	
	def rotate(speed, angle, clockwise):
		vel_msg = Twist()
		velocity_publisher = rospy.Publisher('/cmd_vel', Twist, queue_size=1)
	
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
	
		t0 = rospy.Time.now().to_sec()
		current_angle = 0
	
		while velocity_publisher.get_num_connections() < 1:
			rospy.sleep(0.1)
	
		while(current_angle < relative_angle):
			velocity_publisher.publish(vel_msg)
			t1 = rospy.Time.now().to_sec()
			current_angle = angular_speed*(t1-t0)
	
		vel_msg.angular.z = 0
		velocity_publisher.publish(vel_msg)
	
	
	#direction (true)- forward, left, up
	def move(speed, distance, direction, axis): 
		vel_msg = Twist()
		velocity_publisher = rospy.Publisher('/cmd_vel', Twist, queue_size=1)
	
		vel_msg.linear.x=0
		vel_msg.linear.y=0
		vel_msg.linear.z=0
		vel_msg.angular.x = 0
		vel_msg.angular.y = 0
		vel_msg.angular.z = 0
	
		if axis == "x":
			if direction:
				vel_msg.linear.x = abs(speed)
			else:
				vel_msg.linear.x = -abs(speed)
		elif axis == "y":
			if direction:
				vel_msg.linear.y = abs(speed)
			else:
				vel_msg.linear.y = -abs(speed)
		elif axis == "z":
			if direction:
				vel_msg.linear.z = abs(speed)
			else:
				vel_msg.linear.z = -abs(speed)
	
	
		while velocity_publisher.get_num_connections() < 1:
			rospy.sleep(0.1)
	
		t0 = rospy.Time.now().to_sec()
		current_distance = 0
	
		while(current_distance < distance):
			velocity_publisher.publish(vel_msg)
			t1 = rospy.Time.now().to_sec()
			current_distance = speed*(t1-t0)
	
		vel_msg.linear.x=0
		vel_msg.linear.y=0
		vel_msg.linear.z=0
		velocity_publisher.publish(vel_msg)
		

rospy.init_node('test_node')
empty = Empty()
rospy.Subscriber('/ardrone/navdata', Navdata, ReceiveNavdata)

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
rospy.sleep(5)


land = rospy.Publisher('/ardrone/land', Empty, queue_size=1)
			
while land.get_num_connections() < 1:
	rospy.sleep(0.1)

land.publish(empty)

