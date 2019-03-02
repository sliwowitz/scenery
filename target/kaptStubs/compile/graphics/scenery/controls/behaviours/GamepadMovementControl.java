package graphics.scenery.controls.behaviours;

import java.lang.System;

/**
 * * Implementation of GamepadBehaviour for Camera Movement Control
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @property[name] Name of the behaviour
 * * @property[axis] List of axis that are assigned to this behaviour
 * * @property[cam] The camera to control
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001eB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0013H\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017\u00a8\u0006\u001f"}, d2 = {"Lgraphics/scenery/controls/behaviours/GamepadMovementControl;", "Lgraphics/scenery/controls/behaviours/GamepadBehaviour;", "name", "", "axis", "", "Lnet/java/games/input/Component$Identifier;", "camera", "Lkotlin/Function0;", "Lgraphics/scenery/Camera;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "getAxis", "()Ljava/util/List;", "cam", "getCam", "()Lgraphics/scenery/Camera;", "cam$delegate", "Lgraphics/scenery/controls/behaviours/GamepadMovementControl$CameraDelegate;", "speedMultiplier", "", "getSpeedMultiplier", "()F", "setSpeedMultiplier", "(F)V", "threshold", "getThreshold", "setThreshold", "axisEvent", "", "value", "CameraDelegate", "scenery"})
public class GamepadMovementControl implements graphics.scenery.controls.behaviours.GamepadBehaviour {
    
    /**
     * Speed multiplier for camera movement 
     */
    private float speedMultiplier;
    
    /**
     * Threshold below which the behaviour does not trigger 
     */
    private float threshold;
    private final graphics.scenery.controls.behaviours.GamepadMovementControl.CameraDelegate cam$delegate = null;
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<net.java.games.input.Component.Identifier> axis = null;
    private final kotlin.jvm.functions.Function0<graphics.scenery.Camera> camera = null;
    
    public final float getSpeedMultiplier() {
        return 0.0F;
    }
    
    public final void setSpeedMultiplier(float p0) {
    }
    
    public final float getThreshold() {
        return 0.0F;
    }
    
    public final void setThreshold(float p0) {
    }
    
    private final graphics.scenery.Camera getCam() {
        return null;
    }
    
    /**
     * * This function is triggered upon arrival of an axis event that
     *     * concerns this behaviour. It takes the event's value to move the camera
     *     * in the corresponding direction.
     *     *
     *     * @param[axis] The gamepad axis.
     *     * @param[value] The absolute value of the gamepad axis.
     */
    @java.lang.Override()
    public synchronized void axisEvent(@org.jetbrains.annotations.NotNull()
    net.java.games.input.Component.Identifier axis, float value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<net.java.games.input.Component.Identifier> getAxis() {
        return null;
    }
    
    public GamepadMovementControl(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends net.java.games.input.Component.Identifier> axis, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends graphics.scenery.Camera> camera) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086\u0002J)\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0086\u0002\u00a8\u0006\u000b"}, d2 = {"Lgraphics/scenery/controls/behaviours/GamepadMovementControl$CameraDelegate;", "", "(Lgraphics/scenery/controls/behaviours/GamepadMovementControl;)V", "getValue", "Lgraphics/scenery/Camera;", "thisRef", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "scenery"})
    public final class CameraDelegate {
        
        /**
         * Returns the [graphics.scenery.Camera] resulting from the evaluation of [camera] 
         */
        @org.jetbrains.annotations.Nullable()
        public final graphics.scenery.Camera getValue(@org.jetbrains.annotations.Nullable()
        java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
        kotlin.reflect.KProperty<?> property) {
            return null;
        }
        
        /**
         * Setting the value is not supported 
         */
        public final void setValue(@org.jetbrains.annotations.Nullable()
        java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
        kotlin.reflect.KProperty<?> property, @org.jetbrains.annotations.Nullable()
        graphics.scenery.Camera value) {
        }
        
        public CameraDelegate() {
            super();
        }
    }
}