package graphics.scenery.effectors;

import java.lang.System;

/**
 * * Slicing volume effector
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lgraphics/scenery/effectors/SlicingVolumeEffector;", "Lgraphics/scenery/effectors/VolumeEffector;", "()V", "proxy", "Lgraphics/scenery/Node;", "getProxy", "()Lgraphics/scenery/Node;", "setProxy", "(Lgraphics/scenery/Node;)V", "scenery"})
public final class SlicingVolumeEffector extends graphics.scenery.effectors.VolumeEffector {
    
    /**
     * Proxy plane for slicing 
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Node proxy;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public graphics.scenery.Node getProxy() {
        return null;
    }
    
    @java.lang.Override()
    public void setProxy(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Node p0) {
    }
    
    public SlicingVolumeEffector() {
        super();
    }
}