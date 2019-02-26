package graphics.scenery.backends;

/**
 * * <Description>
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\fH&J \u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0000H&J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H&JJ\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H&\u00f8\u0001\u0000\u00a2\u0006\u0004\b(\u0010)J\b\u0010*\u001a\u00020\u001aH&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lgraphics/scenery/backends/Display;", "", "getEyeProjection", "Lcleargl/GLMatrix;", "eye", "", "nearPlane", "", "farPlane", "getHeadToEyeTransform", "getIPD", "getRenderTargetSize", "Lcleargl/GLVector;", "getVulkanDeviceExtensions", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "physicalDevice", "Lorg/lwjgl/vulkan/VkPhysicalDevice;", "getVulkanInstanceExtensions", "", "getWorkingDisplay", "hasCompositor", "", "initializedAndWorking", "submitToCompositor", "", "textureId", "submitToCompositorVulkan", "width", "height", "format", "instance", "Lorg/lwjgl/vulkan/VkInstance;", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "image", "Lvkk/entities/VkImage;", "submitToCompositorVulkan-nscd4to", "(IIILorg/lwjgl/vulkan/VkInstance;Lgraphics/scenery/backends/vulkan/VulkanDevice;Lorg/lwjgl/vulkan/VkQueue;J)V", "update", "scenery"})
public abstract interface Display {

    /**
     * * Returns the per-eye projection matrix
     * *
     * * @param[eye] The index of the eye
     * * @return GLMatrix containing the per-eye projection matrix
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLMatrix getEyeProjection(int eye, float nearPlane, float farPlane);

    /**
     * * Returns the inter-pupillary distance (IPD)
     * *
     * * @return IPD as Float
     */
    public abstract float getIPD();

    /**
     * * Query the HMD whether a compositor is used or the renderer should take
     * * care of displaying on the HMD on its own.
     * *
     * * @return True if the HMD has a compositor
     */
    public abstract boolean hasCompositor();

    /**
     * * Submit OpenGL texture IDs to the compositor. The texture is assumed to have the left eye in the
     * * left half, right eye in the right half.
     * *
     * * @param[textureId] OpenGL Texture ID of the left eye texture
     */
    public abstract void submitToCompositor(int textureId);

    /**
     * * Returns the optimal render target size for the HMD as 2D vector
     * *
     * * @return Render target size as 2D vector
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLVector getRenderTargetSize();

    /**
     * * Check whether the HMD is initialized and working
     * *
     * * @return True if HMD is initialiased correctly and working properly
     */
    public abstract boolean initializedAndWorking();

    /**
     * * update state
     */
    public abstract void update();

    /**
     * * Returns a [List] of Vulkan instance extensions required by the device.
     * *
     * * @return [List] of strings containing the required instance extensions
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getVulkanInstanceExtensions();

    /**
     * * Returns a [List] of Vulkan device extensions required by the device.
     * *
     * * @return [List] of strings containing the required device extensions
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<java.lang.String> getVulkanDeviceExtensions(@org.jetbrains.annotations.NotNull()
                                                                                        org.lwjgl.vulkan.VkPhysicalDevice physicalDevice);

    /**
     * * Returns a [Display] instance, if working currently
     * *
     * * @return Either a [Display] instance, or null.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract graphics.scenery.backends.Display getWorkingDisplay();

    /**
     * * Returns the per-eye transform that moves from head to eye
     * *
     * * @param[eye] The eye index
     * * @return GLMatrix containing the transform
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLMatrix getHeadToEyeTransform(int eye);

    /**
     * * <Description>
     * *
     * * @author Ulrik Günther <hello@ulrik.is>
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}
