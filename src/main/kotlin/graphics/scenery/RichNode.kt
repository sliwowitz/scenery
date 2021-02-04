package graphics.scenery

open class RichNode(override var name: String = "Node") : DefaultNode (name), HasRenderable, HasSpatial
