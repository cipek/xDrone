//IMPORTANT!
//y and z axis are swapped in respect to ROS. Y is down and up axis
var scene, renderer, camera, drone, simulator, outputDiv;
var modelHeight = 0.1;
var cube, controls, execute = true;
var globalDroneRotation = 90, currentDroneRotation = 0;
var coveredXDistance = 0, coveredYDistance = 0, coveredZDistance = 0;
var coveredDistance = 0, coveredAngle = 0;
var line, raycaster, mouse, INTERSECTED;
var radius = 500, theta = 0, frustumSize = 1000;
var objects, labelPoistion, centerLabel, labelObjects, labelAxes;
var CANVAS_WIDTH = 130, CANVAS_HEIGHT = 100, CAM_DISTANCE = 15;
var axesContainer, camera2, scene2, renderer2, axes2;
var collisionBox, collisions, collidedWith, wallsColision, walls;
var lastCameraPosition, landHeight, currentDroneAngle;
var isOutputVisible = false;

function init()
{
    objects = [], labelObjects = [], labelAxes = [], landHeight = undefined,
    currentDroneAngle = 90, isOutputVisible = false;

    var simulatorContainer = document.getElementById('SIMULATOR_CONTAINER');
    simulator = document.getElementById('SIMULATOR');
    outputDiv = document.getElementById('SIMULATOR_OUTPUT');
    //Removing old canvases
    removeChilds(simulator);
    removeChilds(outputDiv);

    renderer = new THREE.WebGLRenderer( {antialias:true} );
    var width = simulator.offsetWidth;
    var height = simulator.offsetHeight;
    renderer.setSize (width, height);
    renderer.setPixelRatio( window.devicePixelRatio );

    simulator.appendChild (renderer.domElement);

    scene = new THREE.Scene();

    if(camera)
      lastCameraPosition = camera.position;
    camera = new THREE.PerspectiveCamera (45, width/height, 0.1, 600);
    if(lastCameraPosition)
      camera.position.copy(lastCameraPosition);
    else{
      camera.position.y = 2;
      camera.position.z = 5;
      camera.position.x = 3;
    }
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
    var dronesize = 0.25;
    scene.add(drone);
    loader = new THREE.LegacyJSONLoader();
    //Model taken from https://sketchfab.com/3d-models/tron-ish-low-poly-drone-cad1fc9ada864e06ab69a37705656392
    loader.load(baseUrl+'simulator-resources/drone.js', function (geometry, materials) {
      var matt = new THREE.MeshBasicMaterial( { color: new THREE.Color('black'), side: THREE.DoubleSide }); //, transparent:true, opacity:1,  side: THREE.DoubleSide } );
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

    var matt = new THREE.MeshBasicMaterial( { color: new THREE.Color('red'), side: THREE.DoubleSide});//,  transparent:true, opacity:1 } );
    var obj = new THREE.Mesh(geometry, matt);
      geometry.center();
      obj.scale.set(dronesize,dronesize,dronesize);
      obj.rotateY(Math.PI);
      obj.receiveShadow = true;
      obj.castShadow = true;
      drone.add(obj);
    });

    drone.position.y = 0 + modelHeight;
    drone.position.x = 0;
    drone.position.z = 0;

    addCollisionBoxToDrone(0.5,0.36,0.5)
    collisions = [], collidedWith = [], wallsColision = false, walls = {};

    var axesDrone = new THREE.AxisHelper(0.5);
    drone.add(axesDrone);

    raycaster = new THREE.Raycaster();
    mouse = new THREE.Vector2();
    // when the mouse moves, call the given function
    simulator.addEventListener('mousemove', onDocumentMouseMove, false);

    createPointsOnGrid();
    centerLabel = addText(0, 0.7, 0, "(0,0,0)");
    scene.add( centerLabel );

    axesSystem();

    //Resets distance
    coveredDistance = 0, coveredAngle = 0;
}

//Add axes system in the left top corner
function axesSystem(){
  axesContainer = document.getElementById('AXES_SYSTEM');
  removeChilds(axesContainer);
  renderer2 = new THREE.WebGLRenderer();
  renderer2.setClearColor( 0xf0f0f0, 1 );
  renderer2.setSize( CANVAS_WIDTH, CANVAS_HEIGHT );
  axesContainer.appendChild( renderer2.domElement );

  scene2 = new THREE.Scene();

  camera2 = new THREE.PerspectiveCamera( 45, CANVAS_WIDTH / CANVAS_HEIGHT, 0.1, 600 );
  camera2.up = camera.up; // important!

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

function drawWalls(front, right, back, left, up){
  walls = {xMin: -right, xMax: left,
    yMin: 0, yMax: up,
    zMin: -back, zMax: front
  };
  var cubeGeometry = new THREE.BoxGeometry (right+left, up, front+back);
  var geo = new THREE.EdgesGeometry( cubeGeometry ); // or WireframeGeometry( geometry )
  var mat = new THREE.LineBasicMaterial( { color: 0xff0000, linewidth: 2 } );
  var wireframe = new THREE.LineSegments( geo, mat );
  wireframe.position.set((left-right)/2, up/2, (front-back)/2);
  scene.add( wireframe );
}

function onDocumentMouseMove(event) {
  event.preventDefault();

  var rect = renderer.domElement.getBoundingClientRect();
  mouse.x = ( ( event.clientX - rect.left ) / rect.width ) * 2 - 1;
  mouse.y = - ( ( event.clientY - rect.top ) / rect.height ) * 2 + 1;
}

function addText(x, y, z, text, color){
  const canvas = makeLabelCanvas(20, text, color);
  const labelGeometry = new THREE.PlaneBufferGeometry(1, 1);

  const texture = new THREE.CanvasTexture(canvas);
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

    addGoToToEditor();
    controls.update();
    updateAxesSystem();

    //If simulator.js has been generated, execute 'flySimulation()'
    if(typeof flySimulation !== 'undefined' && flySimulation){
      if(execute)
        flySimulation();
      detectCollisions();
      drawOutput();
    }

    raycating();
    rotateLabels();
    renderer.render (scene, camera);
    renderer2.render( scene2, camera2 );
}

//Copy camera rotation of the simulator into axes system window
function updateAxesSystem(){
  camera2.position.copy( camera.position );
  camera2.position.sub( controls.target );
  camera2.position.setLength( CAM_DISTANCE );

  camera2.lookAt( new THREE.Vector3(0,0,0));
}

//Rotates labels to always face the camera
function rotateLabels(){
  if(centerLabel)
    centerLabel.lookAt(camera.position);
  if(labelPoistion)
    labelPoistion.lookAt(camera.position);
  labelObjects.forEach(ob => ob.lookAt(camera.position));
  labelAxes.forEach(ob => ob.lookAt(camera2.position));
}

function flySupporter(currentLocation, endPoint, speed){
  if(endPoint > currentLocation){
    return speed;
  }
  else{
    return -speed;
  }
}

function fly(destination, axis){
  landHeight = undefined;
  var stopped = true;

  if(destination !== 0 && Math.abs(coveredDistance-destination) > 0.015){ //0.02 acceptable movement precision error
    var additionalDistance = flySupporter(coveredDistance, destination, 0.015);
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

//Redraws last line segment to match the new drone's position
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

//Rotates the drone
function rotation(goalRotation){
  var stopped = true;
  if(Math.abs(coveredAngle-goalRotation) > 0.02){
    var additionalAngle = flySupporter(coveredAngle, goalRotation, 0.02)
    coveredAngle += additionalAngle;
    drone.rotateY(additionalAngle);
    stopped = false;
  }
  if(stopped){
    coveredAngle = 0;
    currentDroneAngle = checkAngle(currentDroneAngle + radiansToDegrees(goalRotation));
  }

  return stopped;
}

function takeoff(){
  return fly('y', 0.7);
}

function land(){
  if(landHeight == undefined)
    landHeight = findSurface();

  if(drone.position.y > landHeight){
    drone.position.y -= 0.01;
    drawNewLineSegment();
    return false;
  }
  else {
    return true;
  }
}

//Finds the nearest surface below the drone
function findSurface(){
  var highestSurface = modelHeight;

  for (var i = 0; i < collisions.length; i++) {
    if ( ( drone.position.x <= collisions[i].xMax && drone.position.x >= collisions[i].xMin ) &&
       ( drone.position.z <= collisions[i].zMax && drone.position.z >= collisions[i].zMin) &&
        drone.position.y >= collisions[i].yMax && collisions[i].yMax > 0) {
        highestSurface = collisions[i].yMax + modelHeight;
    }
  }

  return highestSurface;
}

//Draws a cube on a scene
function addCube(objectName, sizeX, sizeY, sizeZ, locX, locY, locZ, color){
  var cubeGeometry = new THREE.BoxGeometry (sizeX, sizeY, sizeZ);
  var cubeMaterial = new THREE.MeshBasicMaterial ({color: color});
  cube = new THREE.Mesh (cubeGeometry, cubeMaterial);
  cube.position.set (locX, locY, locZ);
  cube.name= objectName;
  objects.push(cube);

  var text = addText(locX, locY + sizeY/2 + 1, locZ,
    objectName)
  labelObjects.push(text);
  scene.add(text);

  calculateCollisionPoints(cube, objectName);
  scene.add(cube);
}

function calculateCollisionPoints( mesh, objectName) {
  // Compute the bounding box after scale, translation, etc.
  var bbox = new THREE.Box3().setFromObject(mesh);

  var bounds = {
    objectName: objectName,
    xMin: bbox.min.x,
    xMax: bbox.max.x,
    yMin: bbox.min.y,
    yMax: bbox.max.y,
    zMin: bbox.min.z,
    zMax: bbox.max.z,
  };

  collisions.push( bounds );
}

//Shows labels on a grid
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

//removes object from the scene
function removeEntity(object) {
  if(object && object.name){
    var selectedObject = scene.getObjectByName(object.name);
    scene.remove( selectedObject );
  }
}

//Drwas the ellispoide after the simulaotion
function drawSphere(){
  var geometry = new THREE.SphereGeometry(1, 32, 32 );
  geometry.applyMatrix( new THREE.Matrix4().makeScale(
    collisionBox.scale.x/2, collisionBox.scale.y/2, collisionBox.scale.z/2) );
  var material = new THREE.MeshBasicMaterial( {
    color: 0xffffff, transparent: true,
    opacity: 0.5 } );

  var sphere = new THREE.Mesh (geometry, material);
  sphere.position.copy(drone.position);
  scene.add( sphere );
}


//Detects drone's collisons with other objects
function detectCollisions() {
  // Get the drone's current collision area.
  var bounds = {
    xMin: drone.position.x - collisionBox.scale.x / 2,
    xMax: drone.position.x + collisionBox.scale.x / 2,
    yMin: drone.position.y - collisionBox.scale.y / 2,
    yMax: drone.position.y + collisionBox.scale.y / 2,
    zMin: drone.position.z - collisionBox.scale.z / 2,
    zMax: drone.position.z + collisionBox.scale.z / 2,
  };

  // Run through each object and detect if there is a collision.
  for ( var index = 0; index < collisions.length; index ++ ) {
    if ( ( bounds.xMin <= collisions[ index ].xMax && bounds.xMax >= collisions[ index ].xMin ) &&
       ( bounds.yMin <= collisions[ index ].yMax && bounds.yMax >= collisions[ index ].yMin) &&
       ( bounds.zMin <= collisions[ index ].zMax && bounds.zMax >= collisions[ index ].zMin) ) {
      // Hit detected
      if(!collidedWith.includes(collisions[ index ].objectName))
        collidedWith.push(collisions[ index ].objectName);
    }
  }

  if(walls.xMin >= bounds.xMin || walls.xMax <= bounds.xMax ||
    walls.zMin >= bounds.zMin || walls.zMax <= bounds.zMax ||
    walls.yMax <= bounds.yMax){
    wallsColision = true;
  }
}

function addCollisionBoxToDrone(sizeX, sizeY, sizeZ){
  var cubeGeometry = new THREE.BoxBufferGeometry (1, 1, 1);
  var cubeMaterial = new THREE.MeshBasicMaterial( {
    color: 0xffffff, transparent: true, alphaTest: 0.5,
    opacity: 0.0 } );
  collisionBox = new THREE.Mesh (cubeGeometry, cubeMaterial);
  collisionBox.position.copy(drone.position);
  collisionBox.scale.x = sizeX;
  collisionBox.scale.y = sizeY;
  collisionBox.scale.z = sizeZ;

  drone.add(collisionBox);
}

function changeDroneCollisionBox(additionalX, additionalY, additionalZ) {
  collisionBox.scale.x += additionalX;
  collisionBox.scale.y += additionalY;
  collisionBox.scale.z += additionalZ;
}

function getDistanceToObject(objectName){
  let object;

  for (var i = 0; i < objects.length; i++) {
    if(objects[i].name == objectName){
      object = objects[i];
      break;
    }
  }

  var x = Math.abs(drone.position.x - object.position.x)
  var z = Math.abs(drone.position.z - object.position.z)

  var distance = Math.sqrt( x*x + z*z );
  if(object !== undefined){
    return {
      y: getDistance(drone.position.y, object.position.y) + object.geometry.parameters.height/2 + 0.5,
      z: distance
    }
  }
  else
    return {x: 0, y: 0, z: 0}
}

function getDistance(dronePos, obPos){
  if(dronePos > obPos)
    return - Math.abs(dronePos - obPos);
  else
    return Math.abs(dronePos - obPos);
}

function getRotationToObject(objectName){
  let object;

  for (var i = 0; i < objects.length; i++) {
    if(objects[i].name == objectName){
      object = objects[i];
      break;
    }
  }

  if(object !== undefined){
    var angleToObject = -Math.atan2(drone.position.z - object.position.z, drone.position.x - object.position.x) * 180 / Math.PI;

    angleToObject = angleTo360(angleToObject);
    var isPositive = true;
    if(currentDroneAngle > angleToObject)
      isPositive = false;

    angleToObject = Math.abs(currentDroneAngle - angleToObject);
    if(angleToObject > 180 ){
      angleToObject = 360 - angleToObject;
      isPositive = !isPositive;
    }

    return (isPositive ? angleToObject : -angleToObject)
  }
  else
    return 0;
}

function radiansToDegrees(radians){
  return radians * (180/Math.PI);
}

function angleTo360(angle){
  while(angle < 0)
    angle = 360 + angle;
  return angle;
}

function checkAngle(angle){
  angle = angle%360;
  while(angle < 0)
    angle = 360 + angle;
  return angle;
}

function drawOutput(){
  if(finishSimulation && !isOutputVisible){
    outputDiv.appendChild (createDiv("Estimated landing area: x= " + (Math.round( Math.abs(collisionBox.scale.x) * 10) / 10) +
      " m, z = " + (Math.round( Math.abs(collisionBox.scale.z) * 10) / 10) + " m"));
    if(collidedWith && collidedWith.length > 0)
      outputDiv.appendChild (createDiv("Possilbe collison with objects: " + collidedWith.join(','), "red"));
    if(wallsColision)
      outputDiv.appendChild (createDiv("Possilbe collison with a wall", "red"));

    drawSphere();
    isOutputVisible = true;
  }
}

function createDiv(text, color){
  var div = document.createElement("div");
  div.innerHTML = text;
  div.style.color = color ? color : "black";
  return div;
}

function removeChilds(element){
  while (element.firstChild) {
    element.removeChild(element.firstChild);
  }
}
