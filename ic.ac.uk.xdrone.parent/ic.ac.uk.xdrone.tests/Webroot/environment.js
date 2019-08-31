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

