package net.michaeljohansen.kotlin.js.three


@native("THREE.Material")
open class Material {
  @native var side: Int = noImpl
  @native var transparent: Boolean = noImpl
  @native var opacity: Double = noImpl
  @native var blending: Int = noImpl
  @native var blendSrc: Int = noImpl

  @native var blendDst: Int = noImpl
  @native var blendEquation: Int = noImpl
  @native var blendSrcAlpha: Int? = noImpl
  @native var blendDstAlpha: Int? = noImpl
  @native var blendEquationAlpha: Int? = noImpl

  @native var depthFunc: Int = noImpl
  @native var depthTest: Boolean = noImpl
  @native var depthWrite: Boolean = noImpl

  @native var colorWrite: Boolean = noImpl

  @native var precision: Int? = noImpl // override the renderer's default precision for this material

  @native var polygonOffset: Boolean = noImpl
  @native var polygonOffsetFactor: Int = noImpl
  @native var polygonOffsetUnits: Int = noImpl

  @native var alphaTest: Double = noImpl
  @native var premultipliedAlpha: Boolean = noImpl

  @native var overdraw: Int = noImpl // Overdrawn pixels (typically between 0 and 1) for fixing antialiasing gaps in CanvasRenderer

  @native var visible: Boolean = true
}

@native("THREE.MeshBasicMaterial")
class MeshBasicMaterial(parameters: Any) : Material() {

}

@native("THREE.MeshLambertMaterial")
class MeshLambertMaterial(parameters: Any) : Material() {

}

@native("THREE.PointCloudMaterial")
class PointCloudMaterial(parameters: Any) : Material() {
  @native
  var color: Color = noImpl
  //@native var map: Int = noImpl
  @native
  var size: Double = noImpl
  @native
  var sizeAttenuation: Boolean = noImpl
  @native
  var vertexColors: Boolean = noImpl
  @native
  var fog: Boolean = noImpl
}

@native("THREE.PointsMaterial")
class PointsMaterial(parameters: PointsMaterialParameters) : Material() {
}

@native("THREE.PointsMaterial")
class PointsMaterialParameters : Material() {
  @native var color: Color = noImpl
  @native var size: Double = noImpl
  @native var sizeAttenuation: Boolean = noImpl
  @native var vertexColors: Int = noImpl
  @native var fog: Boolean = noImpl
  @native var map: Texture? = noImpl
}
