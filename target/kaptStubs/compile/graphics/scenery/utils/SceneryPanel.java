package graphics.scenery.utils;

import java.lang.System;

/**
 * * Interface for embeddable windows scenery can render to.
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000fH&J\u001a\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u000fH&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0017\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013\u00a8\u0006\""}, d2 = {"Lgraphics/scenery/utils/SceneryPanel;", "", "displayedFrames", "", "getDisplayedFrames", "()J", "setDisplayedFrames", "(J)V", "imageScaleY", "", "getImageScaleY", "()F", "setImageScaleY", "(F)V", "panelHeight", "", "getPanelHeight", "()I", "setPanelHeight", "(I)V", "panelWidth", "getPanelWidth", "setPanelWidth", "refreshRate", "getRefreshRate", "setRefreshRate", "setPreferredDimensions", "", "w", "h", "update", "buffer", "Ljava/nio/ByteBuffer;", "id", "scenery"})
public abstract interface SceneryPanel {
    
    /**
     * Number of frames displayed so far. 
     */
    public abstract long getDisplayedFrames();
    
    /**
     * Number of frames displayed so far. 
     */
    public abstract void setDisplayedFrames(long p0);
    
    /**
     * Image scaling in Y, can be used to flip the image. 
     */
    public abstract float getImageScaleY();
    
    /**
     * Image scaling in Y, can be used to flip the image. 
     */
    public abstract void setImageScaleY(float p0);
    
    /**
     * Current width of the panel. 
     */
    public abstract int getPanelWidth();
    
    /**
     * Current width of the panel. 
     */
    public abstract void setPanelWidth(int p0);
    
    /**
     * Current height of the panel. 
     */
    public abstract int getPanelHeight();
    
    /**
     * Current height of the panel. 
     */
    public abstract void setPanelHeight(int p0);
    
    /**
     * Refresh rate. 
     */
    public abstract int getRefreshRate();
    
    /**
     * Refresh rate. 
     */
    public abstract void setRefreshRate(int p0);
    
    /**
     * Updates the backing byte buffer of the image. 
     */
    public abstract void update(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer buffer, int id);
    
    /**
     * Sets the preferred dimensions of the panel. 
     */
    public abstract void setPreferredDimensions(int w, int h);
    
    /**
     * * Interface for embeddable windows scenery can render to.
     * *
     * * @author Ulrik Guenther <hello@ulrik.is>
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}