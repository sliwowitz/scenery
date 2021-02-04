package graphics.scenery.effectors

import graphics.scenery.*
import graphics.scenery.volumes.Volume

/**
 * Volume effector class
 *
 * @author Ulrik Guenther <hello@ulrik.is>
 */
open class VolumeEffector : DefaultNode("VolumeEffector"), HasRenderable, HasSpatial {
    /** Whether this effector node is currently active */
    var active: Boolean = false
        private set

    /** The volume this effector is associated with */
    var activeVolume: Node? = null
        private set

    /** Proxy node to display e.g. auxiliary geometry. */
    open var proxy: Node = DefaultNode("proxy")

    init {
        update.add {
            getScene()?.let {
                it.discover(it, { it is Volume }).forEach { node ->
                    if (proxy.spatial()?.intersects(node) ?: false) {
                        activeVolume = node
                    }
                }
            }
        }
    }
}
