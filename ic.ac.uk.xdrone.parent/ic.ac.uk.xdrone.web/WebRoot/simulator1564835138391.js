var commands = [];
var currentDroneLocation = {x: drone.position.x, y: drone.position.y, z: drone.position.z};
var goalDroneLocation = currentDroneLocation;
commands.push({x: 0, y: 0.7, z: 0}); 
commands.push({x: 0, y: -0.7, z: 0}); 
console.log(currentDroneLocation, goalDroneLocation, commands);
nextLocation();
console.log(currentDroneLocation, goalDroneLocation, commands);
function flySimulation(){
	if(fly(goalDroneLocation)){
		nextLocation();
		console.log(currentDroneLocation, goalDroneLocation, commands);
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

