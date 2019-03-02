package graphics.scenery.controls;

import java.lang.System;

/**
 * * Generic interface for head-mounted displays (HMDs) providing tracker input.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0017\u001a\u00020\u0018H&J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0000H&J\b\u0010\u001a\u001a\u00020\u001bH&J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH&J\u001a\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH&J\b\u0010 \u001a\u00020\u0003H&\u00a8\u0006!"}, d2 = {"Lgraphics/scenery/controls/TrackerInput;", "", "attachToNode", "", "device", "Lgraphics/scenery/controls/TrackedDevice;", "node", "Lgraphics/scenery/Node;", "camera", "Lgraphics/scenery/Camera;", "getOrientation", "Lcom/jogamp/opengl/math/Quaternion;", "id", "", "getPose", "Lcleargl/GLMatrix;", "getPoseForEye", "eye", "", "getPosition", "Lcleargl/GLVector;", "getTrackedDevices", "", "ofType", "Lgraphics/scenery/controls/TrackedDeviceType;", "getWorkingTracker", "initializedAndWorking", "", "loadModelForMesh", "Lgraphics/scenery/Mesh;", "mesh", "type", "update", "scenery"})
public abstract interface TrackerInput {
    
    /**
     * * Returns the orientation of the HMD
     *     *
     *     * @returns GLMatrix with orientation
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.jogamp.opengl.math.Quaternion getOrientation();
    
    /**
     * * Returns the orientation of the given device, or a unit quaternion if the device is not found.
     *     *
     *     * @returns GLMatrix with orientation
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.jogamp.opengl.math.Quaternion getOrientation(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    /**
     * * Returns the absolute position as GLVector
     *     *
     *     * @return HMD position as GLVector
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLVector getPosition();
    
    /**
     * * Returns the HMD pose
     *     *
     *     * @return HMD pose as GLMatrix
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLMatrix getPose();
    
    /**
     * * Returns the HMD pose for a given eye.
     *     *
     *     * @param[eye] The eye to return the pose for.
     *     * @return HMD pose as GLMatrix
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLMatrix getPoseForEye(int eye);
    
    /**
     * * Check whether the HMD is initialized and working
     *     *
     *     * @return True if HMD is initialiased correctly and working properly
     */
    public abstract boolean initializedAndWorking();
    
    /**
     * * update state
     */
    public abstract void update();
    
    /**
     * * Check whether there is a working TrackerInput for this device.
     *     *
     *     * @returns the [TrackerInput] if that is the case, null otherwise.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract graphics.scenery.controls.TrackerInput getWorkingTracker();
    
    /**
     * * Loads a model representing the [TrackedDevice].
     *     *
     *     * @param[device] The device to load the model for.
     *     * @param[mesh] The [Mesh] to attach the model data to.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract graphics.scenery.Mesh loadModelForMesh(@org.jetbrains.annotations.NotNull()
    graphics.scenery.controls.TrackedDevice device, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Mesh mesh);
    
    /**
     * * Loads a model representing a kind of [TrackedDeviceType].
     *     *
     *     * @param[type] The device type to load the model for, by default [TrackedDeviceType.Controller].
     *     * @param[mesh] The [Mesh] to attach the model data to.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract graphics.scenery.Mesh loadModelForMesh(@org.jetbrains.annotations.NotNull()
    graphics.scenery.controls.TrackedDeviceType type, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Mesh mesh);
    
    /**
     * * Attaches a given [TrackedDevice] to a scene graph [Node], camera-relative in case [camera] is non-null.
     *     *
     *     * @param[device] The [TrackedDevice] to use.
     *     * @param[node] The node which should take tracking data from [device].
     *     * @param[camera] A camera, in case the node should also be added as a child to the camera.
     */
    public abstract void attachToNode(@org.jetbrains.annotations.NotNull()
    graphics.scenery.controls.TrackedDevice device, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Node node, @org.jetbrains.annotations.Nullable()
    graphics.scenery.Camera camera);
    
    /**
     * * Returns all tracked devices a given type.
     *     *
     *     * @param[ofType] The [TrackedDeviceType] of the devices to return.
     *     * @return A [Map] of device name to [TrackedDevice]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, graphics.scenery.controls.TrackedDevice> getTrackedDevices(@org.jetbrains.annotations.NotNull()
    graphics.scenery.controls.TrackedDeviceType ofType);
    
    /**
     * * Generic interface for head-mounted displays (HMDs) providing tracker input.
     * *
     * * @author Ulrik Günther <hello@ulrik.is>
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}