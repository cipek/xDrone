//IMPORTANT!
//y and z axis are swapped in respect to ROS. Y is down and up axis
var scene, renderer, camera, drone;
var cube;
var controls;

function init()
{
    var div = document.getElementById('SIMULATOR');
    //Removing old canvases
    while (div.firstChild) {
      div.removeChild(div.firstChild);
    }
    renderer = new THREE.WebGLRenderer( {antialias:true} );
    var width = div.offsetWidth;
    var height = div.offsetHeight;
    renderer.setSize (width, height);
    var div = document.getElementById('SIMULATOR');
    div.appendChild (renderer.domElement);
    // document.body.appendChild (renderer.domElement);

    scene = new THREE.Scene();

    camera = new THREE.PerspectiveCamera (45, width/height, 0.1, 100);
    camera.position.y = 3;
    camera.position.z = 10;
    camera.position.x = 5;
    camera.lookAt (new THREE.Vector3(0,0,0));

    controls = new THREE.OrbitControls(camera, renderer.domElement);

    var gridXZ = new THREE.GridHelper(20, 20);
    gridXZ.setColors( new THREE.Color(0xff0000), new THREE.Color(0xffffff) );
    scene.add(gridXZ);

    drone = new THREE.Group();
    var dronesize = 0.5;
    scene.add(drone);
    loader = new THREE.LegacyJSONLoader();
    loader.load(baseUrl+'simulator-resources/drone.js', function (geometry, materials) {

      var matt = new THREE.MeshPhongMaterial( { color: new THREE.Color('red'), transparent:true, opacity:1,  side: THREE.DoubleSide } );
      var obj = new THREE.Mesh(geometry, matt);
      geometry.center();
      obj.scale.set(dronesize,dronesize,dronesize);
      obj.rotateY(Math.PI);
      obj.receiveShadow = true;
      obj.castShadow = true;
      drone.add(obj);

     });

     loader = new THREE.LegacyJSONLoader();
    loader.load(baseUrl +'simulator-resources/drone-lights.js', function (geometry, materials) {

      var matt = new THREE.MeshBasicMaterial( { color: new THREE.Color('red'),  transparent:true, opacity:1,  side: THREE.DoubleSide } );
      var obj = new THREE.Mesh(geometry, matt);
      geometry.center();
      obj.scale.set(dronesize,dronesize,dronesize);
      obj.position.y = 0;
      obj.position.x = 0;
      obj.position.z = 0;
      obj.rotateY(Math.PI);
      obj.receiveShadow = true;
      obj.castShadow = true;
      drone.add(obj);

     });

}

function animate()
{
    controls.update();
    requestAnimationFrame ( animate );
		// drone.position.y += 0.01;
		// drone.rotation.y += 0.01;
    if(typeof flySimulation !== 'undefined' && flySimulation)
      flySimulation();
    renderer.render (scene, camera);
}

function flySupporter(axis, currentLocation, endPoint){
  if(endPoint > currentLocation){
    if(drone.position[axis] < endPoint)
      drone.position[axis] += 0.01;
  }
  else{
    if(drone.position[axis] > endPoint)
      drone.position[axis] -= 0.01;
  }
}

function fly(goalPostion){
  var stopped = true;
  if(Math.abs(drone.position.x-goalPostion.x) > 0.02){ //0.2 acceptable movement error
    flySupporter('x', drone.position.x, goalPostion.x);
    stopped = false;
  }
  if(Math.abs(drone.position.y-goalPostion.y) > 0.02){
    flySupporter('y', drone.position.y, goalPostion.y);
    stopped = false;
  }
  if(Math.abs(drone.position.z-goalPostion.z) > 0.02){
    flySupporter('z', drone.position.z, goalPostion.z);
    stopped = false;
  }
  return stopped;
}

function takeoff(){
  return fly('y', 0.7);
}

function land(){
  if(drone.position.y > 0){
    drone.position.y -= 0.01;
    return false;
  }
  else {
    return true;
  }
}

function addCube(sizeX, sizeY, sizeZ, locX, locY, locZ){
  var cubeGeometry = new THREE.BoxGeometry (sizeX, sizeY, sizeZ);
  var cubeMaterial = new THREE.MeshBasicMaterial ({color: 0x1ec876});
  cube = new THREE.Mesh (cubeGeometry, cubeMaterial);

  cube.position.set (locX, locY, locZ);
  scene.add(cube);
}
