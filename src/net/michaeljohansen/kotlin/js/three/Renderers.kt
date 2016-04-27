package net.michaeljohansen.kotlin.js.three

import org.w3c.dom.Element

@native("THREE.WebGLRenderer")
open class WebGLRenderer {
  @native
  var domElement: Element = noImpl
  //Functions
  fun setSize(innerWidth: Double, innerHeight: Double): Unit = noImpl

  fun setClearColor(color: Int): Unit = noImpl
  @native fun render(scene: Scene, camera: PerspectiveCamera): Unit = noImpl
}
