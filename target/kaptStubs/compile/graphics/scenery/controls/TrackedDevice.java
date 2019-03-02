package graphics.scenery.controls;

import java.lang.System;

/**
 * * Class for tracked devices and querying information about them.
 * *
 * * @property[type] The [TrackedDeviceType] of the device.
 * * @property[name] A name for the device.
 * * @property[pose] The current pose of the device.
 * * @property[timestamp] The latest timestamp with respect to the pose.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u00020\u00158FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u00020\u001f8FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u00a8\u0006*"}, d2 = {"Lgraphics/scenery/controls/TrackedDevice;", "", "type", "Lgraphics/scenery/controls/TrackedDeviceType;", "name", "", "pose", "Lcleargl/GLMatrix;", "timestamp", "", "(Lgraphics/scenery/controls/TrackedDeviceType;Ljava/lang/String;Lcleargl/GLMatrix;J)V", "metadata", "getMetadata", "()Ljava/lang/Object;", "setMetadata", "(Ljava/lang/Object;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "orientation", "Lcom/jogamp/opengl/math/Quaternion;", "getOrientation", "()Lcom/jogamp/opengl/math/Quaternion;", "setOrientation", "(Lcom/jogamp/opengl/math/Quaternion;)V", "getPose", "()Lcleargl/GLMatrix;", "setPose", "(Lcleargl/GLMatrix;)V", "position", "Lcleargl/GLVector;", "getPosition", "()Lcleargl/GLVector;", "setPosition", "(Lcleargl/GLVector;)V", "getTimestamp", "()J", "setTimestamp", "(J)V", "getType", "()Lgraphics/scenery/controls/TrackedDeviceType;", "scenery"})
public final class TrackedDevice {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Object metadata;
    @org.jetbrains.annotations.NotNull()
    private com.jogamp.opengl.math.Quaternion orientation;
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector position;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.controls.TrackedDeviceType type = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLMatrix pose;
    private long timestamp;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMetadata() {
        return null;
    }
    
    public final void setMetadata(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jogamp.opengl.math.Quaternion getOrientation() {
        return null;
    }
    
    public final void setOrientation(@org.jetbrains.annotations.NotNull()
    com.jogamp.opengl.math.Quaternion p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getPosition() {
        return null;
    }
    
    public final void setPosition(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.controls.TrackedDeviceType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLMatrix getPose() {
        return null;
    }
    
    public final void setPose(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0) {
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    public final void setTimestamp(long p0) {
    }
    
    public TrackedDevice(@org.jetbrains.annotations.NotNull()
    graphics.scenery.controls.TrackedDeviceType type, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix pose, long timestamp) {
        super();
    }
}