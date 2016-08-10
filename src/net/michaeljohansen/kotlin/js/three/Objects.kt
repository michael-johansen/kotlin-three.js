package net.michaeljohansen.kotlin.js.three

@native("THREE.Mesh")
class Mesh(
  var geometry: Geometry,
  var material: Material = noImpl
) : Object3D()

@native("THREE.PointCloud")
class PointCloud(geometry: Geometry, material: Material) : Object3D() {

}

@native("THREE.Points")
class Points(
  var geometry: Geometry = noImpl,
  var material: Material = noImpl
) : Object3D() {

}
