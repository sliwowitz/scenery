package graphics.scenery.effectors;

/**
 * * Volume effector class
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0001X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lgraphics/scenery/effectors/VolumeEffector;", "Lgraphics/scenery/Node;", "()V", "<set-?>", "", "active", "getActive", "()Z", "setActive", "(Z)V", "activeVolume", "getActiveVolume", "()Lgraphics/scenery/Node;", "setActiveVolume", "(Lgraphics/scenery/Node;)V", "proxy", "getProxy", "setProxy", "scenery"})
public class VolumeEffector extends graphics.scenery.Node {

    /**
     * Whether this effector node is currently active
     */
    private boolean active;

    /**
     * The volume this effector is associated with
     */
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Node activeVolume;

    /**
     * Proxy node to display e.g. auxiliary geometry.
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Node proxy;

    public VolumeEffector() {
        super(null);
    }

    public final boolean getActive() {
        return false;
    }

    private final void setActive(boolean p0) {
    }

    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.Node getActiveVolume() {
        return null;
    }

    private final void setActiveVolume(graphics.scenery.Node p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public graphics.scenery.Node getProxy() {
        return null;
    }

    public void setProxy(@org.jetbrains.annotations.NotNull()
                             graphics.scenery.Node p0) {
    }
}
