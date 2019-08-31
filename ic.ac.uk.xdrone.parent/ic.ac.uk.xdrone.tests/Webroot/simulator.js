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

