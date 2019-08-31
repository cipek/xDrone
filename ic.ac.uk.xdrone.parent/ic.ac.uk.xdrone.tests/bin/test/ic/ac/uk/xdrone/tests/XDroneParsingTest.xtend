/*
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.tests

import com.google.inject.Inject
import ic.ac.uk.xdrone.xDrone.Program
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.xbase.testing.CompilationTestHelper

@ExtendWith(InjectionExtension)
@InjectWith(XDroneInjectorProvider)
class XDroneParsingTest {
	@Inject
	ParseHelper<Program> parseHelper
	@Inject extension CompilationTestHelper
	
	@Test
	def void GOTO() {
		val result = parseHelper.parse('''
			
			fly(){
			    TAKEOFF()
			    GOTO("table")
			    LAND()
			}
			
			
			environment(){
			
			    DRONE={
			        position=(1,0,1)
			        rotation=45
			    }
			
			    WALLS = {
			        front=2
			        back=2
			        left=3
			        right=3
			        up=3
			    }
			    
			    cupboard = {
			        origin=(2.5,0.5,1.5)
			        size=(1,1,1)
			        color="brown"
			    }
			    
			    plant = {
			        origin=(2.5,1,-1.5)
			        size=(1,2,1)
			        color="green"
			    }
			    
			    table = {
			        origin=(-2,0.5,0)
			        size=(1,1,2)
			        color="blue"
			    }
			    
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
	
	@Test
	def void moveCommands() {
		val result = parseHelper.parse('''
			
			fly(){
			    TAKEOFF()
			    UP(1)
			    DOWN(1)
			    LEFT(1)
			    RIGHT(1)
			    FORWARD(1)
			    BACKWARD(1)
			    ROTATELEFT(90)
			    ROTATERIGHT(90)
			    WAIT(1)
			    LAND()
			}
			
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
	
	
	@Test
	def void noFly() {
		val result = parseHelper.parse('''
			
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(!errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
	
	
	@Test
	def void noTakeoff() {
		val result = parseHelper.parse('''
			fly(){
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(!errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
	
	
	@Test
	def void noLand() {
		val result = parseHelper.parse('''
		fly(){
		    TAKEOFF()
		}
			
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(!errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
	
	
	@Test
	def void diffrentObjects() {
		val result = parseHelper.parse('''
		fly(){
		    TAKEOFF()
		    LAND()
		}
		
		environment(){
					
		    DRONE={
		    }
		
		    WALLS = {
		    }
		    cupboard = {
		        origin=(2.5,0.5,1.5)
		        size=(1,1,1)
		    }
		    
		    plant = {
		    }	    
		    
		}
			
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
	
	//Failing if JS files' names in generator contain "time' variable
	@Test
		def void testGeneratedCode() {
		'''
		fly(){
		    TAKEOFF()
		    GOTO("table")
		    UP(1)
		    DOWN(1)
		    LEFT(1)
		    RIGHT(1)
		    FORWARD(1)
		    BACKWARD(1)
		    ROTATELEFT(90)
		    ROTATERIGHT(90)
		    WAIT(1)
		    LAND()
		}
		
		
		environment(){
		
		    DRONE={
		        position=(1,0,1)
		        rotation=45
		    }
		
		    WALLS = {
		        front=2
		        back=2
		        left=3
		        right=3
		        up=3
		    }
		    
		    cupboard = {
		        origin=(2.5,0.5,1.5)
		        size=(1,1,1)
		        color="brown"
		    }
		    
		    plant = {
		        origin=(2.5,1,-1.5)
		        size=(1,2,1)
		        color="green"
		    }
		    
		    table = {
		        origin=(-2,0.5,0)
		        size=(1,1,2)
		        color="blue"
		    }
		    
		}
		'''.assertCompilesTo(
			'''
			MULTIPLE FILES WERE GENERATED
			
			File 1 : /myProject/./src-gen//xdrone/result.py
			
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
			ACCEPTED_DISTANCE_ERROR = 20 # 20 cm
			ACCEPTED_ALTITUDE_ERROR = 50 # 5 cm
			ACCEPTED_ROTATION_ERROR = 10 # 10 degrees
			DISTANCE_ONE_AND_HALF_SECOND = 1.25
			DISTANCE_TWO_SECONDS = 2.20
			#DISTANCE_TWO_AND_HALF_SECONDS = 1.65
			
			state = -1
			dronePosition = {
				'x': 0,
				'y': 0,
				'z': 0
			}
			currentAngle = 0.0 #Navdata
			currentDroneAngle = 270.0 #Real Life
			
			dronePosition.x = 1
			dronePosition.z = 0
			dronePosition.y = 1
			currentDroneAngle += 45
			
			objects = {}
			
			objects['cupboard'] = {
				'x': 1.5,
				'y': 2.5,
				'z': 0.5 + 1/2
			}
			objects['plant'] = {
				'x': -1.5,
				'y': 2.5,
				'z': 1 + 2/2
			}
			objects['table'] = {
				'x': 0,
				'y': -2,
				'z': 0.5 + 1/2
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
				#else:
				#	return 2 + ((distance- DISTANCE_TWO_SECONDS) * 0.5 / (DISTANCE_TWO_AND_HALF_SECONDS-DISTANCE_TWO_SECONDS))
					
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
				global ACCEPTED_ROTATION_ERROR
				lastAngle = currentAngle
				angleDone = 0.0
				
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
			
				while(angleDone < abs(angle)-ACCEPTED_ROTATION_ERROR):
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
			
			vector = getDistanceToObject("table");
			angle = getRotationToObject("table");
			currentDroneAngle += angle
			rotate(30, angle);
			dronePosition['z'] += vector['z']
			moveUpAndDown(vector['z'])
			dronePosition['x'] += vector['x']
			moveBaseOnTime(vector['x'], 0.15, 0)
			noMove(1.5)
			dronePosition['z'] += 1
			moveUpAndDown(1)
			dronePosition['z'] += -1
			moveUpAndDown(-1)
			dronePosition['y']  += 1
			moveBaseOnTime(1, 0, 0.15)
			noMove(1.5)
			dronePosition['y']  += -1
			moveBaseOnTime(-1, 0, 0.15)
			noMove(1.5)
			dronePosition['x'] += 1
			moveBaseOnTime(1, 0.15, 0)
			noMove(1.5)
			dronePosition['x'] += -1
			moveBaseOnTime(-1, 0.15, 0)
			noMove(1.5)
			currentDroneAngle += -90
			rotate(90, -90);
			currentDroneAngle += 90
			rotate(90, 90);
			moveBaseOnTime(1, 0, 0)
			
			land = rospy.Publisher('/ardrone/land', Empty, queue_size=1)
						
			while land.get_num_connections() < 1:
				rospy.sleep(0.1)
			
			land.publish(empty)
			rospy.sleep(3)
			
			File 2 : /myProject/./src-gen/Webroot/environment.js
			
			function environment()
			{
				//resets drone location
				drone.position.x = 0;
				drone.position.z = 0;
				drone.position.y = 0 + modelHeight;
				drone.position.x = 1
				drone.position.z = 1
				drone.position.y = 0 + modelHeight
				currentDroneAngle += 45;
				drone.rotateY(45  * (Math.PI/180));
				drawWalls(2, 3, 2, 3,  3)
				addCube("cupboard",1, 1, 1, 
					2.5, 0.5, 1.5,
				"brown"
				)
				addCube("plant",1, 2, 1, 
					2.5, 1, -1.5,
				"green"
				)
				addCube("table",1, 1, 2, 
					-2, 0.5, 0,
				"blue"
				)
			}
			
			File 3 : /myProject/./src-gen/Webroot/simulator.js
			
			var ANGLE_MARIGIN = 0.4;
			var MOVE_MARIGIN = 1.25;
			var MOVE_MARIGIN_ADD = 0.6;
			var MOVE_MARIGIN_NEXT = 0.95;
			var MOVE_MARIGIN_NEXT_ADD = 0.1;
			
			
			var commands = [];
			var currentDroneLocation = {x: drone.position.x, y: drone.position.y, z: drone.position.z};
			//var goalDroneLocation = currentDroneLocation;
			var goalDroneRotation = drone.rotation.y;
			var currentFunction = "";
			var finishSimulation = false;
			var destination = 0;
			
			//Drone's path
			var lineMaterial = new THREE.LineBasicMaterial({color: 0x1ACF10});
			var lineGeometry = new THREE.Geometry();
			lineGeometry.vertices.push(
				new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z)
			);
			commands.push("TAKEOFF");
			
			commands.push({flyTo: "table"});
			commands.push({y: 1}); 
			commands.push({y: -1}); 
			commands.push({x: 1});
			commands.push({x: -1});
			commands.push({z: 1});
			commands.push({z: -1});
			commands.push({r: 90}); 
			commands.push({r: -90}); 
			commands.push({w: 1});
			
			commands.push("LAND");
			nextCommand();
			
			if(line)
				scene.remove( line );
			line = new THREE.Line( lineGeometry, lineMaterial );
			
			scene.add( line );
			function flySimulation(){
				if(!finishSimulation){
					if((currentFunction == "MOVE_Y" && fly(destination, 'y'))
						|| (currentFunction == "MOVE_X" && fly(destination, 'x'))
						|| (currentFunction == "MOVE_Z" && fly(destination, 'z'))
						|| (currentFunction == "LAND" && land())
						|| (currentFunction == "ROTATION" && rotation(goalDroneRotation))){
						nextCommand();
					}
				}
			}
			
			function nextCommand(){
				if(commands && commands[0]){
					if(commands[0].r !== undefined){
						changeDroneCollisionBox(getDistanceErrorFromAngle(commands[0].r),0,getDistanceErrorFromAngle(commands[0].r))
						goalDroneRotation = commands[0].r * (Math.PI/180);
						currentFunction = "ROTATION";
					}
					else if(commands[0].w !== undefined){
						execute = false;
						setTimeout(function () {
							execute = true;
						    }, (commands[0].w * 1000));
					}
					else if(commands[0].y !== undefined){
						destination = commands[0].y;
						currentFunction = "MOVE_Y";
						lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
					}
					else if(commands[0].x !== undefined){
						changeDroneCollisionBox(getDistanceErrorFromDistance(Math.abs(commands[0].x)),0,0)
						destination = commands[0].x;
						currentFunction = "MOVE_X";
						lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
					}
					else if(commands[0].z !== undefined){
						changeDroneCollisionBox(0, 0, getDistanceErrorFromDistance(Math.abs(commands[0].z)))
						destination = commands[0].z;
						currentFunction = "MOVE_Z";
						lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
					}
					else if(commands[0] == "TAKEOFF"){
						//changeDroneCollisionBox(0.25,0,0.25)
						destination = 0.7;
						currentFunction = "MOVE_Y";
						lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
					}
					else if(commands[0] == "LAND"){
						//changeDroneCollisionBox(0.25,0,0.25)
						currentFunction = "LAND";
						lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
					}
					else if(commands[0].flyTo !== undefined){
						var vector = getDistanceToObject(commands[0].flyTo);
						var angle = getRotationToObject(commands[0].flyTo);
											
						var commandSet = "";
						
						if(angle > 0)
							commandSet += "ROTATELEFT(" + Math.round( Math.abs(angle) * 10) / 10 + ")\n";
						else if(angle < 0)
							commandSet += "ROTATERIGHT(" + Math.round( Math.abs(angle) * 10) / 10 + ")\n";
						if(vector.y > 0)
							commandSet += "UP(" + Math.round( Math.abs(vector.y) * 10) / 10 + ")\n";
						else if(vector.y < 0)
							commandSet += "DOWN(" + Math.round( Math.abs(vector.y) * 10) / 10 + ")\n";
						if(vector.z > 0)
							commandSet += "FORWARD(" + Math.round( vector.z * 10) / 10 + ")\n";
											
						listGoTo.push({object_name: commands[0].flyTo, 
						commands: commandSet});
						console.log(listGoTo)
						lastFirstNumber = "-1"; //Force refresh
							
						commands.shift();
						
						changeDroneCollisionBox(getDistanceErrorFromAngle(angle),0,getDistanceErrorFromAngle(angle))
						
						goalDroneRotation = angle * (Math.PI/180);
						currentFunction = "ROTATION";
						commands.unshift({z: vector.z}); 
						commands.unshift({y: vector.y}); 
						commands.unshift({r: angle});
					}
					commands.shift();
				}
				else{
					finishSimulation = true;
				}
			}
			
			function getDistanceErrorFromAngle(angle){
				return 1.2 * Math.abs(angle) /90
			}
					var MOVE_MARIGIN = 1.25;
					var MOVE_MARIGIN_ADD = 0.6;
					var MOVE_MARIGIN_NEXT = 0.95;
					var MOVE_MARIGIN_NEXT_ADD = 0.1;
			
			function getDistanceErrorFromDistance(distance){
				if(distance < MOVE_MARIGIN)
					return MOVE_MARIGIN_ADD;
				else
					return MOVE_MARIGIN_ADD + (((distance-MOVE_MARIGIN) * MOVE_MARIGIN_NEXT_ADD) / MOVE_MARIGIN_NEXT)
			}
			
			'''
		)
		
	}
	
	
}
