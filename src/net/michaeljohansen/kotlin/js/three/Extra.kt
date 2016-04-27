package net.michaeljohansen.kotlin.js.three


@native("THREE.ImageUtils.loadTexture")
fun loadTexture(url: String): Texture = noImpl

@native("THREE.SceneUtils.createMultiMaterialObject")
fun createMultiMaterialObject(geometry: Geometry, materials: Array<Material>): Object3D = noImpl
