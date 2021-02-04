package graphics.scenery

import graphics.scenery.utils.extensions.xyz
import org.joml.Vector3f
import org.joml.Vector4f

/**
 * Point light class.
 *
 * Point lights have an extent given as [lightRadius].
 * They also have an optional [Box] to accompany them for easier visualisation.
 *
 * @author Ulrik Günther <hello@ulrik.is>
 * @constructor Creates a PointLight with default settings, e.g. white emission color.
 */
class PointLight(radius: Float = 5.0f) : Light("PointLight") {
    private var proxySphere = Sphere(radius * 1.1f, 10)
    /** The intensity of the point light. Bound to [0.0, 1.0] if using non-HDR rendering. */
    @ShaderProperty
    override var intensity: Float = 100.0f

    /** The emission color of the point light. Setting it will also affect the accompanying Box' color. */
    @ShaderProperty
    override var emissionColor: Vector3f = Vector3f(1.0f, 1.0f, 1.0f)

    @ShaderProperty
    override val lightType: LightType = LightType.PointLight

    /** Maximum radius in world units */
    @Suppress("unused") // will be serialised into ShaderProperty buffer
    @ShaderProperty var lightRadius: Float = radius
        set(value) {
            if(value != lightRadius) {
                logger.info("Resetting light radius")
                field = value
                proxySphere = Sphere(value * 1.1f, 10)
                geometry {
                    val proxyGeom = proxySphere.geometry()
                    this.vertices = proxyGeom.vertices
                    this.normals = proxyGeom.normals
                    this.texcoords = proxyGeom.texcoords
                    this@PointLight.boundingBox = proxySphere.boundingBox
                    this.dirty = true
                }
            }
        }

    /** Node name of the Point Light */
    override var name = "PointLight"

    @Suppress("unused") // will be serialised into ShaderProperty buffer
    @ShaderProperty val worldPosition
        get(): Vector3f =
            if(this.parent != null && this.parent !is Scene) {
                this.spatial().world.transform(Vector4f(spatial().position.x(), spatial().position.y(), spatial().position.z(), 1.0f)).xyz()
            } else {
                Vector3f(spatial().position.x(), spatial().position.y(), spatial().position.z())
            }

    @Suppress("unused") // will be serialised into ShaderProperty buffer
    @ShaderProperty var debugMode = 0

    init {
        geometry {
            val proxyGeom = proxySphere.geometry()
            this.vertices = proxyGeom.vertices
            this.normals = proxyGeom.normals
            this.texcoords = proxyGeom.texcoords
            this.geometryType = proxyGeom.geometryType
            this.vertexSize = proxyGeom.vertexSize
            this.texcoordSize = proxyGeom.texcoordSize
            this@PointLight.boundingBox = proxySphere.boundingBox
        }
        renderable {
            material.blending.transparent = true
            material.blending.colorBlending = Blending.BlendOp.add
            material.blending.sourceColorBlendFactor = Blending.BlendFactor.One
            material.blending.destinationColorBlendFactor = Blending.BlendFactor.One
            material.blending.sourceAlphaBlendFactor = Blending.BlendFactor.One
            material.blending.destinationAlphaBlendFactor = Blending.BlendFactor.One
            material.blending.alphaBlending = Blending.BlendOp.add
            material.cullingMode = Material.CullingMode.Front
            material.depthTest = Material.DepthTest.Greater
        }
    }
}
