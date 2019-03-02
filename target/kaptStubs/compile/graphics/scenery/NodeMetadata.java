package graphics.scenery;

import java.lang.System;

/**
 * * The NodeMetadata is a generic interface for metadata stored for a Node.
 * * The interface only defines a list of [consumers], and is extended e.g. by
 * * [OpenGLObjectState].
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lgraphics/scenery/NodeMetadata;", "", "consumers", "", "", "getConsumers", "()Ljava/util/List;", "scenery"})
public abstract interface NodeMetadata {
    
    /**
     * List of the names of consumers of this metadata. 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getConsumers();
}