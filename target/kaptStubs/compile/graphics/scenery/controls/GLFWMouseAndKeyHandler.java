package graphics.scenery.controls;

import java.lang.System;

/**
 * * Input handling class for GLFW-based windows.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010(\u001a\u00020)H\u0016J\u001a\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020+H\u0002J\u000e\u0010/\u001a\u00020)2\u0006\u0010,\u001a\u000200J\u000e\u00101\u001a\u00020)2\u0006\u0010,\u001a\u000200J\u000e\u00102\u001a\u00020)2\u0006\u0010,\u001a\u000203J\u000e\u00104\u001a\u00020)2\u0006\u0010,\u001a\u000203J\u000e\u00105\u001a\u00020)2\u0006\u0010,\u001a\u000203J\u000e\u00106\u001a\u00020)2\u0006\u0010,\u001a\u000203J\u000e\u00107\u001a\u00020)2\u0006\u0010,\u001a\u000203J\u000e\u00108\u001a\u00020)2\u0006\u0010,\u001a\u000203J\u000e\u00109\u001a\u00020)2\u0006\u0010,\u001a\u000203J\u000e\u0010:\u001a\u00020)2\u0006\u0010,\u001a\u000203J\u0010\u0010;\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010<J\u0010\u0010=\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010<R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lgraphics/scenery/controls/GLFWMouseAndKeyHandler;", "Lgraphics/scenery/controls/MouseAndKeyHandlerBase;", "Ljava/lang/AutoCloseable;", "Lgraphics/scenery/utils/ExtractsNatives;", "hub", "Lgraphics/scenery/Hub;", "(Lgraphics/scenery/Hub;)V", "clickBefore", "", "cursorCallback", "Lorg/lwjgl/glfw/GLFWCursorPosCallback;", "getCursorCallback", "()Lorg/lwjgl/glfw/GLFWCursorPosCallback;", "setCursorCallback", "(Lorg/lwjgl/glfw/GLFWCursorPosCallback;)V", "getHub", "()Lgraphics/scenery/Hub;", "setHub", "keyCallback", "Lorg/lwjgl/glfw/GLFWKeyCallback;", "getKeyCallback", "()Lorg/lwjgl/glfw/GLFWKeyCallback;", "setKeyCallback", "(Lorg/lwjgl/glfw/GLFWKeyCallback;)V", "mouseCallback", "Lorg/lwjgl/glfw/GLFWMouseButtonCallback;", "getMouseCallback", "()Lorg/lwjgl/glfw/GLFWMouseButtonCallback;", "setMouseCallback", "(Lorg/lwjgl/glfw/GLFWMouseButtonCallback;)V", "os", "", "scrollCallback", "Lorg/lwjgl/glfw/GLFWScrollCallback;", "getScrollCallback", "()Lorg/lwjgl/glfw/GLFWScrollCallback;", "setScrollCallback", "(Lorg/lwjgl/glfw/GLFWScrollCallback;)V", "scrollSpeedMultiplier", "", "close", "", "getMask", "", "e", "Lcom/jogamp/newt/event/InputEvent;", "initial", "keyPressed", "Lcom/jogamp/newt/event/KeyEvent;", "keyReleased", "mouseClicked", "Lcom/jogamp/newt/event/MouseEvent;", "mouseDragged", "mouseEntered", "mouseExited", "mouseMoved", "mousePressed", "mouseReleased", "mouseWheelMoved", "windowGainedFocus", "Lcom/jogamp/newt/event/WindowEvent;", "windowLostFocus", "scenery"})
public class GLFWMouseAndKeyHandler extends graphics.scenery.controls.MouseAndKeyHandlerBase implements java.lang.AutoCloseable, graphics.scenery.utils.ExtractsNatives {
    
    /**
     * store os name 
     */
    private java.lang.String os;
    
    /**
     * scroll speed multiplier to combat OS idiosyncrasies 
     */
    private float scrollSpeedMultiplier;
    @org.jetbrains.annotations.NotNull()
    private org.lwjgl.glfw.GLFWCursorPosCallback cursorCallback;
    @org.jetbrains.annotations.NotNull()
    private org.lwjgl.glfw.GLFWKeyCallback keyCallback;
    private long clickBefore;
    @org.jetbrains.annotations.NotNull()
    private org.lwjgl.glfw.GLFWMouseButtonCallback mouseCallback;
    @org.jetbrains.annotations.NotNull()
    private org.lwjgl.glfw.GLFWScrollCallback scrollCallback;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Hub hub;
    
    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.glfw.GLFWCursorPosCallback getCursorCallback() {
        return null;
    }
    
    public final void setCursorCallback(@org.jetbrains.annotations.NotNull()
    org.lwjgl.glfw.GLFWCursorPosCallback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.glfw.GLFWKeyCallback getKeyCallback() {
        return null;
    }
    
    public final void setKeyCallback(@org.jetbrains.annotations.NotNull()
    org.lwjgl.glfw.GLFWKeyCallback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.glfw.GLFWMouseButtonCallback getMouseCallback() {
        return null;
    }
    
    public final void setMouseCallback(@org.jetbrains.annotations.NotNull()
    org.lwjgl.glfw.GLFWMouseButtonCallback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.glfw.GLFWScrollCallback getScrollCallback() {
        return null;
    }
    
    public final void setScrollCallback(@org.jetbrains.annotations.NotNull()
    org.lwjgl.glfw.GLFWScrollCallback p0) {
    }
    
    /**
     * * Returns the key mask of a given input event
     *     *
     *     * @param[e] The input event to evaluate.
     */
    private final int getMask(com.jogamp.newt.event.InputEvent e, int initial) {
        return 0;
    }
    
    /**
     * * Called when the mouse is moved, evaluates active drag behaviours, updates state
     *     *
     *     * @param[e] The incoming MouseEvent
     */
    public final void mouseMoved(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse enters, updates state
     *     *
     *     * @param[e] The incoming MouseEvent
     */
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    public final void mouseEntered(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse is clicked, updates state
     *     *
     *     * @param[e] The incoming MouseEvent
     */
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    public final void mouseClicked(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse wheel is moved
     *     *
     *     * @param[e] The incoming mouse event
     */
    public final void mouseWheelMoved(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse is release
     *     *
     *     * @param[e] The incoming mouse event
     */
    public final void mouseReleased(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse is dragged, evaluates current drag behaviours
     *     *
     *     * @param[e] The incoming mouse event
     */
    public final void mouseDragged(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse is exiting, updates state
     *     *
     *     * @param[e] The incoming mouse event
     */
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    public final void mouseExited(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse is pressed, updates state and masks, evaluates drags
     *     *
     *     * @param[e] The incoming mouse event
     */
    public final void mousePressed(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when a key is pressed
     *     *
     *     * @param[e] The incoming keyboard event
     */
    public final void keyPressed(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.KeyEvent e) {
    }
    
    /**
     * * Called when a key is released
     *     *
     *     * @param[e] The incoming keyboard event
     */
    public final void keyReleased(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.KeyEvent e) {
    }
    
    /**
     * * Called when the window lost focus. Clears pressed keys
     *     *
     *     * @param[e] The incoming window update event
     */
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    public final void windowLostFocus(@org.jetbrains.annotations.Nullable()
    com.jogamp.newt.event.WindowEvent e) {
    }
    
    /**
     * * Called when a window regains focus, clears pressed keys
     *     *
     *     * @param[e] The incoming window update event
     */
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    public final void windowGainedFocus(@org.jetbrains.annotations.Nullable()
    com.jogamp.newt.event.WindowEvent e) {
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final graphics.scenery.Hub getHub() {
        return null;
    }
    
    protected final void setHub(@org.jetbrains.annotations.Nullable()
    graphics.scenery.Hub p0) {
    }
    
    public GLFWMouseAndKeyHandler(@org.jetbrains.annotations.Nullable()
    graphics.scenery.Hub hub) {
        super();
    }
}