package graphics.scenery

import org.joml.Matrix4f
import java.util.concurrent.CopyOnWriteArrayList

open class InstancedNode(template: Node) : DefaultNode("InstancedNode"), DelegatesRendering, DelegatesGeometry {
    /** instances */
    val instances = CopyOnWriteArrayList<Instance>()
    /** instanced properties */
    val instancedProperties = LinkedHashMap<String, () -> Any>()
    private val delegationType: DelegationType = DelegationType.ForEachNode
    override fun getDelegationType(): DelegationType {
        return delegationType
    }

    var template: Node? = template
        set(node) {
//            val instancedMaterial = ShaderMaterial.fromFiles("DefaultDeferredInstanced.vert", "DefaultDeferred.frag")
//            if(node.material.name.equals(Material.DefaultMaterial().name)) {
//                node.material = instancedMaterial
//            }
            instancedProperties.put("ModelMatrix", { node?.spatial()?.model ?: Matrix4f() })
            field = node
        }
    //    val updateStrategy = // TODO make enum for different strategies -> one time, every second (or fixed time interval), each frame

    init {
        boundingBox = template.generateBoundingBox()
    }

    override fun getDelegateRendering(): Renderable? {
        return template?.renderable()
    }
    override fun getDelegateGeometry(): Geometry? {
        return template?.geometry()
    }

    fun addInstance(): Instance {
        val node = Instance(this)
        node.instanceProperties.put("ModelMatrix", { node.spatial().world })
        node.boundingBox = node.generateBoundingBox()
        instances.add(node)
        return node
    }

    override fun generateBoundingBox(): OrientedBoundingBox? {
        //TODO? generate joint boundingbox of all instances, set bounding box
        return template?.generateBoundingBox()
    }

    class Instance(val instancedParent : InstancedNode, override var name: String = "Instance") : DefaultNode(name), HasRenderable, HasSpatial {
        var instanceProperties = LinkedHashMap<String, () -> Any>()

        override fun generateBoundingBox(): OrientedBoundingBox? {
            return instancedParent.template?.generateBoundingBox()
        }
    }
}
