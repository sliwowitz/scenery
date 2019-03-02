package graphics.scenery.controls.behaviours;

import java.lang.System;

/**
 * * Movement Command class. Moves a given camera in the given direction.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @property[name] The name of the behaviour
 * * @property[direction] The direction of movement as string. Can be forward/back/left/right/up/down.
 * * @property[n] The [Node] this behaviour affects.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001 B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006!"}, d2 = {"Lgraphics/scenery/controls/behaviours/MovementCommand;", "Lorg/scijava/ui/behaviour/ClickBehaviour;", "name", "", "direction", "n", "Lkotlin/Function0;", "Lgraphics/scenery/Node;", "speed", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;F)V", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "node", "getNode", "()Lgraphics/scenery/Node;", "node$delegate", "Lgraphics/scenery/controls/behaviours/MovementCommand$NodeDelegate;", "getSpeed", "()F", "setSpeed", "(F)V", "click", "", "x", "", "y", "NodeDelegate", "scenery"})
public class MovementCommand implements org.scijava.ui.behaviour.ClickBehaviour {
    private final graphics.scenery.controls.behaviours.MovementCommand.NodeDelegate node$delegate = null;
    private final kotlin.Lazy logger$delegate = null;
    
    /**
     * Movement speed multiplier 
     */
    private float speed;
    private final java.lang.String name = null;
    private final java.lang.String direction = null;
    private kotlin.jvm.functions.Function0<? extends graphics.scenery.Node> n;
    
    private final graphics.scenery.Node getNode() {
        return null;
    }
    
    private final org.slf4j.Logger getLogger() {
        return null;
    }
    
    public final float getSpeed() {
        return 0.0F;
    }
    
    public final void setSpeed(float p0) {
    }
    
    /**
     * * This function is triggered upon arrival of a click event that concerns
     *     * this behaviour. The camera is then moved in the corresponding direction.
     *     * this behaviour. The camera is then moved in the corresponding direction.
     */
    @java.lang.Override()
    public synchronized void click(int x, int y) {
    }
    
    public MovementCommand(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String direction, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends graphics.scenery.Node> n) {
        super();
    }
    
    /**
     * * Additional constructor to directly adjust movement speed.
     *     *
     *     * @param[name] The name of the behaviour
     *     * @param[direction] The direction of movement as string. Can be forward/back/left/right/up/down.
     *     * @param[n] The [Node] this behaviour affects.
     *     * @param[speed] The speed multiplier for movement.
     */
    public MovementCommand(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String direction, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends graphics.scenery.Node> n, float speed) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086\u0002J)\u0010\b\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0086\u0002\u00a8\u0006\u000b"}, d2 = {"Lgraphics/scenery/controls/behaviours/MovementCommand$NodeDelegate;", "", "(Lgraphics/scenery/controls/behaviours/MovementCommand;)V", "getValue", "Lgraphics/scenery/Node;", "thisRef", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "scenery"})
    public final class NodeDelegate {
        
        /**
         * Returns the [graphics.scenery.Node] resulting from the evaluation of [n] 
         */
        @org.jetbrains.annotations.Nullable()
        public final graphics.scenery.Node getValue(@org.jetbrains.annotations.Nullable()
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
        graphics.scenery.Node value) {
        }
        
        public NodeDelegate() {
            super();
        }
    }
}