package graphics.scenery;

import java.lang.System;

/**
 * * Constructs a plane with the dimensions given in [sizes].
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @param[sizes] The dimensions of the plane.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0013X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u0019X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010$\u001a\u00020\u0013X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017\u00a8\u0006\'"}, d2 = {"Lgraphics/scenery/Plane;", "Lgraphics/scenery/Mesh;", "Lgraphics/scenery/HasGeometry;", "sizes", "Lcleargl/GLVector;", "(Lcleargl/GLVector;)V", "geometryType", "Lgraphics/scenery/GeometryType;", "getGeometryType", "()Lgraphics/scenery/GeometryType;", "setGeometryType", "(Lgraphics/scenery/GeometryType;)V", "indices", "Ljava/nio/IntBuffer;", "getIndices", "()Ljava/nio/IntBuffer;", "setIndices", "(Ljava/nio/IntBuffer;)V", "normals", "Ljava/nio/FloatBuffer;", "getNormals", "()Ljava/nio/FloatBuffer;", "setNormals", "(Ljava/nio/FloatBuffer;)V", "texcoordSize", "", "getTexcoordSize", "()I", "setTexcoordSize", "(I)V", "texcoords", "getTexcoords", "setTexcoords", "vertexSize", "getVertexSize", "setVertexSize", "vertices", "getVertices", "setVertices", "scenery"})
public class Plane extends graphics.scenery.Mesh implements graphics.scenery.HasGeometry {
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer vertices;
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer normals;
    @org.jetbrains.annotations.NotNull()
    private java.nio.FloatBuffer texcoords;
    @org.jetbrains.annotations.NotNull()
    private java.nio.IntBuffer indices;
    private int vertexSize;
    private int texcoordSize;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.GeometryType geometryType;
    
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
    
    @java.lang.Override()
    public int getVertexSize() {
        return 0;
    }
    
    @java.lang.Override()
    public void setVertexSize(int p0) {
    }
    
    @java.lang.Override()
    public int getTexcoordSize() {
        return 0;
    }
    
    @java.lang.Override()
    public void setTexcoordSize(int p0) {
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
    
    public Plane(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector sizes) {
        super(null);
    }
}