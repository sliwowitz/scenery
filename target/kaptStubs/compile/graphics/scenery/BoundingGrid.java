package graphics.scenery;

import java.lang.System;

/**
 * * Creating bounding boxes for [Node]s
 * *
 * * This class can render bounding boxes for any node, use it in the [REPL]
 * * e.g. by:
 * * ```
 * * bb = new BoundingGrid();
 * * bb.node = scene.find("ObjectName");
 * * ```
 * * Programmatic usage in the same way is possible of course ;)
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020\fH\u0016J\b\u00101\u001a\u00020/H\u0004R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u00020!8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\'\u0010\u0002\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R$\u0010*\u001a\u00020!8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%\u00a8\u00062"}, d2 = {"Lgraphics/scenery/BoundingGrid;", "Lgraphics/scenery/Mesh;", "()V", "gridColor", "Lcleargl/GLVector;", "gridColor$annotations", "getGridColor", "()Lcleargl/GLVector;", "setGridColor", "(Lcleargl/GLVector;)V", "labels", "Ljava/util/HashMap;", "", "Lgraphics/scenery/TextBoard;", "getLabels", "()Ljava/util/HashMap;", "setLabels", "(Ljava/util/HashMap;)V", "lineWidth", "", "lineWidth$annotations", "getLineWidth", "()F", "setLineWidth", "(F)V", "value", "Lgraphics/scenery/Node;", "node", "getNode", "()Lgraphics/scenery/Node;", "setNode", "(Lgraphics/scenery/Node;)V", "nodeBoundingBoxHash", "", "getNodeBoundingBoxHash", "()I", "setNodeBoundingBoxHash", "(I)V", "numLines", "numLines$annotations", "getNumLines", "setNumLines", "ticksOnly", "ticksOnly$annotations", "getTicksOnly", "setTicksOnly", "preDraw", "", "toString", "updateFromNode", "scenery"})
public class BoundingGrid extends graphics.scenery.Mesh {
    @org.jetbrains.annotations.NotNull()
    private java.util.HashMap<java.lang.String, graphics.scenery.TextBoard> labels;
    
    /**
     * Grid color for the bounding grid. 
     */
    @org.jetbrains.annotations.NotNull()
    private cleargl.GLVector gridColor;
    
    /**
     * Number of lines per grid axis. 
     */
    private int numLines;
    
    /**
     * Line width for the grid. 
     */
    private float lineWidth;
    
    /**
     * Whether to show only the ticks on the grid, or show the full grid. 
     */
    private int ticksOnly;
    
    /**
     * The [Node] this bounding grid is attached to. Set to null to remove. 
     */
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Node node;
    
    /**
     * Stores the hash of the [node]'s bounding box to keep an eye on it. 
     */
    private int nodeBoundingBoxHash;
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.HashMap<java.lang.String, graphics.scenery.TextBoard> getLabels() {
        return null;
    }
    
    protected final void setLabels(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, graphics.scenery.TextBoard> p0) {
    }
    
    @ShaderProperty()
    public static void gridColor$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector getGridColor() {
        return null;
    }
    
    public final void setGridColor(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector p0) {
    }
    
    @ShaderProperty()
    public static void numLines$annotations() {
    }
    
    public final int getNumLines() {
        return 0;
    }
    
    public final void setNumLines(int p0) {
    }
    
    @ShaderProperty()
    public static void lineWidth$annotations() {
    }
    
    public final float getLineWidth() {
        return 0.0F;
    }
    
    public final void setLineWidth(float p0) {
    }
    
    @ShaderProperty()
    public static void ticksOnly$annotations() {
    }
    
    public final int getTicksOnly() {
        return 0;
    }
    
    public final void setTicksOnly(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.Node getNode() {
        return null;
    }
    
    public final void setNode(@org.jetbrains.annotations.Nullable()
    graphics.scenery.Node value) {
    }
    
    protected final int getNodeBoundingBoxHash() {
        return 0;
    }
    
    protected final void setNodeBoundingBoxHash(int p0) {
    }
    
    @java.lang.Override()
    public void preDraw() {
    }
    
    protected final void updateFromNode() {
    }
    
    /**
     * * Returns this bounding box' coordinates and associated [Node] as String.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public BoundingGrid() {
        super(null);
    }
}