package net.michaeljohansen.kotlin.js.three


@native("THREE.Camera")
open class Camera : Object3D() {
  @native var matrixWorldInverse: Matrix4 = noImpl
  @native var projectionMatrix: Matrix4 = noImpl

  fun lookAt(vector: Vector3): Unit = noImpl
  fun getWorldDirection(): Vector3 = noImpl
}

@native("THREE.PerspectiveCamera")
open class PerspectiveCamera(
  @native var fovDegrees: Double,
  @native var aspect: Double,
  @native var near: Double,
  @native var far: Double
) : Camera() {
  //Functions
  fun setLens(focalLength: Int, frameSize: Int): Unit = noImpl

  fun setViewOffset(fullWidth: Int, fullHeight: Int, x: Int, y: Int, width: Int, height: Int): Unit = noImpl
  fun updateProjectionMatrix(): Unit = noImpl
}

@native("THREE.OrthographicCamera")
class OrthographicCamera(left: Double, right: Double, top: Double, bottom: Double, near: Int, far: Int) : Camera() {
  //Properties
  @native
  var left: Double = 0.0
  @native
  var right: Double = 0.0
  @native
  var top: Double = 0.0
  @native
  var bottom: Double = 0.0
  @native
  var near: Int = 0
  @native
  var far: Int = 0

  //Functions
  fun updateProjectionMatrix(): Unit = noImpl
}

@native("THREE.Frustum")
class Frustum(){
  @native fun setFromMatrix(matrix4: Matrix4) : Unit = noImpl
  @native fun containsPoint(point: Vector3) : Boolean = noImpl
}
