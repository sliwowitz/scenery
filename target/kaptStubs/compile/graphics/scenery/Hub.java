package graphics.scenery;

import java.lang.System;

/**
 * * The Hub class interconnects the different components a scenery application may
 * * have, such as a renderer or compute context (see also [SceneryElement].
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\f\u001a\u0002H\r\"\b\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u0002H\r\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0007J\u001f\u0010\u0016\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u0007R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lgraphics/scenery/Hub;", "", "name", "", "(Ljava/lang/String;)V", "elements", "Ljava/util/concurrent/ConcurrentHashMap;", "Lgraphics/scenery/SceneryElement;", "getElements", "()Ljava/util/concurrent/ConcurrentHashMap;", "getName", "()Ljava/lang/String;", "add", "T", "Lgraphics/scenery/Hubable;", "type", "obj", "(Lgraphics/scenery/SceneryElement;Lgraphics/scenery/Hubable;)Lgraphics/scenery/Hubable;", "addApplication", "Lgraphics/scenery/SceneryBase;", "application", "elementsAsString", "get", "(Lgraphics/scenery/SceneryElement;)Lgraphics/scenery/Hubable;", "getApplication", "getWorkingHMD", "Lgraphics/scenery/controls/TrackerInput;", "getWorkingHMDDisplay", "Lgraphics/scenery/backends/Display;", "has", "", "scenery"})
public final class Hub {
    
    /**
     * Hash map storage for all the [SceneryElement] and their instances 
     */
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ConcurrentHashMap<graphics.scenery.SceneryElement, java.lang.Object> elements = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<graphics.scenery.SceneryElement, java.lang.Object> getElements() {
        return null;
    }
    
    /**
     * * Adds a given [SceneryElement] to the Hub.
     *     *
     *     * @param[type] The type of [SceneryElement] to add.
     *     * @param[obj] The [Hubable] object.
     */
    @org.jetbrains.annotations.NotNull()
    public final <T extends graphics.scenery.Hubable>T add(@org.jetbrains.annotations.NotNull()
    graphics.scenery.SceneryElement type, @org.jetbrains.annotations.NotNull()
    T obj) {
        return null;
    }
    
    /**
     * * Adds a given [SceneryBase] instance to this Hub.
     *     *
     *     * @param[application] The [SceneryBase] instance to add to this Hub.
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.SceneryBase addApplication(@org.jetbrains.annotations.NotNull()
    graphics.scenery.SceneryBase application) {
        return null;
    }
    
    /**
     * * Returns a the basic application [SceneryBase] instance if contained in this Hub.
     *     *
     *     * @return [SceneryBase] instance, or null if not found.
     */
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.SceneryBase getApplication() {
        return null;
    }
    
    /**
     * * Query the Hub for a given type of [SceneryElement]
     *     *
     *     * @param[type] [SceneryElement] type.
     *     * @return The instance of [SceneryElement] currently registered.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object get(@org.jetbrains.annotations.NotNull()
    graphics.scenery.SceneryElement type) {
        return null;
    }
    
    /**
     * * Query the Hub for a given type of [SceneryElement]
     *     *
     *     * @param[type] [SceneryElement] type.
     *     * @return The instance of [SceneryElement] currently registered.
     */
    @org.jetbrains.annotations.Nullable()
    public final <T extends graphics.scenery.Hubable>T get(@org.jetbrains.annotations.NotNull()
    graphics.scenery.SceneryElement type) {
        return null;
    }
    
    /**
     * * Check whether the Hub has this type of [SceneryElement] registered
     *     *
     *     * @param[type] [SceneryElement] type to query for.
     *     * @return True if [type] is registered, else false.
     */
    public final boolean has(@org.jetbrains.annotations.NotNull()
    graphics.scenery.SceneryElement type) {
        return false;
    }
    
    /**
     * * Returns a [TrackerInput] instance in case this Hub contains a [TrackerInput], which is working.
     *     *
     *     * @return A [TrackerInput] instance, or null if not found or not working.
     */
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.controls.TrackerInput getWorkingHMD() {
        return null;
    }
    
    /**
     * * Returns a [Display] in case this Hub contains an [SceneryElement.HMDInput] that can also
     *     * act as [Display] and is working.
     *     *
     *     * @return [Display] instance if found in the Hub, otherwise null.
     */
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.backends.Display getWorkingHMDDisplay() {
        return null;
    }
    
    /**
     * * Returns a string representation of the contents of this Hub.
     *     *
     *     * @return String representation of all the elements of the Hub, one per line.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"unused"})
    public final java.lang.String elementsAsString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public Hub(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super();
    }
    
    public Hub() {
        super();
    }
}