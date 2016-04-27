package net.michaeljohansen.kotlin.js.three


@native("THREE.Scene")
open class Scene : Object3D() {
  //Properties
  @native
  var fog: FogExp2 = noImpl
  //Functions
  fun add(a: Any): Unit = noImpl
}

@native("THREE.FogExp2")
class FogExp2(color: Color, density: Double) {
  //Properties
  @native
  var name: String = noImpl
  @native
  var color: Color = noImpl
  @native
  var density: Double = noImpl
  //Functions
  fun clone(): FogExp2 = noImpl
}
