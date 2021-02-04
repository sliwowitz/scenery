package graphics.scenery

import graphics.scenery.backends.Renderer
import graphics.scenery.utils.MaybeIntersects
import org.joml.Matrix4f
import org.joml.Quaternionf
import org.joml.Vector3f
import java.util.*
import java.util.concurrent.locks.ReentrantLock
import kotlin.collections.HashMap

/**
 * Generic interface for objects that can be rendered
 *
 * Matrices that are set to null shall be treated as identity matrix
 * by the renderer. See e.g. [projection] or [view].
 *
 * @author Ulrik Günther <hello@ulrik.is>
 */
interface Renderable {

    var material: Material

    /** Whether the object has been initialized. Used by renderers. */
    var initialized: Boolean

    /** State of the Node **/
    var state: State
    /** Flag to set whether the object is a billboard and will always face the camera. */
    var isBillboard: Boolean

    /** [ReentrantLock] to be used if the object is being updated and should not be
     * touched in the meantime. */
    var lock: ReentrantLock

    /** Hash map used for storing metadata for the [Renderable]. [Renderer] implementations use
     * it to e.g. store renderer-specific state. */
    var metadata: HashMap<String, Any>

    /** Unique ID of the Renderable */
    fun getUuid(): UUID

    /** Initialisation function for the object */
    fun init(): Boolean
    fun preUpdate(renderer: Renderer, hub: Hub?)

    /**
     * PreDraw function, to be called before the actual rendering, useful for
     * per-timestep preparation.
     */
    fun preDraw(): Boolean
}

interface HasRenderable: Node {

    fun createRenderable(): Renderable {
        return DefaultRenderable()
    }

    override fun renderable(block: Renderable.() -> Unit): Renderable {
        var prop = super.renderable(block)
        if(prop == null) {
            prop = createRenderable()
            addProperties(Renderable::class.java, prop)
            prop.block()
        }
        return prop
    }

    override fun renderable(): Renderable {
        return this.renderable({})
    }
}
