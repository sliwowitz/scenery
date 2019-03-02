package graphics.scenery.controls.behaviours;

import java.lang.System;

/**
 * * Raycasting-based selection command. Needs to be given a
 * * [scene] to act upon, plus a lambda returning current camera information ([camera]).
 * *
 * * The command returns all the selected objects sorted by distance to
 * * the lambda given in [action]. [ignoredObjects] can be set to classes the user does not want
 * * to select, by default this is only [BoundingGrid].
 * *
 * * If [debugRaycast] is true, a line will be drawn from the camera in the direction of
 * * the selection raycast.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u00018Bi\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e\u0012\u0004\u0012\u00020\u00130\u0011\u00a2\u0006\u0002\u0010\u0014J\u0018\u00104\u001a\u00020\u00132\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000206H\u0016R,\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e\u0012\u0004\u0012\u00020\u00130\u0011X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\n8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001b\u0010(\u001a\u00020)8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103\u00a8\u00069"}, d2 = {"Lgraphics/scenery/controls/behaviours/SelectCommand;", "Lorg/scijava/ui/behaviour/ClickBehaviour;", "name", "", "renderer", "Lgraphics/scenery/backends/Renderer;", "scene", "Lgraphics/scenery/Scene;", "camera", "Lkotlin/Function0;", "Lgraphics/scenery/Camera;", "debugRaycast", "", "ignoredObjects", "", "Ljava/lang/Class;", "action", "Lkotlin/Function1;", "Lgraphics/scenery/Scene$RaycastResult;", "", "(Ljava/lang/String;Lgraphics/scenery/backends/Renderer;Lgraphics/scenery/Scene;Lkotlin/jvm/functions/Function0;ZLjava/util/List;Lkotlin/jvm/functions/Function1;)V", "getAction", "()Lkotlin/jvm/functions/Function1;", "setAction", "(Lkotlin/jvm/functions/Function1;)V", "cam", "getCam", "()Lgraphics/scenery/Camera;", "cam$delegate", "Lgraphics/scenery/controls/behaviours/SelectCommand$CameraDelegate;", "getCamera", "()Lkotlin/jvm/functions/Function0;", "getDebugRaycast", "()Z", "setDebugRaycast", "(Z)V", "getIgnoredObjects", "()Ljava/util/List;", "setIgnoredObjects", "(Ljava/util/List;)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "getName", "()Ljava/lang/String;", "getRenderer", "()Lgraphics/scenery/backends/Renderer;", "getScene", "()Lgraphics/scenery/Scene;", "click", "x", "", "y", "CameraDelegate", "scenery"})
public class SelectCommand implements org.scijava.ui.behaviour.ClickBehaviour {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final graphics.scenery.controls.behaviours.SelectCommand.CameraDelegate cam$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.Renderer renderer = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.Scene scene = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<graphics.scenery.Camera> camera = null;
    private boolean debugRaycast;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends java.lang.Class<?>> ignoredObjects;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super java.util.List<graphics.scenery.Scene.RaycastResult>, kotlin.Unit> action;
    
    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final graphics.scenery.Camera getCam() {
        return null;
    }
    
    /**
     * * This is the action executed upon triggering this action, with [x] and [y] being
     *     * the screen-space coordinates.
     */
    @java.lang.Override()
    public void click(int x, int y) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.Renderer getRenderer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.Scene getScene() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlin.jvm.functions.Function0<graphics.scenery.Camera> getCamera() {
        return null;
    }
    
    protected final boolean getDebugRaycast() {
        return false;
    }
    
    protected final void setDebugRaycast(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Class<?>> getIgnoredObjects() {
        return null;
    }
    
    public final void setIgnoredObjects(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Class<?>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlin.jvm.functions.Function1<java.util.List<graphics.scenery.Scene.RaycastResult>, kotlin.Unit> getAction() {
        return null;
    }
    
    protected final void setAction(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<graphics.scenery.Scene.RaycastResult>, kotlin.Unit> p0) {
    }
    
    public SelectCommand(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.Renderer renderer, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Scene scene, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends graphics.scenery.Camera> camera, boolean debugRaycast, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Class<?>> ignoredObjects, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<graphics.scenery.Scene.RaycastResult>, kotlin.Unit> action) {
        super();
    }
    
    public SelectCommand(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.Renderer renderer, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Scene scene, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends graphics.scenery.Camera> camera, boolean debugRaycast, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Class<?>> ignoredObjects) {
        super();
    }
    
    public SelectCommand(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.Renderer renderer, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Scene scene, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends graphics.scenery.Camera> camera, boolean debugRaycast) {
        super();
    }
    
    public SelectCommand(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.Renderer renderer, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Scene scene, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends graphics.scenery.Camera> camera) {
        super();
    }
    
    /**
     * Camera delegate class, converting lambdas to Cameras. 
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086\u0002J)\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0086\u0002\u00a8\u0006\u000b"}, d2 = {"Lgraphics/scenery/controls/behaviours/SelectCommand$CameraDelegate;", "", "(Lgraphics/scenery/controls/behaviours/SelectCommand;)V", "getValue", "Lgraphics/scenery/Camera;", "thisRef", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "scenery"})
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