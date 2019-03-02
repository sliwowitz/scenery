package graphics.scenery.utils;

import java.lang.System;

/**
 * * Sticky boolean class, remains true if set to true once.
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0086\u0002J\'\u0010\u0011\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0013\u001a\u00020\u0003H\u0086\u0002R+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00038B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004\u00a8\u0006\u0014"}, d2 = {"Lgraphics/scenery/utils/StickyBoolean;", "", "initial", "", "(Z)V", "<set-?>", "updated", "getUpdated", "()Z", "setUpdated", "updated$delegate", "Lkotlin/properties/ReadWriteProperty;", "getValue", "nothing", "", "property", "Lkotlin/reflect/KProperty;", "setValue", "", "b", "scenery"})
public final class StickyBoolean {
    private final kotlin.properties.ReadWriteProperty updated$delegate = null;
    
    private final boolean getUpdated() {
        return false;
    }
    
    private final void setUpdated(boolean p0) {
    }
    
    /**
     * Returns the sticky boolean's value 
     */
    public final boolean getValue(@org.jetbrains.annotations.Nullable()
    java.lang.Void nothing, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property) {
        return false;
    }
    
    /**
     * Potentially sets booleans value to [b], if not vetoed. 
     */
    public final void setValue(@org.jetbrains.annotations.Nullable()
    java.lang.Void nothing, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property, boolean b) {
    }
    
    public StickyBoolean(boolean initial) {
        super();
    }
}