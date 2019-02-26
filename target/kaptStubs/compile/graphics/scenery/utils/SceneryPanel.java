package graphics.scenery.utils;

/**
 * * Created by ulrik on 6/30/2017.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @author Hongkee Moon <moon@mpi-cbg.de>
 * * @author Philipp Hanslovsky <hanslovskyp@janelia.hmmi.org>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/H\u0016J\u001f\u00101\u001a\u00020-2\u0006\u00102\u001a\u00020\u00152\b\b\u0002\u00103\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\b4R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0007X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u000e\u0010\"\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010(\u001a\u0004\b%\u0010&R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lgraphics/scenery/utils/SceneryPanel;", "Ljavafx/scene/layout/Pane;", "imageWidth", "", "imageHeight", "(II)V", "RESIZE_DELAY_MS", "", "getRESIZE_DELAY_MS", "()J", "displayedFrames", "getDisplayedFrames$scenery", "setDisplayedFrames$scenery", "(J)V", "image", "Lgraphics/scenery/utils/DirectWritableImage;", "getImage", "()Lgraphics/scenery/utils/DirectWritableImage;", "setImage", "(Lgraphics/scenery/utils/DirectWritableImage;)V", "imageBuffer", "Ljava/nio/ByteBuffer;", "getImageHeight", "()I", "setImageHeight", "(I)V", "imageView", "Ljavafx/scene/image/ImageView;", "getImageView$scenery", "()Ljavafx/scene/image/ImageView;", "setImageView$scenery", "(Ljavafx/scene/image/ImageView;)V", "getImageWidth", "setImageWidth", "latestImageSize", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "resizeTimer", "Ljava/util/Timer;", "textureId", "resize", "", "width", "", "height", "update", "buffer", "id", "update$scenery", "ResizeTimerTask", "scenery"})
public final class SceneryPanel extends javafx.scene.layout.Pane {
    private final kotlin.Lazy logger$delegate = null;

    /**
     * Delay between resize events before associated renderer swapchains are resized actually.
     */
    private final long RESIZE_DELAY_MS = 200L;

    /**
     * The image displayed in the panel. Will be set by a renderer.
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.utils.DirectWritableImage image;
    @org.jetbrains.annotations.NotNull()
    private javafx.scene.image.ImageView imageView;
    private long displayedFrames;
    private java.util.Timer resizeTimer;
    private int latestImageSize;
    private java.nio.ByteBuffer imageBuffer;
    private int textureId;
    private int imageWidth;
    private int imageHeight;

    public SceneryPanel(int imageWidth, int imageHeight) {
        super();
    }

    private final org.slf4j.Logger getLogger() {
        return null;
    }

    public final long getRESIZE_DELAY_MS() {
        return 0L;
    }

    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.utils.DirectWritableImage getImage() {
        return null;
    }

    protected final void setImage(@org.jetbrains.annotations.NotNull()
                                      graphics.scenery.utils.DirectWritableImage p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final javafx.scene.image.ImageView getImageView$scenery() {
        return null;
    }

    public final void setImageView$scenery(@org.jetbrains.annotations.NotNull()
                                               javafx.scene.image.ImageView p0) {
    }

    public final long getDisplayedFrames$scenery() {
        return 0L;
    }

    public final void setDisplayedFrames$scenery(long p0) {
    }

    public final void update$scenery(@org.jetbrains.annotations.NotNull()
                                         java.nio.ByteBuffer buffer, int id) {
    }

    /**
     * * Resizes the panel to [width] x [height].
     */
    @java.lang.Override()
    public void resize(double width, double height) {
    }

    public final int getImageWidth() {
        return 0;
    }

    public final void setImageWidth(int p0) {
    }

    public final int getImageHeight() {
        return 0;
    }

    public final void setImageHeight(int p0) {
    }

    /**
     * Timer task to keep track of resize events.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lgraphics/scenery/utils/SceneryPanel$ResizeTimerTask;", "Ljava/util/TimerTask;", "width", "", "height", "(Lgraphics/scenery/utils/SceneryPanel;DD)V", "getHeight", "()D", "getWidth", "run", "", "scenery"})
    public final class ResizeTimerTask extends java.util.TimerTask {
        private final double width = 0.0;
        private final double height = 0.0;

        public ResizeTimerTask(double width, double height) {
            super();
        }

        /**
         * * The action to be performed by this timer task.
         */
        @java.lang.Override()
        public void run() {
        }

        public final double getWidth() {
            return 0.0;
        }

        public final double getHeight() {
            return 0.0;
        }
    }
}
