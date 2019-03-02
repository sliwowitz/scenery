package graphics.scenery;

import java.lang.System;

/**
 * * Simple interface for classes that may become part of a [Hub]
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lgraphics/scenery/Hubable;", "", "hub", "Lgraphics/scenery/Hub;", "getHub", "()Lgraphics/scenery/Hub;", "setHub", "(Lgraphics/scenery/Hub;)V", "scenery"})
public abstract interface Hubable {
    
    /**
     * The Hub this instance belongs to 
     */
    @org.jetbrains.annotations.Nullable()
    public abstract graphics.scenery.Hub getHub();
    
    /**
     * The Hub this instance belongs to 
     */
    public abstract void setHub(@org.jetbrains.annotations.Nullable()
    graphics.scenery.Hub p0);
}