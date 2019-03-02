package graphics.scenery.utils;

import java.lang.System;

/**
 * * Minimal Renderdoc integration. At the moment, only loads the Renderdoc library into
 * * the processes' address space. Has to be run before any renderers are initialiased.
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lgraphics/scenery/utils/Renderdoc;", "Ljava/lang/AutoCloseable;", "()V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "close", "", "Companion", "scenery"})
public final class Renderdoc implements java.lang.AutoCloseable {
    private final kotlin.Lazy logger$delegate = null;
    
    /**
     * Check whether Renderdoc is attached to this scenery instance. 
     */
    private static boolean renderdocAttached;
    public static final graphics.scenery.utils.Renderdoc.Companion Companion = null;
    
    private final org.slf4j.Logger getLogger() {
        return null;
    }
    
    /**
     * Closes this Renderdoc interface. 
     */
    @java.lang.Override()
    public void close() {
    }
    
    public Renderdoc() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lgraphics/scenery/utils/Renderdoc$Companion;", "", "()V", "renderdocAttached", "", "getRenderdocAttached", "()Z", "setRenderdocAttached", "(Z)V", "scenery"})
    public static final class Companion {
        
        public final boolean getRenderdocAttached() {
            return false;
        }
        
        public final void setRenderdocAttached(boolean p0) {
        }
        
        private Companion() {
            super();
        }
    }
}