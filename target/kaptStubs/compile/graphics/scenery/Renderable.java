package graphics.scenery;

import java.lang.System;

/**
 * * Generic interface for objects that can be rendered
 * *
 * * Matrices that are set to null shall be treated as identity matrix
 * * by the renderer. See e.g. [projection] or [view].
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\bf\u0018\u00002\u00020\u0001J\b\u0010U\u001a\u00020\u0003H&R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0018\u0010\u0011\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\u0005\"\u0004\b\u0013\u0010\u0007R\u0018\u0010\u0014\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u0018\u0010\u0017\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0005\"\u0004\b\u0018\u0010\u0007R\u0018\u0010\u0019\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\rR\u0018\u0010\u001c\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\rR\u0018\u0010\u001f\u001a\u00020 X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0018\u0010%\u001a\u00020&X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u0018\u0010+\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010\rR\u0018\u0010.\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b/\u0010\u000b\"\u0004\b0\u0010\rR\u0018\u00101\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b2\u0010\u000b\"\u0004\b3\u0010\rR\u0018\u00104\u001a\u000205X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0018\u0010:\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b;\u0010\u000b\"\u0004\b<\u0010\rR\u0018\u0010=\u001a\u00020>X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0018\u0010C\u001a\u00020DX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0018\u0010I\u001a\u000205X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bJ\u00107\"\u0004\bK\u00109R\u0018\u0010L\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bM\u0010\u000b\"\u0004\bN\u0010\rR\u0018\u0010O\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bP\u0010\u0005\"\u0004\bQ\u0010\u0007R\u0018\u0010R\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bS\u0010\u000b\"\u0004\bT\u0010\r\u00a8\u0006V"}, d2 = {"Lgraphics/scenery/Renderable;", "", "dirty", "", "getDirty", "()Z", "setDirty", "(Z)V", "imodel", "Lcleargl/GLMatrix;", "getImodel", "()Lcleargl/GLMatrix;", "setImodel", "(Lcleargl/GLMatrix;)V", "imodelView", "getImodelView", "setImodelView", "initialized", "getInitialized", "setInitialized", "iprojection", "getIprojection", "setIprojection", "isBillboard", "setBillboard", "iview", "getIview", "setIview", "iworld", "getIworld", "setIworld", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "setLock", "(Ljava/util/concurrent/locks/ReentrantLock;)V", "material", "Lgraphics/scenery/Material;", "getMaterial", "()Lgraphics/scenery/Material;", "setMaterial", "(Lgraphics/scenery/Material;)V", "model", "getModel", "setModel", "modelView", "getModelView", "setModelView", "mvp", "getMvp", "setMvp", "position", "Lcleargl/GLVector;", "getPosition", "()Lcleargl/GLVector;", "setPosition", "(Lcleargl/GLVector;)V", "projection", "getProjection", "setProjection", "renderScale", "", "getRenderScale", "()F", "setRenderScale", "(F)V", "rotation", "Lcom/jogamp/opengl/math/Quaternion;", "getRotation", "()Lcom/jogamp/opengl/math/Quaternion;", "setRotation", "(Lcom/jogamp/opengl/math/Quaternion;)V", "scale", "getScale", "setScale", "view", "getView", "setView", "visible", "getVisible", "setVisible", "world", "getWorld", "setWorld", "init", "scenery"})
public abstract interface Renderable {
    
    /**
     * Model matrix 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLMatrix getModel();
    
    /**
     * Model matrix 
     */
    public abstract void setModel(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0);
    
    /**
     * Inverse [model] matrix 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLMatrix getImodel();
    
    /**
     * Inverse [model] matrix 
     */
    public abstract void setImodel(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0);
    
    /**
     * World transform matrix 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLMatrix getWorld();
    
    /**
     * World transform matrix 
     */
    public abstract void setWorld(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0);
    
    /**
     * Inverse of [world] 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLMatrix getIworld();
    
    /**
     * Inverse of [world] 
     */
    public abstract void setIworld(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0);
    
    /**
     * View matrix. May be null. 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLMatrix getView();
    
    /**
     * View matrix. May be null. 
     */
    public abstract void setView(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0);
    
    /**
     * Inverse of [view] matrix. May be null. 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLMatrix getIview();
    
    /**
     * Inverse of [view] matrix. May be null. 
     */
    public abstract void setIview(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0);
    
    /**
     * Projection matrix. May be null. 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLMatrix getProjection();
    
    /**
     * Projection matrix. May be null. 
     */
    public abstract void setProjection(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0);
    
    /**
     * Inverse of [projection]. May be null. 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLMatrix getIprojection();
    
    /**
     * Inverse of [projection]. May be null. 
     */
    public abstract void setIprojection(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0);
    
    /**
     * modelView matrix. May be null. 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLMatrix getModelView();
    
    /**
     * modelView matrix. May be null. 
     */
    public abstract void setModelView(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0);
    
    /**
     * Inverse of [modelView]. May be null. 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLMatrix getImodelView();
    
    /**
     * Inverse of [modelView]. May be null. 
     */
    public abstract void setImodelView(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0);
    
    /**
     * ModelViewProjection matrix. May be null. 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLMatrix getMvp();
    
    /**
     * ModelViewProjection matrix. May be null. 
     */
    public abstract void setMvp(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0);
    
    /**
     * World position of the [Renderable] object. 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLVector getPosition();
    
    /**
     * World position of the [Renderable] object. 
     */
    public abstract void setPosition(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector p0);
    
    /**
     * X/Y/Z scale of the object. 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract cleargl.GLVector getScale();
    
    /**
     * X/Y/Z scale of the object. 
     */
    public abstract void setScale(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector p0);
    
    /**
     * Rendering scale, e.g. coming from physical units of the object. 
     */
    public abstract float getRenderScale();
    
    /**
     * Rendering scale, e.g. coming from physical units of the object. 
     */
    public abstract void setRenderScale(float p0);
    
    /**
     * Quaternion defining the rotation of the object in local coordinates. 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.jogamp.opengl.math.Quaternion getRotation();
    
    /**
     * Quaternion defining the rotation of the object in local coordinates. 
     */
    public abstract void setRotation(@org.jetbrains.annotations.NotNull()
    com.jogamp.opengl.math.Quaternion p0);
    
    /**
     * Whether the object has been initialized. Used by renderers. 
     */
    public abstract boolean getInitialized();
    
    /**
     * Whether the object has been initialized. Used by renderers. 
     */
    public abstract void setInitialized(boolean p0);
    
    /**
     * Whether the object is dirty and somehow needs to be updated. Used by renderers. 
     */
    public abstract boolean getDirty();
    
    /**
     * Whether the object is dirty and somehow needs to be updated. Used by renderers. 
     */
    public abstract void setDirty(boolean p0);
    
    /**
     * Flag to set whether the object is visible or not. 
     */
    public abstract boolean getVisible();
    
    /**
     * Flag to set whether the object is visible or not. 
     */
    public abstract void setVisible(boolean p0);
    
    /**
     * Flag to set whether the object is a billboard and will always face the camera. 
     */
    public abstract boolean isBillboard();
    
    /**
     * Flag to set whether the object is a billboard and will always face the camera. 
     */
    public abstract void setBillboard(boolean p0);
    
    /**
     * The [Material] of the object. 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract graphics.scenery.Material getMaterial();
    
    /**
     * The [Material] of the object. 
     */
    public abstract void setMaterial(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Material p0);
    
    /**
     * [ReentrantLock] to be used if the object is being updated and should not be
     *     * touched in the meantime. 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.concurrent.locks.ReentrantLock getLock();
    
    /**
     * [ReentrantLock] to be used if the object is being updated and should not be
     *     * touched in the meantime. 
     */
    public abstract void setLock(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.locks.ReentrantLock p0);
    
    /**
     * Initialisation function for the object 
     */
    public abstract boolean init();
}