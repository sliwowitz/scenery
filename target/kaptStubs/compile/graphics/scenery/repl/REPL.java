package graphics.scenery.repl;

/**
 * * Constructs a read-eval-print loop (REPL) to interactive manipulate scenery's
 * * scene rendering.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @property[addAccessibleObject] A list of objects that should be accessible right away in the REPL
 * * @constructor Returns a REPL, equipped with a window for input/output.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\"\u00020\u0001\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0001J\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0013J\u0006\u0010&\u001a\u00020\"J\u001a\u0010\u0016\u001a\u00020\"2\u0006\u0010\'\u001a\u00020\u00132\n\u0010(\u001a\u0006\u0012\u0002\b\u00030\u0019J\u0006\u0010)\u001a\u00020\"J\u0006\u0010*\u001a\u00020\"R\u001a\u0010\u0007\u001a\u00020\u0003X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0019X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0013X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017\u00a8\u0006+"}, d2 = {"Lgraphics/scenery/repl/REPL;", "", "scijavaContext", "Lorg/scijava/Context;", "accessibleObjects", "", "(Lorg/scijava/Context;[Ljava/lang/Object;)V", "context", "getContext", "()Lorg/scijava/Context;", "setContext", "(Lorg/scijava/Context;)V", "interpreterWindow", "Lorg/scijava/ui/swing/script/InterpreterWindow;", "getInterpreterWindow", "()Lorg/scijava/ui/swing/script/InterpreterWindow;", "setInterpreterWindow", "(Lorg/scijava/ui/swing/script/InterpreterWindow;)V", "startupScript", "", "getStartupScript", "()Ljava/lang/String;", "setStartupScript", "(Ljava/lang/String;)V", "startupScriptClass", "Ljava/lang/Class;", "getStartupScriptClass", "()Ljava/lang/Class;", "setStartupScriptClass", "(Ljava/lang/Class;)V", "startupScriptCode", "getStartupScriptCode", "setStartupScriptCode", "addAccessibleObject", "", "obj", "eval", "code", "hideConsoleWindow", "scriptFileName", "baseClass", "showConsoleWindow", "start", "scenery"})
public final class REPL {

    /**
     * SciJava context for the REPL
     */
    @org.jetbrains.annotations.NotNull()
    private org.scijava.Context context;

    /**
     * SciJava interpreter window, handles input and output.
     */
    @org.jetbrains.annotations.NotNull()
    private org.scijava.ui.swing.script.InterpreterWindow interpreterWindow;

    /**
     * Code to evaluate upon launch.
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String startupScriptCode;

    /**
     * A startup script to evaluate upon launch.
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String startupScript;

    /**
     * The [startupScript] will be searched for in the resources of this class.
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.Class<?> startupScriptClass;

    public REPL(@org.jetbrains.annotations.Nullable()
                    org.scijava.Context scijavaContext, @org.jetbrains.annotations.NotNull()
                    java.lang.Object... accessibleObjects) {
        super();
    }

    public REPL(@org.jetbrains.annotations.NotNull()
                    java.lang.Object... accessibleObjects) {
        super();
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.scijava.Context getContext() {
        return null;
    }

    protected final void setContext(@org.jetbrains.annotations.NotNull()
                                        org.scijava.Context p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.scijava.ui.swing.script.InterpreterWindow getInterpreterWindow() {
        return null;
    }

    protected final void setInterpreterWindow(@org.jetbrains.annotations.NotNull()
                                                  org.scijava.ui.swing.script.InterpreterWindow p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getStartupScriptCode() {
        return null;
    }

    protected final void setStartupScriptCode(@org.jetbrains.annotations.NotNull()
                                                  java.lang.String p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getStartupScript() {
        return null;
    }

    protected final void setStartupScript(@org.jetbrains.annotations.NotNull()
                                              java.lang.String p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.lang.Class<?> getStartupScriptClass() {
        return null;
    }

    protected final void setStartupScriptClass(@org.jetbrains.annotations.NotNull()
                                                   java.lang.Class<?> p0) {
    }

    /**
     * * Sets a startup script and its class to find it in its resources.
     * *
     * * @param[scriptFileName] The file name of the script
     * * @param[baseClass] The class whose resources to search for the script
     */
    public final void setStartupScript(@org.jetbrains.annotations.NotNull()
                                           java.lang.String scriptFileName, @org.jetbrains.annotations.NotNull()
                                           java.lang.Class<?> baseClass) {
    }

    /**
     * * Adds an object to the REPL's accessible objects
     * *
     * * @param[obj] The object to add.
     */
    public final void addAccessibleObject(@org.jetbrains.annotations.NotNull()
                                              java.lang.Object obj) {
    }

    /**
     * * Shows the interpreter window
     */
    public final void showConsoleWindow() {
    }

    /**
     * * Hides the interpreter window
     */
    public final void hideConsoleWindow() {
    }

    /**
     * * Launches the REPL and evaluates any set startup code.
     */
    public final void start() {
    }

    /**
     * * Evaluate a string in the REPL
     * *
     * * @param[code] The code to evaluate.
     */
    public final void eval(@org.jetbrains.annotations.NotNull()
                               java.lang.String code) {
    }
}
