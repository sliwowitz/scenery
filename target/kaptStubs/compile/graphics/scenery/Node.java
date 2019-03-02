package graphics.scenery;

import java.lang.System;

/**
 * * Class describing a [Node] of a [Scene], inherits from [Renderable]
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @constructor Creates a node with default settings, e.g. identity matrices
 * *  for model, view, projection, etc.
 * * @property[name] The name of the [Node]
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00da\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \u00f8\u00012\u00020\u00012\u00020\u0002:\u0006\u00f7\u0001\u00f8\u0001\u00f9\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\u00c5\u0001\u001a\u00030\u00ac\u00012\u0007\u0010\u00c6\u0001\u001a\u00020\u0000J\u0012\u0010\u00c7\u0001\u001a\u00030\u008b\u00012\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001J\b\u0010\u00c8\u0001\u001a\u00030\u00ac\u0001J\n\u0010\u00c9\u0001\u001a\u00030\u00ac\u0001H\u0016J\'\u0010\u00ca\u0001\u001a\u00060\u0007R\u00020\u00002\u000b\u0010\u00cb\u0001\u001a\u00060\u0007R\u00020\u00002\u000b\u0010\u00cc\u0001\u001a\u00060\u0007R\u00020\u0000H\u0002J\u001d\u0010\u00cd\u0001\u001a\u00030\u008b\u00012\b\u0010\u00ce\u0001\u001a\u00030\u0096\u00012\t\b\u0002\u0010\u00cf\u0001\u001a\u00020\u0019J\u000f\u0010\u00d0\u0001\u001a\b\u0018\u00010\u0007R\u00020\u0000H\u0016J\u000b\u0010\u00d1\u0001\u001a\u00060\u0007R\u00020\u0000J\n\u0010\u00d2\u0001\u001a\u0005\u0018\u00010\u00d3\u0001J\u0011\u0010\u00d4\u0001\u001a\u0004\u0018\u00010<2\u0006\u0010\u0003\u001a\u00020\u0004J\t\u0010\u00d5\u0001\u001a\u00020\u0019H\u0016J)\u0010\u00d6\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0005\u0012\u00030\u0096\u00010\u00d7\u00012\b\u0010\u00d8\u0001\u001a\u00030\u008b\u00012\b\u0010\u00d9\u0001\u001a\u00030\u008b\u0001J\u0010\u0010\u00da\u0001\u001a\u00020\u00192\u0007\u0010\u00db\u0001\u001a\u00020\u0000J\n\u0010\u00dc\u0001\u001a\u00030\u00ac\u0001H\u0016J$\u0010\u00dd\u0001\u001a\u00030\u00ac\u00012\b\u0010\u00de\u0001\u001a\u00030\u00df\u00012\b\u0010\u00e0\u0001\u001a\u00030\u00e1\u0001H\u0010\u00a2\u0006\u0003\b\u00e2\u0001J9\u0010\u00e3\u0001\u001a\u00030\u00ac\u0001\"\u0005\b\u0000\u0010\u00e4\u00012\f\u0010\u00e5\u0001\u001a\u0007\u0012\u0002\b\u00030\u00e6\u00012\b\u0010\u00e7\u0001\u001a\u0003H\u00e4\u00012\b\u0010\u00e8\u0001\u001a\u0003H\u00e4\u0001H\u0004\u00a2\u0006\u0003\u0010\u00e9\u0001J\u0012\u0010\u00ea\u0001\u001a\u00030\u008b\u00012\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001J\u0010\u0010\u00eb\u0001\u001a\u00020\u00192\u0007\u0010\u00c6\u0001\u001a\u00020\u0000J\u000f\u0010\u00eb\u0001\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0004J\u001f\u0010\u00ec\u0001\u001a\u00030\u00ac\u00012\u0015\u0010\u00ed\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0005\u0012\u00030\u00ac\u00010\u00ee\u0001J\u0018\u0010\u00ec\u0001\u001a\u00030\u00ac\u00012\u000e\u0010\u00ed\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u00ef\u0001J\u001c\u0010\u00f0\u0001\u001a\u00030\u00ac\u00012\u0007\u0010\u00f1\u0001\u001a\u00020\u00192\t\b\u0002\u0010\u00f2\u0001\u001a\u00020\u0019J\u0016\u0010\u00f3\u0001\u001a\u00030\u008b\u00012\f\b\u0002\u0010\u00ba\u0001\u001a\u0005\u0018\u00010\u008b\u0001J\"\u0010\u00f4\u0001\u001a\u00020\u0019*\u00030\u008b\u00012\b\u0010\u00f5\u0001\u001a\u00030\u008b\u00012\b\u0010\u00f6\u0001\u001a\u00030\u008b\u0001H\u0002R \u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR+\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R+\u0010*\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b-\u0010)\u001a\u0004\b+\u0010%\"\u0004\b,\u0010\'R\u001a\u0010.\u001a\u00020\u0019X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001dR\u001a\u00101\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001dR\u001c\u00104\u001a\u0004\u0018\u00010\u0000X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R,\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00000\r\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\u000fR+\u0010C\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\bF\u0010)\u001a\u0004\bD\u0010%\"\u0004\bE\u0010\'R\u001a\u0010G\u001a\u00020\u0019X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001b\"\u0004\bH\u0010\u001dR+\u0010I\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\bL\u0010)\u001a\u0004\bJ\u0010%\"\u0004\bK\u0010\'R+\u0010M\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\bP\u0010)\u001a\u0004\bN\u0010%\"\u0004\bO\u0010\'R \u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00000\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u000f\"\u0004\bS\u0010\u0011R\u001a\u0010T\u001a\u00020UX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001b\u0010Z\u001a\u00020[8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b\\\u0010]R\u001a\u0010`\u001a\u00020aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR6\u0010f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020<0gj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020<`hX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR+\u0010m\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\bp\u0010)\u001a\u0004\bn\u0010%\"\u0004\bo\u0010\'R+\u0010q\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\bt\u0010)\u001a\u0004\br\u0010%\"\u0004\bs\u0010\'R\u001a\u0010u\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0015\"\u0004\bw\u0010\u0017R+\u0010x\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b{\u0010)\u001a\u0004\by\u0010%\"\u0004\bz\u0010\'R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u0005R\u001c\u0010\u007f\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u001b\"\u0005\b\u0081\u0001\u0010\u001dR\u001d\u0010\u0082\u0001\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u001b\"\u0005\b\u0084\u0001\u0010\u001dR\'\u0010\u0085\u0001\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004@DX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010}\"\u0005\b\u0087\u0001\u0010\u0005R\u001f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u00106\"\u0005\b\u008a\u0001\u00108R3\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0007\u0010!\u001a\u00030\u008b\u00018V@VX\u0096\u008e\u0002\u00a2\u0006\u0017\n\u0005\b\u0091\u0001\u0010)\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R/\u0010\u0092\u0001\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u0095\u0001\u0010)\u001a\u0005\b\u0093\u0001\u0010%\"\u0005\b\u0094\u0001\u0010\'R3\u0010\u0097\u0001\u001a\u00030\u0096\u00012\u0007\u0010!\u001a\u00030\u0096\u00018V@VX\u0096\u008e\u0002\u00a2\u0006\u0017\n\u0005\b\u009c\u0001\u0010)\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R3\u0010\u009e\u0001\u001a\u00030\u009d\u00012\u0007\u0010!\u001a\u00030\u009d\u00018V@VX\u0096\u008e\u0002\u00a2\u0006\u0017\n\u0005\b\u00a3\u0001\u0010)\u001a\u0006\b\u009f\u0001\u0010\u00a0\u0001\"\u0006\b\u00a1\u0001\u0010\u00a2\u0001R3\u0010\u00a4\u0001\u001a\u00030\u008b\u00012\u0007\u0010!\u001a\u00030\u008b\u00018V@VX\u0096\u008e\u0002\u00a2\u0006\u0017\n\u0005\b\u00a7\u0001\u0010)\u001a\u0006\b\u00a5\u0001\u0010\u008e\u0001\"\u0006\b\u00a6\u0001\u0010\u0090\u0001R&\u0010\u00a8\u0001\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u0000\u0012\u0002\b\u00030\u00a9\u00010gX\u0082\u0004\u00a2\u0006\u0002\n\u0000R?\u0010\u00aa\u0001\u001a\"\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00ac\u00010;0\u00ab\u0001j\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00ac\u00010;`\u00ad\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ae\u0001\u0010\u00af\u0001\"\u0006\b\u00b0\u0001\u0010\u00b1\u0001R#\u0010\u00b3\u0001\u001a\u00030\u00b2\u00012\u0007\u0010!\u001a\u00030\u00b2\u0001@BX\u0086\u000e\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00b4\u0001\u0010\u00b5\u0001R/\u0010\u00b6\u0001\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u00b9\u0001\u0010)\u001a\u0005\b\u00b7\u0001\u0010%\"\u0005\b\u00b8\u0001\u0010\'R(\u0010\u00bb\u0001\u001a\u00020\u00192\u0007\u0010\u00ba\u0001\u001a\u00020\u0019@VX\u0096\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bc\u0001\u0010\u001b\"\u0005\b\u00bd\u0001\u0010\u001dR\u001d\u0010\u00be\u0001\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bf\u0001\u0010\u001b\"\u0005\b\u00c0\u0001\u0010\u001dR/\u0010\u00c1\u0001\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8V@VX\u0096\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u00c4\u0001\u0010)\u001a\u0005\b\u00c2\u0001\u0010%\"\u0005\b\u00c3\u0001\u0010\'\u00a8\u0006\u00fa\u0001"}, d2 = {"Lgraphics/scenery/Node;", "Lgraphics/scenery/Renderable;", "Ljava/io/Serializable;", "name", "", "(Ljava/lang/String;)V", "boundingBox", "Lgraphics/scenery/Node$OrientedBoundingBox;", "getBoundingBox", "()Lgraphics/scenery/Node$OrientedBoundingBox;", "setBoundingBox", "(Lgraphics/scenery/Node$OrientedBoundingBox;)V", "children", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getChildren", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "setChildren", "(Ljava/util/concurrent/CopyOnWriteArrayList;)V", "createdAt", "", "getCreatedAt", "()J", "setCreatedAt", "(J)V", "dirty", "", "getDirty", "()Z", "setDirty", "(Z)V", "discoveryBarrier", "getDiscoveryBarrier", "setDiscoveryBarrier", "<set-?>", "Lcleargl/GLMatrix;", "imodel", "getImodel", "()Lcleargl/GLMatrix;", "setImodel", "(Lcleargl/GLMatrix;)V", "imodel$delegate", "Lkotlin/properties/ReadWriteProperty;", "imodelView", "getImodelView", "setImodelView", "imodelView$delegate", "initialized", "getInitialized", "setInitialized", "instanceMaster", "getInstanceMaster", "setInstanceMaster", "instanceOf", "getInstanceOf", "()Lgraphics/scenery/Node;", "setInstanceOf", "(Lgraphics/scenery/Node;)V", "instancedProperties", "Ljava/util/LinkedHashMap;", "Lkotlin/Function0;", "", "getInstancedProperties", "()Ljava/util/LinkedHashMap;", "setInstancedProperties", "(Ljava/util/LinkedHashMap;)V", "instances", "getInstances", "iprojection", "getIprojection", "setIprojection", "iprojection$delegate", "isBillboard", "setBillboard", "iview", "getIview", "setIview", "iview$delegate", "iworld", "getIworld", "setIworld", "iworld$delegate", "linkedNodes", "getLinkedNodes", "setLinkedNodes", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "setLock", "(Ljava/util/concurrent/locks/ReentrantLock;)V", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "material", "Lgraphics/scenery/Material;", "getMaterial", "()Lgraphics/scenery/Material;", "setMaterial", "(Lgraphics/scenery/Material;)V", "metadata", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getMetadata", "()Ljava/util/HashMap;", "setMetadata", "(Ljava/util/HashMap;)V", "model", "getModel", "setModel", "model$delegate", "modelView", "getModelView", "setModelView", "modelView$delegate", "modifiedAt", "getModifiedAt", "setModifiedAt", "mvp", "getMvp", "setMvp", "mvp$delegate", "getName", "()Ljava/lang/String;", "setName", "needsUpdate", "getNeedsUpdate", "setNeedsUpdate", "needsUpdateWorld", "getNeedsUpdateWorld", "setNeedsUpdateWorld", "nodeType", "getNodeType", "setNodeType", "parent", "getParent", "setParent", "Lcleargl/GLVector;", "position", "getPosition", "()Lcleargl/GLVector;", "setPosition", "(Lcleargl/GLVector;)V", "position$delegate", "projection", "getProjection", "setProjection", "projection$delegate", "", "renderScale", "getRenderScale", "()F", "setRenderScale", "(F)V", "renderScale$delegate", "Lcom/jogamp/opengl/math/Quaternion;", "rotation", "getRotation", "()Lcom/jogamp/opengl/math/Quaternion;", "setRotation", "(Lcom/jogamp/opengl/math/Quaternion;)V", "rotation$delegate", "scale", "getScale", "setScale", "scale$delegate", "shaderPropertyFieldCache", "Lkotlin/reflect/KProperty1;", "update", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getUpdate", "()Ljava/util/ArrayList;", "setUpdate", "(Ljava/util/ArrayList;)V", "Ljava/util/UUID;", "uuid", "getUuid", "()Ljava/util/UUID;", "view", "getView", "setView", "view$delegate", "v", "visible", "getVisible", "setVisible", "wantsComposeModel", "getWantsComposeModel", "setWantsComposeModel", "world", "getWorld", "setWorld", "world$delegate", "addChild", "child", "centerOn", "composeModel", "draw", "expand", "lhs", "rhs", "fitInto", "sideLength", "scaleUp", "generateBoundingBox", "getMaximumBoundingBox", "getScene", "Lgraphics/scenery/Scene;", "getShaderProperty", "init", "intersectAABB", "Lkotlin/Pair;", "origin", "dir", "intersects", "other", "preDraw", "preUpdate", "renderer", "Lgraphics/scenery/backends/Renderer;", "hub", "Lgraphics/scenery/Hub;", "preUpdate$scenery", "propertyChanged", "R", "property", "Lkotlin/reflect/KProperty;", "old", "new", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "putAbove", "removeChild", "runRecursive", "func", "Lkotlin/Function1;", "Ljava/util/function/Consumer;", "updateWorld", "recursive", "force", "worldPosition", "isInside", "min", "max", "BoundingSphere", "NodeHelpers", "OrientedBoundingBox", "scenery"})
public class Node implements graphics.scenery.Renderable, java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;
    
    /**
     * Unique ID of the Node 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID uuid;
    
    /**
     * Hash map used for storing metadata for the Node. [Renderer] implementations use
     *     * it to e.g. store renderer-specific state. 
     */
    @org.jetbrains.annotations.NotNull()
    private transient java.util.HashMap<java.lang.String, java.lang.Object> metadata;
    
    /**
     * Material of the Node 
     */
    @org.jetbrains.annotations.NotNull()
    private transient graphics.scenery.Material material;
    
    /**
     * Initialisation flag. 
     */
    private boolean initialized;
    
    /**
     * Whether the Node is dirty and needs updating. 
     */
    private boolean dirty;
    
    /**
     * Flag to set whether the Node is visible or not, recursively affects children. 
     */
    private boolean visible;
    
    /**
     * Is this Node an instance of another Node? 
     */
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Node instanceOf;
    
    /**
     * instanced properties 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, kotlin.jvm.functions.Function0<java.lang.Object>> instancedProperties;
    
    /**
     * flag to set whether this node is an instance master 
     */
    private boolean instanceMaster;
    
    /**
     * The Node's lock. 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.locks.ReentrantLock lock;
    
    /**
     * bounding box 
     */
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Node.OrientedBoundingBox boundingBox;
    
    /**
     * Name of the Node's type 
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nodeType;
    
    /**
     * Node update routine, called before updateWorld 
     */
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<kotlin.jvm.functions.Function0<kotlin.Unit>> update;
    
    /**
     * World transform matrix. Will create inverse [iworld] upon modification. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty world$delegate = null;
    
    /**
     * Inverse [world] transform matrix. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty iworld$delegate = null;
    
    /**
     * Model transform matrix. Will create inverse [imodel] upon modification. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty model$delegate = null;
    
    /**
     * Inverse [world] transform matrix. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty imodel$delegate = null;
    
    /**
     * View matrix. Will create inverse [iview] upon modification. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty view$delegate = null;
    
    /**
     * Inverse [view] matrix. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty iview$delegate = null;
    
    /**
     * Projection matrix. Will create inverse [iprojection] upon modification. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty projection$delegate = null;
    
    /**
     * Inverse [projection] transform matrix. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty iprojection$delegate = null;
    
    /**
     * ModelView matrix. Will create inverse [imodelView] upon modification. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty modelView$delegate = null;
    
    /**
     * Inverse [modelView] transform matrix. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty imodelView$delegate = null;
    
    /**
     * ModelViewProjection matrix. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty mvp$delegate = null;
    
    /**
     * World position of the Node. Setting will trigger [world] update. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty position$delegate = null;
    
    /**
     * x/y/z scale of the Node. Setting will trigger [world] update. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty scale$delegate = null;
    
    /**
     * Rendering scale, e.g. coming from physical units of the object. Setting will trigger [world] update. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty renderScale$delegate = null;
    
    /**
     * Rotation of the Node. Setting will trigger [world] update. 
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty rotation$delegate = null;
    
    /**
     * Children of the Node. 
     */
    @org.jetbrains.annotations.NotNull()
    private transient java.util.concurrent.CopyOnWriteArrayList<graphics.scenery.Node> children;
    
    /**
     * Other nodes that have linked transforms. 
     */
    @org.jetbrains.annotations.NotNull()
    private transient java.util.concurrent.CopyOnWriteArrayList<graphics.scenery.Node> linkedNodes;
    
    /**
     * Parent node of this node. 
     */
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Node parent;
    
    /**
     * Flag to store whether the node is a billboard and will always face the camera. 
     */
    private boolean isBillboard;
    
    /**
     * Creation timestamp of the node. 
     */
    private long createdAt;
    
    /**
     * Modification timestamp of the node. 
     */
    private long modifiedAt;
    
    /**
     * Stores whether the [model] matrix needs an update. 
     */
    private boolean wantsComposeModel;
    
    /**
     * Stores whether the [model] matrix needs an update. 
     */
    private boolean needsUpdate;
    
    /**
     * Stores whether the [world] matrix needs an update. 
     */
    private boolean needsUpdateWorld;
    private boolean discoveryBarrier;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.CopyOnWriteArrayList<graphics.scenery.Node> instances = null;
    private final java.util.HashMap<java.lang.String, kotlin.reflect.KProperty1<graphics.scenery.Node, ?>> shaderPropertyFieldCache = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    public static final graphics.scenery.Node.NodeHelpers NodeHelpers = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getUuid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.Object> getMetadata() {
        return null;
    }
    
    public final void setMetadata(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public final graphics.scenery.Material getMaterial() {
        return null;
    }
    
    @java.lang.Override()
    public final void setMaterial(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Material p0) {
    }
    
    @java.lang.Override()
    public boolean getInitialized() {
        return false;
    }
    
    @java.lang.Override()
    public void setInitialized(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getDirty() {
        return false;
    }
    
    @java.lang.Override()
    public void setDirty(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean getVisible() {
        return false;
    }
    
    @java.lang.Override()
    public void setVisible(boolean v) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.Node getInstanceOf() {
        return null;
    }
    
    public final void setInstanceOf(@org.jetbrains.annotations.Nullable()
    graphics.scenery.Node p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, kotlin.jvm.functions.Function0<java.lang.Object>> getInstancedProperties() {
        return null;
    }
    
    public final void setInstancedProperties(@org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.String, kotlin.jvm.functions.Function0<java.lang.Object>> p0) {
    }
    
    public final boolean getInstanceMaster() {
        return false;
    }
    
    public final void setInstanceMaster(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.concurrent.locks.ReentrantLock getLock() {
        return null;
    }
    
    @java.lang.Override()
    public void setLock(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.locks.ReentrantLock p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.Node.OrientedBoundingBox getBoundingBox() {
        return null;
    }
    
    public final void setBoundingBox(@org.jetbrains.annotations.Nullable()
    graphics.scenery.Node.OrientedBoundingBox p0) {
    }
    
    /**
     * * Initialisation function for the Node.
     *     *
     *     * @return True of false whether initialisation was successful.
     */
    @java.lang.Override()
    public boolean init() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNodeType() {
        return null;
    }
    
    protected final void setNodeType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<kotlin.jvm.functions.Function0<kotlin.Unit>> getUpdate() {
        return null;
    }
    
    public final void setUpdate(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<kotlin.jvm.functions.Function0<kotlin.Unit>> p0) {
    }
    
    /**
     * World transform matrix. Will create inverse [iworld] upon modification. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getWorld() {
        return null;
    }
    
    /**
     * World transform matrix. Will create inverse [iworld] upon modification. 
     */
    @java.lang.Override()
    public void setWorld(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0) {
    }
    
    /**
     * Inverse [world] transform matrix. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getIworld() {
        return null;
    }
    
    /**
     * Inverse [world] transform matrix. 
     */
    @java.lang.Override()
    public void setIworld(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0) {
    }
    
    /**
     * Model transform matrix. Will create inverse [imodel] upon modification. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getModel() {
        return null;
    }
    
    /**
     * Model transform matrix. Will create inverse [imodel] upon modification. 
     */
    @java.lang.Override()
    public void setModel(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0) {
    }
    
    /**
     * Inverse [world] transform matrix. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getImodel() {
        return null;
    }
    
    /**
     * Inverse [world] transform matrix. 
     */
    @java.lang.Override()
    public void setImodel(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0) {
    }
    
    /**
     * View matrix. Will create inverse [iview] upon modification. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getView() {
        return null;
    }
    
    /**
     * View matrix. Will create inverse [iview] upon modification. 
     */
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0) {
    }
    
    /**
     * Inverse [view] matrix. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getIview() {
        return null;
    }
    
    /**
     * Inverse [view] matrix. 
     */
    @java.lang.Override()
    public void setIview(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0) {
    }
    
    /**
     * Projection matrix. Will create inverse [iprojection] upon modification. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getProjection() {
        return null;
    }
    
    /**
     * Projection matrix. Will create inverse [iprojection] upon modification. 
     */
    @java.lang.Override()
    public void setProjection(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0) {
    }
    
    /**
     * Inverse [projection] transform matrix. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getIprojection() {
        return null;
    }
    
    /**
     * Inverse [projection] transform matrix. 
     */
    @java.lang.Override()
    public void setIprojection(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0) {
    }
    
    /**
     * ModelView matrix. Will create inverse [imodelView] upon modification. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getModelView() {
        return null;
    }
    
    /**
     * ModelView matrix. Will create inverse [imodelView] upon modification. 
     */
    @java.lang.Override()
    public void setModelView(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0) {
    }
    
    /**
     * Inverse [modelView] transform matrix. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getImodelView() {
        return null;
    }
    
    /**
     * Inverse [modelView] transform matrix. 
     */
    @java.lang.Override()
    public void setImodelView(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0) {
    }
    
    /**
     * ModelViewProjection matrix. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLMatrix getMvp() {
        return null;
    }
    
    /**
     * ModelViewProjection matrix. 
     */
    @java.lang.Override()
    public void setMvp(@org.jetbrains.annotations.NotNull()
    cleargl.GLMatrix p0) {
    }
    
    /**
     * World position of the Node. Setting will trigger [world] update. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLVector getPosition() {
        return null;
    }
    
    /**
     * World position of the Node. Setting will trigger [world] update. 
     */
    @java.lang.Override()
    public void setPosition(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector p0) {
    }
    
    /**
     * x/y/z scale of the Node. Setting will trigger [world] update. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.GLVector getScale() {
        return null;
    }
    
    /**
     * x/y/z scale of the Node. Setting will trigger [world] update. 
     */
    @java.lang.Override()
    public void setScale(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector p0) {
    }
    
    /**
     * Rendering scale, e.g. coming from physical units of the object. Setting will trigger [world] update. 
     */
    @java.lang.Override()
    public float getRenderScale() {
        return 0.0F;
    }
    
    /**
     * Rendering scale, e.g. coming from physical units of the object. Setting will trigger [world] update. 
     */
    @java.lang.Override()
    public void setRenderScale(float p0) {
    }
    
    /**
     * Rotation of the Node. Setting will trigger [world] update. 
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jogamp.opengl.math.Quaternion getRotation() {
        return null;
    }
    
    /**
     * Rotation of the Node. Setting will trigger [world] update. 
     */
    @java.lang.Override()
    public void setRotation(@org.jetbrains.annotations.NotNull()
    com.jogamp.opengl.math.Quaternion p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CopyOnWriteArrayList<graphics.scenery.Node> getChildren() {
        return null;
    }
    
    public final void setChildren(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.CopyOnWriteArrayList<graphics.scenery.Node> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CopyOnWriteArrayList<graphics.scenery.Node> getLinkedNodes() {
        return null;
    }
    
    public final void setLinkedNodes(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.CopyOnWriteArrayList<graphics.scenery.Node> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.Node getParent() {
        return null;
    }
    
    public final void setParent(@org.jetbrains.annotations.Nullable()
    graphics.scenery.Node p0) {
    }
    
    @java.lang.Override()
    public boolean isBillboard() {
        return false;
    }
    
    @java.lang.Override()
    public void setBillboard(boolean p0) {
    }
    
    public final long getCreatedAt() {
        return 0L;
    }
    
    public final void setCreatedAt(long p0) {
    }
    
    public final long getModifiedAt() {
        return 0L;
    }
    
    public final void setModifiedAt(long p0) {
    }
    
    public final boolean getWantsComposeModel() {
        return false;
    }
    
    public final void setWantsComposeModel(boolean p0) {
    }
    
    public final boolean getNeedsUpdate() {
        return false;
    }
    
    public final void setNeedsUpdate(boolean p0) {
    }
    
    public final boolean getNeedsUpdateWorld() {
        return false;
    }
    
    public final void setNeedsUpdateWorld(boolean p0) {
    }
    
    public final boolean getDiscoveryBarrier() {
        return false;
    }
    
    public final void setDiscoveryBarrier(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CopyOnWriteArrayList<graphics.scenery.Node> getInstances() {
        return null;
    }
    
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    protected final <R extends java.lang.Object>void propertyChanged(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property, R old, R p2_54480) {
    }
    
    /**
     * * Attaches a child node to this node.
     *     *
     *     * @param[child] The child to attach to this node.
     */
    public final void addChild(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Node child) {
    }
    
    /**
     * * Removes a given node from the set of children of this node.
     *     *
     *     * @param[child] The child node to remove.
     */
    public final boolean removeChild(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Node child) {
        return false;
    }
    
    /**
     * * Removes a given node from the set of children of this node.
     *     * If possible, use [removeChild] instead.
     *     *
     *     * @param[name] The name of the child node to remove.
     */
    public final boolean removeChild(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    /**
     * * Routine to call if the node has special requirements for drawing.
     */
    public void draw() {
    }
    
    public void preUpdate$scenery(@org.jetbrains.annotations.NotNull()
    graphics.scenery.backends.Renderer renderer, @org.jetbrains.annotations.NotNull()
    graphics.scenery.Hub hub) {
    }
    
    /**
     * * PreDraw function, to be called before the actual rendering, useful for
     *     * per-timestep preparation.
     */
    public void preDraw() {
    }
    
    /**
     * * Update the the [world] matrix of the [Node].
     *     *
     *     * This method will update the [model] and [world] matrices of the node,
     *     * if [needsUpdate] is true, or [force] is true. If [recursive] is true,
     *     * this method will also recurse into the [children] and [linkedNodes] of
     *     * the node and update these as well.
     *     *
     *     * @param[recursive] Whether the [children] should be recursed into.
     *     * @param[force] Force update irrespective of [needsUpdate] state.
     */
    public final synchronized void updateWorld(boolean recursive, boolean force) {
    }
    
    /**
     * * This method composes the [model] matrices of the node from its
     *     * [position], [scale] and [rotation].
     */
    public final void composeModel() {
    }
    
    /**
     * * Generates an [OrientedBoundingBox] for this [Node]. This will take
     *     * geometry information into consideration if this Node implements [HasGeometry].
     *     * In case a bounding box cannot be determined, the function will return null.
     */
    @org.jetbrains.annotations.Nullable()
    public graphics.scenery.Node.OrientedBoundingBox generateBoundingBox() {
        return null;
    }
    
    /**
     * * Returns the [ShaderProperty] given by [name], if it exists and is declared by
     *     * this class or a subclass inheriting from [Node]. Returns null if the [name] can
     *     * neither be found as a property, or as member of the shaderProperties HashMap the Node
     *     * might declare.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getShaderProperty(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    /**
     * * Returns the [Scene] this Node is ultimately attached to.
     *     * Will return null in case the Node is not attached to a [Scene] yet.
     */
    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.Scene getScene() {
        return null;
    }
    
    /**
     * * Centers the [Node] on a given position.
     *     *
     *     * @param[position] - the position to center the [Node] on.
     *     * @return GLVector - the center offset calculcated for the [Node].
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector centerOn(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector position) {
        return null;
    }
    
    /**
     * * Taking this [Node]'s [boundingBox] into consideration, puts it above
     *     * the [position] entirely.
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector putAbove(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector position) {
        return null;
    }
    
    /**
     * * Fits the [Node] within a box of the given dimension.
     *     *
     *     * @param[sideLength] - The size of the box to fit the [Node] uniformly into.
     *     * @param[scaleUp] - Whether the model should only be scaled down, or also up.
     *     * @return GLVector - containing the applied scaling
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector fitInto(float sideLength, boolean scaleUp) {
        return null;
    }
    
    private final graphics.scenery.Node.OrientedBoundingBox expand(graphics.scenery.Node.OrientedBoundingBox lhs, graphics.scenery.Node.OrientedBoundingBox rhs) {
        return null;
    }
    
    /**
     * * Returns the maximum [OrientedBoundingBox] of this [Node] and all its children.
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Node.OrientedBoundingBox getMaximumBoundingBox() {
        return null;
    }
    
    /**
     * * Checks whether two node's bounding boxes do intersect using a simple bounding sphere test.
     */
    public final boolean intersects(@org.jetbrains.annotations.NotNull()
    graphics.scenery.Node other) {
        return false;
    }
    
    /**
     * * Returns the [Node]'s world position
     *     *
     *     * @returns The position in world space
     */
    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLVector worldPosition(@org.jetbrains.annotations.Nullable()
    cleargl.GLVector v) {
        return null;
    }
    
    /**
     * *  Runs an operation recursively on the node itself and all child nodes.
     *     *
     *     *  @param[func] A lambda accepting a [Node], representing this node and its potential children.
     */
    public final void runRecursive(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super graphics.scenery.Node, kotlin.Unit> func) {
    }
    
    /**
     * *  Runs an operation recursively on the node itself and all child nodes.
     *     *
     *     *  @param[func] A Java [Consumer] accepting a [Node], representing this node and its potential children.
     */
    public final void runRecursive(@org.jetbrains.annotations.NotNull()
    java.util.function.Consumer<graphics.scenery.Node> func) {
    }
    
    /**
     * * Performs a intersection test with an axis-aligned bounding box of this [Node], where
     *     * the test ray originates at [origin] and points into [dir].
     *     *
     *     * Returns a Pair of Boolean and Float, indicating whether an intersection is possible,
     *     * and at which distance.
     *     *
     *     * Code adapted from zachamarz, http://gamedev.stackexchange.com/a/18459
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<java.lang.Boolean, java.lang.Float> intersectAABB(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector origin, @org.jetbrains.annotations.NotNull()
    cleargl.GLVector dir) {
        return null;
    }
    
    private final boolean isInside(@org.jetbrains.annotations.NotNull()
    cleargl.GLVector $receiver, cleargl.GLVector min, cleargl.GLVector max) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getName() {
        return null;
    }
    
    public void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Node(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super();
    }
    
    public Node() {
        super();
    }
    
    /**
     * * Bounding sphere class, a bounding sphere is defined by an origin and a radius,
     *     * to enclose all of the Node's geometry.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lgraphics/scenery/Node$BoundingSphere;", "", "origin", "Lcleargl/GLVector;", "radius", "", "(Lcleargl/GLVector;F)V", "getOrigin", "()Lcleargl/GLVector;", "getRadius", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scenery"})
    public static final class BoundingSphere {
        @org.jetbrains.annotations.NotNull()
        private final cleargl.GLVector origin = null;
        private final float radius = 0.0F;
        
        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLVector getOrigin() {
            return null;
        }
        
        public final float getRadius() {
            return 0.0F;
        }
        
        public BoundingSphere(@org.jetbrains.annotations.NotNull()
        cleargl.GLVector origin, float radius) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLVector component1() {
            return null;
        }
        
        public final float component2() {
            return 0.0F;
        }
        
        /**
         * * Bounding sphere class, a bounding sphere is defined by an origin and a radius,
         *     * to enclose all of the Node's geometry.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Node.BoundingSphere copy(@org.jetbrains.annotations.NotNull()
        cleargl.GLVector origin, float radius) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    /**
     * * Oriented bounding box class to perform easy intersection tests.
     *     *
     *     * @property[min] The x/y/z minima for the bounding box.
     *     * @property[max] The x/y/z maxima for the bounding box.
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tB\u000f\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fB\u0015\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0000R\u00020\u001cR\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lgraphics/scenery/Node$OrientedBoundingBox;", "", "xMin", "", "yMin", "zMin", "xMax", "yMax", "zMax", "(Lgraphics/scenery/Node;FFFFFF)V", "boundingBox", "", "(Lgraphics/scenery/Node;[F)V", "min", "Lcleargl/GLVector;", "max", "(Lgraphics/scenery/Node;Lcleargl/GLVector;Lcleargl/GLVector;)V", "getMax", "()Lcleargl/GLVector;", "getMin", "equals", "", "other", "getBoundingSphere", "Lgraphics/scenery/Node$BoundingSphere;", "hashCode", "", "intersects", "Lgraphics/scenery/Node;", "scenery"})
    public final class OrientedBoundingBox {
        @org.jetbrains.annotations.NotNull()
        private final cleargl.GLVector min = null;
        @org.jetbrains.annotations.NotNull()
        private final cleargl.GLVector max = null;
        
        /**
         * * Returns the maximum bounding sphere of this bounding box.
         */
        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.Node.BoundingSphere getBoundingSphere() {
            return null;
        }
        
        /**
         * * Checks this [OrientedBoundingBox] for intersection with [other], and returns
         *         * true if the bounding boxes do intersect.
         */
        public final boolean intersects(@org.jetbrains.annotations.NotNull()
        graphics.scenery.Node.OrientedBoundingBox other) {
            return false;
        }
        
        /**
         * * Returns the hash code of this [OrientedBoundingBox], taking [min] and [max] into consideration.
         */
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        /**
         * * Compares this bounding box to [other], returning true if they are equal.
         */
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLVector getMin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final cleargl.GLVector getMax() {
            return null;
        }
        
        public OrientedBoundingBox(@org.jetbrains.annotations.NotNull()
        cleargl.GLVector min, @org.jetbrains.annotations.NotNull()
        cleargl.GLVector max) {
            super();
        }
        
        /**
         * * Alternative [OrientedBoundingBox] constructor taking the [min] and [max] as a series of floats.
         */
        public OrientedBoundingBox(float xMin, float yMin, float zMin, float xMax, float yMax, float zMax) {
            super();
        }
        
        /**
         * * Alternative [OrientedBoundingBox] constructor, taking a 6-element float array for [min] and [max].
         */
        public OrientedBoundingBox(@org.jetbrains.annotations.NotNull()
        float[] boundingBox) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t\u00a8\u0006\u000b"}, d2 = {"Lgraphics/scenery/Node$NodeHelpers;", "", "()V", "discover", "Ljava/util/ArrayList;", "Lgraphics/scenery/Node;", "Lkotlin/collections/ArrayList;", "origin", "func", "Lkotlin/Function1;", "", "scenery"})
    public static final class NodeHelpers {
        
        /**
         * * Depth-first search for elements in a Scene.
         *         *
         *         * @param[origin] The [Node] to start the search at.
         *         * @param[func] A lambda taking a [Node] and returning a Boolean for matching.
         *         * @return A list of [Node]s that match [func].
         */
        @org.jetbrains.annotations.NotNull()
        @kotlin.Suppress(names = {"unused"})
        public final java.util.ArrayList<graphics.scenery.Node> discover(@org.jetbrains.annotations.NotNull()
        graphics.scenery.Node origin, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super graphics.scenery.Node, java.lang.Boolean> func) {
            return null;
        }
        
        private NodeHelpers() {
            super();
        }
    }
}