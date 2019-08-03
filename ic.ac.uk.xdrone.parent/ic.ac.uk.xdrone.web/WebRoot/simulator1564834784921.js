var commands = [];
var currentDroneLocation = {x: drone.position.x, y: drone.position.y, z: drone.position.z};
var goalDroneLocation = currentDroneLocation;
commands.push({x: 0, y: 0.7, z: 0}); 
nextLocation();

function flySimulation(){
	if(fly(goalDroneLocation)){
		nextLocation();
	}
}

function nextLocation(){
	if(commands && commands[0]){
		goalDroneLocation.x += commands[0].x;
		goalDroneLocation.y += commands[0].y;
		goalDroneLocation.z += commands[0].z;
		commands.shift();
	}
}

