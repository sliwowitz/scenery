package graphics.scenery.controls.behaviours;

import java.lang.System;

/**
 * * FPS-style camera control
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @property[name] The name of the behaviour
 * * @property[node] The node this behaviour controls
 * * @property[w] Window width
 * * @property[h] Window height
 * * @constructor Creates a new FPSCameraControl behaviour
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001fB/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0018\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00068D@DX\u0084\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lgraphics/scenery/controls/behaviours/FPSCameraControl;", "Lorg/scijava/ui/behaviour/DragBehaviour;", "name", "", "n", "Ljava/util/function/Supplier;", "Lgraphics/scenery/Camera;", "w", "", "h", "(Ljava/lang/String;Ljava/util/function/Supplier;II)V", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;II)V", "firstEntered", "", "lastX", "lastY", "<set-?>", "node", "getNode", "()Lgraphics/scenery/Camera;", "setNode", "(Lgraphics/scenery/Camera;)V", "node$delegate", "Lgraphics/scenery/controls/behaviours/FPSCameraControl$CameraDelegate;", "drag", "", "x", "y", "end", "init", "CameraDelegate", "scenery"})
public class FPSCameraControl implements org.scijava.ui.behaviour.DragBehaviour {
    private int lastX;
    private int lastY;
    private boolean firstEntered;
    
    /**
     * The [graphics.scenery.Node] this behaviour class controls 
     */
    @org.jetbrains.annotations.Nullable()
    private final graphics.scenery.controls.behaviours.FPSCameraControl.CameraDelegate node$delegate = null;
    private final java.lang.String name = null;
    private final kotlin.jvm.functions.Function0<graphics.scenery.Camera> n = null;
    private final int w = 0;
    private final int h = 0;
    
    /**
     * The [graphics.scenery.Node] this behaviour class controls 
     */
    @org.jetbrains.annotations.Nullable()
    protected final graphics.scenery.Camera getNode() {
        return null;
    }
    
    /**
     * The [graphics.scenery.Node] this behaviour class controls 
     */
    protected final void setNode(@org.jetbrains.annotations.Nullable()
    graphics.scenery.Camera p0) {
    }
    
    /**
     * * This function is called upon mouse down and initialises the camera control
     *     * with the current window size.
     *     *
     *     * @param[x] x position in window
     *     * @param[y] y position in window
     */
    @java.lang.Override()
    public void init(int x, int y) {
    }
    
    /**
     * * This function is called upon mouse down ends.
     *     *
     *     * @param[x] x position in window
     *     * @param[y] y position in window
     */
    @java.lang.Override()
    public void end(int x, int y) {
    }
    
    /**
     * * This function is called during mouse down and updates the yaw and pitch states,
     *     * and resets the cam's forward and up vectors according to these angles.
     *     *
     *     * @param[x] x position in window
     *     * @param[y] y position in window
     */
    @java.lang.Override()
    public synchronized void drag(int x, int y) {
    }
    
    public FPSCameraControl(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends graphics.scenery.Camera> n, int w, int h) {
        super();
    }
    
    /**
     * * FPS-style camera control, supplying a Camera via a Java [Supplier] lambda.
     */
    @kotlin.Suppress(names = {"unused"})
    public FPSCameraControl(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.util.function.Supplier<graphics.scenery.Camera> n, int w, int h) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086\u0002J)\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0086\u0002\u00a8\u0006\u000b"}, d2 = {"Lgraphics/scenery/controls/behaviours/FPSCameraControl$CameraDelegate;", "", "(Lgraphics/scenery/controls/behaviours/FPSCameraControl;)V", "getValue", "Lgraphics/scenery/Camera;", "thisRef", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "scenery"})
    public final class CameraDelegate {
        
        /**
         * Returns the [graphics.scenery.Node] resulting from the evaluation of [n] 
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