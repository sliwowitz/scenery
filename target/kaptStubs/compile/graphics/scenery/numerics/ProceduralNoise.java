package graphics.scenery.numerics;

import java.lang.System;

/**
 * * Interface for classes producing some kind of procedural noise,
 * * continuous or not.
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H&J \u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H&J(\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H&\u00a8\u0006\f"}, d2 = {"Lgraphics/scenery/numerics/ProceduralNoise;", "", "random1D", "", "x", "", "random2D", "y", "random3D", "z", "random4D", "w", "scenery"})
public abstract interface ProceduralNoise {
    
    /**
     * Generate 1D noise with the origin [x] 
     */
    public abstract float random1D(float x);
    
    /**
     * Generate 2D noise with the origin [x],[y] 
     */
    public abstract float random2D(float x, float y);
    
    /**
     * Generate 3D noise with the origin [x],[y],[z] 
     */
    public abstract float random3D(float x, float y, float z);
    
    /**
     * Generate 4D noise with the origin [x],[y],[z],[w] 
     */
    public abstract float random4D(float x, float y, float z, float w);
    
    /**
     * Generate 1D noise with the origin [x] 
     */
    public abstract double random1D(double x);
    
    /**
     * Generate 2D noise with the origin [x],[y] 
     */
    public abstract double random2D(double x, double y);
    
    /**
     * Generate 3D noise with the origin [x],[y],[z] 
     */
    public abstract double random3D(double x, double y, double z);
    
    /**
     * Generate 4D noise with the origin [x],[y],[z],[w] 
     */
    public abstract double random4D(double x, double y, double z, double w);
}