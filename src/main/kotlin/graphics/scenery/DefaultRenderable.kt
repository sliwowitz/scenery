package graphics.scenery

import graphics.scenery.backends.Renderer
import graphics.scenery.utils.LazyLogger
import java.util.*
import java.util.concurrent.locks.ReentrantLock
import kotlin.collections.HashMap
import kotlin.reflect.KProperty1
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.isAccessible

open class DefaultRenderable: Renderable {
    @Transient override var metadata: HashMap<String, Any> = HashMap()
    override var material: Material = Material.DefaultMaterial()
    override var initialized: Boolean = false
    override var state : State = State.Ready
    override var lock: ReentrantLock = ReentrantLock()
    val logger by LazyLogger()
    override fun init(): Boolean {
        return true
    }

    private var uuid: UUID = UUID.randomUUID()
    override fun getUuid(): UUID {
        return uuid
    }
    override var isBillboard: Boolean = false

    override fun preUpdate(renderer: Renderer, hub: Hub?) {
    }

    override fun preDraw(): Boolean {
        return true
    }

}
