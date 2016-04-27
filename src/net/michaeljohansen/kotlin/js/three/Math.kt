package net.michaeljohansen.kotlin.js.three

@native("THREE.Color")
class Color(hexString: String) {
  //Properties
  @native
  var r: Double = 0.0
  @native
  var b: Double = 0.0
  @native
  var g: Double = 0.0

  //Functions
  fun setRGB(r: Double, b: Double, g: Double): Unit = noImpl

  fun setHSL(h: Double, s: Double, l: Double): Unit = noImpl
}

@native("THREE.Quaternion")
class Quaternion(x: Double, y: Double, z: Double, w: Double) {

}

@native("THREE.Matrix3")
class Matrix3(n11: Double, n12: Double, n13: Double,
              n21: Double, n22: Double, n23: Double,
              n31: Double, n32: Double, n33: Double) {

}

@native("THREE.Matrix4")
class Matrix4() {
  @native var elements: Array<Double> = noImpl

  fun set(n11: Double, n12: Double, n13: Double, n14: Double,
          n21: Double, n22: Double, n23: Double, n24: Double,
          n31: Double, n32: Double, n33: Double, n34: Double,
          n41: Double, n42: Double, n43: Double, n44: Double): Unit = noImpl
  fun identity(): Matrix4 = noImpl
  fun copy(m: Matrix4): Matrix4 = noImpl
  fun copyPosition(m: Matrix4): Matrix4 = noImpl
  fun extractRotation(m: Matrix4): Matrix4 = noImpl
  fun lookAt(eye: Vector3, center: Vector3, up: Vector3): Matrix4 = noImpl
  fun multiply(m: Matrix4): Matrix4 = noImpl
  fun multiplyMatrices(a: Matrix4, b: Matrix4): Matrix4 = noImpl
  fun multiplyToArray(a: Matrix4, b: Matrix4, r: Array<Double>): Matrix4 = noImpl
  fun determinant(): Matrix4 = noImpl
  fun transpose(): Double = noImpl
  fun flattenToArrayOffset(flat: Array<Double>, offset: Int): Matrix4 = noImpl
  fun setPosition(v: Vector3): Matrix4 = noImpl
  fun getInverse(m: Matrix4): Matrix4 = noImpl
  fun makeRotationFromEuler(v: Vector3, order: String): Matrix4 = noImpl
  //fun makeRotationFromQuaternion(): Matrix4 = noImpl
  fun scale(v: Vector3): Matrix4 = noImpl

  //fun compose(): Matrix4 = noImpl
  //fun decompose(): Matrix4 = noImpl
  fun makeTranslation(x: Double, y: Double, z: Double): Matrix4 = noImpl

  fun makeRotationX(x: Double): Matrix4 = noImpl
  fun makeRotationY(y: Double): Matrix4 = noImpl
  fun makeRotationZ(z: Double): Matrix4 = noImpl
  fun makeRotationAxis(axis: Vector3, theta: Double): Matrix4 = noImpl
  fun makeScale(x: Double, y: Double, z: Double): Matrix4 = noImpl
  fun makeFrustum(left: Double, right: Double, bottom: Double,
                  top: Double, near: Double, far: Double): Matrix4 = noImpl

  fun makePerspective(fov: Double, aspect: Double, near: Double, far: Double): Matrix4 = noImpl
  fun makeOrthographic(): Matrix4 = noImpl
  fun clone(): Matrix4 = noImpl
  fun applyToVector3Array(a: Array<Double>): Matrix4 = noImpl
  fun getMaxScaleOnAxis(): Double = noImpl
}

@native("THREE.Euler")
class Euler {
  //Properties
  @native
  var x: Double = 0.0
  @native
  var y: Double = 0.0
  @native
  var z: Double = 0.0
  @native
  var order: String = ""

  //Functions
  fun set(x: Double, y: Double, z: Double): Unit = noImpl

  fun set(x: Double, y: Double, z: Double, order: String): Unit = noImpl
}

@native("THREE.Vector2")
class Vector2 {
  //Properties
  @native
  var x: Double = 0.0
  @native
  var y: Double = 0.0

  //Functions
  fun set(x: Double, y: Double): Unit = noImpl

  fun setX(x: Double): Unit = noImpl
  fun setY(y: Double): Unit = noImpl
}

@native("THREE.Vector3")
class Vector3(
  @native var x: Double = noImpl,
  @native var y: Double = noImpl,
  @native var z: Double = noImpl
) {
  fun set(x: Double, y: Double, z: Double): Unit = noImpl
  fun setX(x: Double): Unit = noImpl
  fun setY(y: Double): Unit = noImpl
  fun setZ(z: Double): Unit = noImpl
  fun setScalar(scalar: Double): Unit = noImpl
  fun setComponent(index: Int, value: Double): Unit = noImpl
  fun getComponent(index: Int): Unit = noImpl
  fun clone(): Unit = noImpl
  fun copy(v: Vector3): Unit = noImpl
  fun add(v: Vector3, w: Vector3): Unit = noImpl
  fun addScalar(s: Double): Unit = noImpl
  fun addVectors(a: Vector3, b: Vector3): Unit = noImpl
  fun addScaledVector(v: Vector3, s: Double): Unit = noImpl
  fun sub(v: Vector3, w: Vector3): Unit = noImpl
  fun subScalar(s: Double): Unit = noImpl
  fun subVectors(a: Vector3, b: Vector3): Unit = noImpl
  fun multiply(v: Vector3, w: Vector3): Unit = noImpl
  fun multiplyScalar(scalar: Double): Unit = noImpl
  fun multiplyVectors(a: Vector3, b: Vector3): Unit = noImpl
  fun applyEuler(): Unit = noImpl
  fun applyAxisAngle(): Unit = noImpl
  fun applyMatrix3(m: Matrix3): Unit = noImpl
  fun applyMatrix4(m: Matrix4): Unit = noImpl
  fun applyProjection(m: Matrix4): Unit = noImpl
  fun applyQuaternion(q: Quaternion): Unit = noImpl
  fun project(camera: PerspectiveCamera): Vector3 = noImpl
  fun unproject(): Unit = noImpl
  fun transformDirection(m: Matrix4): Unit = noImpl
  fun divide(v: Vector3): Unit = noImpl
  fun divideScalar(scalar: Double): Unit = noImpl
  fun min(v: Vector3): Unit = noImpl
  fun max(v: Vector3): Unit = noImpl
  fun clamp(min: Vector3, max: Vector3): Unit = noImpl
  fun clampScalar(): (Double, Double) -> Unit = noImpl
  fun clampLength(min: Double, max: Double): Unit = noImpl
  fun floor(): Unit = noImpl
  fun ceil(): Unit = noImpl
  fun round(): Unit = noImpl
  fun roundToZero(): Unit = noImpl
  fun negate(): Unit = noImpl
  fun dot(v: Vector3): Unit = noImpl
  fun lengthSq(): Unit = noImpl
  fun length(): Unit = noImpl
  fun lengthManhattan(): Unit = noImpl
  fun normalize(): Unit = noImpl
  fun setLength(length: Double): Unit = noImpl
  fun lerp(v: Vector3, alpha: Double): Unit = noImpl
  fun lerpVectors(v: Vector3, v2: Vector3, alpha: Double): Unit = noImpl
  fun cross(v: Vector3, w: Vector3): Unit = noImpl
  fun crossVectors(a: Vector3, b: Vector3): Unit = noImpl
  fun projectOnVector(): Unit = noImpl
  fun projectOnPlane(): Unit = noImpl
  fun reflect(): Unit = noImpl
  fun angleTo(v: Vector3): Unit = noImpl
  fun distanceTo(v: Vector3): Unit = noImpl
  fun distanceToSquared(v: Vector3): Unit = noImpl
  fun setFromSpherical(s: dynamic): Unit = noImpl
  fun setFromMatrixPosition(m: Matrix4): Unit = noImpl
  fun setFromMatrixScale(m: Matrix4): Unit = noImpl
  fun setFromMatrixColumn(m: Matrix4, index: Int): Unit = noImpl
  fun equals(v: Vector3): Unit = noImpl
  fun fromArray(array: Array<Double>, offset:Int): Unit = noImpl
  fun toArray(array: Array<Double>, offset:Int): Unit = noImpl
}
