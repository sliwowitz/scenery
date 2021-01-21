package graphics.scenery

import graphics.scenery.backends.Renderer
import graphics.scenery.utils.MaybeIntersects
import org.joml.Matrix4f
import org.joml.Quaternionf
import org.joml.Vector3f
import java.util.concurrent.locks.ReentrantLock

/**
 * Generic interface for objects that can be rendered
 *
 * Matrices that are set to null shall be treated as identity matrix
 * by the renderer. See e.g. [projection] or [view].
 *
 * @author Ulrik Günther <hello@ulrik.is>
 */
interface Renderable : Node {

    /** Whether the object has been initialized. Used by renderers. */
    var initialized: Boolean

    /** State of the Node **/
    var state: State
    /** Whether the object is dirty and somehow needs to be updated. Used by renderers. */
    var dirty: Boolean
    /** Flag to set whether the object is a billboard and will always face the camera. */
    var isBillboard: Boolean

    /** [ReentrantLock] to be used if the object is being updated and should not be
     * touched in the meantime. */
    var lock: ReentrantLock

    /** Initialisation function for the object */
    fun init(): Boolean
    fun preUpdate(renderer: Renderer, hub: Hub?)

    /**
     * PreDraw function, to be called before the actual rendering, useful for
     * per-timestep preparation.
     */
    fun preDraw(): Boolean
    /**
     * Returns the [ShaderProperty] given by [name], if it exists and is declared by
     * this class or a subclass inheriting from [Node]. Returns null if the [name] can
     * neither be found as a property, or as member of the shaderProperties HashMap the Node
     * might declare.
     */
    fun getShaderProperty(name: String): Any?
}
