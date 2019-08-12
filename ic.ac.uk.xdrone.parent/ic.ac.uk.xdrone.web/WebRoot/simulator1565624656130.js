var commands = [];
var currentDroneLocation = {x: drone.position.x, y: drone.position.y, z: drone.position.z};
var goalDroneLocation = currentDroneLocation;
var goalDroneRotation = drone.rotation.y;
var currentFunction = "";
var finishSimulation = false;

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

commands.push({r: 90 / 90 * (Math.PI/2)}); 
commands.push({y: 0}); 
commands.push({z: 1}); 
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
		if((currentFunction == "MOVE_Y" && fly(goalDroneLocation.y, 'y'))
			|| (currentFunction == "MOVE_X" && fly(goalDroneLocation.x, 'x'))
			|| (currentFunction == "MOVE_Z" && fly(goalDroneLocation.z, 'z'))
			|| (currentFunction == "LAND" && land())
			|| (currentFunction == "ROTATION" && rotation(goalDroneRotation))){
			nextCommand();
		}
	}
}

function nextCommand(){
	if(commands && commands[0]){
		if(commands[0].r){
			goalDroneRotation += commands[0].r;
			currentFunction = "ROTATION";
		}
		else if(commands[0].w){
			execute = false;
			setTimeout(function () {
				execute = true;
			    }, (commands[0].w * 1000));
		}
		else if(commands[0].y){
			goalDroneLocation.y = commands[0].y;
			currentFunction = "MOVE_Y";
			lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
		}
		else if(commands[0].x){
			goalDroneLocation.x = commands[0].x;
			currentFunction = "MOVE_X";
			lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
		}
		else if(commands[0].z){
			goalDroneLocation.z = commands[0].z;
			currentFunction = "MOVE_Z";
			lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
		}
		else if(commands[0] == "LAND"){
			currentFunction = "LAND";
			lineGeometry.vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z))
		}
		commands.shift();
	}
	else{
		finishSimulation = true;	
	}
}

