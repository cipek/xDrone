//IMPORTANT!
//y and z axis are swapped in respect to ROS. Y is down and up axis
var scene, renderer, camera, drone;
var cube;
var controls;
var execute = true;
var globalDroneRotation = 90, currentDroneRotation = 0;
var coveredXDistance = 0, coveredYDistance = 0, coveredZDistance = 0;
var line;
var raycaster;
var mouse, INTERSECTED;
var radius = 500, theta = 0;
var frustumSize = 1000;

// Axes in the corner
// http://jsfiddle.net/aqnL1mx9/

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
    renderer.setPixelRatio( window.devicePixelRatio );

    var div = document.getElementById('SIMULATOR');
    div.appendChild (renderer.domElement);

    scene = new THREE.Scene();

    camera = new THREE.PerspectiveCamera (45, width/height, 0.1, 100);
    camera.position.y = 3;
    camera.position.z = 10;
    camera.position.x = 5;
    camera.lookAt (new THREE.Vector3(0,0,0));

    controls = new THREE.OrbitControls(camera, renderer.domElement);
    controls.minDistance = 1;
		controls.maxDistance = 100;
		controls.maxPolarAngle = Math.PI / 2;
    controls.target.y = 0;
    controls.update();

    var gridXZ = new THREE.GridHelper(20, 20);
    gridXZ.setColors( new THREE.Color(0xff0000), new THREE.Color(0xffffff) );
    gridXZ.name="GRID";
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

    var axesDrone = new THREE.AxisHelper(1);
    drone.add(axesDrone);

    raycaster = new THREE.Raycaster(); // create once
    mouse = new THREE.Vector2(); // create once
    // projector = new THREE.Projector();
    // when the mouse moves, call the given function
    div.addEventListener('mousemove', onDocumentMouseMove, false);

    createCubeGrid();
}

function onDocumentMouseMove(event) {
  // the following line would stop any other event handler from firing
  // (such as the mouse's TrackballControls)
  event.preventDefault();

  var rect = renderer.domElement.getBoundingClientRect();
  mouse.x = ( ( event.clientX - rect.left ) / rect.width ) * 2 - 1;
  mouse.y = - ( ( event.clientY - rect.top ) / rect.height ) * 2 + 1;
}

function animate()
{
    controls.update();
    requestAnimationFrame ( animate );
    //If simulator.js has been generated, execute 'flySimulation()'
    if(typeof flySimulation !== 'undefined' && flySimulation)
      if(execute)
        flySimulation();

    raycating()
    renderer.render (scene, camera);
}

function flySupporter(currentLocation, endPoint){
  if(endPoint > currentLocation){
    // if(drone.position[axis] < endPoint)
      // drone.position[axis] += 0.01;
    return 0.01;
  }
  else{
    // if(drone.position[axis] > endPoint)
      // drone.position[axis] -= 0.01;
    return -0.01;
  }
}

function fly(goalPostion){
  var stopped = true;
  if(Math.abs(coveredXDistance-goalPostion.x) > 0.04){ //0.02 acceptable movement precision error
    // flySupporter('x', drone.position.x, goalPostion.x);
     // console.log("X1", drone.position.z, goalPostion.x);
     var additionalDistance = flySupporter(coveredXDistance, goalPostion.x);
     coveredXDistance += additionalDistance;
    drone.translateX(additionalDistance);
    // coveredXDistance = +0.01;
     // console.log("X2", drone.position.z, goalPostion.x);
    stopped = false;
  }
  if(Math.abs(coveredYDistance-goalPostion.y) > 0.04){
    // flySupporter('y', drone.position.y, goalPostion.y);
    // console.log(coveredYDistance, goalPostion.y);
    var additionalDistance = flySupporter(coveredYDistance, goalPostion.y);
    coveredYDistance += additionalDistance;
    drone.translateY(additionalDistance);
    stopped = false;
  }
  if(Math.abs(coveredZDistance-goalPostion.z) > 0.04){
    // flySupporter('z', drone.position.z, goalPostion.z);
    var additionalDistance = flySupporter(coveredZDistance, goalPostion.z);
    coveredZDistance += additionalDistance;
    drone.translateZ(additionalDistance);
    stopped = false;
  }
  drawNewLineSegment();
  if(stopped){
    coveredXDistance = 0;
    coveredYDistance = 0;
    coveredZDistance = 0;
  }

  return stopped;
}

function drawNewLineSegment(){
  var vertices = lineGeometry.vertices;
  vertices.pop();
  vertices.push(new THREE.Vector3( drone.position.x, drone.position.y, drone.position.z));

  lineGeometry = new THREE.Geometry();
	lineGeometry.vertices = vertices;

  scene.remove( line );
	line = new THREE.Line( lineGeometry, lineMaterial )
	scene.add( line );
}

function rotation(goalRotation){
  var stopped = true;
  if(Math.abs(drone.rotation.y - goalRotation) > 0.04){
    if(drone.rotation.y > goalRotation){
        drone.rotateY(-0.02);
    }
    else{
        drone.rotateY(0.02);
    }
    stopped = false;
  }
  if(stopped){

  }


  // var stopped = true;
  // if(Math.abs(drone.rotation.y - goalRotation) > 0.04){
  //   if(drone.rotation.y > goalRotation){
  //       drone.rotateY(-0.02);
  //   }
  //   else{
  //       drone.rotateY(0.02);
  //   }
  //   stopped = false;
  // }
  // if(stopped){
  //
  // }


  // if(Math.abs(currentDroneRotation - goalRotation) > 1){
  //   console.log(currentDroneRotation, goalRotation)
  //   if(currentDroneRotation < goalRotation){
  //       currentDroneRotation += 1;
  //       globalDroneRotation += 1;
  //       drone.lookAt(getPointOnCircleX(globalDroneRotation), drone.position.y, getPointOnCircleZ(globalDroneRotation));
  //   }
  //   else{
  //       currentDroneRotation -= 1;
  //       globalDroneRotation -= 1;
  //       drone.lookAt(getPointOnCircleX(globalDroneRotation), drone.position.y, getPointOnCircleZ(globalDroneRotation));
  //   }
  //   stopped = false;
  // }
  // if(stopped)
  //   currentDroneRotation = 0;

  return stopped;
}

// function getPointOnCircleX(angle){
//   return Math.cos(angle /180 * Math.PI) + drone.position.x;
// }
//
// function getPointOnCircleZ(angle){
//   return Math.sin(angle /180 * Math.PI) + drone.position.z;
// }
// var rotObjectMatrix;
// function rotateAroundObjectAxis(object, axis, radians) {
//     rotObjectMatrix = new THREE.Matrix4();
//     rotObjectMatrix.makeRotationAxis(new THREE.Vector3(0,1,0).normalize(), radians);
//
//     // old code for Three.JS pre r54:
//     // object.matrix.multiplySelf(rotObjectMatrix);      // post-multiply
//     // new code for Three.JS r55+:
//     object.matrix.multiply(rotObjectMatrix);
//
//     // old code for Three.js pre r49:
//     // object.rotation.getRotationFromMatrix(object.matrix, object.scale);
//     // old code for Three.js r50-r58:
//     // object.rotation.setEulerFromRotationMatrix(object.matrix);
//     // new code for Three.js r59+:
//     object.rotation.setFromRotationMatrix(object.matrix);
//     return true;
// }

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

function raycating() {
	// find intersections
	raycaster.setFromCamera( mouse, camera );
	var intersects = raycaster.intersectObjects( scene.children );
  if ( intersects.length > 0 ) {
    let pos = -1;
    do{
      pos++;
    }while(pos < intersects.length
      && intersects[pos].object.name != "POINT_ON_GRID")
    if(intersects[ pos ])
		// if ( intersects[ 0 ].object.name == "POINT_ON_GRID" && INTERSECTED != intersects[ 0 ].object ) {
    if(pos > -1 && pos < intersects.length){ // && INTERSECTED != intersects[ pos ].object ){
      console.log("IN1");
      if ( INTERSECTED ) INTERSECTED.material.color.setHex( INTERSECTED.currentHex );
			INTERSECTED = intersects[ pos ].object;
			INTERSECTED.currentHex = INTERSECTED.material.color.getHex();
			INTERSECTED.material.color.setHex( 0xff0000 );
		}
    else {
      console.log("IN2");

  		if ( INTERSECTED ) INTERSECTED.material.color.setHex( INTERSECTED.currentHex );
  		INTERSECTED = null;
  	}
	} else {      console.log("IN3");

		if ( INTERSECTED ) INTERSECTED.material.color.setHex( INTERSECTED.currentHex );
		INTERSECTED = null;
	}
	renderer.render( scene, camera );
}

//Creates points for showing position on the grid
function createCubeGrid(){
  for (var i = -10; i < 10; i++) {
    for (var j = -10; j < 10; j++) {
      var geometry = new THREE.SphereGeometry(0.2, 32, 32 );
      // var material = new THREE.MeshPhongMaterial({
      //   color: 'red',
      //   opacity: 0.5,
      //   transparent: false,
      // });
      var material = new THREE.MeshBasicMaterial ({color: 0x1ec876});

      var sphere = new THREE.Mesh (geometry, material);
      sphere.name = 'POINT_ON_GRID';
      sphere.position.set (i, 0.1, j);
      scene.add(sphere);
    }
  }
}
