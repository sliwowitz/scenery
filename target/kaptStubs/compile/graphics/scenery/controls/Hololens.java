package graphics.scenery.controls;

/**
 * * Hololens HMD class
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @constructor Creates a new Hololens HMD instance
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u007fB\u0005\u00a2\u0006\u0002\u0010\u0004J\"\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J \u0010I\u001a\u00020\u00182\u0006\u0010J\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020LH\u0016J\u0010\u0010N\u001a\u00020\u00182\u0006\u0010J\u001a\u00020\u000eH\u0016J\b\u0010O\u001a\u00020LH\u0016J\b\u0010P\u001a\u00020&H\u0016J\u0010\u0010P\u001a\u00020&2\u0006\u0010Q\u001a\u000209H\u0016J\b\u0010R\u001a\u00020\u0018H\u0016J\u0010\u0010S\u001a\u00020\u00182\u0006\u0010J\u001a\u00020\u000eH\u0016J\b\u0010T\u001a\u00020\u001eH\u0016J\b\u0010U\u001a\u00020\u001eH\u0016J\\\u0010V\u001a\u0014\u0012\b\u0012\u00060\u0012R\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00112\u0006\u0010W\u001a\u00020\u00142\u0006\u0010X\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020<2\u0006\u0010C\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u001bH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b_\u0010`J\u001c\u0010a\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020D0b2\u0006\u0010c\u001a\u00020dH\u0016J\u0016\u0010e\u001a\b\u0012\u0004\u0012\u0002090f2\u0006\u0010g\u001a\u00020hH\u0016J\u000e\u0010i\u001a\b\u0012\u0004\u0012\u0002090\u0010H\u0016J\n\u0010j\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010k\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010l\u001a\u00020mH\u0016J\b\u0010n\u001a\u00020mH\u0016J\u0018\u0010o\u001a\u00020p2\u0006\u0010C\u001a\u00020D2\u0006\u0010q\u001a\u00020pH\u0016J\u0018\u0010o\u001a\u00020p2\u0006\u0010r\u001a\u00020d2\u0006\u0010q\u001a\u00020pH\u0016J\u0010\u0010s\u001a\u00020B2\u0006\u0010t\u001a\u00020\u000eH\u0016JJ\u0010u\u001a\u00020B2\u0006\u0010X\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020\u000e2\u0006\u0010v\u001a\u00020w2\u0006\u0010C\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010x\u001a\u00020yH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\bz\u0010{J\u0010\u0010|\u001a\u00020B2\u0006\u0010}\u001a\u000209H\u0002J\b\u0010~\u001a\u00020BH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u00060\u0012R\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00180\u00180\u0017X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0019R\u0013\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010%\u001a\n \u0007*\u0004\u0018\u00010&0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010/\u001a\n \u0007*\u0004\u0018\u00010\u001e0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u001802X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\u001802X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u00105\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00107\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:08X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010?\u001a\n \u0007*\u0004\u0018\u00010@0@X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0080\u0001"}, d2 = {"Lgraphics/scenery/controls/Hololens;", "Lgraphics/scenery/controls/TrackerInput;", "Lgraphics/scenery/backends/Display;", "Lgraphics/scenery/Hubable;", "()V", "acqKeys", "Ljava/nio/LongBuffer;", "kotlin.jvm.PlatformType", "acquireTimeout", "Ljava/nio/IntBuffer;", "commandBuffers", "", "Lgraphics/scenery/controls/Hololens$CommandBufferWithStatus;", "currentImageIndex", "", "d3dImages", "", "Lkotlin/Pair;", "Lgraphics/scenery/backends/vulkan/VulkanTexture$VulkanImage;", "Lgraphics/scenery/backends/vulkan/VulkanTexture;", "", "defaultPort", "headToEyeTransforms", "", "Lcleargl/GLMatrix;", "[Lcleargl/GLMatrix;", "hololensCommandPool", "Lvkk/entities/VkCommandPool;", "J", "hololensDisplaySize", "Lcleargl/GLVector;", "hub", "Lgraphics/scenery/Hub;", "getHub", "()Lgraphics/scenery/Hub;", "setHub", "(Lgraphics/scenery/Hub;)V", "identityQuat", "Lcom/jogamp/opengl/math/Quaternion;", "leftProjection", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "memoryHandleBuffer", "nullVector", "poseLeft", "poseLeftDeque", "Ljava/util/ArrayDeque;", "poseRight", "poseRightDeque", "releaseKeys", "rightProjection", "subscriberSockets", "Ljava/util/HashMap;", "", "Lkotlinx/coroutines/Job;", "textureFormat", "Lvkk/VkFormat;", "zmqContext", "Lorg/zeromq/ZContext;", "zmqSocket", "Lorg/zeromq/ZMQ$Socket;", "attachToNode", "", "device", "Lgraphics/scenery/controls/TrackedDevice;", "node", "Lgraphics/scenery/Node;", "camera", "Lgraphics/scenery/Camera;", "getEyeProjection", "eye", "nearPlane", "", "farPlane", "getHeadToEyeTransform", "getIPD", "getOrientation", "id", "getPose", "getPoseForEye", "getPosition", "getRenderTargetSize", "getSharedHandleVulkanTexture", "sharedHandleAddress", "width", "height", "format", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "commandPool", "getSharedHandleVulkanTexture-1Ygzq7E", "(JIILvkk/VkFormat;Lgraphics/scenery/backends/vulkan/VulkanDevice;Lorg/lwjgl/vulkan/VkQueue;J)Lkotlin/Pair;", "getTrackedDevices", "", "ofType", "Lgraphics/scenery/controls/TrackedDeviceType;", "getVulkanDeviceExtensions", "Ljava/util/ArrayList;", "physicalDevice", "Lorg/lwjgl/vulkan/VkPhysicalDevice;", "getVulkanInstanceExtensions", "getWorkingDisplay", "getWorkingTracker", "hasCompositor", "", "initializedAndWorking", "loadModelForMesh", "Lgraphics/scenery/Mesh;", "mesh", "type", "submitToCompositor", "textureId", "submitToCompositorVulkan", "instance", "Lorg/lwjgl/vulkan/VkInstance;", "image", "Lvkk/entities/VkImage;", "submitToCompositorVulkan-nscd4to", "(IIILorg/lwjgl/vulkan/VkInstance;Lgraphics/scenery/backends/vulkan/VulkanDevice;Lorg/lwjgl/vulkan/VkQueue;J)V", "subscribe", "topic", "update", "CommandBufferWithStatus", "scenery"})
public final class Hololens implements graphics.scenery.controls.TrackerInput, graphics.scenery.backends.Display, graphics.scenery.Hubable {
    private final kotlin.Lazy logger$delegate = null;
    private final com.jogamp.opengl.math.Quaternion identityQuat = null;
    private final cleargl.GLVector nullVector = null;
    private final cleargl.GLVector hololensDisplaySize = null;
    private final cleargl.GLMatrix[] headToEyeTransforms = null;
    private final vkk.VkFormat textureFormat = null;
    private final int defaultPort = 1339;
    private final org.zeromq.ZContext zmqContext = null;
    private final org.zeromq.ZMQ.Socket zmqSocket = null;
    private final java.util.HashMap<java.lang.String, kotlinx.coroutines.Job> subscriberSockets = null;
    private final java.nio.LongBuffer acqKeys = null;
    private final java.nio.LongBuffer releaseKeys = null;
    private final java.nio.LongBuffer memoryHandleBuffer = null;
    private final java.nio.IntBuffer acquireTimeout = null;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Hub hub;
    private java.util.List<graphics.scenery.controls.Hololens.CommandBufferWithStatus> commandBuffers;
    private long hololensCommandPool;
    private java.util.List<kotlin.Pair<graphics.scenery.backends.vulkan.VulkanTexture.VulkanImage, java.lang.Long>> d3dImages;
    private int currentImageIndex;
    private cleargl.GLMatrix leftProjection;
    private cleargl.GLMatrix rightProjection;
    private java.util.ArrayDeque<cleargl.GLMatrix> poseLeftDeque;
    private java.util.ArrayDeque<cleargl.GLMatrix> poseRightDeque;
    private cleargl.GLMatrix poseLeft;
    private cleargl.GLMatrix poseRight;

    public Hololens() {
        super();
    }

    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public graphics.scenery.Hub getHub() {
        return null;
    }

    @java.lang.Override()
    public void setHub(@org.jetbrains.annotations.Nullable()
                           graphics.scenery.Hub p0) {
    }

    private final org.slf4j.Logger getLogger() {
        return null;
    }

    /**
     * * Returns the orientation of the HMD
     * *
     * * @returns GLMatrix with orientation
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jogamp.opengl.math.Quaternion getOrientation() {
        return null;
    }

    /**
     * * Returns the orientation of the given device, or a unit quaternion if the device is not found.
     * *
     * * @returns GLMatrix with orientation
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jogamp.opengl.math.Quaternion getOrientation(@org.jetbrains.annotations.NotNull()
                                                                java.lang.String id) {
        return null;
    }

    /**
     * * Returns the absolute position as GLVector
     * *
     * * @return HMD position as GLVector
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLVector getPosition() {
        return null;
    }

    /**
     * * Returns the HMD pose
     * *
     * * @return HMD pose as GLMatrix
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getPose() {
        return null;
    }

    /**
     * * Check whether the HMD is initialized and working
     * *
     * * @return True if HMD is initialiased correctly and working properly
     */
    @java.lang.Override()
    public boolean initializedAndWorking() {
        return false;
    }

    /**
     * * update state
     */
    @java.lang.Override()
    public void update() {
    }

    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public graphics.scenery.controls.TrackerInput getWorkingTracker() {
        return null;
    }

    /**
     * * Returns the per-eye projection matrix
     * *
     * * @param[eye] The index of the eye
     * * @return GLMatrix containing the per-eye projection matrix
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getEyeProjection(int eye, float nearPlane, float farPlane) {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getPoseForEye(int eye) {
        return null;
    }

    /**
     * * Returns the inter-pupillary distance (IPD)
     * *
     * * @return IPD as Float
     */
    @java.lang.Override()
    public float getIPD() {
        return 0.0F;
    }

    /**
     * * Query the HMD whether a compositor is used or the renderer should take
     * * care of displaying on the HMD on its own. For the Hololens, this is always true as it is not addressed
     * * as regular display.
     * *
     * * @return Always true, Hololens requires compositor use.
     */
    @java.lang.Override()
    public boolean hasCompositor() {
        return false;
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public graphics.scenery.Mesh loadModelForMesh(@org.jetbrains.annotations.NotNull()
                                                      graphics.scenery.controls.TrackedDeviceType type, @org.jetbrains.annotations.NotNull()
                                                      graphics.scenery.Mesh mesh) {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public graphics.scenery.Mesh loadModelForMesh(@org.jetbrains.annotations.NotNull()
                                                      graphics.scenery.controls.TrackedDevice device, @org.jetbrains.annotations.NotNull()
                                                      graphics.scenery.Mesh mesh) {
        return null;
    }

    @java.lang.Override()
    public void attachToNode(@org.jetbrains.annotations.NotNull()
                                 graphics.scenery.controls.TrackedDevice device, @org.jetbrains.annotations.NotNull()
                                 graphics.scenery.Node node, @org.jetbrains.annotations.Nullable()
                                 graphics.scenery.Camera camera) {
    }

    /**
     * * Submit OpenGL texture IDs to the compositor. The texture is assumed to have the left eye in the
     * * left half, right eye in the right half.
     * *
     * * @param[textureId] OpenGL Texture ID of the left eye texture
     */
    @java.lang.Override()
    public void submitToCompositor(int textureId) {
    }

    /**
     * * Returns the optimal render target size for the HMD as 2D vector
     * *
     * * @return Render target size as 2D vector
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLVector getRenderTargetSize() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getVulkanInstanceExtensions() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<java.lang.String> getVulkanDeviceExtensions(@org.jetbrains.annotations.NotNull()
                                                                               org.lwjgl.vulkan.VkPhysicalDevice physicalDevice) {
        return null;
    }

    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public graphics.scenery.backends.Display getWorkingDisplay() {
        return null;
    }

    /**
     * * Returns the per-eye transform that moves from head to eye
     * *
     * * @param[eye] The eye index
     * * @return GLMatrix containing the transform
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getHeadToEyeTransform(int eye) {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, graphics.scenery.controls.TrackedDevice> getTrackedDevices(@org.jetbrains.annotations.NotNull()
                                                                                                          graphics.scenery.controls.TrackedDeviceType ofType) {
        return null;
    }

    private final void subscribe(java.lang.String topic) {
    }

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lgraphics/scenery/controls/Hololens$CommandBufferWithStatus;", "", "commandBuffer", "Lgraphics/scenery/backends/vulkan/VulkanCommandBuffer;", "current", "", "(Lgraphics/scenery/backends/vulkan/VulkanCommandBuffer;Z)V", "getCommandBuffer", "()Lgraphics/scenery/backends/vulkan/VulkanCommandBuffer;", "getCurrent", "()Z", "setCurrent", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "scenery"})
    public static final class CommandBufferWithStatus {
        @org.jetbrains.annotations.NotNull()
        private final graphics.scenery.backends.vulkan.VulkanCommandBuffer commandBuffer = null;
        private boolean current;

        public CommandBufferWithStatus(@org.jetbrains.annotations.NotNull()
                                           graphics.scenery.backends.vulkan.VulkanCommandBuffer commandBuffer, boolean current) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanCommandBuffer getCommandBuffer() {
            return null;
        }

        public final boolean getCurrent() {
            return false;
        }

        public final void setCurrent(boolean p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanCommandBuffer component1() {
            return null;
        }

        public final boolean component2() {
            return false;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.controls.Hololens.CommandBufferWithStatus copy(@org.jetbrains.annotations.NotNull()
                                                                                         graphics.scenery.backends.vulkan.VulkanCommandBuffer commandBuffer, boolean current) {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }

        @java.lang.Override()
        public int hashCode() {
            return 0;
        }

        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
                                  java.lang.Object p0) {
            return false;
        }
    }
}
