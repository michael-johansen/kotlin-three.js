package net.michaeljohansen.kotlin.js.three


@native("THREE") val ThreeJS: THREE = noImpl

@native
interface THREE {
  @native var MaterialCount: Int

  @native var NoShading: Int

  @native var AdditiveAlphaBlending: Int

  @native var CullFaceNone: Int
  @native var CullFaceBack: Int
  @native var CullFaceFront: Int
  @native var CullFaceFrontBack: Int

  @native var FrontFaceDirectionCW: Int
  @native var FrontFaceDirectionCCW: Int

  // SHADOWING TYPES

  @native var BasicShadowMap: Int
  @native var PCFShadowMap: Int
  @native var PCFSoftShadowMap: Int

  // MATERIAL CONSTANTS

  // side

  @native var FrontSide: Int
  @native var BackSide: Int
  @native var DoubleSide: Int

  // shading

  @native var FlatShading: Int
  @native var SmoothShading: Int

  // colors

  @native var NoColors: Int
  @native var FaceColors: Int
  @native var VertexColors: Int

  // blending modes

  @native var NoBlending: Int
  @native var NormalBlending: Int
  @native var AdditiveBlending: Int
  @native var SubtractiveBlending: Int
  @native var MultiplyBlending: Int
  @native var CustomBlending: Int

  // custom blending equations
  // (numbers start from 100 not to clash with other
  // mappings to OpenGL constants defined in Texture.js)

  @native var AddEquation: Int
  @native var SubtractEquation: Int
  @native var ReverseSubtractEquation: Int
  @native var MinEquation: Int
  @native var MaxEquation: Int

  // custom blending destination factors

  @native var ZeroFactor: Int
  @native var OneFactor: Int
  @native var SrcColorFactor: Int
  @native var OneMinusSrcColorFactor: Int
  @native var SrcAlphaFactor: Int
  @native var OneMinusSrcAlphaFactor: Int
  @native var DstAlphaFactor: Int
  @native var OneMinusDstAlphaFactor: Int

  // custom blending source factors

  //@native var ZeroFactor: Int
  //@native var OneFactor: Int
  //@native var SrcAlphaFactor: Int
  //@native var OneMinusSrcAlphaFactor: Int
  //@native var DstAlphaFactor: Int
  //@native var OneMinusDstAlphaFactor: Int
  @native var DstColorFactor: Int
  @native var OneMinusDstColorFactor: Int
  @native var SrcAlphaSaturateFactor: Int

  // depth modes

  @native var NeverDepth: Int
  @native var AlwaysDepth: Int
  @native var LessDepth: Int
  @native var LessEqualDepth: Int
  @native var EqualDepth: Int
  @native var GreaterEqualDepth: Int
  @native var GreaterDepth: Int
  @native var NotEqualDepth: Int


  // TEXTURE CONSTANTS

  @native var MultiplyOperation: Int
  @native var MixOperation: Int
  @native var AddOperation: Int

  // Tone Mapping modes

  @native var NoToneMapping: Int // do not do any tone mapping, not even exposure (required for special purpose passes.)
  @native var LinearToneMapping: Int // only apply exposure.
  @native var ReinhardToneMapping: Int
  @native var Uncharted2ToneMapping: Int // John Hable
  @native var CineonToneMapping: Int  // optimized filmic operator by Jim Hejl and Richard Burgess-Dawson

  // Mapping modes

  @native var UVMapping: Int

  @native var CubeReflectionMapping: Int
  @native var CubeRefractionMapping: Int

  @native var EquirectangularReflectionMapping: Int
  @native var EquirectangularRefractionMapping: Int

  @native var SphericalReflectionMapping: Int
  @native var CubeUVReflectionMapping: Int
  @native var CubeUVRefractionMapping: Int

  // Wrapping modes

  @native var RepeatWrapping: Int
  @native var ClampToEdgeWrapping: Int
  @native var MirroredRepeatWrapping: Int

  // Filters

  @native var NearestFilter: Int
  @native var NearestMipMapNearestFilter: Int
  @native var NearestMipMapLinearFilter: Int
  @native var LinearFilter: Int
  @native var LinearMipMapNearestFilter: Int
  @native var LinearMipMapLinearFilter: Int

  // Data types

  @native var UnsignedByteType: Int
  @native var ByteType: Int
  @native var ShortType: Int
  @native var UnsignedShortType: Int
  @native var IntType: Int
  @native var UnsignedIntType: Int
  @native var FloatType: Int
  @native var HalfFloatType: Int

  // Pixel types

  //@native var UnsignedByteType: Int
  @native var UnsignedShort4444Type: Int
  @native var UnsignedShort5551Type: Int
  @native var UnsignedShort565Type: Int

  // Pixel formats

  @native var AlphaFormat: Int
  @native var RGBFormat: Int
  @native var RGBAFormat: Int
  @native var LuminanceFormat: Int
  @native var LuminanceAlphaFormat: Int
  // THREE.RGBEFormat handled as THREE.RGBAFormat in shaders
  @native var RGBEFormat : Int //1024;

  // DDS / ST3C Compressed texture formats

  @native var RGB_S3TC_DXT1_Format: Int
  @native var RGBA_S3TC_DXT1_Format: Int
  @native var RGBA_S3TC_DXT3_Format: Int
  @native var RGBA_S3TC_DXT5_Format: Int


  // PVRTC compressed texture formats

  @native var RGB_PVRTC_4BPPV1_Format: Int
  @native var RGB_PVRTC_2BPPV1_Format: Int
  @native var RGBA_PVRTC_4BPPV1_Format: Int
  @native var RGBA_PVRTC_2BPPV1_Format: Int

  // ETC compressed texture formats

  @native var RGB_ETC1_Format: Int

  // Loop styles for AnimationAction

  @native var LoopOnce: Int
  @native var LoopRepeat: Int
  @native var LoopPingPong: Int

  // Interpolation

  @native var InterpolateDiscrete: Int
  @native var InterpolateLinear: Int
  @native var InterpolateSmooth: Int

  // Interpolant ending modes

  @native var ZeroCurvatureEnding: Int
  @native var ZeroSlopeEnding: Int
  @native var WrapAroundEnding: Int

  // Triangle Draw modes

  @native var TrianglesDrawMode: Int
  @native var TriangleStripDrawMode: Int
  @native var TriangleFanDrawMode: Int

  // Texture Encodings

  @native var LinearEncoding: Int // No encoding at all.
  @native var sRGBEncoding: Int
  @native var GammaEncoding: Int // uses GAMMA_FACTOR, for backwards compatibility with WebGLRenderer.gammaInput/gammaOutput

  // The following Texture Encodings are for RGB-only (no alpha) HDR light emission sources.
  // These encodings should not specified as output encodings except in rare situations.
  @native var RGBEEncoding: Int // AKA Radiance.
  @native var LogLuvEncoding: Int
  @native var RGBM7Encoding: Int
  @native var RGBM16Encoding: Int
  @native var RGBDEncoding: Int
}
