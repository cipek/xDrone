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
//var lastX = drone.position.x, lastY = drone.position.y, lastZ = drone.position.z;
commands.push({y: 0.7}); 
//lineGeometry.vertices.push(new THREE.Vector3(lastX, lastY + 0.7, lastZ));
//lastY += 0.7;

//commands.push({w: 2}); 

//commands.push({x: 2}); 
//lineGeometry.vertices.push(new THREE.Vector3(lastX + 2, lastY, lastZ));
//lastX += 2;

commands.push({r: 45 * (Math.PI/180)}); 
commands.push({flyTo: "TABLE"});
commands.push({r: 90 * (Math.PI/180)}); 
commands.push({y: 0}); 
commands.push({z: 0}); 
commands.push({x: 2}); 


//commands.push({r: 90 / 90 * (Math.PI/2)}); 
//commands.push({r: 90}); 
						

//commands.push({y: -0.7}); 
commands.push("LAND");
//lineGeometry.vertices.push(new THREE.Vector3(lastX, lastY - 0.7, lastZ));
//lastY -= 0.7;
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
			|| (currentFunction == "ROTATION" && rotation(goalDroneRotation))
			|| (currentFunction == "FLY_TO_X" && flyTo(destination, 'x'))
			|| (currentFunction == "FLY_TO_Z" && flyTo(destination, 'z'))){
			nextCommand();
		}
	}
}

function nextCommand(){
	if(commands && commands[0]){
		if(commands[0].r !== undefined){
			goalDroneRotation = commands[0].r;
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
			destination = commands[0].x;
			currentFunction = "MOVE_X";
			lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
		}
		else if(commands[0].z !== undefined){
			destination = commands[0].z;
			currentFunction = "MOVE_Z";
			lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
		}
		else if(commands[0] == "LAND"){
			currentFunction = "LAND";
			lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
		}
		else if(commands[0].flyTo !== undefined){
			currentFunction = "MOVE_Y";
			var vector = getDistanceToObject(commands[0].flyTo);
			
			commands.shift();
			destination = vector.y;
			lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
			
			commands.unshift({flytToX: vector.x}); 
			commands.unshift({flytToZ: vector.z}); 
			commands.unshift({y: vector.y}); 
		}
		else if(commands[0].flytToX !== undefined){
			destination = commands[0].flytToX;
			currentFunction = "FLY_TO_X";
			lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
		}
		else if(commands[0].flytToZ !== undefined){
			destination = commands[0].flytToZ;
			currentFunction = "FLY_TO_Z";
			lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
		}
		commands.shift();
	}
	else{
		finishSimulation = true;	
	}
}

