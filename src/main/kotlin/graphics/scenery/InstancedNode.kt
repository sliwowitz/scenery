package graphics.scenery

import java.util.concurrent.CopyOnWriteArrayList

open class InstancedNode(template: Node, override var name: String = "InstancedNode") : DelegatesRendering(DelegationType.ForEachNode, template) {
    /** instances */
    val instances = CopyOnWriteArrayList<Instance>()
    /** instanced properties */
    val properties = LinkedHashMap<String, () -> Any>()
    private var template: Node = template
        set(node) {
            field = node
            val instancedMaterial = ShaderMaterial.fromFiles("DefaultDeferredInstanced.vert", "DefaultDeferred.frag")
            if(node.material.materialHashCode() != instancedMaterial.materialHashCode() ) {
                node.material = instancedMaterial
            }
            delegate = node
            properties.put("ModelMatrix", node::model)
        }
    //    val updateStrategy = // TODO make enum for different strategies -> one time, every second (or fixed time interval), each frame

    init {
        boundingBox = this.template.generateBoundingBox()
        this.template = template
    }

    fun addInstance(): Node {
        val node = Instance()
        node.properties.put("ModelMatrix", node::world)
        instances.add(node)
        return node
    }

    override fun init(): Boolean {
        return template.init()
    }

    override fun generateBoundingBox(): OrientedBoundingBox? {
        //TODO generate joint boundingbox of all instances, set bounding box
        this.boundingBox = template.generateBoundingBox()
        return boundingBox
    }

    class Instance(override var name: String = "Instance") : Mesh(name) {
        var properties = LinkedHashMap<String, () -> Any>()
    }
}
