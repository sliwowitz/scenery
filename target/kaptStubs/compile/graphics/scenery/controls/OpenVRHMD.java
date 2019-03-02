package graphics.scenery.controls;

import java.lang.System;

/**
 * * TrackerInput implementation of OpenVR
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @property[seated] Whether the user is assumed to be sitting or not.
 * * @property[useCompositor] Whether or not the compositor should be used.
 * * @constructor Creates a new OpenVR HMD instance, using the compositor if requested
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b2\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u00cf\u0001\u00d0\u0001B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u001b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020f2\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001J-\u0010\u0085\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020f2\u0014\u0010\u0086\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020f0\u0087\u0001\"\u00020f\u00a2\u0006\u0003\u0010\u0088\u0001J)\u0010\u0089\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u008a\u0001\u001a\u00020u2\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0016J\b\u0010\u008f\u0001\u001a\u00030\u0081\u0001J\u0013\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u0084\u00012\u0007\u0010\u0082\u0001\u001a\u00020fJ\u0007\u0010\u0091\u0001\u001a\u000201J$\u0010\u0092\u0001\u001a\u00020#2\u0007\u0010\u0093\u0001\u001a\u0002012\u0007\u0010\u0094\u0001\u001a\u00020n2\u0007\u0010\u0095\u0001\u001a\u00020nH\u0016J\u0010\u0010\u0096\u0001\u001a\u00020n2\u0007\u0010\u0097\u0001\u001a\u000201J\u0012\u0010\u0098\u0001\u001a\u00020#2\u0007\u0010\u0093\u0001\u001a\u000201H\u0016J\t\u0010\u0099\u0001\u001a\u00020nH\u0016J\n\u0010\u009a\u0001\u001a\u00030\u009b\u0001H\u0016J\u0013\u0010\u009a\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009c\u0001\u001a\u00020fH\u0016J\t\u0010\u009d\u0001\u001a\u00020#H\u0016J\u0018\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020u0\u009e\u00012\b\u0010\u009f\u0001\u001a\u00030\u00a0\u0001J\u0012\u0010\u00a1\u0001\u001a\u00020#2\u0007\u0010\u0093\u0001\u001a\u000201H\u0016J\n\u0010\u00a2\u0001\u001a\u00030\u00a3\u0001H\u0016J\b\u0010\u00a4\u0001\u001a\u00030\u00a3\u0001J\u001b\u0010\u00a5\u0001\u001a\u00020f2\u0007\u0010\u00a6\u0001\u001a\u0002012\u0007\u0010\u00a7\u0001\u001a\u000201H\u0002J\u001f\u0010v\u001a\u000f\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020u0\u00a8\u00012\b\u0010\u00a9\u0001\u001a\u00030\u00a0\u0001H\u0016J#\u0010\u00aa\u0001\u001a\u0012\u0012\u0004\u0012\u00020f0\"j\b\u0012\u0004\u0012\u00020f`$2\b\u0010\u00ab\u0001\u001a\u00030\u00ac\u0001H\u0016J\u0010\u0010\u00ad\u0001\u001a\t\u0012\u0004\u0012\u00020f0\u009e\u0001H\u0016J\u000b\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u0002H\u0016J\u000b\u0010\u00af\u0001\u001a\u0004\u0018\u00010\u0001H\u0016J\t\u0010\u00b0\u0001\u001a\u00020\u0005H\u0016J\b\u0010\u00b1\u0001\u001a\u00030\u0081\u0001J\t\u0010\u00b2\u0001\u001a\u00020\u0005H\u0016J\u001d\u0010\u00b3\u0001\u001a\u00030\u00b4\u00012\u0007\u0010\u008a\u0001\u001a\u00020u2\b\u0010\u00b5\u0001\u001a\u00030\u00b4\u0001H\u0016J\u001e\u0010\u00b3\u0001\u001a\u00030\u00b4\u00012\b\u0010\u009f\u0001\u001a\u00030\u00a0\u00012\b\u0010\u00b5\u0001\u001a\u00030\u00b4\u0001H\u0016J\u0011\u0010\u00b6\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020fJ\u0011\u0010\u00b7\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020fJ\u0013\u0010\u00b8\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u00b9\u0001\u001a\u000201H\u0016JL\u0010\u00ba\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u00bb\u0001\u001a\u0002012\u0007\u0010\u00bc\u0001\u001a\u0002012\u0007\u0010\u00bd\u0001\u001a\u0002012\b\u0010\u00be\u0001\u001a\u00030\u00bf\u00012\b\u0010\u008a\u0001\u001a\u00030\u00c0\u00012\b\u0010\u00c1\u0001\u001a\u00030\u00c2\u00012\u0007\u0010\u00c3\u0001\u001a\u00020\rH\u0016J\u0011\u0010\u00c4\u0001\u001a\u00020f2\u0006\u0010\u001d\u001a\u000201H\u0002J\n\u0010\u00c5\u0001\u001a\u00030\u0081\u0001H\u0016J\u001a\u0010\u00c6\u0001\u001a\u00030\u00c7\u0001*\u00030\u00c8\u00012\t\b\u0002\u0010\u00c9\u0001\u001a\u000201H\u0002J\f\u0010\u00ca\u0001\u001a\u00020#*\u00030\u00cb\u0001J\f\u0010\u00ca\u0001\u001a\u00020#*\u00030\u00cc\u0001J\u0018\u0010\u00cd\u0001\u001a\u00030\u00ce\u0001*\u00030\u00c8\u00012\u0007\u0010\u00c9\u0001\u001a\u000201H\u0002R\u0014\u0010\b\u001a\u00020\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u0014\u0010\u001d\u001a\u00020\u001eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R.\u0010!\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010#0\"j\n\u0012\u0006\u0012\u0004\u0018\u00010#`$X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R.\u0010)\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010#0\"j\n\u0012\u0006\u0012\u0004\u0018\u00010#`$X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u0014\u0010,\u001a\u00020-X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\u000201X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u000201X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u001a\u00109\u001a\u00020:X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u000201X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u00103\"\u0004\bA\u00105R\u001a\u0010B\u001a\u00020:X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>R\u001c\u0010E\u001a\u0004\u0018\u00010FX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0010\"\u0004\bM\u0010\u0012R\u0014\u0010N\u001a\u00020OX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020SX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020WX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u001a\u0010Z\u001a\u00020\rX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001b\u0010_\u001a\u00020`8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\bc\u0010d\u001a\u0004\ba\u0010bR\u001e\u0010g\u001a\u00020f2\u0006\u0010e\u001a\u00020f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u001e\u0010j\u001a\u00020\u00052\u0006\u0010e\u001a\u00020\u0005@BX\u0084\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010\u0010R\u001a\u0010m\u001a\u00020nX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR&\u0010s\u001a\u000e\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020u0tX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001e\u0010z\u001a\u00020f2\u0006\u0010e\u001a\u00020f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010iR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u0010\u0010R\u001a\u0010}\u001a\u00020nX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010p\"\u0004\b\u007f\u0010r\u00a8\u0006\u00d1\u0001"}, d2 = {"Lgraphics/scenery/controls/OpenVRHMD;", "Lgraphics/scenery/controls/TrackerInput;", "Lgraphics/scenery/backends/Display;", "Lgraphics/scenery/Hubable;", "seated", "", "useCompositor", "(ZZ)V", "behaviourMap", "Lorg/scijava/ui/behaviour/BehaviourMap;", "getBehaviourMap", "()Lorg/scijava/ui/behaviour/BehaviourMap;", "commandPool", "", "compositorInitialized", "getCompositorInitialized", "()Z", "setCompositorInitialized", "(Z)V", "config", "Lorg/scijava/ui/behaviour/io/InputTriggerConfig;", "getConfig", "()Lorg/scijava/ui/behaviour/io/InputTriggerConfig;", "debugLatency", "getDebugLatency", "setDebugLatency", "disableSubmission", "getDisableSubmission", "setDisableSubmission", "error", "Ljava/nio/IntBuffer;", "getError", "()Ljava/nio/IntBuffer;", "eyeProjectionCache", "Ljava/util/ArrayList;", "Lcleargl/GLMatrix;", "Lkotlin/collections/ArrayList;", "getEyeProjectionCache", "()Ljava/util/ArrayList;", "setEyeProjectionCache", "(Ljava/util/ArrayList;)V", "eyeTransformCache", "getEyeTransformCache", "setEyeTransformCache", "frameCount", "Ljava/nio/LongBuffer;", "getFrameCount", "()Ljava/nio/LongBuffer;", "frameCountRun", "", "getFrameCountRun", "()I", "setFrameCountRun", "(I)V", "frames", "getFrames", "setFrames", "gamePoses", "Lorg/lwjgl/openvr/TrackedDevicePose$Buffer;", "getGamePoses", "()Lorg/lwjgl/openvr/TrackedDevicePose$Buffer;", "setGamePoses", "(Lorg/lwjgl/openvr/TrackedDevicePose$Buffer;)V", "hmdDisplayFreq", "getHmdDisplayFreq", "setHmdDisplayFreq", "hmdTrackedDevicePoses", "getHmdTrackedDevicePoses", "setHmdTrackedDevicePoses", "hub", "Lgraphics/scenery/Hub;", "getHub", "()Lgraphics/scenery/Hub;", "setHub", "(Lgraphics/scenery/Hub;)V", "initialized", "getInitialized", "setInitialized", "inputHandler", "Lorg/scijava/ui/behaviour/MouseAndKeyHandler;", "getInputHandler", "()Lorg/scijava/ui/behaviour/MouseAndKeyHandler;", "inputMap", "Lorg/scijava/ui/behaviour/InputTriggerMap;", "getInputMap", "()Lorg/scijava/ui/behaviour/InputTriggerMap;", "lastVsync", "Ljava/nio/FloatBuffer;", "getLastVsync", "()Ljava/nio/FloatBuffer;", "latencyWaitTime", "getLatencyWaitTime", "()J", "setLatencyWaitTime", "(J)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "<set-?>", "", "manufacturer", "getManufacturer", "()Ljava/lang/String;", "readyForSubmission", "getReadyForSubmission", "getSeated", "timePerFrame", "", "getTimePerFrame", "()F", "setTimePerFrame", "(F)V", "trackedDevices", "Ljava/util/concurrent/ConcurrentHashMap;", "Lgraphics/scenery/controls/TrackedDevice;", "getTrackedDevices", "()Ljava/util/concurrent/ConcurrentHashMap;", "setTrackedDevices", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "trackingSystemName", "getTrackingSystemName", "getUseCompositor", "vsyncToPhotons", "getVsyncToPhotons", "setVsyncToPhotons", "addBehaviour", "", "behaviourName", "behaviour", "Lorg/scijava/ui/behaviour/Behaviour;", "addKeyBinding", "keys", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "attachToNode", "device", "node", "Lgraphics/scenery/Node;", "camera", "Lgraphics/scenery/Camera;", "close", "getBehaviour", "getExperience", "getEyeProjection", "eye", "nearPlane", "farPlane", "getFOV", "direction", "getHeadToEyeTransform", "getIPD", "getOrientation", "Lcom/jogamp/opengl/math/Quaternion;", "id", "getPose", "", "type", "Lgraphics/scenery/controls/TrackedDeviceType;", "getPoseForEye", "getPosition", "Lcleargl/GLVector;", "getRenderTargetSize", "getStringProperty", "deviceIndex", "property", "", "ofType", "getVulkanDeviceExtensions", "physicalDevice", "Lorg/lwjgl/vulkan/VkPhysicalDevice;", "getVulkanInstanceExtensions", "getWorkingDisplay", "getWorkingTracker", "hasCompositor", "initCompositor", "initializedAndWorking", "loadModelForMesh", "Lgraphics/scenery/Mesh;", "mesh", "removeBehaviour", "removeKeyBinding", "submitToCompositor", "textureId", "submitToCompositorVulkan", "width", "height", "format", "instance", "Lorg/lwjgl/vulkan/VkInstance;", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "image", "translateError", "update", "toAWTKeyCode", "Lgraphics/scenery/controls/OpenVRHMD$AWTKey;", "Lgraphics/scenery/controls/OpenVRHMD$OpenVRButton;", "role", "toGLMatrix", "Lorg/lwjgl/openvr/HmdMatrix34;", "Lorg/lwjgl/openvr/HmdMatrix44;", "toKeyEvent", "Ljava/awt/event/KeyEvent;", "AWTKey", "OpenVRButton", "scenery"})
public class OpenVRHMD implements graphics.scenery.controls.TrackerInput, graphics.scenery.backends.Display, graphics.scenery.Hubable {
    
    /**
     * slf4j logger instance 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;
    
    /**
     * The Hub to use for communication 
     */
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Hub hub;
    
    /**
     * Has the HMD already been initialised? 
     */
    private volatile boolean initialized;
    private volatile boolean compositorInitialized;
    
    /**
     * OpenVR poses structure for all tracked device 
     */
    @org.jetbrains.annotations.NotNull()
    private org.lwjgl.openvr.TrackedDevicePose.Buffer hmdTrackedDevicePoses;
    @org.jetbrains.annotations.NotNull()
    private org.lwjgl.openvr.TrackedDevicePose.Buffer gamePoses;
    
    /**
     * error code storage 
     */
    @org.jetbrains.annotations.NotNull()
    private final java.nio.IntBuffer error = null;
    
    /**
     * Storage for the poses of all tracked devices. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.controls.TrackedDevice> trackedDevices;
    
    /**
     * Cache for per-eye projection matrices 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<cleargl.GLMatrix> eyeProjectionCache;
    
    /**
     * Cache for head-to-eye transform matrices 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<cleargl.GLMatrix> eyeTransformCache;
    
    /**
     * When did the last vsync occur? 
     */
    @org.jetbrains.annotations.NotNull()
    private final java.nio.FloatBuffer lastVsync = null;
    
    /**
     * Current frame count on the HMD 
     */
    @org.jetbrains.annotations.NotNull()
    private final java.nio.LongBuffer frameCount = null;
    
    /**
     * Display frequency of the HMD 
     */
    private int hmdDisplayFreq;
    
    /**
     * Latency wait time 
     */
    private long latencyWaitTime;
    
    /**
     * Whether or not to vsync to the beacons 
     */
    private float vsyncToPhotons;
    
    /**
     * Per-run frame count 
     */
    private int frameCountRun;
    
    /**
     * Per-frame rendering time 
     */
    private float timePerFrame;
    
    /**
     * (De)activate latency debugging 
     */
    private boolean debugLatency;
    
    /**
     * Frame count per-vsync 
     */
    private int frames;
    
    /**
     * disables submission in case of compositor errors 
     */
    private boolean disableSubmission;
    private volatile boolean readyForSubmission;
    @org.jetbrains.annotations.NotNull()
    private final org.scijava.ui.behaviour.MouseAndKeyHandler inputHandler = null;
    @org.jetbrains.annotations.NotNull()
    private final org.scijava.ui.behaviour.io.InputTriggerConfig config = null;
    @org.jetbrains.annotations.NotNull()
    private final org.scijava.ui.behaviour.InputTriggerMap inputMap = null;
    @org.jetbrains.annotations.NotNull()
    private final org.scijava.ui.behaviour.BehaviourMap behaviourMap = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String manufacturer;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String trackingSystemName;
    private long commandPool;
    private final boolean seated = false;
    private final boolean useCompositor = false;
    
    /**
     * slf4j logger instance 
     */
    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
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
    
    protected final boolean getInitialized() {
        return false;
    }
    
    protected final void setInitialized(boolean p0) {
    }
    
    protected final boolean getCompositorInitialized() {
        return false;
    }
    
    protected final void setCompositorInitialized(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.lwjgl.openvr.TrackedDevicePose.Buffer getHmdTrackedDevicePoses() {
        return null;
    }
    
    protected final void setHmdTrackedDevicePoses(@org.jetbrains.annotations.NotNull()
    org.lwjgl.openvr.TrackedDevicePose.Buffer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.lwjgl.openvr.TrackedDevicePose.Buffer getGamePoses() {
        return null;
    }
    
    protected final void setGamePoses(@org.jetbrains.annotations.NotNull()
    org.lwjgl.openvr.TrackedDevicePose.Buffer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.nio.IntBuffer getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.controls.TrackedDevice> getTrackedDevices() {
        return null;
    }
    
    protected final void setTrackedDevices(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.controls.TrackedDevice> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<cleargl.GLMatrix> getEyeProjectionCache() {
        return null;
    }
    
    protected final void setEyeProjectionCache(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<cleargl.GLMatrix> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<cleargl.GLMatrix> getEyeTransformCache() {
        return null;
    }
    
    protected final void setEyeTransformCache(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<cleargl.GLMatrix> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.nio.FloatBuffer getLastVsync() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.nio.LongBuffer getFrameCount() {
        return null;
    }
    
    protected final int getHmdDisplayFreq() {
        return 0;
    }
    
    protected final void setHmdDisplayFreq(int p0) {
    }
    
    protected final long getLatencyWaitTime() {
        return 0L;
    }
    
    protected final void setLatencyWaitTime(long p0) {
    }
    
    protected final float getVsyncToPhotons() {
        return 0.0F;
    }
    
    protected final void setVsyncToPhotons(float p0) {
    }
    
    protected final int getFrameCountRun() {
        return 0;
    }
    
    protected final void setFrameCountRun(int p0) {
    }
    
    protected final float getTimePerFrame() {
        return 0.0F;
    }
    
    protected final void setTimePerFrame(float p0) {
    }
    
    public final boolean getDebugLatency() {
        return false;
    }
    
    public final void setDebugLatency(boolean p0) {
    }
    
    protected final int getFrames() {
        return 0;
    }
    
    protected final void setFrames(int p0) {
    }
    
    protected final boolean getDisableSubmission() {
        return false;
    }
    
    protected final void setDisableSubmission(boolean p0) {
    }
    
    protected final boolean getReadyForSubmission() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.scijava.ui.behaviour.MouseAndKeyHandler getInputHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.scijava.ui.behaviour.io.InputTriggerConfig getConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.scijava.ui.behaviour.InputTriggerMap getInputMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.scijava.ui.behaviour.BehaviourMap getBehaviourMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getManufacturer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTrackingSystemName() {
        return null;
    }
    
    /**
     * * Initialises the OpenVR compositor
     */
    public final void initCompositor() {
    }
    
    /**
     * * Runs the OpenVR shutdown hooks
     */
    public final void close() {
    }
    
    /**
     * * Check whether there is a working TrackerInput for this device.
     *     *
     *     * @returns the [TrackerInput] if that is the case, null otherwise.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public graphics.scenery.controls.TrackerInput getWorkingTracker() {
        return null;
    }
    
    /**
     * * Returns a [Display] instance, if working currently
     *     *
     *     * @return Either a [Display] instance, or null.
     */
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public graphics.scenery.backends.Display getWorkingDisplay() {
        return null;
    }
    
    /**
     * * Check whether the HMD is initialized and working
     *     *
     *     * @return True if HMD is initialiased correctly and working properly
     */
    @java.lang.Override()
    public boolean initializedAndWorking() {
        return false;
    }
    
    /**
     * * Returns the optimal render target size for the HMD as 2D vector
     *     *
     *     * @return Render target size as 2D vector
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public final cleargl.GLVector getRenderTargetSize() {
        return null;
    }
    
    /**
     * * Returns the field of view in degrees
     *     *
     *     * @return FOV in degrees
     */
    @kotlin.Suppress(names = {"unused"})
    public final float getFOV(int direction) {
        return 0.0F;
    }
    
    /**
     * * Returns the per-eye projection matrix
     *     *
     *     * @param[eye] The index of the eye
     *     * @return GLMatrix containing the per-eye projection matrix
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public synchronized cleargl.GLMatrix getEyeProjection(int eye, float nearPlane, float farPlane) {
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
    public synchronized cleargl.GLMatrix getHeadToEyeTransform(int eye) {
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
     * * Returns the orientation of the HMD
     *     *
     *     * @returns GLMatrix with orientation
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jogamp.opengl.math.Quaternion getOrientation() {
        return null;
    }
    
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
     * * Queries the OpenVR runtime for updated poses and stores them
     */
    @java.lang.Override()
    public synchronized void update() {
    }
    
    private final java.awt.event.KeyEvent toKeyEvent(@org.jetbrains.annotations.NotNull()
    graphics.scenery.controls.OpenVRHMD.OpenVRButton $receiver, int role) {
        return null;
    }
    
    private final graphics.scenery.controls.OpenVRHMD.AWTKey toAWTKeyCode(@org.jetbrains.annotations.NotNull()
    graphics.scenery.controls.OpenVRHMD.OpenVRButton $receiver, int role) {
        return null;
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
    public synchronized void submitToCompositor(int textureId) {
    }
    
    @java.lang.Override()
    public void submitToCompositorVulkan(int width, int height, int format, @org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkInstance instance, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.vulkan.VulkanDevice device, @org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkQueue queue, long image) {
    }
    
    private final java.lang.String translateError(int error) {
        return null;
    }
    
    /**
     * * Returns a [List] of Vulkan instance extensions required by the device.
     *     *
     *     * @return [List] of strings containing the required instance extensions
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getVulkanInstanceExtensions() {
        return null;
    }
    
    /**
     * * Returns a [List] of Vulkan device extensions required by the device.
     *     *
     *     * @return [List] of strings containing the required device extensions
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<java.lang.String> getVulkanDeviceExtensions(@org.jetbrains.annotations.NotNull()
    org.lwjgl.vulkan.VkPhysicalDevice physicalDevice) {
        return null;
    }
    
    private final java.lang.String getStringProperty(int deviceIndex, int property) {
        return null;
    }
    
    /**
     * * Queries the OpenVR runtime whether the user is using a sitting or standing configuration
     */
    public final int getExperience() {
        return 0;
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
     * * Returns the HMD pose for a given eye.
     *     *
     *     * @param[eye] The eye to return the pose for.
     *     * @return HMD pose as GLMatrix
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getPoseForEye(int eye) {
        return null;
    }
    
    /**
     * * Returns the HMD pose
     *     *
     *     * @param[type] Type of the tracked device to get the pose for
     *     * @return HMD pose as GLMatrix
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<graphics.scenery.controls.TrackedDevice> getPose(@org.jetbrains.annotations.NotNull()
    graphics.scenery.controls.TrackedDeviceType type) {
        return null;
    }
    
    /**
     * * Extension function to convert from HmdMatric34_t to GLMatrix
     *     *
     *     * @return 4x4 GLMatrix created from the original matrix
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLMatrix toGLMatrix(@org.jetbrains.annotations.NotNull()
    org.lwjgl.openvr.HmdMatrix34 $receiver) {
        return null;
    }
    
    /**
     * * Extension function to convert a HmdMatrix44_t to a GLMatrix
     *     *
     *     * @return 4x4 GLMatrix created from the original matrix
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLMatrix toGLMatrix(@org.jetbrains.annotations.NotNull()
    org.lwjgl.openvr.HmdMatrix44 $receiver) {
        return null;
    }
    
    /**
     * * Loads a model representing the [TrackedDevice].
     *     *
     *     * @param[device] The device to load the model for.
     *     * @param[mesh] The [Mesh] to attach the model data to.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public graphics.scenery.Mesh loadModelForMesh(@org.jetbrains.annotations.NotNull()
    graphics.scenery.controls.TrackedDevice device, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Mesh mesh) {
        return null;
    }
    
    /**
     * * Loads a model representing a kind of [TrackedDeviceType].
     *     *
     *     * @param[type] The device type to load the model for, by default [TrackedDeviceType.Controller].
     *     * @param[mesh] The [Mesh] to attach the model data to.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public graphics.scenery.Mesh loadModelForMesh(@org.jetbrains.annotations.NotNull()
    graphics.scenery.controls.TrackedDeviceType type, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Mesh mesh) {
        return null;
    }
    
    /**
     * * Returns all tracked devices a given type.
     *     *
     *     * @param[ofType] The [TrackedDeviceType] of the devices to return.
     *     * @return A [Map] of device name to [TrackedDevice]
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Map<java.lang.String, graphics.scenery.controls.TrackedDevice> getTrackedDevices(@org.jetbrains.annotations.NotNull()
    graphics.scenery.controls.TrackedDeviceType ofType) {
        return null;
    }
    
    /**
     * * Attaches a given [TrackedDevice] to a scene graph [Node], camera-relative in case [camera] is non-null.
     *     *
     *     * @param[device] The [TrackedDevice] to use.
     *     * @param[node] The node which should take tracking data from [device].
     *     * @param[camera] A camera, in case the node should also be added as a child to the camera.
     */
    @java.lang.Override()
    public void attachToNode(@org.jetbrains.annotations.NotNull()
    graphics.scenery.controls.TrackedDevice device, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Node node, @org.jetbrains.annotations.Nullable()
    graphics.scenery.Camera camera) {
    }
    
    /**
     * * Adds a behaviour to the map of behaviours, making them available for key bindings
     *     *
     *     * @param[behaviourName] The name of the behaviour
     *     * @param[behaviour] The behaviour to add.
     */
    public final void addBehaviour(@org.jetbrains.annotations.NotNull()
    java.lang.String behaviourName, @org.jetbrains.annotations.NotNull()
    org.scijava.ui.behaviour.Behaviour behaviour) {
    }
    
    /**
     * * Removes a behaviour from the map of behaviours.
     *     *
     *     * @param[behaviourName] The name of the behaviour to remove.
     */
    public final void removeBehaviour(@org.jetbrains.annotations.NotNull()
    java.lang.String behaviourName) {
    }
    
    /**
     * * Adds a key binding for a given behaviour
     *     *
     *     * @param[behaviourName] The behaviour to add a key binding for
     *     * @param[keys] Which keys should trigger this behaviour?
     */
    public final void addKeyBinding(@org.jetbrains.annotations.NotNull()
    java.lang.String behaviourName, @org.jetbrains.annotations.NotNull()
    java.lang.String... keys) {
    }
    
    /**
     * * Removes a key binding for a given behaviour
     *     *
     *     * @param[behaviourName] The behaviour to remove the key binding for.
     */
    @kotlin.Suppress(names = {"unused"})
    public final void removeKeyBinding(@org.jetbrains.annotations.NotNull()
    java.lang.String behaviourName) {
    }
    
    /**
     * * Returns the behaviour with the given name, if it exists. Otherwise null is returned.
     *     *
     *     * @param[behaviourName] The name of the behaviour
     */
    @org.jetbrains.annotations.Nullable()
    public final org.scijava.ui.behaviour.Behaviour getBehaviour(@org.jetbrains.annotations.NotNull()
    java.lang.String behaviourName) {
        return null;
    }
    
    public final boolean getSeated() {
        return false;
    }
    
    public final boolean getUseCompositor() {
        return false;
    }
    
    public OpenVRHMD(boolean seated, boolean useCompositor) {
        super();
    }
    
    public OpenVRHMD() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lgraphics/scenery/controls/OpenVRHMD$OpenVRButton;", "", "internalId", "", "(Ljava/lang/String;II)V", "getInternalId", "()I", "Left", "Right", "Up", "Down", "Menu", "Side", "scenery"})
    public static enum OpenVRButton {
        /*public static final*/ Left /* = new Left(0) */,
        /*public static final*/ Right /* = new Right(0) */,
        /*public static final*/ Up /* = new Up(0) */,
        /*public static final*/ Down /* = new Down(0) */,
        /*public static final*/ Menu /* = new Menu(0) */,
        /*public static final*/ Side /* = new Side(0) */;
        private final int internalId = 0;
        
        public final int getInternalId() {
            return 0;
        }
        
        OpenVRButton(int internalId) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lgraphics/scenery/controls/OpenVRHMD$AWTKey;", "", "code", "", "char", "", "(IC)V", "getChar", "()C", "getCode", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "scenery"})
    public static final class AWTKey {
        private final int code = 0;
        
        public final int getCode() {
            return 0;
        }
        
        public final char getChar() {
            return '\u0000';
        }
        
        public AWTKey(int code, char p1_1526187) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final char component2() {
            return '\u0000';
        }
        
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.controls.OpenVRHMD.AWTKey copy(int code, char p1_1526187) {
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