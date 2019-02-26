package graphics.scenery.utils;

/**
 * * Created by ulrik on 2/1/2017.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lgraphics/scenery/utils/NVAPI;", "Lcom/sun/jna/win32/StdCallLibrary;", "nvapi_QueryInterface", "", "pointer", "Companion", "scenery"})
public abstract interface NVAPI extends com.sun.jna.win32.StdCallLibrary {
    public static final graphics.scenery.utils.NVAPI.Companion Companion = null;

    public abstract long nvapi_QueryInterface(long pointer);

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lgraphics/scenery/utils/NVAPI$Companion;", "", "()V", "instance", "Lgraphics/scenery/utils/NVAPI;", "getInstance", "()Lgraphics/scenery/utils/NVAPI;", "scenery"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        private static final graphics.scenery.utils.NVAPI instance = null;

        private Companion() {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.utils.NVAPI getInstance() {
            return null;
        }
    }
}
