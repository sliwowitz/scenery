package graphics.scenery.backends.vulkan

import kool.set
import org.lwjgl.system.MemoryUtil.*
import org.lwjgl.vulkan.VK10.*
import org.lwjgl.vulkan.VkCommandBuffer
import org.lwjgl.vulkan.VkFenceCreateInfo
import vkk.*
import vkk.entities.VkFence
import vkk.extensionFunctions.begin
import vkk.extensionFunctions.reset
import java.nio.LongBuffer

/**
 * Vulkan Command Buffer class. Wraps command buffer and fencing functionality.
 * Allocates the command buffer on [device], and can wrap an existing raw [commandBuffer].
 * [VulkanCommandBuffer]s are by default [fenced].
 *
 * @author Ulrik Günther <hello@ulrik.is>
 */
class VulkanCommandBuffer(val device: VulkanDevice, var commandBuffer: VkCommandBuffer?, val fenced: Boolean = true) : AutoCloseable {
    /** Whether this command buffer is stale and needs to be re-recorded. */
    var stale: Boolean = true

    private var fenceInitialized: Boolean = false
    private var fence = VkFence()

    /** Whether this command buffer has already been submitted to a queue. */
    var submitted = false

    val vkDev get() = device.vulkanDevice

    init {
        if (fenced) {
            addFence()
        }
    }

    /**
     * Adds a fence to this command buffer for synchronisation.
     */
    fun addFence() {
        fence = vkDev.createFence(vk.FenceCreateInfo())
        fenceInitialized = true
    }

    /**
     * Waits for the command buffer's execution to complete via a fence,
     * waiting for [timeout] milliseconds.
     */
    fun waitForFence(timeout: Long? = null) {
        if (fenced && fenceInitialized)
            vkDev.waitForFence(fence, true, timeout ?: -1L)
    }

    /**
     * Resets this command buffer's fence.
     */
    fun resetFence() {
        if (fenced && fenceInitialized)
            vkDev.resetFence(fence)
    }

    /**
     * Returns a reference to the fence, or null if the command buffer is not [fenced].
     */
    fun getFence(): VkFence {
        return when {
            fenced -> fence
            else -> return VkFence.NULL
        }
    }

    /**
     * Closes and deallocates this command buffer.
     */
    override fun close() {
        if (fenced && fenceInitialized) {
            vkDev.destroyFence(fence)
        }
    }

    /**
     * Prepares this command buffer for recording, either initialising or
     * resetting the associated Vulkan command buffer. Recording will take place in command pool [pool].
     */
    fun prepareAndStartRecording(pool: Long): VkCommandBuffer {
        // start command buffer recording
        if (commandBuffer == null) {
            commandBuffer = VU.newCommandBuffer(device, pool, autostart = true)
        }

        return commandBuffer!!.apply {
            reset()
            begin(VkCommandBufferUsage.SIMULTANEOUS_USE_BIT.i)
        }
    }
}
