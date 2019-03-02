package graphics.scenery.controls.behaviours;

import java.lang.System;

/**
 * * Toggle command class. Enables to call a parameter-free method of an instance
 * * by the press of a button.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @property[name] The name of the behaviour.
 * * @property[receiver] The receiving object
 * * @property[method] The name of the method to invoke
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lgraphics/scenery/controls/behaviours/ToggleCommand;", "Lorg/scijava/ui/behaviour/ClickBehaviour;", "name", "", "receiver", "", "method", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "click", "", "x", "", "y", "scenery"})
public final class ToggleCommand implements org.scijava.ui.behaviour.ClickBehaviour {
    private final kotlin.Lazy logger$delegate = null;
    private final java.lang.String name = null;
    private final java.lang.Object receiver = null;
    private final java.lang.String method = null;
    
    private final org.slf4j.Logger getLogger() {
        return null;
    }
    
    /**
     * * This function is called upon arrival of an event that concerns
     *     * this behaviour. It will execute the given method on the given object instance.
     *     *
     *     * @param[x] x position in window (unused)
     *     * @param[y] y position in window (unused)
     */
    @java.lang.Override()
    public void click(int x, int y) {
    }
    
    public ToggleCommand(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.Object receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String method) {
        super();
    }
}