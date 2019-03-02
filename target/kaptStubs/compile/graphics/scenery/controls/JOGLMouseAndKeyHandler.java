package graphics.scenery.controls;

import java.lang.System;

/**
 * * Input handling class for JOGL-based windows
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u001aH\u0016J\u0012\u0010\"\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010$\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010%\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010&\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010\'\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010(\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010*\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010#H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\tR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lgraphics/scenery/controls/JOGLMouseAndKeyHandler;", "Lgraphics/scenery/controls/MouseAndKeyHandlerBase;", "Lcom/jogamp/newt/event/MouseListener;", "Lcom/jogamp/newt/event/KeyListener;", "Lcom/jogamp/newt/event/WindowListener;", "Lnet/java/games/input/ControllerListener;", "Lgraphics/scenery/utils/ExtractsNatives;", "hub", "Lgraphics/scenery/Hub;", "(Lgraphics/scenery/Hub;)V", "getHub", "()Lgraphics/scenery/Hub;", "setHub", "os", "", "scrollSpeedMultiplier", "", "getMask", "", "e", "Lcom/jogamp/newt/event/InputEvent;", "keyPressed", "", "Lcom/jogamp/newt/event/KeyEvent;", "keyReleased", "mouseClicked", "Lcom/jogamp/newt/event/MouseEvent;", "mouseDragged", "mouseEntered", "mouseExited", "mouseMoved", "mousePressed", "mouseReleased", "mouseWheelMoved", "windowDestroyNotify", "Lcom/jogamp/newt/event/WindowEvent;", "windowDestroyed", "windowGainedFocus", "windowLostFocus", "windowMoved", "windowRepaint", "Lcom/jogamp/newt/event/WindowUpdateEvent;", "windowResized", "scenery"})
public class JOGLMouseAndKeyHandler extends graphics.scenery.controls.MouseAndKeyHandlerBase implements com.jogamp.newt.event.MouseListener, com.jogamp.newt.event.KeyListener, com.jogamp.newt.event.WindowListener, net.java.games.input.ControllerListener, graphics.scenery.utils.ExtractsNatives {
    
    /**
     * store os name 
     */
    private java.lang.String os;
    
    /**
     * scroll speed multiplier to combat OS idiosyncrasies 
     */
    private float scrollSpeedMultiplier;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Hub hub;
    
    /**
     * * Returns the key mask of a given input event
     *     *
     *     * @param[e] The input event to evaluate.
     */
    private final int getMask(com.jogamp.newt.event.InputEvent e) {
        return 0;
    }
    
    /**
     * * Called when the mouse is moved, evaluates active drag behaviours, updates state
     *     *
     *     * @param[e] The incoming MouseEvent
     */
    @java.lang.Override()
    public void mouseMoved(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse enters, updates state
     *     *
     *     * @param[e] The incoming MouseEvent
     */
    @java.lang.Override()
    public void mouseEntered(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse is clicked, updates state
     *     *
     *     * @param[e] The incoming MouseEvent
     */
    @java.lang.Override()
    public void mouseClicked(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse wheel is moved
     *     *
     *     * @param[e] The incoming mouse event
     */
    @java.lang.Override()
    public void mouseWheelMoved(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse is release
     *     *
     *     * @param[e] The incoming mouse event
     */
    @java.lang.Override()
    public void mouseReleased(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse is dragged, evaluates current drag behaviours
     *     *
     *     * @param[e] The incoming mouse event
     */
    @java.lang.Override()
    public void mouseDragged(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse is exiting, updates state
     *     *
     *     * @param[e] The incoming mouse event
     */
    @java.lang.Override()
    public void mouseExited(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse is pressed, updates state and masks, evaluates drags
     *     *
     *     * @param[e] The incoming mouse event
     */
    @java.lang.Override()
    public void mousePressed(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.MouseEvent e) {
    }
    
    /**
     * * Called when a key is pressed
     *     *
     *     * @param[e] The incoming keyboard event
     */
    @java.lang.Override()
    public void keyPressed(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.KeyEvent e) {
    }
    
    /**
     * * Called when a key is released
     *     *
     *     * @param[e] The incoming keyboard event
     */
    @java.lang.Override()
    public void keyReleased(@org.jetbrains.annotations.NotNull()
    com.jogamp.newt.event.KeyEvent e) {
    }
    
    /**
     * * Called when a window repaint event is registered
     *     *
     *     * @param[e] The incoming window update event
     */
    @java.lang.Override()
    public void windowRepaint(@org.jetbrains.annotations.Nullable()
    com.jogamp.newt.event.WindowUpdateEvent e) {
    }
    
    /**
     * * Called when a window destroy event is registered
     *     *
     *     * @param[e] The incoming window event
     */
    @java.lang.Override()
    public void windowDestroyed(@org.jetbrains.annotations.Nullable()
    com.jogamp.newt.event.WindowEvent e) {
    }
    
    /**
     * * Called when a window destruction notification event is registered
     *     *
     *     * @param[e] The incoming window update event
     */
    @java.lang.Override()
    public void windowDestroyNotify(@org.jetbrains.annotations.Nullable()
    com.jogamp.newt.event.WindowEvent e) {
    }
    
    /**
     * * Called when the window lost focus. Clears pressed keys
     *     *
     *     * @param[e] The incoming window update event
     */
    @java.lang.Override()
    public void windowLostFocus(@org.jetbrains.annotations.Nullable()
    com.jogamp.newt.event.WindowEvent e) {
    }
    
    /**
     * * Called when a window move event is registered
     *     *
     *     * @param[e] The incoming window update event
     */
    @java.lang.Override()
    public void windowMoved(@org.jetbrains.annotations.Nullable()
    com.jogamp.newt.event.WindowEvent e) {
    }
    
    /**
     * * Called when a window resize event is registered
     *     *
     *     * @param[e] The incoming window update event
     */
    @java.lang.Override()
    public void windowResized(@org.jetbrains.annotations.Nullable()
    com.jogamp.newt.event.WindowEvent e) {
    }
    
    /**
     * * Called when a window regains focus, clears pressed keys
     *     *
     *     * @param[e] The incoming window update event
     */
    @java.lang.Override()
    public void windowGainedFocus(@org.jetbrains.annotations.Nullable()
    com.jogamp.newt.event.WindowEvent e) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final graphics.scenery.Hub getHub() {
        return null;
    }
    
    protected final void setHub(@org.jetbrains.annotations.Nullable()
    graphics.scenery.Hub p0) {
    }
    
    public JOGLMouseAndKeyHandler(@org.jetbrains.annotations.Nullable()
    graphics.scenery.Hub hub) {
        super();
    }
}