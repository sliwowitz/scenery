package graphics.scenery.utils;

/**
 * * Ring buffer class. Creates a ring buffer of size [size], with all elements
 * * initialiased to a default value. Querying this ring buffer will return the current
 * * element of the buffer, and advance the read position. Setting it will store
 * * the element, and advance the write position. Running one of these two operations
 * * again will then affect the next element of the ring buffer.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\u0019\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u001cR \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013\u00a8\u0006 "}, d2 = {"Lgraphics/scenery/utils/RingBuffer;", "T", "", "size", "", "default", "Lkotlin/Function1;", "(ILkotlin/jvm/functions/Function1;)V", "backingStore", "Ljava/util/ArrayList;", "getBackingStore", "()Ljava/util/ArrayList;", "setBackingStore", "(Ljava/util/ArrayList;)V", "<set-?>", "currentReadPosition", "getCurrentReadPosition", "()I", "setCurrentReadPosition", "(I)V", "currentWritePosition", "getCurrentWritePosition", "setCurrentWritePosition", "getSize", "setSize", "get", "()Ljava/lang/Object;", "put", "", "element", "(Ljava/lang/Object;)V", "reset", "scenery"})
public class RingBuffer<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<T> backingStore;

    /**
     * The current read position of the ring buffer
     */
    private int currentReadPosition;

    /**
     * The current write position of the ring buffer
     */
    private int currentWritePosition;
    private int size;

    public RingBuffer(int size, @org.jetbrains.annotations.Nullable()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> p1_772401952) {
        super();
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<T> getBackingStore() {
        return null;
    }

    protected final void setBackingStore(@org.jetbrains.annotations.NotNull()
                                             java.util.ArrayList<T> p0) {
    }

    public final int getCurrentReadPosition() {
        return 0;
    }

    protected final void setCurrentReadPosition(int p0) {
    }

    public final int getCurrentWritePosition() {
        return 0;
    }

    protected final void setCurrentWritePosition(int p0) {
    }

    /**
     * * Puts a new [element] into the ring buffer, advancing the
     * * write position.
     */
    public final void put(@org.jetbrains.annotations.NotNull()
                              T element) {
    }

    /**
     * * Retrieves and returns the current element from the ring buffer, and advances
     * * the current read position.
     */
    @org.jetbrains.annotations.NotNull()
    public final T get() {
        return null;
    }

    /**
     * * Resets the ring buffer, and clears its backing store.
     */
    public final void reset() {
    }

    public final int getSize() {
        return 0;
    }

    public final void setSize(int p0) {
    }
}
