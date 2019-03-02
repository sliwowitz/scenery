package graphics.scenery.controls;

import java.lang.System;

/**
 * * TrackerInput for handling VRPN-based devices
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J\b\u0010G\u001a\u00020\u0006H\u0016J\u0010\u0010G\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u0003H\u0016J\b\u0010I\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020MH\u0016J\b\u0010N\u001a\u00020\fH\u0016J\u001c\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020B0P2\u0006\u0010Q\u001a\u00020RH\u0016J\n\u0010S\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010T\u001a\u00020.2\u0006\u0010U\u001a\u00020\u0003H\u0002J\b\u0010V\u001a\u00020WH\u0016J\u0018\u0010X\u001a\u00020Y2\u0006\u0010A\u001a\u00020B2\u0006\u0010Z\u001a\u00020YH\u0016J\u0018\u0010X\u001a\u00020Y2\u0006\u0010[\u001a\u00020R2\u0006\u0010Z\u001a\u00020YH\u0016J\b\u0010\\\u001a\u00020@H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010\u0002\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0003@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0013\"\u0004\b5\u0010\u0004R\u001a\u00106\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0013\"\u0004\b8\u0010\u0004R\u001a\u00109\u001a\u00020:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>\u00a8\u0006]"}, d2 = {"Lgraphics/scenery/controls/VRPNTrackerInput;", "Lgraphics/scenery/controls/TrackerInput;", "trackerAddress", "", "(Ljava/lang/String;)V", "cachedOrientation", "Lcom/jogamp/opengl/math/Quaternion;", "getCachedOrientation", "()Lcom/jogamp/opengl/math/Quaternion;", "setCachedOrientation", "(Lcom/jogamp/opengl/math/Quaternion;)V", "cachedPosition", "Lcleargl/GLVector;", "getCachedPosition", "()Lcleargl/GLVector;", "setCachedPosition", "(Lcleargl/GLVector;)V", "deviceName", "getDeviceName", "()Ljava/lang/String;", "setDeviceName", "listener", "Lvrpn/TrackerRemoteListener;", "getListener", "()Lvrpn/TrackerRemoteListener;", "setListener", "(Lvrpn/TrackerRemoteListener;)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "positionScaling", "", "getPositionScaling", "()F", "setPositionScaling", "(F)V", "stats", "Ljava/util/Timer;", "getStats", "()Ljava/util/Timer;", "setStats", "(Ljava/util/Timer;)V", "tracker", "Lvrpn/TrackerRemote;", "getTracker", "()Lvrpn/TrackerRemote;", "setTracker", "(Lvrpn/TrackerRemote;)V", "value", "getTrackerAddress", "setTrackerAddress", "trackerLocation", "getTrackerLocation", "setTrackerLocation", "vrpnMsgCount", "", "getVrpnMsgCount", "()J", "setVrpnMsgCount", "(J)V", "attachToNode", "", "device", "Lgraphics/scenery/controls/TrackedDevice;", "node", "Lgraphics/scenery/Node;", "camera", "Lgraphics/scenery/Camera;", "getOrientation", "id", "getPose", "Lcleargl/GLMatrix;", "getPoseForEye", "eye", "", "getPosition", "getTrackedDevices", "", "ofType", "Lgraphics/scenery/controls/TrackedDeviceType;", "getWorkingTracker", "initializeTracker", "address", "initializedAndWorking", "", "loadModelForMesh", "Lgraphics/scenery/Mesh;", "mesh", "type", "update", "scenery"})
public final class VRPNTrackerInput implements graphics.scenery.controls.TrackerInput {
    private final kotlin.Lazy logger$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private vrpn.TrackerRemote tracker;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String deviceName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String trackerLocation;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String trackerAddress;
    @org.jetbrains.annotations.Nullable()
    private vrpn.TrackerRemoteListener listener;
    @org.jetbrains.annotations.NotNull()
    private com.jogamp.opengl.math.Quaternion cachedOrientation;
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector cachedPosition;
    @org.jetbrains.annotations.NotNull()
    private java.util.Timer stats;
    private long vrpnMsgCount;
    private float positionScaling;
    
    private final org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final vrpn.TrackerRemote getTracker() {
        return null;
    }
    
    public final void setTracker(@org.jetbrains.annotations.Nullable()
    vrpn.TrackerRemote p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceName() {
        return null;
    }
    
    public final void setDeviceName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTrackerLocation() {
        return null;
    }
    
    public final void setTrackerLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTrackerAddress() {
        return null;
    }
    
    public final void setTrackerAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final vrpn.TrackerRemoteListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    vrpn.TrackerRemoteListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jogamp.opengl.math.Quaternion getCachedOrientation() {
        return null;
    }
    
    public final void setCachedOrientation(@org.jetbrains.annotations.NotNull()
    com.jogamp.opengl.math.Quaternion p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getCachedPosition() {
        return null;
    }
    
    public final void setCachedPosition(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Timer getStats() {
        return null;
    }
    
    public final void setStats(@org.jetbrains.annotations.NotNull()
    java.util.Timer p0) {
    }
    
    public final long getVrpnMsgCount() {
        return 0L;
    }
    
    public final void setVrpnMsgCount(long p0) {
    }
    
    public final float getPositionScaling() {
        return 0.0F;
    }
    
    public final void setPositionScaling(float p0) {
    }
    
    private final vrpn.TrackerRemote initializeTracker(java.lang.String address) {
        return null;
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
     *     * @return True if HMD is initialiased correctly and working properly
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
    
    public VRPNTrackerInput(@org.jetbrains.annotations.NotNull()
    java.lang.String trackerAddress) {
        super();
    }
    
    public VRPNTrackerInput() {
        super();
    }
}