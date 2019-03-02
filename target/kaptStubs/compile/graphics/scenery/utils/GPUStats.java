package graphics.scenery.utils;

import java.lang.System;

/**
 * * Interface for collection of GPU statistics.
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0004H&R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lgraphics/scenery/utils/GPUStats;", "", "utilisations", "Ljava/util/HashMap;", "", "", "getUtilisations", "()Ljava/util/HashMap;", "get", "name", "memoryUtilisationToString", "update", "", "gpuIndex", "", "utilisationToString", "scenery"})
public abstract interface GPUStats {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.HashMap<java.lang.String, java.lang.Float> getUtilisations();
    
    /**
     * * Updates the state of the GPU statistics for a GPU with index [gpuIndex].
     */
    public abstract void update(int gpuIndex);
    
    /**
     * * Returns a specific statistic with [name].
     */
    public abstract float get(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    /**
     * * Returns the total GPU utilisation as String.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String utilisationToString();
    
    /**
     * * Returns the total GPU memory utilisation as String.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String memoryUtilisationToString();
}