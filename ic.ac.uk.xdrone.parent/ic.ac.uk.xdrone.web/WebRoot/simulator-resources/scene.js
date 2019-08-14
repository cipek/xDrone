//IMPORTANT!
//y and z axis are swapped in respect to ROS. Y is down and up axis
var scene, renderer, camera, drone, simulator;
var cube;
var controls;
var execute = true;
var globalDroneRotation = 90, currentDroneRotation = 0;
var coveredXDistance = 0, coveredYDistance = 0, coveredZDistance = 0;
var coveredDistance = 0;
var line;
var raycaster;
var mouse, INTERSECTED;
var radius = 500, theta = 0;
var frustumSize = 1000;
var labelPoistion, centerLabel, labelObjects = [], labelAxes = [];
var CANVAS_WIDTH = 130, CANVAS_HEIGHT = 100, CAM_DISTANCE = 15;
var axesContainer, camera2, scene2, renderer2, axes2;

// Axes in the corner
// http://jsfiddle.net/aqnL1mx9/

function init()
{
    var simulatorContainer = document.getElementById('SIMULATOR_CONTAINER');
    simulator = document.getElementById('SIMULATOR');
    //Removing old canvases
    while (simulator.firstChild) {
      simulator.removeChild(simulator.firstChild);
    }
    renderer = new THREE.WebGLRenderer( {antialias:true} );
    var width = simulatorContainer.offsetWidth;
    var height = simulatorContainer.offsetHeight;
    renderer.setSize (width, height);
    renderer.setPixelRatio( window.devicePixelRatio );

    simulator.appendChild (renderer.domElement);

    scene = new THREE.Scene();

    camera = new THREE.PerspectiveCamera (45, width/height, 0.1, 600);
    camera.position.y = 3;
    camera.position.z = 10;
    camera.position.x = 5;
    camera.lookAt (new THREE.Vector3(0,0,0));

    controls = new THREE.OrbitControls(camera, renderer.domElement);
    controls.minDistance = 1;
		controls.maxDistance = 600;
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
      var matt = new THREE.MeshBasicMaterial( { color: new THREE.Color('black'), transparent:true, opacity:1,  side: THREE.DoubleSide } );
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

    raycaster = new THREE.Raycaster();
    mouse = new THREE.Vector2();
    // when the mouse moves, call the given function
    simulator.addEventListener('mousemove', onDocumentMouseMove, false);

    createPointsOnGrid();
    centerLabel = addText(0, 0.7, 0, "(0,0,0)");
    scene.add( centerLabel );

    // drawSphere();
    axesSystem();
}

function axesSystem(){
  // dom
  axesContainer = document.getElementById('AXES_SYSTEM');
  while (axesContainer.firstChild) {
    axesContainer.removeChild(axesContainer.firstChild);
  }
  // renderer
  renderer2 = new THREE.WebGLRenderer();
  renderer2.setClearColor( 0xf0f0f0, 1 );
  renderer2.setSize( CANVAS_WIDTH, CANVAS_HEIGHT );
  axesContainer.appendChild( renderer2.domElement );

  // scene
  scene2 = new THREE.Scene();

  camera2 = new THREE.PerspectiveCamera( 45, CANVAS_WIDTH / CANVAS_HEIGHT, 0.1, 600 );
  camera2.up = camera.up; // important!

  // axes
  axes2 = new THREE.AxisHelper( 5 );
  scene2.add( axes2 );

  labelAxis(4, 0.5, 0, "X");
  labelAxis(0.5, 4, 0, "Y");
  labelAxis(0, 0.5, 4, "Z");

  renderer2.render( scene2, camera2 );
}

function labelAxis(x, y, z, label){
  var text = addText(x, y, z, label, "black")
  labelAxes.push(text);
  scene2.add(text);
}

function drawWalls(front, right, back, left){
  var cubeGeometry = new THREE.BoxGeometry (right+left, 3, front+back);
  var geo = new THREE.EdgesGeometry( cubeGeometry ); // or WireframeGeometry( geometry )
  var mat = new THREE.LineBasicMaterial( { color: 0xff0000, linewidth: 2 } );
  var wireframe = new THREE.LineSegments( geo, mat );
  wireframe.position.set((left-right)/2, 1.5, (front-back)/2);
  scene.add( wireframe );
}

function onDocumentMouseMove(event) {
  // the following line would stop any other event handler from firing
  // (such as the mouse's TrackballControls)
  event.preventDefault();

  var rect = renderer.domElement.getBoundingClientRect();
  mouse.x = ( ( event.clientX - rect.left ) / rect.width ) * 2 - 1;
  mouse.y = - ( ( event.clientY - rect.top ) / rect.height ) * 2 + 1;
}

function addText(x, y, z, text, color){
  const canvas = makeLabelCanvas(20, text, color);
  const labelGeometry = new THREE.PlaneBufferGeometry(1, 1);

  const texture = new THREE.CanvasTexture(canvas);
  // because our canvas is likely not a power of 2
  // in both dimensions set the filtering appropriately.
  texture.minFilter = THREE.LinearFilter;
  texture.wrapS = THREE.ClampToEdgeWrapping;
  texture.wrapT = THREE.ClampToEdgeWrapping;

  const labelMaterial = new THREE.MeshBasicMaterial({
    map: texture,
    side: THREE.DoubleSide,
    transparent: true,
  });

  const label = new THREE.Mesh(labelGeometry, labelMaterial);
  label.position.x = x;
  label.position.y = y;
  label.position.z = z;

  return label;
  // scene.add(label);
}


function makeLabelCanvas(size, name, color) {
  const borderSize = 2;
  const ctx = document.createElement('canvas').getContext('2d');
  const font =  `${size}px bold sans-serif`;
  ctx.font = font;
  // measure how long the name will be
  const doubleBorderSize = borderSize * 2;
  const width = ctx.measureText(name).width + doubleBorderSize;
  const height = size + doubleBorderSize;
  ctx.canvas.width = width;
  ctx.canvas.height = height;

  // need to set font again after resizing canvas
  ctx.font = font;
  ctx.textBaseline = 'top';

  ctx.fillStyle = "rgba(255, 255, 255, 0.0)";
  ctx.fillRect(0, 0, width, height);
  ctx.fillStyle = color ? color : 'white';
  ctx.fillText(name, borderSize, borderSize);

  return ctx.canvas;
}

function toXYCoords (pos) {
  camera.updateMatrixWorld()
  // var vector = projector.projectVector(pos.clone(), camera);
  var vector = pos.clone().unproject(camera);
  vector.x = (vector.x + 1)/2 * window.innerWidth;
  vector.y = -(vector.y - 1)/2 * window.innerHeight;
  return vector;
}

function animate()
{
    requestAnimationFrame ( animate );

    controls.update();
    updateAxesSystem();

    //If simulator.js has been generated, execute 'flySimulation()'
    if(typeof flySimulation !== 'undefined' && flySimulation)
      if(execute)
        flySimulation();

    raycating();
    rotateLabels();
    renderer.render (scene, camera);
    renderer2.render( scene2, camera2 );
}

function updateAxesSystem(){
  camera2.position.copy( camera.position );
  camera2.position.sub( controls.target ); // added by @libe
  camera2.position.setLength( CAM_DISTANCE );

  camera2.lookAt( new THREE.Vector3(0,0,0));
}

function rotateLabels(){
  centerLabel.lookAt(camera.position);
  labelPoistion.lookAt(camera.position);
  labelObjects.forEach(ob => ob.lookAt(camera.position));
  labelAxes.forEach(ob => ob.lookAt(camera2.position));
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

// function fly(goalPostion){
//   var stopped = true;
//   if(Math.abs(coveredXDistance-goalPostion.x) > 0.04){ //0.02 acceptable movement precision error
//     // flySupporter('x', drone.position.x, goalPostion.x);
//      // console.log("X1", drone.position.z, goalPostion.x);
//      var additionalDistance = flySupporter(coveredXDistance, goalPostion.x);
//      coveredXDistance += additionalDistance;
//     drone.translateX(additionalDistance);
//     // coveredXDistance = +0.01;
//      // console.log("X2", drone.position.z, goalPostion.x);
//     stopped = false;
//   }
//   if(Math.abs(coveredYDistance-goalPostion.y) > 0.04){
//     // flySupporter('y', drone.position.y, goalPostion.y);
//     // console.log(coveredYDistance, goalPostion.y);
//     var additionalDistance = flySupporter(coveredYDistance, goalPostion.y);
//     coveredYDistance += additionalDistance;
//     drone.translateY(additionalDistance);
//     stopped = false;
//   }
//   if(Math.abs(coveredZDistance-goalPostion.z) > 0.04){
//     // flySupporter('z', drone.position.z, goalPostion.z);
//     var additionalDistance = flySupporter(coveredZDistance, goalPostion.z);
//     coveredZDistance += additionalDistance;
//     drone.translateZ(additionalDistance);
//     stopped = false;
//   }
//   drawNewLineSegment();
//   if(stopped){
//     coveredXDistance = 0;
//     coveredYDistance = 0;
//     coveredZDistance = 0;
//   }
//
//   return stopped;
// }

function flyManager(goalPostion){
  var stopped = true;
  if(!fly(goalPostion.y, 'y'))
    stopped = false;
  else if(!fly(goalPostion.z, 'z'))
    stopped = false;
  else if(!fly(goalPostion.x, 'x'))
    stopped = false;

  return stopped;
}

function fly(goalPostion, axis){
  var stopped = true;
  if(Math.abs(coveredDistance-goalPostion) > 0.04){ //0.02 acceptable movement precision error
    var additionalDistance = flySupporter(coveredDistance, goalPostion);
    coveredDistance += additionalDistance;
    if(axis == 'x')
      drone.translateX(additionalDistance);
    else if(axis == 'y')
      drone.translateY(additionalDistance);
    else if(axis == 'z')
      drone.translateZ(additionalDistance);
    stopped = false;
  }

  drawNewLineSegment();
  if(stopped){
    coveredDistance = 0;
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
    drawNewLineSegment();
    return false;
  }
  else {
    return true;
  }
}

function addCube(objectName, sizeX, sizeY, sizeZ, locX, locY, locZ, color){
  var cubeGeometry = new THREE.BoxGeometry (sizeX, sizeY, sizeZ);
  var cubeMaterial = new THREE.MeshBasicMaterial ({color: color});
  cube = new THREE.Mesh (cubeGeometry, cubeMaterial);
  cube.position.set (locX, locY, locZ);

  var text = addText(locX, locY + sizeY/2 + 1, locZ,
    objectName)
  labelObjects.push(text);
  scene.add(text);

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

    if(pos > -1 && pos < intersects.length){
      if ( INTERSECTED ) removeEntity(labelPoistion);
			INTERSECTED = intersects[ pos ].object;

      let position = intersects[ pos ].object.position;
      //Do not display one more in center
      if(!(position.x === 0 && position.z === 0)){
        labelPoistion = addText(position.x, 0.7, position.z,
          "(" + position.x + ",0," + position.z + ")");
        labelPoistion.name = "LABEL_POSITON";
        scene.add(labelPoistion);
      }
		}
    else {
  		if ( INTERSECTED ) removeEntity(labelPoistion);
  		INTERSECTED = null;
  	}
	} else {
		if ( INTERSECTED ) removeEntity(labelPoistion);
		INTERSECTED = null;
	}
	renderer.render( scene, camera );
}

//Creates points for showing position on the grid
function createPointsOnGrid(){
  var geometry = new THREE.SphereGeometry(0.2, 8, 8 );
  var material = new THREE.MeshPhongMaterial({
    color: 'white',
    opacity: 0.0,
    alphaTest: 0.5,
    transparent: true,
  });
  // var material = new THREE.MeshBasicMaterial ({color: 0x1ec876});

  var sphere = new THREE.Mesh (geometry, material);
  sphere.name = 'POINT_ON_GRID';

  for (var i = -10; i <= 10; i++) {
    for (var j = -10; j <= 10; j++) {
      instance = sphere.clone();
      instance.position.set( i, 0, j );
      scene.add( instance );
    }
  }
}

//removes object from scene
function removeEntity(object) {
  if(object && object.name){
    var selectedObject = scene.getObjectByName(object.name);
    scene.remove( selectedObject );
  }
}

function drawSphere(){
  var geometry = new THREE.SphereGeometry(1.0, 32, 32 );
  var material = new THREE.MeshBasicMaterial( {
    color: 0xffffff, transparent: true,
    opacity: 0.5 } );


  var sphere = new THREE.Mesh (geometry, material);
  scene.add( sphere );
}
