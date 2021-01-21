package graphics.scenery

import graphics.scenery.backends.Renderer
import graphics.scenery.utils.MaybeIntersects
import org.joml.Matrix4f
import org.joml.Quaternionf
import org.joml.Vector3f
import java.io.Serializable
import java.util.*
import java.util.concurrent.CopyOnWriteArrayList
import java.util.function.Consumer
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

interface Node : Serializable, SpaceAware {
    var material: Material
    var name: String
    /** Children of the Node. */
    var children: CopyOnWriteArrayList<Node>
    /** Other nodes that have linked transforms. */
    var linkedNodes: CopyOnWriteArrayList<Node>
    /** Parent node of this node. */
    var parent: Node?
    /** Creation timestamp of the node. */
    var createdAt: Long
    /** Modification timestamp of the node. */
    var modifiedAt: Long
    /** Flag to set whether the object is visible or not. */
    var visible: Boolean
    var discoveryBarrier: Boolean
    /** Hash map used for storing metadata for the Node. [Renderer] implementations use
     * it to e.g. store renderer-specific state. */
    var metadata: HashMap<String, Any>
    /** Node update routine, called before updateWorld */
    var update: ArrayList<() -> Unit>
    val logger: org.slf4j.Logger

    /** Unique ID of the Node */
    fun getUuid(): UUID

    /**
     * Attaches a child node to this node.
     *
     * @param[child] The child to attach to this node.
     */
    fun addChild(child: Node)

    /**
     * Removes a given node from the set of children of this node.
     *
     * @param[child] The child node to remove.
     */
    fun removeChild(child: Node): Boolean

    /**
     * Removes a given node from the set of children of this node.
     * If possible, use [removeChild] instead.
     *
     * @param[name] The name of the child node to remove.
     */
    fun removeChild(name: String): Boolean

    /**
     * Returns all children with the given [name].
     */
    fun getChildrenByName(name: String): List<Node>

    fun renderable(): Renderable?

    /**
     * Returns the [Scene] this Node is ultimately attached to.
     * Will return null in case the Node is not attached to a [Scene] yet.
     */
    fun getScene(): Scene?

    /**
     *  Runs an operation recursively on the node itself and all child nodes.
     *
     *  @param[func] A lambda accepting a [Node], representing this node and its potential children.
     */
    fun runRecursive(func: (Node) -> Unit)

    /**
     *  Runs an operation recursively on the node itself and all child nodes.
     *
     *  @param[func] A Java [Consumer] accepting a [Node], representing this node and its potential children.
     */
    fun runRecursive(func: Consumer<Node>)

    companion object NodeHelpers {
        /**
         * Depth-first search for elements in a Scene.
         *
         * @param[origin] The [Node] to start the search at.
         * @param[func] A lambda taking a [Node] and returning a Boolean for matching.
         * @return A list of [Node]s that match [func].
         */
        @Suppress("unused")
        fun discover(origin: Node, func: (Node) -> Boolean): ArrayList<Node> {
            val visited = HashSet<Node>()
            val matched = ArrayList<Node>()

            fun discover(current: Node, f: (Node) -> Boolean) {
                if (!visited.add(current)) return
                for (v in current.children) {
                    if (f(v)) {
                        matched.add(v)
                    }
                    discover(v, f)
                }
            }

            discover(origin, func)

            return matched
        }
    }

    var nodeType: String
}
