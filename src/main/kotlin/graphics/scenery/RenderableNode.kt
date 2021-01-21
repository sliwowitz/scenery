package graphics.scenery

import graphics.scenery.backends.Renderer
import graphics.scenery.utils.MaybeIntersects
import graphics.scenery.utils.extensions.max
import graphics.scenery.utils.extensions.minus
import graphics.scenery.utils.extensions.plus
import graphics.scenery.utils.extensions.times
import graphics.scenery.utils.extensions.xyz
import graphics.scenery.utils.extensions.xyzw
import org.joml.Matrix4f
import org.joml.Quaternionf
import org.joml.Vector3f
import org.joml.Vector4f
import java.util.*
import java.util.concurrent.locks.ReentrantLock
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.math.max
import kotlin.math.min
import kotlin.reflect.KProperty1
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.isAccessible

/**
 * Class describing a [Node] of a [Scene], inherits from [Renderable]
 *
 * @author Ulrik Günther <hello@ulrik.is>
 * @constructor Creates a node with default settings, e.g. identity matrices
 *  for model, view, projection, etc.
 * @property[name] The name of the [Node]
 */
open class RenderableNode(override var name: String = "Node") : AbstractNode(name), Renderable {

    final override var material: Material = Material.DefaultMaterial()
    override var initialized: Boolean = false
    override var state : State = State.Ready
    override var dirty: Boolean = true
    override var lock: ReentrantLock = ReentrantLock()
    override fun init(): Boolean {
        return true
    }
    override var isBillboard: Boolean = false

    override fun preUpdate(renderer: Renderer, hub: Hub?) {
    }

    override fun preDraw(): Boolean {
        return true
    }

    @Transient private val shaderPropertyFieldCache = HashMap<String, KProperty1<RenderableNode, *>>()
    override fun getShaderProperty(name: String): Any? {
        // first, try to find the shader property in the cache, and either return it,
        // or, if the member of the cache is the shaderProperties HashMap, return the member of it.
        val f = shaderPropertyFieldCache[name]
        if (f != null) {
            val value = f.get(this)

            return if (value !is HashMap<*, *>) {
                f.get(this)
            } else {
                value.get(name)
            }
        }

        // First fallthrough: In case the field is not in the cache, check all member properties
        // containing the [ShaderProperty] annotation. If the property is found,
        // cache it for performance reasons and return it.
        val field = this.javaClass.kotlin.memberProperties.find { it.name == name && it.findAnnotation<ShaderProperty>() != null }

        if (field != null) {
            field.isAccessible = true

            shaderPropertyFieldCache.put(name, field)

            return field.get(this)
        }

        // Last fallthrough: If [name] cannot be found as a property, try to locate it in the
        // shaderProperties HashMap and return it. If it cannot be found here either, return null.
        this.javaClass.kotlin.memberProperties
            .filter { it.findAnnotation<ShaderProperty>() != null }
            .forEach {
                it.isAccessible = true
                if(logger.isTraceEnabled) {
                    logger.trace("ShaderProperty of ${this.name}: ${it.name} ${it.get(this)?.javaClass}")
                }
            }
        val mappedProperties = this.javaClass.kotlin.memberProperties
            .firstOrNull {
                it.findAnnotation<ShaderProperty>() != null && it.get(this) is HashMap<*, *> && it.name == "shaderProperties"
            }

        return if (mappedProperties == null) {
            logger.warn("Could not find shader property '$name' in class properties or properties map!")
            null
        } else {
            mappedProperties.isAccessible = true

            @Suppress("UNCHECKED_CAST")
            val map = mappedProperties.get(this) as? HashMap<String, Any>
            if (map == null) {
                logger.warn("$this: $name not found in shaderProperties hash map")
                null
            } else {
                shaderPropertyFieldCache.put(name, mappedProperties)
                map.get(name)
            }
        }
    }

    override fun renderable() : Renderable {
        return this
    }
}
