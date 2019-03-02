package graphics.scenery;

import java.lang.System;

/**
 * * Constructs a cylinder with the given [radius] and number of [segments].
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @param[radius] The radius of the sphere
 * * @param[segments] Number of segments in latitude and longitude.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u001a\u0010\'\u001a\u00020\u001aX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001eR\u0014\u0010*\u001a\u00020\u0007X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u001a\u0010,\u001a\u00020\u001aX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001c\"\u0004\b.\u0010\u001e\u00a8\u0006/"}, d2 = {"Lgraphics/scenery/Cone;", "Lgraphics/scenery/Node;", "Lgraphics/scenery/HasGeometry;", "radius", "", "height", "segments", "", "(FFI)V", "geometryType", "Lgraphics/scenery/GeometryType;", "getGeometryType", "()Lgraphics/scenery/GeometryType;", "setGeometryType", "(Lgraphics/scenery/GeometryType;)V", "getHeight", "()F", "setHeight", "(F)V", "indices", "Ljava/nio/IntBuffer;", "getIndices", "()Ljava/nio/IntBuffer;", "setIndices", "(Ljava/nio/IntBuffer;)V", "normals", "Ljava/nio/FloatBuffer;", "getNormals", "()Ljava/nio/FloatBuffer;", "setNormals", "(Ljava/nio/FloatBuffer;)V", "getRadius", "setRadius", "getSegments", "()I", "setSegments", "(I)V", "texcoordSize", "getTexcoordSize", "texcoords", "getTexcoords", "setTexcoords", "vertexSize", "getVertexSize", "vertices", "getVertices", "setVertices", "scenery"})
public final class Cone extends graphics.scenery.Node implements graphics.scenery.HasGeometry {
    private final int vertexSize = 3;
    private final int texcoordSize = 2;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.GeometryType geometryType;
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer vertices;
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer normals;
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer texcoords;
    @org.jetbrains.annotations.NotNull()
    private java.nio.IntBuffer indices;
    private float radius;
    private float height;
    private int segments;
    
    @java.lang.Override()
    public int getVertexSize() {
        return 0;
    }
    
    @java.lang.Override()
    public int getTexcoordSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public graphics.scenery.GeometryType getGeometryType() {
        return null;
    }
    
    @java.lang.Override()
    public void setGeometryType(@org.jetbrains.annotations.NotNull()
    graphics.scenery.GeometryType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.nio.FloatBuffer getVertices() {
        return null;
    }
    
    @java.lang.Override()
    public void setVertices(@org.jetbrains.annotations.NotNull()
    java.nio.FloatBuffer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.nio.FloatBuffer getNormals() {
        return null;
    }
    
    @java.lang.Override()
    public void setNormals(@org.jetbrains.annotations.NotNull()
    java.nio.FloatBuffer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.nio.FloatBuffer getTexcoords() {
        return null;
    }
    
    @java.lang.Override()
    public void setTexcoords(@org.jetbrains.annotations.NotNull()
    java.nio.FloatBuffer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.nio.IntBuffer getIndices() {
        return null;
    }
    
    @java.lang.Override()
    public void setIndices(@org.jetbrains.annotations.NotNull()
    java.nio.IntBuffer p0) {
    }
    
    public final float getRadius() {
        return 0.0F;
    }
    
    public final void setRadius(float p0) {
    }
    
    public final float getHeight() {
        return 0.0F;
    }
    
    public final void setHeight(float p0) {
    }
    
    public final int getSegments() {
        return 0;
    }
    
    public final void setSegments(int p0) {
    }
    
    public Cone(float radius, float height, int segments) {
        super(null);
    }
    
    /**
     * * Reads geometry from a file given by [filename]. The extension of [filename] will determine
     *     * whether the file will be read by [readFromOBJ] or [readFromSTL].
     *     *
     *     * Materials will be automatically used, if present.
     */
    public void readFrom(@org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
    }
    
    /**
     * * Reads geometry from a file given by [filename]. The extension of [filename] will determine
     *     * whether the file will be read by [readFromOBJ] or [readFromSTL].
     *     *
     *     * Materials will be used, if present and [useMaterial] is true.
     */
    public void readFrom(@org.jetbrains.annotations.NotNull()
    java.lang.String filename, boolean useMaterial) {
    }
    
    /**
     * * Reads an OBJ file's material properties from the corresponding MTL file
     *     *
     *     * @param[filename] The filename of the MTL file, stored in the OBJ usually
     *     * @return A HashMap storing material name and [Material].
     */
    @org.jetbrains.annotations.NotNull()
    public java.util.HashMap<java.lang.String, graphics.scenery.Material> readFromMTL(@org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
        return null;
    }
    
    /**
     * * Read the [Node]'s geometry from an OBJ file, including materials
     *     *
     *     * @param[filename] The filename to read from.
     */
    public void readFromOBJ(@org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
    }
    
    /**
     * * Read the [Node]'s geometry from an OBJ file, and choose whether the OBJ-defined materials shall be imported.
     *     *
     *     * @param[filename] The filename to read from.
     *     * @param[importMaterials] Whether a accompanying MTL file shall be used, defaults to true.
     */
    public void readFromOBJ(@org.jetbrains.annotations.NotNull()
    java.lang.String filename, boolean importMaterials) {
    }
    
    /**
     * * Read the [Node]'s geometry from an OBJ file, possible including materials
     *     *
     *     * @param[filename] The filename to read from.
     *     * @param[importMaterials] Whether a accompanying MTL file shall be used, defaults to true.
     *     * @param[flipNormals] Whether to flip the normals after reading them.
     */
    public void readFromOBJ(@org.jetbrains.annotations.NotNull()
    java.lang.String filename, boolean importMaterials, boolean flipNormals) {
    }
    
    /**
     * * Read the [Node]'s geometry from an STL file
     *     *
     *     * @param[filename] The filename to read from.
     */
    public void readFromSTL(@org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
    }
    
    /**
     * * Recalculates normals, assuming CCW winding order and taking
     *     * STL's facet storage format into account.
     */
    public void recalculateNormals() {
    }
}