package graphics.scenery

import java.util.concurrent.CopyOnWriteArrayList

open class InstancedNode(template: Renderable, override var name: String = "InstancedNode") : DelegatesRendering(DelegationType.ForEachNode, template) {
    /** instances */
    val instances = CopyOnWriteArrayList<Instance>()
    /** instanced properties */
    val properties = LinkedHashMap<String, () -> Any>()
    private var template: Renderable = template
        set(node) {
            val instancedMaterial = ShaderMaterial.fromFiles("DefaultDeferredInstanced.vert", "DefaultDeferred.frag")
            if(node.material.name.equals(Material.DefaultMaterial().name)) {
                node.material = instancedMaterial
            }
            properties.put("ModelMatrix", node::model)
            delegate = node
            field = node
        }
    //    val updateStrategy = // TODO make enum for different strategies -> one time, every second (or fixed time interval), each frame

    init {
        boundingBox = this.template.generateBoundingBox()
        this.template = template
    }

    fun addInstance(): Instance {
        val node = Instance(this)
        node.properties.put("ModelMatrix", node::world)
        node.boundingBox = node.generateBoundingBox()
        instances.add(node)
        return node
    }

    override fun generateBoundingBox(): OrientedBoundingBox? {
        //TODO generate joint boundingbox of all instances, set bounding box
        this.boundingBox = template.generateBoundingBox()
        return boundingBox
    }

    class Instance(val instancedParent : InstancedNode, override var name: String = "Instance") : Mesh(name) {
        var properties = LinkedHashMap<String, () -> Any>()

        override fun generateBoundingBox(): OrientedBoundingBox? {
            return instancedParent.template.generateBoundingBox()
        }
    }
}
