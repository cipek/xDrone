function environment()
{
	log(drone.position)
	drone.position.x = 0;
	drone.position.z = 0;
	drone.position.y = 0;
	log(drone.position)
	addCube(1, 1, 1, 2, 0, 0)
}

