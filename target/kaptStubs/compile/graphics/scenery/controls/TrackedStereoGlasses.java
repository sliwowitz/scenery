package graphics.scenery.controls;

import java.lang.System;

/**
 * * Display/TrackerInput implementation for stereoscopic displays and tracked shutter glasses
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ce\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\"\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J \u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u001f2\u0006\u0010F\u001a\u00020\u001fH\u0016J\u0010\u0010G\u001a\u00020\u00132\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010H\u001a\u00020\u001fH\u0016J\b\u0010I\u001a\u00020+H\u0016J\u0010\u0010I\u001a\u00020+2\u0006\u0010J\u001a\u00020\u0005H\u0016J\b\u0010K\u001a\u00020\u0013H\u0016J\u0010\u0010L\u001a\u00020\u00132\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u00020NH\u0016J\u001c\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020=0Q2\u0006\u0010R\u001a\u00020SH\u0016J \u0010T\u001a\u0012\u0012\u0004\u0012\u00020\u00050Uj\b\u0012\u0004\u0012\u00020\u0005`V2\u0006\u0010W\u001a\u00020XH\u0016J\u000e\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00050ZH\u0016J\n\u0010[\u001a\u0004\u0018\u00010\u0001H\u0016J\n\u0010\\\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010]\u001a\u00020^H\u0016J\b\u0010_\u001a\u00020^H\u0016J\u0018\u0010`\u001a\u00020a2\u0006\u0010<\u001a\u00020=2\u0006\u0010b\u001a\u00020aH\u0016J\u0018\u0010`\u001a\u00020a2\u0006\u0010c\u001a\u00020S2\u0006\u0010b\u001a\u00020aH\u0016J\u0010\u0010d\u001a\u00020;2\u0006\u0010e\u001a\u00020DH\u0016J@\u0010f\u001a\u00020;2\u0006\u0010g\u001a\u00020D2\u0006\u0010h\u001a\u00020D2\u0006\u0010i\u001a\u00020D2\u0006\u0010j\u001a\u00020k2\u0006\u0010<\u001a\u00020l2\u0006\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020pH\u0016J\b\u0010q\u001a\u00020;H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010\'R\u000e\u0010*\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\t\"\u0004\b3\u0010\u000bR\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109\u00a8\u0006r"}, d2 = {"Lgraphics/scenery/controls/TrackedStereoGlasses;", "Lgraphics/scenery/backends/Display;", "Lgraphics/scenery/controls/TrackerInput;", "Lgraphics/scenery/Hubable;", "address", "", "screenConfig", "(Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "config", "Lgraphics/scenery/controls/ScreenConfig$Config;", "getConfig", "()Lgraphics/scenery/controls/ScreenConfig$Config;", "setConfig", "(Lgraphics/scenery/controls/ScreenConfig$Config;)V", "currentOrientation", "Lcleargl/GLMatrix;", "getCurrentOrientation", "()Lcleargl/GLMatrix;", "setCurrentOrientation", "(Lcleargl/GLMatrix;)V", "hub", "Lgraphics/scenery/Hub;", "getHub", "()Lgraphics/scenery/Hub;", "setHub", "(Lgraphics/scenery/Hub;)V", "ipd", "", "getIpd", "()F", "setIpd", "(F)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "rotation", "Lcom/jogamp/opengl/math/Quaternion;", "screen", "Lgraphics/scenery/controls/ScreenConfig$SingleScreenConfig;", "getScreen", "()Lgraphics/scenery/controls/ScreenConfig$SingleScreenConfig;", "setScreen", "(Lgraphics/scenery/controls/ScreenConfig$SingleScreenConfig;)V", "getScreenConfig", "setScreenConfig", "vrpnTracker", "Lgraphics/scenery/controls/VRPNTrackerInput;", "getVrpnTracker", "()Lgraphics/scenery/controls/VRPNTrackerInput;", "setVrpnTracker", "(Lgraphics/scenery/controls/VRPNTrackerInput;)V", "attachToNode", "", "device", "Lgraphics/scenery/controls/TrackedDevice;", "node", "Lgraphics/scenery/Node;", "camera", "Lgraphics/scenery/Camera;", "getEyeProjection", "eye", "", "nearPlane", "farPlane", "getHeadToEyeTransform", "getIPD", "getOrientation", "id", "getPose", "getPoseForEye", "getPosition", "Lcleargl/GLVector;", "getRenderTargetSize", "getTrackedDevices", "", "ofType", "Lgraphics/scenery/controls/TrackedDeviceType;", "getVulkanDeviceExtensions", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "physicalDevice", "Lorg/lwjgl/vulkan/VkPhysicalDevice;", "getVulkanInstanceExtensions", "", "getWorkingDisplay", "getWorkingTracker", "hasCompositor", "", "initializedAndWorking", "loadModelForMesh", "Lgraphics/scenery/Mesh;", "mesh", "type", "submitToCompositor", "textureId", "submitToCompositorVulkan", "width", "height", "format", "instance", "Lorg/lwjgl/vulkan/VkInstance;", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "image", "", "update", "scenery"})
public final class TrackedStereoGlasses implements graphics.scenery.backends.Display, graphics.scenery.controls.TrackerInput, graphics.scenery.Hubable {
    private final kotlin.Lazy logger$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Hub hub;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.controls.VRPNTrackerInput vrpnTracker;
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLMatrix currentOrientation;
    private float ipd;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.controls.ScreenConfig.Config config;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.controls.ScreenConfig.SingleScreenConfig screen;
    private com.jogamp.opengl.math.Quaternion rotation;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String address;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String screenConfig;
    
    private final org.slf4j.Logger getLogger() {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.controls.VRPNTrackerInput getVrpnTracker() {
        return null;
    }
    
    public final void setVrpnTracker(@org.jetbrains.annotations.NotNull()
    graphics.scenery.controls.VRPNTrackerInput p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLMatrix getCurrentOrientation() {
        return null;
    }
    
    public final void setCurrentOrientation(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0) {
    }
    
    public final float getIpd() {
        return 0.0F;
    }
    
    public final void setIpd(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.controls.ScreenConfig.Config getConfig() {
        return null;
    }
    
    public final void setConfig(@org.jetbrains.annotations.NotNull()
    graphics.scenery.controls.ScreenConfig.Config p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.controls.ScreenConfig.SingleScreenConfig getScreen() {
        return null;
    }
    
    public final void setScreen(@org.jetbrains.annotations.Nullable()
    graphics.scenery.controls.ScreenConfig.SingleScreenConfig p0) {
    }
    
    /**
     * * Returns the per-eye projection matrix
     *     *
     *     * @param[eye] The index of the eye
     *     * @return GLMatrix containing the per-eye projection matrix
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getEyeProjection(int eye, float nearPlane, float farPlane) {
        return null;
    }
    
    /**
     * * Returns the inter-pupillary distance (IPD)
     *     *
     *     * @return IPD as Float
     */
    @java.lang.Override()
    public float getIPD() {
        return 0.0F;
    }
    
    /**
     * * Query the HMD whether a compositor is used or the renderer should take
     *     * care of displaying on the HMD on its own.
     *     *
     *     * @return True if the HMD has a compositor
     */
    @java.lang.Override()
    public boolean hasCompositor() {
        return false;
    }
    
    /**
     * * Submit OpenGL texture IDs to the compositor. The texture is assumed to have the left eye in the
     *     * left half, right eye in the right half.
     *     *
     *     * @param[textureId] OpenGL Texture ID of the left eye texture
     */
    @java.lang.Override()
    public void submitToCompositor(int textureId) {
    }
    
    /**
     * * Returns the orientation of the HMD
     *     *
     *     * @returns GLMatrix with orientation
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jogamp.opengl.math.Quaternion getOrientation() {
        return null;
    }
    
    /**
     * * Submit a Vulkan texture handle to the compositor
     *     *
     *     * @param[width] Texture width
     *     * @param[height] Texture height
     *     * @param[format] Vulkan texture format
     *     * @param[instance] Vulkan Instance
     *     * @param[device] Vulkan device
     *     * @param[queue] Vulkan queue
     *     * @param[queueFamilyIndex] Queue family index
     *     * @param[image] The Vulkan texture image to be presented to the compositor
     */
    @java.lang.Override()
    public void submitToCompositorVulkan(int width, int height, int format, @org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkInstance instance, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkQueue queue, long image) {
    }
    
    /**
     * * Returns the orientation of the given device, or a unit quaternion if the device is not found.
     *     *
     *     * @returns GLMatrix with orientation
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jogamp.opengl.math.Quaternion getOrientation(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    /**
     * * Returns the absolute position as GLVector
     *     *
     *     * @return HMD position as GLVector
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLVector getPosition() {
        return null;
    }
    
    /**
     * * Returns the optimal render target size for the HMD as 2D vector
     *     *
     *     * @return Render target size as 2D vector
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLVector getRenderTargetSize() {
        return null;
    }
    
    /**
     * * Returns the HMD pose
     *     *
     *     * @return HMD pose as GLMatrix
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getPose() {
        return null;
    }
    
    /**
     * * Returns the HMD pose per eye
     *     *
     *     * @return HMD pose as GLMatrix
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getPoseForEye(int eye) {
        return null;
    }
    
    /**
     * * Check whether the HMD is initialized and working
     *     *
     *     * @return True if HMD is initialised correctly and working properly
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getVulkanInstanceExtensions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public graphics.scenery.controls.TrackerInput getWorkingTracker() {
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
     *     *
     *     * @param[eye] The eye index
     *     * @return GLMatrix containing the transform
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getHeadToEyeTransform(int eye) {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, graphics.scenery.controls.TrackedDevice> getTrackedDevices(@org.jetbrains.annotations.NotNull()
    graphics.scenery.controls.TrackedDeviceType ofType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScreenConfig() {
        return null;
    }
    
    public final void setScreenConfig(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public TrackedStereoGlasses(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String screenConfig) {
        super();
    }
    
    public TrackedStereoGlasses() {
        super();
    }
}