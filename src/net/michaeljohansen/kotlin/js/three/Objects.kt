package net.michaeljohansen.kotlin.js.three

import net.michaeljohansen.kotlin.js.three.Extra.BoxGeometry

@native("THREE.Mesh")
class Mesh(geometry: BoxGeometry, material: MeshBasicMaterial) : Object3D() {

}

@native("THREE.PointCloud")
class PointCloud(geometry: Geometry, material: Material) : Object3D() {

}

@native("THREE.Points")
class Points(geometry: Geometry, material: Material) : Object3D() {

}
