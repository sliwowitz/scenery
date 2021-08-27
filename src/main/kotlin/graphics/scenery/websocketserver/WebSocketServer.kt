package graphics.scenery.websocketserver

import graphics.scenery.Hub
import graphics.scenery.Hubable
import graphics.scenery.Node
import graphics.scenery.utils.LazyLogger
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.http.cio.websocket.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.websocket.*
import kotlinx.serialization.SerializationException
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.util.*

import kotlin.concurrent.thread
import kotlin.reflect.full.memberProperties

/**
 * WebSocket server, attached to a [hub].
 *
 * Internal naming conventions for functions:
 *  - "get" prefix: returns serialized JSON objects ready to be sent by the websocket
 *      - e.g. getAllNodes(): String, getRotation(uuid): String
 *  - name/description of retrieved objects: directly returns the retrieved objects
 *      - e.g. allNodes(): List<Node>, nodeByUUID(uuid): Node
 *  - action verb or "set" prefix: setting the [Node]s values
 *      - e.g. rotate(...), setColor(...)
 *
 * @author Jiri Vyskocil <jiri@vyskocil.com>
 */
class WebSocketServer(override var hub: Hub?) : Hubable {
    private val port = 8765
    private val logger by LazyLogger()

    init {
        thread {
            startServer()
        }
    }

    private fun startServer() {
        embeddedServer(Netty, port = this.port) {
            install(WebSockets)
            routing {
                get("/") {
                    val text = WebSocketServer::class.java.getResource("client.html").readText()
                    call.respondText(text, contentType = ContentType.Text.Html.withCharset(Charsets.UTF_8))
                }
                get("/favicon.ico") {
                    val bytes = WebSocketServer::class.java.getResource("favicon.ico").readBytes()
                    call.respondBytes(bytes, contentType = ContentType("image", "x-icon"))
                }
                webSocket("/ws") {
                    for (frame in incoming) {
                        when (frame) {
                            is Frame.Text -> {
                                val text = frame.readText()
                                logger.debug("RECEIVED: $text")
                                when (text) {
                                    "hello" -> {
                                        send("Hello from Scenery WS!")
                                    }
                                    "getAllNodes" -> {
                                        val data = getAllNodes()
                                        send("{ \"nodes\": $data }")
                                    }
                                    "getCommandTemplate" -> {
                                        val command = ExchangeCommand("CommandTemplate", UUID(0, 0), ExchangeFloat(0.0f))
                                        send(Json.encodeToString(command))
                                    }
                                    else -> {
                                        try {
                                            val command = Json.decodeFromString<ExchangeCommand>(text)
                                            val data = executeCommand(command)
                                            send(data)
                                        } catch (e: SerializationException) {
                                            println("SerializationException: " + e.message)
                                        }
                                    }
                                }
                            }
                            else -> println("WS: Response to frame type " + frame.javaClass.kotlin.qualifiedName + " not implemented")
                        }
                    }
                }
            }
        }.start(wait = true)
    }

    private fun executeCommand(command: ExchangeCommand): String =
        when (command.command) {
            /* TODO: Add position, material color, camera FoV (projection matrix), colormap (volume)
                     Rename rotx to "rotation" (maybe create a command with a Vector) */
            "getAttribute" -> {
                var attributeSpec = command.payload as ExchangeAttributeSpec
                getAttribute(command.uuid, attributeSpec.group, attributeSpec.name)
            }
            "getRotation" -> getRotation(command.uuid)
            "getPosition" -> getPosition(command.uuid)
            "getColor" -> getColor(command.uuid)
            "getColorMap" -> getColorMap(command.uuid)
            "getCameraFoV" -> getCameraFoV(command.uuid)
            "scale" -> scale(command.uuid, (command.payload as ExchangeFloat).value)
            "rotate" -> {
                var parameter = command.payload as ExchangeVectorComponent
                rotate(command.uuid, parameter.component, parameter.value)
            }
            "move" -> {
                var parameter = command.payload as ExchangeVectorComponent
                move(command.uuid, parameter.component, parameter.value, parameter.mode)
            }
            else -> "ERROR: Command not understood!"
        }

    private fun nodeByUUID(uuid: UUID): Node? {
        val scene = hub?.getApplication()?.scene ?: return null
        val nodes = scene.discover(scene, { n -> n.getUuid() == uuid })
        return nodes.firstOrNull()
    }

    private fun nodeAttribute(uuid: UUID, attributeGroup: String, attributeName: String): Pair<String?, Any?> {
        val node = nodeByUUID(uuid) ?: return Pair(null, null)
        val group = when (attributeGroup) {
            "spatial" -> node.spatialOrNull()
            "geometry" -> node.geometryOrNull()
            "material" -> node.materialOrNull()
            "renderable" -> node.renderableOrNull()
            else -> null
        }
        val attribute = group?.javaClass?.kotlin?.memberProperties?.first { it.name == attributeName }?.get(node)
        return Pair(attribute?.javaClass?.kotlin?.qualifiedName, attribute)
    }

    private fun allNodes(): List<Node> {
        val scene = hub?.getApplication()?.scene ?: return emptyList()
        return scene.discover(scene, { _ -> true })
    }

    private fun getAllNodes(): String {
        var nodes = allNodes()
        var commNodes = nodes.map { ExchangeNodeIdentity(it) }
        return Json.encodeToString(commNodes)
    }

    private fun getAttribute(uuid: UUID, attributeGroup: String, attributeName: String): String {
        val (attributeClass, attributeValue) = nodeAttribute(uuid, attributeGroup, attributeName)
        val payload = ExchangeAttributeValue(attributeGroup, attributeName, attributeClass, attributeValue.toString())
        return Json.encodeToString(ExchangeState("attribute", uuid, payload))
    }

    private fun getRotation(uuid: UUID): String {
        val node = nodeByUUID(uuid)
        val rotation = node?.spatialOrNull()?.rotation
        return if (rotation != null) {
            Json.encodeToString(ExchangeState("rotation", uuid, ExchangeQuaternionf(rotation)))
        } else {
            "ERROR: rotation is null!"
        }
    }

    private fun getPosition(uuid: UUID): String {
        val node = nodeByUUID(uuid)
        val position = node?.spatialOrNull()?.position
        return if (position != null) {
            Json.encodeToString(ExchangeState("position", uuid, ExchangeVector3f(position)))
        } else {
            "ERROR: position is null!"
        }
    }

    private fun getColor(uuid: UUID): String {
        return "NOT IMPLEMENTED"
    }

    private fun getColorMap(uuid: UUID): String {
        // Volumetric only
        return "NOT IMPLEMENTED"
    }

    private fun getCameraFoV(uuid: UUID): String {
        // Camera type only
        return "NOT IMPLEMENTED"
    }

    private fun rotate(uuid: UUID, component: Int, amount: Float): String {
        val node = nodeByUUID(uuid)
        node?.ifSpatial {
            //TODO: Something like `rotation[qComponent] = amount` possible?
            when (component) {
                0 -> rotation.x = amount
                1 -> rotation.y = amount
                2 -> rotation.z = amount
                3 -> rotation.w = amount
            }
            needsUpdate = true
        } ?: return "ERROR: Rotate failed!"
        return "Rotate OK"
    }

    private fun scale(uuid: UUID, sc: Float): String {
        val node = nodeByUUID(uuid)
        node?.ifSpatial {
            scale = scale.mul(sc)
        } ?: return "ERROR: Scale failed!"
        return "Scale OK"
    }

    private fun move(uuid: UUID, component: Int, amount: Float, mode: ValueMode?): String {
        val node = nodeByUUID(uuid)
        node?.ifSpatial {
            when (mode) {
                ValueMode.ADD -> when (component) {
                    0 -> position.x += amount
                    1 -> position.y += amount
                    2 -> position.z += amount
                }
                ValueMode.REPLACE -> when (component) {
                    0 -> position.x = amount
                    1 -> position.y = amount
                    2 -> position.z = amount
                }
            }
            needsUpdate = true
        } ?: return "ERROR: Move failed!"
        return "Move OK"
    }
}
