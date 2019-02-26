package graphics.scenery.utils;

/**
 * * Interface for the Linux version of the Renderdoc library.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lgraphics/scenery/utils/RenderdocLinuxLibrary;", "Lcom/sun/jna/Library;", "RENDERDOC_GetAPI", "", "version", "out", "Lcom/sun/jna/ptr/PointerByReference;", "Companion", "scenery"})
public abstract interface RenderdocLinuxLibrary extends com.sun.jna.Library {
    public static final graphics.scenery.utils.RenderdocLinuxLibrary.Companion Companion = null;

    public abstract int RENDERDOC_GetAPI(int version, @org.jetbrains.annotations.NotNull()
        com.sun.jna.ptr.PointerByReference out);

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lgraphics/scenery/utils/RenderdocLinuxLibrary$Companion;", "", "()V", "instance", "Lgraphics/scenery/utils/RenderdocLinuxLibrary;", "getInstance", "()Lgraphics/scenery/utils/RenderdocLinuxLibrary;", "scenery"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        private static final graphics.scenery.utils.RenderdocLinuxLibrary instance = null;

        private Companion() {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.utils.RenderdocLinuxLibrary getInstance() {
            return null;
        }
    }
}
