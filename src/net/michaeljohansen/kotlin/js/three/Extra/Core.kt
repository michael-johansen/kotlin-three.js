package net.michaeljohansen.kotlin.js.three.Extra

import net.michaeljohansen.kotlin.js.three.Geometry
import net.michaeljohansen.kotlin.js.three.Matrix4
import net.michaeljohansen.kotlin.js.three.Vector2


@native("THREE.Curve")
open class Curve() {
  //Functions
  //fun getPoint(t: Double): Unit = noImpl
  //fun getPointAt(u: Double): Unit = noImpl
  //fun getPoints(t: Array<Double>): Unit = noImpl
  //fun getSpacedPoints(u: Array<Double>): Unit = noImpl
  //fun getLength(): Unit = noImpl
  //fun getLengths(t: Array<Double>): Unit = noImpl
  //fun updateArcLengths(): Unit = noImpl
  //fun getUtoTmapping(u: Double, distance : Double): Unit = noImpl
  //fun getTangent(t: Double): Unit = noImpl
  //fun getTangentAt(u: Double): Unit = noImpl
}

@native("THREE.CurvePath")
open class CurvePath() : Curve() {
  //Properties
  @native
  var curves: Array<Double> = noImpl
  @native
  var bends: Array<Double> = noImpl
  @native
  var autoClose: Boolean = noImpl
  //Functions
  fun createPointsGeometry(): Geometry = noImpl

  fun createSpacedPointsGeometry(divisions: Int): Geometry = noImpl
}

@native("THREE.Path")
open class Path(points: Array<Vector2>) : CurvePath() {
  //Functions
  fun fromPoints(points: Array<Vector2>): Unit = noImpl

  fun moveTo(x: Double, y: Double): Unit = noImpl
  fun lineTo(x: Double, y: Double): Unit = noImpl
  //fun quadraticCurveTo(aCPx: Double, aCPy: Double, aX: Double, aY: Double): Unit = noImpl
  //fun bezierCurveTo(aCP1x: Double, aCP1y: Double, aCP2x: Double, aCP2y: Double, aX: Double, aY: Double): Unit = noImpl
  //fun splineThru(m: Matrix4): Unit = noImpl
  //fun arc(m: Matrix4): Unit = noImpl
  //fun absarc(m: Matrix4): Unit = noImpl
  //fun ellipse(m: Matrix4): Unit = noImpl
  //fun absellipse (m: Matrix4): Unit = noImpl
  //fun toShapes(): Unit = noImpl
}

@native("THREE.Shape")
open class Shape() : Path(arrayOf()) {
  //Properties
  @native
  var lineDistances: Array<Double> = noImpl
  //Functions
  fun applyMatrix(m: Matrix4): Unit = noImpl
}
