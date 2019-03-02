package graphics.scenery.net;

import java.lang.System;

/**
 * * Created by ulrik on 4/4/2017.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020*R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u0006,"}, d2 = {"Lgraphics/scenery/net/NodeSubscriber;", "Lgraphics/scenery/Hubable;", "hub", "Lgraphics/scenery/Hub;", "address", "", "context", "Lorg/zeromq/ZContext;", "(Lgraphics/scenery/Hub;Ljava/lang/String;Lorg/zeromq/ZContext;)V", "getAddress", "()Ljava/lang/String;", "getContext", "()Lorg/zeromq/ZContext;", "getHub", "()Lgraphics/scenery/Hub;", "setHub", "(Lgraphics/scenery/Hub;)V", "kryo", "Lcom/esotericsoftware/kryo/Kryo;", "getKryo", "()Lcom/esotericsoftware/kryo/Kryo;", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "nodes", "Ljava/util/HashMap;", "", "Lgraphics/scenery/Node;", "getNodes", "()Ljava/util/HashMap;", "setNodes", "(Ljava/util/HashMap;)V", "subscriber", "Lorg/zeromq/ZMQ$Socket;", "getSubscriber", "()Lorg/zeromq/ZMQ$Socket;", "setSubscriber", "(Lorg/zeromq/ZMQ$Socket;)V", "close", "", "process", "scenery"})
public final class NodeSubscriber implements graphics.scenery.Hubable {
    private final kotlin.Lazy logger$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.HashMap<java.lang.Integer, graphics.scenery.Node> nodes;
    @org.jetbrains.annotations.NotNull()
    private org.zeromq.ZMQ.Socket subscriber;
    @org.jetbrains.annotations.NotNull()
    private final com.esotericsoftware.kryo.Kryo kryo = null;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Hub hub;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String address = null;
    @org.jetbrains.annotations.NotNull()
    private final org.zeromq.ZContext context = null;
    
    private final org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.Integer, graphics.scenery.Node> getNodes() {
        return null;
    }
    
    public final void setNodes(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.Integer, graphics.scenery.Node> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.zeromq.ZMQ.Socket getSubscriber() {
        return null;
    }
    
    public final void setSubscriber(@org.jetbrains.annotations.NotNull()
    org.zeromq.ZMQ.Socket p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.esotericsoftware.kryo.Kryo getKryo() {
        return null;
    }
    
    public final void process() {
    }
    
    public final void close() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public graphics.scenery.Hub getHub() {
        return null;
    }
    
    @java.lang.Override()
    public void setHub(@org.jetbrains.annotations.Nullable()
    graphics.scenery.Hub p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.zeromq.ZContext getContext() {
        return null;
    }
    
    public NodeSubscriber(@org.jetbrains.annotations.Nullable()
    graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    org.zeromq.ZContext context) {
        super();
    }
}