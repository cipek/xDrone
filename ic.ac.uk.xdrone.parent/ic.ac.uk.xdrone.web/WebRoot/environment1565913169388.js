function environment()
{
	//resets drone location
	drone.position.x = 0;
	drone.position.z = 0;
	drone.position.y = 0 + modelHeight;
	addCube("TABLE",1, 1, 1, 
		-1, 1, -1,
	)
}

