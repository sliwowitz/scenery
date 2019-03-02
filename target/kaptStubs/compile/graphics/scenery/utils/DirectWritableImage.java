package graphics.scenery.utils;

import java.lang.System;

/**
 * * Direct writable image
 *
 * * @author Loic Royer <royerloic@gmail.com>, Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0001H\u0002J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0001H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lgraphics/scenery/utils/DirectWritableImage;", "Ljavafx/scene/image/WritableImage;", "pWidth", "", "pHeight", "(II)V", "getWritablePlatformImage", "Ljava/lang/reflect/Method;", "getGetWritablePlatformImage", "()Ljava/lang/reflect/Method;", "setGetWritablePlatformImage", "(Ljava/lang/reflect/Method;)V", "pixelBuffer", "Ljava/lang/reflect/Field;", "pixelsDirty", "serial", "forceUpdate", "", "writableImg", "prismImg", "Lcom/sun/prism/Image;", "replaceBuffer", "pMemory", "Lcoremem/ContiguousMemoryInterface;", "replaceImageBuffer", "direct", "Ljava/nio/ByteBuffer;", "update", "buffer", "writePixels", "writeToImageDirectly", "scenery"})
public final class DirectWritableImage extends javafx.scene.image.WritableImage {
    
    /**
     * Method to store return the writeable platform image. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.reflect.Method getWritablePlatformImage;
    private java.lang.reflect.Field pixelBuffer;
    private java.lang.reflect.Field serial;
    private java.lang.reflect.Method pixelsDirty;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.reflect.Method getGetWritablePlatformImage() {
        return null;
    }
    
    public final void setGetWritablePlatformImage(@org.jetbrains.annotations.NotNull()
    java.lang.reflect.Method p0) {
    }
    
    /**
     * * Replaces the internal image buffer with the given one.
     *
     *     * @param pMemory
     *     * *          new buffer
     */
    public final void replaceBuffer(@org.jetbrains.annotations.NotNull()
    coremem.ContiguousMemoryInterface pMemory) {
    }
    
    /**
     * * Writes the contents of this memory object into the image
     *
     *     * @param pMemory
     *     * *          memory
     */
    public final void writePixels(@org.jetbrains.annotations.NotNull()
    coremem.ContiguousMemoryInterface pMemory) {
    }
    
    private final void writeToImageDirectly(java.nio.ByteBuffer direct, javafx.scene.image.WritableImage writableImg) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchFieldException {
    }
    
    /**
     * * Updates the image with the contents of [buffer].
     */
    public final void update(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer buffer) {
    }
    
    private final void replaceImageBuffer(java.nio.ByteBuffer direct, javafx.scene.image.WritableImage writableImg) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchFieldException {
    }
    
    private final void forceUpdate(javafx.scene.image.WritableImage writableImg, com.sun.prism.Image prismImg) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException {
    }
    
    public DirectWritableImage(int pWidth, int pHeight) {
        super(0, 0);
    }
}