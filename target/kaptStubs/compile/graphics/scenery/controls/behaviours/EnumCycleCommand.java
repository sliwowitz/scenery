package graphics.scenery.controls.behaviours;

/**
 * * Enum advance command class. Enables to call a single-parameter method with a successive list of
 * * enum [values] by the press of a button. The value used for calling is incremented with each call
 * * and wrapped upon arriving at the end of the list. The [method] called should provide the user some
 * * feedback about the change made, as this command does not (although a debug message is emitted,
 * * containing the receiver, method, and current value).
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @property[name] The name of the behaviour.
 * * @property[values] The enum properties to use.
 * * @property[receiver] The receiving object.
 * * @property[method] The name of the single-parameter method to invoke.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lgraphics/scenery/controls/behaviours/EnumCycleCommand;", "T", "", "Lorg/scijava/ui/behaviour/ClickBehaviour;", "name", "", "enumClass", "Ljava/lang/Class;", "receiver", "", "method", "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)V", "currentIndex", "", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "click", "", "x", "y", "scenery"})
public final class EnumCycleCommand<T extends java.lang.Enum<?>> implements org.scijava.ui.behaviour.ClickBehaviour {
    private final kotlin.Lazy logger$delegate = null;
    private final java.lang.String name = null;
    private final java.lang.Class<T> enumClass = null;
    private final java.lang.Object receiver = null;
    private final java.lang.String method = null;
    private int currentIndex;

    public EnumCycleCommand(@org.jetbrains.annotations.NotNull()
                                java.lang.String name, @org.jetbrains.annotations.NotNull()
                                java.lang.Class<T> enumClass, @org.jetbrains.annotations.NotNull()
                                java.lang.Object receiver, @org.jetbrains.annotations.NotNull()
                                java.lang.String method) {
        super();
    }

    private final org.slf4j.Logger getLogger() {
        return null;
    }

    /**
     * * This function is called upon arrival of an event that concerns
     * * this behaviour. It will execute the given method on the given object instance.
     * *
     * * @param[x] x position in window (unused)
     * * @param[y] y position in window (unused)
     */
    @java.lang.Override()
    public void click(int x, int y) {
    }
}
