// var THREE = require('three');
// import THREE from 'three';
// import  { OrbitControls } from 'three/examples/jsm/controls/OrbitControls.js';
// console.log(THREE);
var scene, renderer, camera, drone;
var cube;
var controls;

// const THREE = require('./three.js');

function init()
{
    var div = document.getElementById('SIMULATOR');
    console.log(div.offsetHeight);
    renderer = new THREE.WebGLRenderer( {antialias:true} );
    var width = div.offsetWidth;
    var height = div.offsetHeight;
    renderer.setSize (width, height);
    var div = document.getElementById('SIMULATOR');
    div.appendChild (renderer.domElement);
    // document.body.appendChild (renderer.domElement);

    scene = new THREE.Scene();

    var cubeGeometry = new THREE.BoxGeometry (10,10,10);
    var cubeMaterial = new THREE.MeshBasicMaterial ({color: 0x1ec876});
    cube = new THREE.Mesh (cubeGeometry, cubeMaterial);

    cube.position.set (0, 0, 0);
    //scene.add (cube);

    camera = new THREE.PerspectiveCamera (45, width/height, 0.1, 50);
    camera.position.y = 3;
    camera.position.z = 10;
    camera.position.x = 5;
    camera.lookAt (new THREE.Vector3(0,0,0));

    controls = new THREE.OrbitControls(camera, renderer.domElement);

    var gridXZ = new THREE.GridHelper(100, 10);
    gridXZ.setColors( new THREE.Color(0xff0000), new THREE.Color(0xffffff) );
    scene.add(gridXZ);

    drone = new THREE.Group();
    var dronesize = 0.5;
    scene.add(drone);
    loader = new THREE.LegacyJSONLoader();
    loader.load('http://localhost:8080/simulator-resources/drone.js', function (geometry, materials) {

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
    loader.load('http://localhost:8080/simulator-resources/drone-lights.js', function (geometry, materials) {

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
    // fly('y', false, -1);
    renderer.render (scene, camera);
}

function fly(axis, isForward, endPoint){
  if(isForward){
    if(drone.position[axis] < endPoint)
      drone.position[axis] += 0.01;
  }
  else{
    if(drone.position[axis] > endPoint)
      drone.position[axis] -= 0.01;
  }
}

function addCube(sizeX, sizeY, sizeZ, locX, locY, locZ){
  var cubeGeometry = new THREE.BoxGeometry (sizeX, sizeY, sizeZ);
  var cubeMaterial = new THREE.MeshBasicMaterial ({color: 0x1ec876});
  cube = new THREE.Mesh (cubeGeometry, cubeMaterial);

  cube.position.set (locX, locY, locZ);
}
