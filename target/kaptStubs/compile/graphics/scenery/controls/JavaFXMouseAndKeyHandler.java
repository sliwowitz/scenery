package graphics.scenery.controls;

import java.lang.System;

/**
 * * Input handling class for JavaFX-based windows.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001cH\u0002J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0016J\u000e\u0010!\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001cJ\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001cJ\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001dJ\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001dJ\u000e\u0010%\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001dJ\u000e\u0010&\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001dJ\u000e\u0010\'\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001dJ\u000e\u0010(\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001dJ\u000e\u0010)\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001dJ\u000e\u0010*\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020+J\f\u0010,\u001a\u00020\n*\u00020-H\u0002R\u0014\u0010\t\u001a\u00020\nX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lgraphics/scenery/controls/JavaFXMouseAndKeyHandler;", "Lgraphics/scenery/controls/MouseAndKeyHandlerBase;", "Ljavafx/event/EventHandler;", "Ljavafx/event/Event;", "hub", "Lgraphics/scenery/Hub;", "panel", "Lgraphics/scenery/utils/SceneryFXPanel;", "(Lgraphics/scenery/Hub;Lgraphics/scenery/utils/SceneryFXPanel;)V", "DOUBLE_CLICK_INTERVAL", "", "getDOUBLE_CLICK_INTERVAL", "()I", "getHub", "()Lgraphics/scenery/Hub;", "setHub", "(Lgraphics/scenery/Hub;)V", "os", "", "getPanel", "()Lgraphics/scenery/utils/SceneryFXPanel;", "setPanel", "(Lgraphics/scenery/utils/SceneryFXPanel;)V", "scrollSpeedMultiplier", "", "getMask", "e", "Ljavafx/scene/input/GestureEvent;", "Ljavafx/scene/input/KeyEvent;", "Ljavafx/scene/input/MouseEvent;", "handle", "", "event", "keyPressed", "keyReleased", "mouseClicked", "mouseDragged", "mouseEntered", "mouseExited", "mouseMoved", "mousePressed", "mouseReleased", "mouseWheelMoved", "Ljavafx/scene/input/ScrollEvent;", "code", "Ljavafx/scene/input/KeyCode;", "scenery"})
public class JavaFXMouseAndKeyHandler extends graphics.scenery.controls.MouseAndKeyHandlerBase implements javafx.event.EventHandler<javafx.event.Event> {
    private java.lang.String os;
    private float scrollSpeedMultiplier;
    
    /**
     * Double-click interval, hardcoded here as needed only for keystrokes 
     */
    private final int DOUBLE_CLICK_INTERVAL = 200;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Hub hub;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.utils.SceneryFXPanel panel;
    
    @java.lang.Override()
    protected int getDOUBLE_CLICK_INTERVAL() {
        return 0;
    }
    
    /**
     * * Handle JavaFX events
     */
    @java.lang.Override()
    public void handle(@org.jetbrains.annotations.NotNull()
    javafx.event.Event event) {
    }
    
    /**
     * * Returns the key mask of a given input event
     *     *
     *     * @param[e] The input event to evaluate.
     */
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    private final int getMask(javafx.scene.input.GestureEvent e) {
        return 0;
    }
    
    private final int getMask(javafx.scene.input.MouseEvent e) {
        return 0;
    }
    
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    private final int getMask(javafx.scene.input.KeyEvent e) {
        return 0;
    }
    
    /**
     * * Called when the mouse is moved, evaluates active drag behaviours, updates state
     *     *
     *     * @param[e] The incoming MouseEvent
     */
    public final void mouseMoved(@org.jetbrains.annotations.NotNull()
    javafx.scene.input.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse enters, updates state
     *     *
     *     * @param[e] The incoming MouseEvent
     */
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    public final void mouseEntered(@org.jetbrains.annotations.NotNull()
    javafx.scene.input.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse is clicked, updates state
     *     *
     *     * @param[e] The incoming MouseEvent
     */
    public final void mouseClicked(@org.jetbrains.annotations.NotNull()
    javafx.scene.input.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse wheel is moved
     *     *
     *     * @param[e] The incoming mouse event
     */
    public final void mouseWheelMoved(@org.jetbrains.annotations.NotNull()
    javafx.scene.input.ScrollEvent e) {
    }
    
    /**
     * * Called when the mouse is release
     *     *
     *     * @param[e] The incoming mouse event
     */
    public final void mouseReleased(@org.jetbrains.annotations.NotNull()
    javafx.scene.input.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse is dragged, evaluates current drag behaviours
     *     *
     *     * @param[e] The incoming mouse event
     */
    public final void mouseDragged(@org.jetbrains.annotations.NotNull()
    javafx.scene.input.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse is exiting, updates state
     *     *
     *     * @param[e] The incoming mouse event
     */
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    public final void mouseExited(@org.jetbrains.annotations.NotNull()
    javafx.scene.input.MouseEvent e) {
    }
    
    /**
     * * Called when the mouse is pressed, updates state and masks, evaluates drags
     *     *
     *     * @param[e] The incoming mouse event
     */
    public final void mousePressed(@org.jetbrains.annotations.NotNull()
    javafx.scene.input.MouseEvent e) {
    }
    
    /**
     * * Called when a key is pressed
     *     *
     *     * @param[e] The incoming keyboard event
     */
    @kotlin.Suppress(names = {"DEPRECATION"})
    public final void keyPressed(@org.jetbrains.annotations.NotNull()
    javafx.scene.input.KeyEvent e) {
    }
    
    /**
     * * Called when a key is released
     *     *
     *     * @param[e] The incoming keyboard event
     */
    @kotlin.Suppress(names = {"DEPRECATION"})
    public final void keyReleased(@org.jetbrains.annotations.NotNull()
    javafx.scene.input.KeyEvent e) {
    }
    
    private final int code(@org.jetbrains.annotations.NotNull()
    javafx.scene.input.KeyCode $receiver) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final graphics.scenery.Hub getHub() {
        return null;
    }
    
    protected final void setHub(@org.jetbrains.annotations.Nullable()
    graphics.scenery.Hub p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.utils.SceneryFXPanel getPanel() {
        return null;
    }
    
    protected final void setPanel(@org.jetbrains.annotations.NotNull()
    graphics.scenery.utils.SceneryFXPanel p0) {
    }
    
    public JavaFXMouseAndKeyHandler(@org.jetbrains.annotations.Nullable()
    graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
    graphics.scenery.utils.SceneryFXPanel panel) {
        super();
    }
}