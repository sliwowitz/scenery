package graphics.scenery.websocketserver

import kotlinx.serialization.*
import graphics.scenery.Node
import java.util.*

@Serializable
open class ExchangeNodeIdentity private constructor(
    val name: String,
    @Serializable(with = UUIDSerializer::class) val uuid: UUID,
    val nodeType: String,
    val spatial: Boolean,
    val geometry: Boolean,
    val renderable: Boolean,
    val material: Boolean
) {
    constructor(node: Node) : this(
        name = node.name,
        uuid = node.getUuid(),
        nodeType = node.nodeType,
        spatial = when (node.spatialOrNull()) {
            null -> false
            else -> true
        },
        geometry = when (node.geometryOrNull()) {
            null -> false
            else -> true
        },
        renderable = when (node.renderableOrNull()) {
            null -> false
            else -> true
        },
        material = when (node.materialOrNull()) {
            null -> false
            else -> true
        },
    )
}
