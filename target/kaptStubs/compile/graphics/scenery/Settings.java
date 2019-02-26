package graphics.scenery;

/**
 * * Flexible settings store for scenery. Stores a hash map of <String, Any>,
 * * which one can query for a specific setting and type then.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0012\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017J\u0019\u0010\u0018\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0015J\u0006\u0010\u0019\u001a\u00020\u0010J\u0016\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0011J\u0016\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lgraphics/scenery/Settings;", "Lgraphics/scenery/Hubable;", "hub", "Lgraphics/scenery/Hub;", "(Lgraphics/scenery/Hub;)V", "getHub", "()Lgraphics/scenery/Hub;", "setHub", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "settingsStore", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "get", "T", "name", "(Ljava/lang/String;)Ljava/lang/Object;", "getAllSettings", "", "getProperty", "list", "set", "contents", "setIfUnset", "scenery"})
public final class Settings implements graphics.scenery.Hubable {
    private final kotlin.Lazy logger$delegate = null;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> settingsStore;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Hub hub;

    public Settings(@org.jetbrains.annotations.Nullable()
                        graphics.scenery.Hub hub) {
        super();
    }

    public Settings() {
        super();
    }

    private final org.slf4j.Logger getLogger() {
        return null;
    }

    /**
     * * Query the settings store for a setting [name] and type T
     * *
     * * @param[name] The name of the setting
     * * @return The setting as type T
     */
    public final <T extends java.lang.Object> T get(@org.jetbrains.annotations.NotNull()
                                                        java.lang.String name) {
        return null;
    }

    /**
     * * Compatibility function for Java, see [get]. Returns the settings value for [name], if found.
     */
    public final <T extends java.lang.Object> T getProperty(@org.jetbrains.annotations.NotNull()
                                                                java.lang.String name) {
        return null;
    }

    /**
     * * Add or a setting in the store only if it does not exist yet.
     * * Will only allow replacement if types of existing and new setting match.
     * *
     * * @param[name] Name of the setting.
     * * @param[contents] Contents of the setting, can be anything.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object setIfUnset(@org.jetbrains.annotations.NotNull()
                                                 java.lang.String name, @org.jetbrains.annotations.NotNull()
                                                 java.lang.Object contents) {
        return null;
    }

    /**
     * * Add or replace a setting in the store. Will only allow replacement
     * * if types of existing and new setting match.
     * *
     * * @param[name] Name of the setting.
     * * @param[contents] Contents of the setting, can be anything.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object set(@org.jetbrains.annotations.NotNull()
                                          java.lang.String name, @org.jetbrains.annotations.NotNull()
                                          java.lang.Object contents) {
        return null;
    }

    /**
     * * Lists all settings currently stored as String.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String list() {
        return null;
    }

    /**
     * * Return the names of all settings as a [List] of Strings.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAllSettings() {
        return null;
    }

    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public graphics.scenery.Hub getHub() {
        return null;
    }

    @java.lang.Override()
    public void setHub(@org.jetbrains.annotations.Nullable()
                           graphics.scenery.Hub p0) {
    }
}
