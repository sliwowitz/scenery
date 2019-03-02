package graphics.scenery.backends;

import java.lang.System;

/**
 * * UBO base class, providing API-independent uniform buffer serialisation
 * * functionality for both OpenGL and Vulkan.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 E2\u00020\u0001:\u0001EB\u0005\u00a2\u0006\u0002\u0010\u0002J-\u0010+\u001a\u00020,2\u0006\u0010\"\u001a\u00020\u00162\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010/J\u0016\u00100\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d2\u0006\u0010\"\u001a\u00020\u0016J\u0010\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u000203H\u0004J\u0006\u00104\u001a\u00020\u0004J\u001a\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004062\u0006\u00107\u001a\u00020\u0001J\u0006\u00108\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\u0016J\u0006\u00109\u001a\u00020\u0016J\r\u0010:\u001a\u00020\u0016H\u0000\u00a2\u0006\u0002\b;JN\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u0002032\b\b\u0002\u0010.\u001a\u00020>24\b\u0002\u0010?\u001a.\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001d\u0018\u00010\u001cj\u0016\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001d\u0018\u0001`@J\u0010\u0010A\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0001H\u0004J\u0010\u0010B\u001a\u00020,2\u0006\u00102\u001a\u000203H\u0004J\f\u0010C\u001a\u00020\u0004*\u00020\u0001H\u0004J\f\u0010D\u001a\u00020\u0004*\u00020\tH\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00040\u0015X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR,\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001d0\u001cX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\'\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010*\u00a8\u0006F"}, d2 = {"Lgraphics/scenery/backends/UBO;", "", "()V", "<set-?>", "", "hash", "getHash", "()I", "initialized", "", "getInitialized", "()Z", "setInitialized", "(Z)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "memberOffsets", "Ljava/util/HashMap;", "", "getMemberOffsets", "()Ljava/util/HashMap;", "setMemberOffsets", "(Ljava/util/HashMap;)V", "members", "Ljava/util/LinkedHashMap;", "Lkotlin/Function0;", "getMembers", "()Ljava/util/LinkedHashMap;", "setMembers", "(Ljava/util/LinkedHashMap;)V", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "sizeCached", "getSizeCached", "setSizeCached", "(I)V", "add", "", "value", "offset", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;)V", "get", "getMembersHash", "buffer", "Ljava/nio/ByteBuffer;", "getSize", "getSizeAndAlignment", "Lkotlin/Pair;", "element", "memberCount", "membersAndContent", "perMemberHashes", "perMemberHashes$scenery", "populate", "data", "", "elements", "Lkotlin/collections/LinkedHashMap;", "sizeOf", "updateHash", "objectId", "toInt", "Companion", "scenery"})
public class UBO {
    
    /**
     * Name of this UBO 
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, kotlin.jvm.functions.Function0<java.lang.Object>> members;
    @org.jetbrains.annotations.NotNull()
    private java.util.HashMap<java.lang.String, java.lang.Integer> memberOffsets;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;
    
    /**
     * Hash value of all the members, gets updated by [populate()] 
     */
    private int hash;
    
    /**
     * Optional flag to indicate finished initialisation 
     */
    private boolean initialized;
    
    /**
     * Cached size of the UBO, -1 if the UBO has not been populated yet. 
     */
    private int sizeCached;
    
    /**
     * Cache for alignment data inside buffers 
     */
    @org.jetbrains.annotations.NotNull()
    private static gnu.trove.map.hash.TIntObjectHashMap<kotlin.Pair<java.lang.Integer, java.lang.Integer>> alignments;
    public static final graphics.scenery.backends.UBO.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.LinkedHashMap<java.lang.String, kotlin.jvm.functions.Function0<java.lang.Object>> getMembers() {
        return null;
    }
    
    protected final void setMembers(@org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.String, kotlin.jvm.functions.Function0<java.lang.Object>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.HashMap<java.lang.String, java.lang.Integer> getMemberOffsets() {
        return null;
    }
    
    protected final void setMemberOffsets(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }
    
    public final int getHash() {
        return 0;
    }
    
    public final boolean getInitialized() {
        return false;
    }
    
    public final void setInitialized(boolean p0) {
    }
    
    public final int getSizeCached() {
        return 0;
    }
    
    protected final void setSizeCached(int p0) {
    }
    
    /**
     * * Returns the size of [element] inside an uniform buffer.
     */
    @kotlin.Suppress(names = {"PLATFORM_CLASS_MAPPED_TO_KOTLIN"})
    protected final int sizeOf(@org.jetbrains.annotations.NotNull()
    java.lang.Object element) {
        return 0;
    }
    
    /**
     * * Translates an object to an integer ID for more efficient storage in [alignments].
     */
    @kotlin.Suppress(names = {"PLATFORM_CLASS_MAPPED_TO_KOTLIN"})
    protected final int objectId(@org.jetbrains.annotations.NotNull()
    java.lang.Object $receiver) {
        return 0;
    }
    
    /**
     * * Returns the size occupied and alignment required for [element] inside a uniform buffer.
     *     * Pair layout is <size, alignment>.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"PLATFORM_CLASS_MAPPED_TO_KOTLIN"})
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getSizeAndAlignment(@org.jetbrains.annotations.NotNull()
    java.lang.Object element) {
        return null;
    }
    
    /**
     * * Returns the total size in bytes required to store the contents of this UBO in a uniform buffer.
     */
    public final int getSize() {
        return 0;
    }
    
    /**
     * * Populates the [ByteBuffer] [data] with the members of this UBO, subject to the determined
     *     * sizes and alignments. A buffer [offset] can be given, as well as a list of [elements] that
     *     * would override the UBO's members. This routine checks if an actual buffer update is required,
     *     * and if not, will just set the buffer to the cached position. Otherwise it will serialise all
     *     * the members into [data].
     *     *
     *     * Returns true if [data] has been updated, and false if not.
     */
    @kotlin.Suppress(names = {"PLATFORM_CLASS_MAPPED_TO_KOTLIN"})
    public final boolean populate(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer data, long offset, @org.jetbrains.annotations.Nullable()
    java.util.LinkedHashMap<java.lang.String, kotlin.jvm.functions.Function0<java.lang.Object>> elements) {
        return false;
    }
    
    /**
     * * Adds a member with [name] to this UBO. [value] is given as a lambda
     *     * that will return the actual value when invoked. An optional [offset] can be
     *     * given, otherwise it will be calculated automatically.
     *     *
     *     * Invalidates the UBO's hash if no previous member is associated with [name],
     *     * or if a previous member already bears [name], but has another type than the
     *     * invocation of [value].
     */
    public final void add(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.lang.Object> value, @org.jetbrains.annotations.Nullable()
    java.lang.Integer offset) {
    }
    
    /**
     * * Returns the members of the UBO as string.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String members() {
        return null;
    }
    
    /**
     * * Returns the members of the UBO and their values as string.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String membersAndContent() {
        return null;
    }
    
    /**
     * * Returns the number of members of this UBO.
     */
    public final int memberCount() {
        return 0;
    }
    
    /**
     * * For debugging purposes. Returns the hashes of all members as string.
     */
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"unused"})
    public final java.lang.String perMemberHashes$scenery() {
        return null;
    }
    
    /**
     * * Returns the hash value of all current members.
     *     *
     *     * Takes into consideration the member's name and _invoked_ value, as well as the
     *     * buffer's memory address to discern buffer switches the UBO is oblivious to.
     */
    protected final int getMembersHash(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer buffer) {
        return 0;
    }
    
    /**
     * * Updates the currently stored member hash.
     */
    protected final void updateHash(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer buffer) {
    }
    
    /**
     * * Returns the lambda associated with member of [name], or null
     *     * if it does not exist.
     */
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<java.lang.Object> get(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    private final int toInt(boolean $receiver) {
        return 0;
    }
    
    public UBO() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R,\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lgraphics/scenery/backends/UBO$Companion;", "", "()V", "alignments", "Lgnu/trove/map/hash/TIntObjectHashMap;", "Lkotlin/Pair;", "", "getAlignments$scenery", "()Lgnu/trove/map/hash/TIntObjectHashMap;", "setAlignments$scenery", "(Lgnu/trove/map/hash/TIntObjectHashMap;)V", "scenery"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final gnu.trove.map.hash.TIntObjectHashMap<kotlin.Pair<java.lang.Integer, java.lang.Integer>> getAlignments$scenery() {
            return null;
        }
        
        public final void setAlignments$scenery(@org.jetbrains.annotations.NotNull()
        gnu.trove.map.hash.TIntObjectHashMap<kotlin.Pair<java.lang.Integer, java.lang.Integer>> p0) {
        }
        
        private Companion() {
            super();
        }
    }
}