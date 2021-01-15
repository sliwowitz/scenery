package graphics.scenery

open class InstancedNode(template: Node, override var name: String = "InstancedNode") : DelegatesRendering(DelegationType.ForEachNode, template) {
    init {
        boundingBox = template.generateBoundingBox()
        template.also { this.template = it }
    }

    //    val instances = CopyOnWriteArrayList<Instance>()
    //    var properties = LinkedHashMap<String, () -> Any>()

    //    val updateStrategy = // TODO make enum for different strategies -> one time, every second (or fixed time interval), each frame
    private var template: Node = template
        set(node) {
            field = node
            val instancedMaterial = ShaderMaterial.fromFiles("DefaultDeferredInstanced.vert", "DefaultDeferred.frag")
            if(node.material.materialHashCode() != instancedMaterial.materialHashCode() ) {
                node.material = instancedMaterial
            }
            delegate = node
            instancedProperties.put("ModelMatrix", template::model)
        }

    fun addInstance(): Node {
        val node = Instance()
        node.instancedProperties.put("ModelMatrix", node::world)
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
//        var properties = LinkedHashMap<String, () -> Any>()
    }
}
