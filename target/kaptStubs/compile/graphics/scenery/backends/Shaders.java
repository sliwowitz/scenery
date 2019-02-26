package graphics.scenery.backends;

/**
 * * Shaders handling class.
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J9\u0010\u000f\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0004\u00a2\u0006\u0002\u0010\u0016J\f\u0010\u0017\u001a\u00020\u0018*\u00020\u0019H\u0004J\f\u0010\u001a\u001a\u00020\u001b*\u00020\u0019H\u0004R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002 !\u00a8\u0006\""}, d2 = {"Lgraphics/scenery/backends/Shaders;", "", "()V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "get", "Lgraphics/scenery/backends/ShaderPackage;", "target", "Lgraphics/scenery/backends/Shaders$ShaderTarget;", "type", "Lgraphics/scenery/backends/ShaderType;", "safeFindBaseClass", "Lkotlin/Pair;", "Ljava/lang/Class;", "", "classes", "", "path", "([Ljava/lang/Class;Ljava/lang/String;)Lkotlin/Pair;", "toByteArray", "", "Lgraphics/scenery/spirvcrossj/IntVec;", "toByteBuffer", "Ljava/nio/ByteBuffer;", "ShaderFactory", "ShaderTarget", "ShadersFromClassName", "ShadersFromFiles", "Lgraphics/scenery/backends/Shaders$ShaderFactory;", "Lgraphics/scenery/backends/Shaders$ShadersFromFiles;", "scenery"})
public abstract class Shaders {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;

    private Shaders() {
        super();
    }

    @org.jetbrains.annotations.NotNull()
    public final org.slf4j.Logger getLogger() {
        return null;
    }

    /**
     * * Abstract functions all shader providers will have to implement, for returning
     * * a [ShaderPackage] containing both source code and SPIRV, targeting [target],
     * * and being of [ShaderType] [type].
     */
    @org.jetbrains.annotations.NotNull()
    public abstract graphics.scenery.backends.ShaderPackage get(@org.jetbrains.annotations.NotNull()
                                                                    graphics.scenery.backends.Shaders.ShaderTarget target, @org.jetbrains.annotations.NotNull()
                                                                    graphics.scenery.backends.ShaderType type);

    /**
     * * Finds the base class for a resource given by [path], and falls back to
     * * [Renderer] in case it is not found before. Returns null if the file cannot
     * * be located. The function also falls back to looking into a subdirectory "shaders/",
     * * if the files cannot be located within the normal neighborhood of the resources in [classes].
     */
    @org.jetbrains.annotations.Nullable()
    protected final kotlin.Pair<java.lang.Class<?>, java.lang.String> safeFindBaseClass(@org.jetbrains.annotations.NotNull()
                                                                                            java.lang.Class<?>[] classes, @org.jetbrains.annotations.NotNull()
                                                                                            java.lang.String path) {
        return null;
    }

    /**
     * * Converts an glslang-compatible IntVec to a [ByteBuffer].
     */
    @org.jetbrains.annotations.NotNull()
    protected final java.nio.ByteBuffer toByteBuffer(@org.jetbrains.annotations.NotNull()
                                                         graphics.scenery.spirvcrossj.IntVec $receiver) {
        return null;
    }

    /**
     * * Converts an glslang-compatible IntVec to a [ByteArray].
     */
    @org.jetbrains.annotations.NotNull()
    protected final byte[] toByteArray(@org.jetbrains.annotations.NotNull()
                                           graphics.scenery.spirvcrossj.IntVec $receiver) {
        return null;
    }

    /**
     * * Enum to indicate whether a shader will target Vulkan or OpenGL.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lgraphics/scenery/backends/Shaders$ShaderTarget;", "", "(Ljava/lang/String;I)V", "Vulkan", "OpenGL", "scenery"})
    public static enum ShaderTarget {
        /*public static final*/ Vulkan /* = new Vulkan() */,
        /*public static final*/ OpenGL /* = new OpenGL() */;

        ShaderTarget() {
        }
    }

    /**
     * * Abstract base class for custom shader factories.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lgraphics/scenery/backends/Shaders$ShaderFactory;", "Lgraphics/scenery/backends/Shaders;", "()V", "construct", "Lgraphics/scenery/backends/ShaderPackage;", "target", "Lgraphics/scenery/backends/Shaders$ShaderTarget;", "type", "Lgraphics/scenery/backends/ShaderType;", "get", "scenery"})
    public static abstract class ShaderFactory extends graphics.scenery.backends.Shaders {

        public ShaderFactory() {
            super();
        }

        /**
         * * Invoked by [get] to actually construct a [ShaderPackage].
         */
        @org.jetbrains.annotations.NotNull()
        public abstract graphics.scenery.backends.ShaderPackage construct(@org.jetbrains.annotations.NotNull()
                                                                              graphics.scenery.backends.Shaders.ShaderTarget target, @org.jetbrains.annotations.NotNull()
                                                                              graphics.scenery.backends.ShaderType type);

        /**
         * * Returns a [ShaderPackage] targeting [target] (OpenGL or Vulkan), containing
         * * a shader of [type].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public graphics.scenery.backends.ShaderPackage get(@org.jetbrains.annotations.NotNull()
                                                               graphics.scenery.backends.Shaders.ShaderTarget target, @org.jetbrains.annotations.NotNull()
                                                               graphics.scenery.backends.ShaderType type) {
            return null;
        }
    }

    /**
     * * Base class for producing a shader provider that is backed by files given in
     * * [shaders], which are assumed to be relative to a class [clazz].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\b\u0002\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0015\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lgraphics/scenery/backends/Shaders$ShadersFromFiles;", "Lgraphics/scenery/backends/Shaders;", "shaders", "", "", "clazz", "Ljava/lang/Class;", "([Ljava/lang/String;Ljava/lang/Class;)V", "getClazz", "()Ljava/lang/Class;", "getShaders", "()[Ljava/lang/String;", "[Ljava/lang/String;", "get", "Lgraphics/scenery/backends/ShaderPackage;", "target", "Lgraphics/scenery/backends/Shaders$ShaderTarget;", "type", "Lgraphics/scenery/backends/ShaderType;", "Companion", "scenery"})
    public static class ShadersFromFiles extends graphics.scenery.backends.Shaders {
        public static final graphics.scenery.backends.Shaders.ShadersFromFiles.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.util.concurrent.ConcurrentHashMap<kotlin.Pair<java.lang.String, java.lang.String>, graphics.scenery.backends.ShaderPackage> cache = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String[] shaders = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Class<?> clazz = null;

        public ShadersFromFiles(@org.jetbrains.annotations.NotNull()
                                    java.lang.String[] shaders, @org.jetbrains.annotations.NotNull()
                                    java.lang.Class<?> clazz) {
            super();
        }

        /**
         * * Returns a [ShaderPackage] targeting [target] (OpenGL or Vulkan), containing
         * * a shader of [type].
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public graphics.scenery.backends.ShaderPackage get(@org.jetbrains.annotations.NotNull()
                                                               graphics.scenery.backends.Shaders.ShaderTarget target, @org.jetbrains.annotations.NotNull()
                                                               graphics.scenery.backends.ShaderType type) {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getShaders() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.Class<?> getClazz() {
            return null;
        }

        /**
         * * Companion object providing a cache for preventing repeated compilations.
         */
        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R,\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lgraphics/scenery/backends/Shaders$ShadersFromFiles$Companion;", "", "()V", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "", "Lgraphics/scenery/backends/ShaderPackage;", "getCache", "()Ljava/util/concurrent/ConcurrentHashMap;", "scenery"})
        public static final class Companion {

            private Companion() {
                super();
            }

            @org.jetbrains.annotations.NotNull()
            protected final java.util.concurrent.ConcurrentHashMap<kotlin.Pair<java.lang.String, java.lang.String>, graphics.scenery.backends.ShaderPackage> getCache() {
                return null;
            }
        }
    }

    /**
     * * Shader provider for deriving a [ShadersFromFiles] provider just by using
     * * the simpleName of [clazz].
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\b\u0007\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lgraphics/scenery/backends/Shaders$ShadersFromClassName;", "Lgraphics/scenery/backends/Shaders$ShadersFromFiles;", "clazz", "Ljava/lang/Class;", "shaderTypes", "", "Lgraphics/scenery/backends/ShaderType;", "(Ljava/lang/Class;Ljava/util/List;)V", "scenery"})
    public static final class ShadersFromClassName extends graphics.scenery.backends.Shaders.ShadersFromFiles {

        public ShadersFromClassName(@org.jetbrains.annotations.NotNull()
                                        java.lang.Class<?> clazz, @org.jetbrains.annotations.NotNull()
                                        java.util.List<? extends graphics.scenery.backends.ShaderType> shaderTypes) {
            super(null, null);
        }

        public ShadersFromClassName(@org.jetbrains.annotations.NotNull()
                                        java.lang.Class<?> clazz) {
            super(null, null);
        }
    }
}
