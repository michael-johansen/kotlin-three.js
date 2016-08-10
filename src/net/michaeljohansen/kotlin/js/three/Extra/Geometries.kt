package net.michaeljohansen.kotlin.js.three.Extra

import net.michaeljohansen.kotlin.js.three.Geometry


@native("THREE.BoxGeometry") class BoxGeometry(
  x: Int,
  y: Int,
  z: Int
) : Geometry()

@native("THREE.SphereGeometry") class SphereGeometry(
  radius: Double = noImpl,
  widthSegments: Int = noImpl,
  heightSegments: Int = noImpl,
  phiStart: Double = noImpl,
  phiLength: Double = noImpl,
  thetaStart: Double = noImpl,
  thetaLength: Double = noImpl
) : Geometry()

@native("THREE.ShapeGeometry") class ShapeGeometry(
  shapes: Array<Shape>,
  options: Any = noImpl
) : Geometry() {
  fun addShapeList(shapes: Array<Shape>, options: Any): Unit = noImpl
  fun addShape(shapes: Array<Shape>, options: Any): Unit = noImpl
}
