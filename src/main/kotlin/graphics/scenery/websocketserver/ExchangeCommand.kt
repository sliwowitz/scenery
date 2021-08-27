package graphics.scenery.websocketserver

import graphics.scenery.Node
import kotlinx.serialization.*
import org.joml.Quaternionf
import org.joml.Vector3f
import java.util.*

@Serializable
sealed class ExchangePayload {}

enum class ValueMode {
    REPLACE, ADD, MULTIPLY
}

@Serializable
open class ExchangeCommand(
    val command: String,
    @Serializable(with = UUIDSerializer::class) val uuid: UUID,
    val payload: ExchangePayload?
)

@Serializable
open class ExchangeState(
    val variable: String,
    @Serializable(with = UUIDSerializer::class) val uuid: UUID,
    val payload: ExchangePayload?
)

@Serializable
open class ExchangeFloat(
    val value: Float
) : ExchangePayload()

@Serializable
open class ExchangeVector3f(
    val x: Float,
    val y: Float,
    val z: Float
) : ExchangePayload() {
    constructor(vector: Vector3f) : this(
        x = vector.x,
        y = vector.y,
        z = vector.z,
    )
}

@Serializable
open class ExchangeQuaternionf(
    val x: Float,
    val y: Float,
    val z: Float,
    val w: Float
) : ExchangePayload(){
    constructor(quaternion: Quaternionf) : this(
        x = quaternion.x,
        y = quaternion.y,
        z = quaternion.z,
        w = quaternion.w
    )
}

@Serializable
open class ExchangeVectorComponent(
    val component: Int,
    val value: Float,
    val mode: ValueMode? = null
) : ExchangePayload()

@Serializable
open class ExchangeAttributeSpec(
    val group: String,
    val name: String,
) : ExchangePayload()

@Serializable
open class ExchangeAttributeValue(
    val group: String,
    val name: String,
    val attributeClass: String?,
    val attributeValue: String?
) : ExchangePayload()

