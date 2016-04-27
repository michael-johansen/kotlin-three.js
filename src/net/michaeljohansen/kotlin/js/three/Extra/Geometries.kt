package net.michaeljohansen.kotlin.js.three.Extra

import net.michaeljohansen.kotlin.js.three.Geometry


@native("THREE.BoxGeometry")
class BoxGeometry(x: Int, y: Int, z: Int) {

}

//native("THREE.ShapeGeometry")
//fun ShapeGeometry(s: Shape) = ShapeGeometry(Array(1){s})

@native("THREE.ShapeGeometry")
class ShapeGeometry(shapes: Array<Shape>, options: Any = noImpl) : Geometry() {
  //Functions
  fun addShapeList(shapes: Array<Shape>, options: Any): Unit = noImpl

  fun addShape(shapes: Array<Shape>, options: Any): Unit = noImpl
}
