package graphics.scenery.backends.opengl;

/**
 * * Deferred Lighting Renderer for scenery
 * *
 * * This is the main class of scenery's Deferred Lighting Renderer. Currently,
 * * a rendering strategy using a 32bit position, 16bit normal, 32bit RGBA diffuse/albedo,
 * * and 24bit depth buffer is employed. The renderer supports HDR rendering and does that
 * * by default. By deactivating the `hdr.Active` [Settings], HDR can be programmatically
 * * deactivated. The renderer also supports drawing to HMDs via OpenVR. If this is intended,
 * * make sure the `vr.Active` [Settings] is set to `true`, and that the `Hub` has a HMD
 * * instance attached.
 * *
 * * @param[hub] Hub instance to use and attach to.
 * * @param[applicationName] The name of this application.
 * * @param[scene] The [Scene] instance to initialize first.
 * * @param[width] Horizontal window size.
 * * @param[height] Vertical window size.
 * * @param[embedIn] An optional [SceneryPanel] in which to embed the renderer instance.
 * * @param[renderConfigFile] The file to create a [RenderConfigReader.RenderConfig] from.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ee\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u0090\u00022\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u0090\u0002\u0091\u0002\u0092\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0010JX\u0010\u00ad\u0001\u001a\u00020>2\n\u0010\u00ae\u0001\u001a\u0005\u0018\u00010\u00af\u00012\n\u0010\u00b0\u0001\u001a\u0005\u0018\u00010\u00af\u00012\b\u0010\u00b1\u0001\u001a\u00030\u00b2\u00012\b\u0010\u00b3\u0001\u001a\u00030\u00b2\u00012\t\b\u0002\u0010\u00b4\u0001\u001a\u00020/2\t\b\u0002\u0010\u00b5\u0001\u001a\u00020/2\u000b\b\u0002\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u0007H\u0002J\t\u0010\u00b7\u0001\u001a\u00020>H\u0016J\u0007\u0010\u00b8\u0001\u001a\u00020>J\u0007\u0010\u00b9\u0001\u001a\u00020>J\u0012\u0010\u00ba\u0001\u001a\u00020>2\u0007\u0010\u00bb\u0001\u001a\u00020iH\u0004J\u0012\u0010\u00bc\u0001\u001a\u00020>2\u0007\u0010\u00bd\u0001\u001a\u00020UH\u0016J\u0012\u0010\u00be\u0001\u001a\u00020>2\u0007\u0010\u00bd\u0001\u001a\u00020UH\u0016J.\u0010\u00bf\u0001\u001a\u00020>2\u0007\u0010\u00bb\u0001\u001a\u00020i2\t\b\u0002\u0010\u00c0\u0001\u001a\u00020\u000b2\u000b\b\u0002\u0010\u00c1\u0001\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0003\u0010\u00c2\u0001J\u001d\u0010\u00c3\u0001\u001a\u00020>2\u0007\u0010\u00bb\u0001\u001a\u00020i2\t\b\u0002\u0010\u00c0\u0001\u001a\u00020!H\u0004J\u0012\u0010\u00c4\u0001\u001a\u00020\u00172\u0007\u0010\u00c5\u0001\u001a\u00020\u0007H\u0002J\n\u0010\u00c6\u0001\u001a\u00030\u00c7\u0001H\u0016J\u0011\u0010\u00c8\u0001\u001a\u00030\u00c9\u00012\u0007\u0010\u00bb\u0001\u001a\u00020iJ\u0007\u0010\u00ca\u0001\u001a\u00020>J\u0007\u0010\u00cb\u0001\u001a\u00020>J\u0012\u0010\u00cc\u0001\u001a\u00020>2\u0007\u0010\u00bd\u0001\u001a\u00020UH\u0016J\u0010\u0010\u00cd\u0001\u001a\u00020/2\u0007\u0010\u00bb\u0001\u001a\u00020iJ\t\u0010\u00ce\u0001\u001a\u00020>H\u0016J\u001d\u0010\u00cf\u0001\u001a\u00030\u00c9\u00012\u0007\u0010\u00bb\u0001\u001a\u00020i2\b\u0010\u00d0\u0001\u001a\u00030\u00c9\u0001H\u0002J\u0012\u0010\u00d1\u0001\u001a\u00020>2\u0007\u0010\u00d2\u0001\u001a\u00020iH\u0002J\t\u0010\u00d3\u0001\u001a\u00020>H\u0002JA\u0010\u00d4\u0001\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u0001j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0084\u0001`\u00d5\u00012\u0006\u0010\u007f\u001a\u00020~2\u0007\u0010\u00d6\u0001\u001a\u00020\u000b2\u0007\u0010\u00d7\u0001\u001a\u00020\u000bJ\u0016\u0010\u00d8\u0001\u001a\u0005\u0018\u00010\u00d9\u00012\b\u0010\u00da\u0001\u001a\u00030\u00db\u0001H\u0004J\u0006\u0010|\u001a\u00020>J\t\u0010\u00dc\u0001\u001a\u00020>H\u0016J\u0011\u0010\u00dd\u0001\u001a\u00020>2\b\u0010\u00de\u0001\u001a\u00030\u00d9\u0001J6\u0010\u00df\u0001\u001a\u00020>2\u0007\u0010\u00bd\u0001\u001a\u00020U2\u0007\u0010\u00e0\u0001\u001a\u00020\u000b2\u0007\u0010\u00e1\u0001\u001a\u00020\u000b2\u0007\u0010\u00e2\u0001\u001a\u00020\u000b2\u0007\u0010\u00e3\u0001\u001a\u00020\u000bH\u0016J\u001b\u0010\u00df\u0001\u001a\u00020>2\u0007\u0010\u00e4\u0001\u001a\u00020\u000b2\u0007\u0010\u00e5\u0001\u001a\u00020\u000bH\u0016J\u001b\u0010\u00e6\u0001\u001a\u00020>2\u0007\u0010\u00e7\u0001\u001a\u00020\u00072\u0007\u0010\u00e8\u0001\u001a\u00020/H\u0016J\u0012\u0010\u00e9\u0001\u001a\u00020>2\u0007\u0010\u00ea\u0001\u001a\u00020\u001bH\u0016J\u0010\u0010\u00eb\u0001\u001a\u00020>2\u0007\u0010\u00bb\u0001\u001a\u00020iJ\u0010\u0010\u00ec\u0001\u001a\u00020>2\u0007\u0010\u00bb\u0001\u001a\u00020iJ\u0013\u0010\u00ed\u0001\u001a\u00020>2\b\u0010\u00ee\u0001\u001a\u00030\u00ef\u0001H\u0016J\u001c\u0010\u00f0\u0001\u001a\u00020>2\u0007\u0010\u00d2\u0001\u001a\u00020i2\b\u0010\u00de\u0001\u001a\u00030\u00f1\u0001H\u0002J\u0010\u0010\u00f2\u0001\u001a\u00020>2\u0007\u0010\u00bb\u0001\u001a\u00020iJ\u0010\u0010\u00f3\u0001\u001a\u00020>2\u0007\u0010\u00bb\u0001\u001a\u00020iJ\u0012\u0010\u00f4\u0001\u001a\u00020\u00072\u0007\u0010\u00f5\u0001\u001a\u00020\u0007H\u0002J\u001a\u0010\u00f6\u0001\u001a\u00020\u000b2\b\u0010\u00b0\u0001\u001a\u00030\u0084\u00012\u0007\u0010\u00f5\u0001\u001a\u00020\u0007J\u0007\u0010\u00f7\u0001\u001a\u00020>J\u0007\u0010\u00f8\u0001\u001a\u00020>J\u0007\u0010\u00f9\u0001\u001a\u00020>J\u0007\u0010\u00fa\u0001\u001a\u00020>J\t\u0010\u00fb\u0001\u001a\u00020/H\u0004J\u0010\u0010\u00fc\u0001\u001a\u00020>2\u0007\u0010\u00bb\u0001\u001a\u00020iJ\u001d\u0010\u00fd\u0001\u001a\u00030\u00c9\u00012\u0007\u0010\u00fe\u0001\u001a\u00020i2\b\u0010\u00ff\u0001\u001a\u00030\u00c9\u0001H\u0002J\u0018\u0010\u0080\u0002\u001a\u00020>2\r\u0010\u0081\u0002\u001a\b\u0012\u0004\u0012\u00020i06H\u0002J\u0010\u0010\u0082\u0002\u001a\u00020>2\u0007\u0010\u00bb\u0001\u001a\u00020iJ\u0010\u0010\u0083\u0002\u001a\u00020>2\u0007\u0010\u00bb\u0001\u001a\u00020iJ\u0010\u0010\u0084\u0002\u001a\u00020>2\u0007\u0010\u00bb\u0001\u001a\u00020iJ\r\u0010\u0085\u0002\u001a\u00020\u000b*\u00020iH\u0002J\u0010\u0010\u0086\u0002\u001a\u0005\u0018\u00010\u00c9\u0001*\u00020iH\u0002J\u000b\u0010\u0087\u0002\u001a\u00020\u000b*\u00020/J\u000e\u0010\u0088\u0002\u001a\u00020\u000b*\u00030\u0089\u0002H\u0002J\u000e\u0010\u0088\u0002\u001a\u00020\u000b*\u00030\u008a\u0002H\u0002J\u000e\u0010\u008b\u0002\u001a\u00020\u000b*\u00030\u008c\u0002H\u0002J\u000b\u0010\u008d\u0002\u001a\u00020\u000b*\u00020\u000bJ\u0011\u0010\u008e\u0002\u001a\u0005\u0018\u00010\u008f\u0002*\u00030\u008f\u0002H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u0016X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020/@TX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00105\u001a\b\u0012\u0004\u0012\u00020\u000706X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u00107\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020>0=X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010?\u001a\u00020!X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\u000bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u00109\"\u0004\bF\u0010;R\u000e\u0010G\u001a\u00020HX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010JX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020LX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Q\u001a\u00020/2\u0006\u0010.\u001a\u00020/@TX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u00102\"\u0004\bS\u00104R\u0010\u0010T\u001a\u0004\u0018\u00010UX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010V\u001a\u00020WX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u000e\u0010\\\u001a\u00020LX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010]\u001a\u00020^8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\ba\u0010b\u001a\u0004\b_\u0010`R\u001a\u0010c\u001a\u00020/X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u00102\"\u0004\be\u00104R\u000e\u0010f\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020i0hX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010l0kX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010mR\u0014\u0010n\u001a\u00020\u000bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u00109R\u000e\u0010p\u001a\u00020qX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010r\u001a\b\u0012\u0004\u0012\u00020i0kX\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010w\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001a\u0010x\u001a\u00020/X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u00102\"\u0004\bz\u00104R\u000e\u0010{\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020~X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u007f\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u0012\"\u0005\b\u0081\u0001\u0010\u0014R\u001d\u0010\u0082\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0084\u00010\u0083\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0085\u0001\u001a\u00070\u0086\u0001R\u00020\u0000X\u0084\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001e\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00020i0\u008e\u0001X\u0084\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u000f\u0010\u0091\u0001\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0092\u0001\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0094\u0001\u001a\u00030\u0095\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\'\u0010\u009a\u0001\u001a\u001a\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u009b\u0001\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u009c\u0001060\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u009d\u0001\u001a\u00020/X\u0096\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u00102\"\u0005\b\u009f\u0001\u00104R\u001c\u0010\u00a0\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u00a1\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u00a2\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u00a3\u00010hX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00a4\u0001\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u00a5\u0001\u001a\u0005\u0018\u00010\u00a6\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u00a7\u0001\u001a\u00030\u00a8\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a9\u0001\u0010\u00aa\u0001\"\u0006\b\u00ab\u0001\u0010\u00ac\u0001\u00a8\u0006\u0093\u0002"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLRenderer;", "Lgraphics/scenery/backends/Renderer;", "Lgraphics/scenery/Hubable;", "Lcleargl/ClearGLEventListener;", "hub", "Lgraphics/scenery/Hub;", "applicationName", "", "scene", "Lgraphics/scenery/Scene;", "width", "", "height", "embedIn", "Lgraphics/scenery/utils/SceneryPanel;", "renderConfigFile", "(Lgraphics/scenery/Hub;Ljava/lang/String;Lgraphics/scenery/Scene;IILgraphics/scenery/utils/SceneryPanel;Ljava/lang/String;)V", "getApplicationName", "()Ljava/lang/String;", "setApplicationName", "(Ljava/lang/String;)V", "buffers", "Ljava/util/HashMap;", "Lgraphics/scenery/backends/opengl/OpenGLRenderer$OpenGLBuffer;", "getBuffers", "()Ljava/util/HashMap;", "cglWindow", "Lcleargl/ClearGLWindow;", "getCglWindow", "()Lcleargl/ClearGLWindow;", "setCglWindow", "(Lcleargl/ClearGLWindow;)V", "currentTime", "", "drawable", "Lcom/jogamp/opengl/GLOffscreenAutoDrawable;", "getDrawable", "()Lcom/jogamp/opengl/GLOffscreenAutoDrawable;", "setDrawable", "(Lcom/jogamp/opengl/GLOffscreenAutoDrawable;)V", "getEmbedIn", "()Lgraphics/scenery/utils/SceneryPanel;", "setEmbedIn", "(Lgraphics/scenery/utils/SceneryPanel;)V", "encoder", "Lgraphics/scenery/utils/H264Encoder;", "<set-?>", "", "firstImageReady", "getFirstImageReady", "()Z", "setFirstImageReady", "(Z)V", "flow", "", "fps", "getFps", "()I", "setFps", "(I)V", "framebufferRecreateHook", "Lkotlin/Function0;", "", "frames", "getFrames", "()J", "setFrames", "(J)V", "framesPerSec", "getFramesPerSec", "setFramesPerSec", "gl", "Lcom/jogamp/opengl/GL4;", "gpuStats", "Lgraphics/scenery/utils/GPUStats;", "heartbeatTimer", "Ljava/util/Timer;", "getHub", "()Lgraphics/scenery/Hub;", "setHub", "(Lgraphics/scenery/Hub;)V", "initialized", "getInitialized", "setInitialized", "joglDrawable", "Lcom/jogamp/opengl/GLAutoDrawable;", "lastFrameTime", "", "getLastFrameTime", "()F", "setLastFrameTime", "(F)V", "lastResizeTimer", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "managesRenderLoop", "getManagesRenderLoop", "setManagesRenderLoop", "mustRecreateFramebuffers", "nodeStore", "Ljava/util/concurrent/ConcurrentHashMap;", "Lgraphics/scenery/Node;", "pboBuffers", "", "Ljava/nio/ByteBuffer;", "[Ljava/nio/ByteBuffer;", "pboCount", "getPboCount", "pbos", "", "previousSceneObjects", "getPreviousSceneObjects", "()[Lgraphics/scenery/Node;", "setPreviousSceneObjects", "([Lgraphics/scenery/Node;)V", "[Lgraphics/scenery/Node;", "pushMode", "getPushMode", "setPushMode", "readIndex", "recordMovie", "renderConfig", "Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;", "config", "getRenderConfigFile", "setRenderConfigFile", "renderpasses", "Ljava/util/LinkedHashMap;", "Lgraphics/scenery/backends/opengl/OpenGLRenderpass;", "resizeHandler", "Lgraphics/scenery/backends/opengl/OpenGLRenderer$ResizeHandler;", "getResizeHandler", "()Lgraphics/scenery/backends/opengl/OpenGLRenderer$ResizeHandler;", "getScene", "()Lgraphics/scenery/Scene;", "setScene", "(Lgraphics/scenery/Scene;)V", "sceneUBOs", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getSceneUBOs", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "screenshotFilename", "screenshotOverwriteExisting", "screenshotRequested", "settings", "Lgraphics/scenery/Settings;", "getSettings", "()Lgraphics/scenery/Settings;", "setSettings", "(Lgraphics/scenery/Settings;)V", "shaderPropertyCache", "Ljava/lang/Class;", "Ljava/lang/reflect/Field;", "shouldClose", "getShouldClose", "setShouldClose", "textureCache", "Lcleargl/GLTexture;", "uboCache", "Lgraphics/scenery/backends/opengl/OpenGLUBO;", "updateIndex", "updateLatch", "Ljava/util/concurrent/CountDownLatch;", "window", "Lgraphics/scenery/backends/SceneryWindow;", "getWindow", "()Lgraphics/scenery/backends/SceneryWindow;", "setWindow", "(Lgraphics/scenery/backends/SceneryWindow;)V", "blitFramebuffers", "source", "Lcleargl/GLFramebuffer;", "target", "sourceOffset", "Lgraphics/scenery/backends/opengl/OpenGLRenderpass$Rect2D;", "targetOffset", "colorOnly", "depthOnly", "sourceName", "close", "decreaseExposure", "decreaseGamma", "destroyNode", "node", "display", "pDrawable", "dispose", "drawNode", "offset", "count", "(Lgraphics/scenery/Node;ILjava/lang/Integer;)V", "drawNodeInstanced", "findBuffer", "name", "getClearGLWindow", "Lcleargl/ClearGLDisplayable;", "getOpenGLObjectStateFromNode", "Lgraphics/scenery/backends/opengl/OpenGLObjectState;", "increaseExposure", "increaseGamma", "init", "initializeNode", "initializeScene", "loadTexturesForNode", "s", "preDrawAndUpdateGeometryForNode", "n", "prepareDefaultTextures", "prepareRenderpasses", "Lkotlin/collections/LinkedHashMap;", "windowWidth", "windowHeight", "prepareShaderProgram", "Lgraphics/scenery/backends/opengl/OpenGLShaderProgram;", "shaders", "Lgraphics/scenery/backends/Shaders;", "render", "renderFullscreenQuad", "program", "reshape", "pX", "pY", "pWidth", "pHeight", "newWidth", "newHeight", "screenshot", "filename", "overwrite", "setClearGLWindow", "pClearGLWindow", "setIndicesAndCreateBufferForNode", "setNormalsAndCreateBufferForNode", "setRenderingQuality", "quality", "Lgraphics/scenery/backends/RenderConfigReader$RenderingQuality;", "setShaderPropertiesForNode", "Lcleargl/GLProgram;", "setTextureCoordsAndCreateBufferForNode", "setVerticesAndCreateBufferForNode", "textureTypeToArrayName", "type", "textureTypeToUnit", "toggleDebug", "toggleFullscreen", "toggleHDR", "toggleSSAO", "updateDefaultUBOs", "updateIndices", "updateInstanceBuffer", "parentNode", "state", "updateInstanceBuffers", "sceneObjects", "updateNormals", "updateTextureCoords", "updateVertices", "materialToMaterialType", "rendererMetadata", "toInt", "toOpenGL", "Lgraphics/scenery/Blending$BlendFactor;", "Lgraphics/scenery/Blending$BlendOp;", "toOpenGLType", "Lgraphics/scenery/GeometryType;", "toggle", "wantsVR", "Lgraphics/scenery/backends/Display;", "Companion", "OpenGLBuffer", "ResizeHandler", "scenery"})
public class OpenGLRenderer extends graphics.scenery.backends.Renderer implements graphics.scenery.Hubable, cleargl.ClearGLEventListener {

    public static final graphics.scenery.backends.opengl.OpenGLRenderer.Companion Companion = null;
    private static final long WINDOW_RESIZE_TIMEOUT = 200L;
    private static final int MATERIAL_HAS_DIFFUSE = 1;
    private static final int MATERIAL_HAS_AMBIENT = 2;
    private static final int MATERIAL_HAS_SPECULAR = 4;
    private static final int MATERIAL_HAS_NORMAL = 8;
    private static final int MATERIAL_HAS_ALPHAMASK = 16;
    /**
     * slf4j logger
     */
    private final kotlin.Lazy logger$delegate = null;
    private final int pboCount = 2;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLRenderer.OpenGLBuffer> buffers = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.CopyOnWriteArrayList<graphics.scenery.Node> sceneUBOs = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.opengl.OpenGLRenderer.ResizeHandler resizeHandler = null;
    /**
     * [GL4] instance handed over, coming from [ClearGLDefaultEventListener]
     */
    private com.jogamp.opengl.GL4 gl;
    /**
     * should the window close on next looping?
     */
    private boolean shouldClose;
    /**
     * the scenery window
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.SceneryWindow window;
    /**
     * separately stored ClearGLWindow
     */
    @org.jetbrains.annotations.Nullable()
    private cleargl.ClearGLWindow cglWindow;
    /**
     * drawble for offscreen rendering
     */
    @org.jetbrains.annotations.Nullable()
    private com.jogamp.opengl.GLOffscreenAutoDrawable drawable;
    /**
     * Whether the renderer manages its own event loop, which is the case for this one.
     */
    private boolean managesRenderLoop;
    /**
     * The currently active scene
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Scene scene;
    /**
     * Cache of [Node]s, needed e.g. for fullscreen quad rendering
     */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.Node> nodeStore;
    /**
     * [Settings] for the renderer
     */
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Settings settings;
    /**
     * The hub used for communication between the components
     */
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Hub hub;
    private java.util.HashMap<java.lang.String, cleargl.GLTexture> textureCache;
    private java.util.HashMap<java.lang.Class<?>, java.util.List<java.lang.reflect.Field>> shaderPropertyCache;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLUBO> uboCache;
    private com.jogamp.opengl.GLAutoDrawable joglDrawable;
    private boolean screenshotRequested;
    private boolean screenshotOverwriteExisting;
    private java.lang.String screenshotFilename;
    private graphics.scenery.utils.H264Encoder encoder;
    private boolean recordMovie;
    /**
     * * Activate or deactivate push-based rendering mode (render only on scene changes
     * * or input events). Push mode is activated if [pushMode] is true.
     */
    private boolean pushMode;
    private java.util.concurrent.CountDownLatch updateLatch;
    private java.util.Timer lastResizeTimer;
    private volatile boolean mustRecreateFramebuffers;
    private kotlin.jvm.functions.Function0<kotlin.Unit> framebufferRecreateHook;
    private graphics.scenery.utils.GPUStats gpuStats;
    /**
     * heartbeat timer
     */
    private java.util.Timer heartbeatTimer;
    private float lastFrameTime;
    private long currentTime;
    private boolean initialized;
    private boolean firstImageReady;
    private long frames;
    private int fps;
    private int framesPerSec;
    private volatile int[] pbos;
    private java.nio.ByteBuffer[] pboBuffers;
    private int readIndex;
    private int updateIndex;
    private graphics.scenery.backends.RenderConfigReader.RenderConfig renderConfig;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String renderConfigFile;
    private java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLRenderpass> renderpasses;
    private java.util.List<java.lang.String> flow;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String applicationName;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Node[] previousSceneObjects;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.utils.SceneryPanel embedIn;

    public OpenGLRenderer(@org.jetbrains.annotations.NotNull()
                              graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
                              java.lang.String applicationName, @org.jetbrains.annotations.NotNull()
                              graphics.scenery.Scene scene, int width, int height, @org.jetbrains.annotations.Nullable()
                              graphics.scenery.utils.SceneryPanel embedIn, @org.jetbrains.annotations.NotNull()
                              java.lang.String renderConfigFile) {
        super();
    }

    /**
     * slf4j logger
     */
    private final org.slf4j.Logger getLogger() {
        return null;
    }

    @java.lang.Override()
    public boolean getShouldClose() {
        return false;
    }

    @java.lang.Override()
    public void setShouldClose(boolean p0) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public final graphics.scenery.backends.SceneryWindow getWindow() {
        return null;
    }

    @java.lang.Override()
    public final void setWindow(@org.jetbrains.annotations.NotNull()
                                    graphics.scenery.backends.SceneryWindow p0) {
    }

    @org.jetbrains.annotations.Nullable()
    public final cleargl.ClearGLWindow getCglWindow() {
        return null;
    }

    public final void setCglWindow(@org.jetbrains.annotations.Nullable()
                                       cleargl.ClearGLWindow p0) {
    }

    @org.jetbrains.annotations.Nullable()
    public final com.jogamp.opengl.GLOffscreenAutoDrawable getDrawable() {
        return null;
    }

    public final void setDrawable(@org.jetbrains.annotations.Nullable()
                                      com.jogamp.opengl.GLOffscreenAutoDrawable p0) {
    }

    @java.lang.Override()
    public boolean getManagesRenderLoop() {
        return false;
    }

    public void setManagesRenderLoop(boolean p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Scene getScene() {
        return null;
    }

    public final void setScene(@org.jetbrains.annotations.NotNull()
                                   graphics.scenery.Scene p0) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public final graphics.scenery.Settings getSettings() {
        return null;
    }

    @java.lang.Override()
    public final void setSettings(@org.jetbrains.annotations.NotNull()
                                      graphics.scenery.Settings p0) {
    }

    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public final graphics.scenery.Hub getHub() {
        return null;
    }

    @java.lang.Override()
    public final void setHub(@org.jetbrains.annotations.Nullable()
                                 graphics.scenery.Hub p0) {
    }

    @java.lang.Override()
    public boolean getPushMode() {
        return false;
    }

    @java.lang.Override()
    public void setPushMode(boolean p0) {
    }

    @java.lang.Override()
    public float getLastFrameTime() {
        return 0.0F;
    }

    @java.lang.Override()
    public void setLastFrameTime(float p0) {
    }

    @java.lang.Override()
    public boolean getInitialized() {
        return false;
    }

    @java.lang.Override()
    protected void setInitialized(boolean p0) {
    }

    @java.lang.Override()
    public boolean getFirstImageReady() {
        return false;
    }

    @java.lang.Override()
    protected void setFirstImageReady(boolean p0) {
    }

    protected final long getFrames() {
        return 0L;
    }

    protected final void setFrames(long p0) {
    }

    public final int getFps() {
        return 0;
    }

    protected final void setFps(int p0) {
    }

    protected final int getFramesPerSec() {
        return 0;
    }

    protected final void setFramesPerSec(int p0) {
    }

    public final int getPboCount() {
        return 0;
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public final java.lang.String getRenderConfigFile() {
        return null;
    }

    @java.lang.Override()
    public final void setRenderConfigFile(@org.jetbrains.annotations.NotNull()
                                              java.lang.String config) {
    }

    /**
     * * Extension function of Boolean to use Booleans in GLSL
     * *
     * * This function converts a Boolean to Int 0, if false, and to 1, if true
     */
    public final int toInt(boolean $receiver) {
        return 0;
    }

    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApplicationName() {
        return null;
    }

    public final void setApplicationName(@org.jetbrains.annotations.NotNull()
                                             java.lang.String p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.HashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLRenderer.OpenGLBuffer> getBuffers() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.CopyOnWriteArrayList<graphics.scenery.Node> getSceneUBOs() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.opengl.OpenGLRenderer.ResizeHandler getResizeHandler() {
        return null;
    }

    @java.lang.Override()
    public void init(@org.jetbrains.annotations.NotNull()
                         com.jogamp.opengl.GLAutoDrawable pDrawable) {
    }

    private final graphics.scenery.backends.opengl.OpenGLObjectState rendererMetadata(@org.jetbrains.annotations.NotNull()
                                                                                          graphics.scenery.Node $receiver) {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, graphics.scenery.backends.opengl.OpenGLRenderpass> prepareRenderpasses(@org.jetbrains.annotations.NotNull()
                                                                                                                                      graphics.scenery.backends.RenderConfigReader.RenderConfig config, int windowWidth, int windowHeight) {
        return null;
    }

    @org.jetbrains.annotations.Nullable()
    protected final graphics.scenery.backends.opengl.OpenGLShaderProgram prepareShaderProgram(@org.jetbrains.annotations.NotNull()
                                                                                                  graphics.scenery.backends.Shaders shaders) {
        return null;
    }

    @java.lang.Override()
    public void display(@org.jetbrains.annotations.NotNull()
                            com.jogamp.opengl.GLAutoDrawable pDrawable) {
    }

    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public cleargl.ClearGLDisplayable getClearGLWindow() {
        return null;
    }

    @java.lang.Override()
    public void setClearGLWindow(@org.jetbrains.annotations.NotNull()
                                     cleargl.ClearGLWindow pClearGLWindow) {
    }

    @java.lang.Override()
    public void reshape(@org.jetbrains.annotations.NotNull()
                            com.jogamp.opengl.GLAutoDrawable pDrawable, int pX, int pY, int pWidth, int pHeight) {
    }

    @java.lang.Override()
    public void dispose(@org.jetbrains.annotations.NotNull()
                            com.jogamp.opengl.GLAutoDrawable pDrawable) {
    }

    /**
     * * Based on the [GLFramebuffer], devises a texture unit that can be used
     * * for object textures.
     * *
     * * @param[type] texture type
     * * @return Int of the texture unit to be used
     */
    public final int textureTypeToUnit(@org.jetbrains.annotations.NotNull()
                                           graphics.scenery.backends.opengl.OpenGLRenderpass target, @org.jetbrains.annotations.NotNull()
                                           java.lang.String type) {
        return 0;
    }

    private final java.lang.String textureTypeToArrayName(java.lang.String type) {
        return null;
    }

    /**
     * * Converts a [GeometryType] to an OpenGL geometry type
     * *
     * * @return Int of the OpenGL geometry type.
     */
    private final int toOpenGLType(@org.jetbrains.annotations.NotNull()
                                       graphics.scenery.GeometryType $receiver) {
        return 0;
    }

    public final int toggle(int $receiver) {
        return 0;
    }

    /**
     * * Toggles deferred shading buffer debug view. Used for e.g.
     * * [graphics.scenery.controls.behaviours.ToggleCommand]
     */
    @kotlin.Suppress(names = {"UNUSED"})
    public final void toggleDebug() {
    }

    /**
     * * Toggles Screen-space ambient occlusion. Used for e.g.
     * * [graphics.scenery.controls.behaviours.ToggleCommand].
     */
    @kotlin.Suppress(names = {"UNUSED"})
    public final void toggleSSAO() {
    }

    /**
     * * Toggles HDR rendering. Used for e.g.
     * * [graphics.scenery.controls.behaviours.ToggleCommand].
     */
    @kotlin.Suppress(names = {"UNUSED"})
    public final void toggleHDR() {
    }

    /**
     * * Increases the HDR exposure value. Used for e.g.
     * * [graphics.scenery.controls.behaviours.ToggleCommand].
     */
    @kotlin.Suppress(names = {"UNUSED"})
    public final void increaseExposure() {
    }

    /**
     * * Decreases the HDR exposure value.Used for e.g.
     * * [graphics.scenery.controls.behaviours.ToggleCommand].
     */
    @kotlin.Suppress(names = {"UNUSED"})
    public final void decreaseExposure() {
    }

    /**
     * * Increases the HDR gamma value. Used for e.g.
     * * [graphics.scenery.controls.behaviours.ToggleCommand].
     */
    @kotlin.Suppress(names = {"unused"})
    public final void increaseGamma() {
    }

    /**
     * * Decreases the HDR gamma value. Used for e.g.
     * * [graphics.scenery.controls.behaviours.ToggleCommand].
     */
    @kotlin.Suppress(names = {"unused"})
    public final void decreaseGamma() {
    }

    /**
     * * Toggles fullscreen. Used for e.g.
     * * [graphics.scenery.controls.behaviours.ToggleCommand].
     */
    @kotlin.Suppress(names = {"unused"})
    public final void toggleFullscreen() {
    }

    /**
     * * Convenience function that extracts the [OpenGLObjectState] from a [Node]'s
     * * metadata.
     * *
     * * @param[node] The node of interest
     * * @return The [OpenGLObjectState] of the [Node]
     */
    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.backends.opengl.OpenGLObjectState getOpenGLObjectStateFromNode(@org.jetbrains.annotations.NotNull()
                                                                                                     graphics.scenery.Node node) {
        return null;
    }

    /**
     * * Initializes the [Scene] with the [OpenGLRenderer], to be called
     * * before [render].
     */
    @java.lang.Override()
    public synchronized void initializeScene() {
    }

    private final graphics.scenery.backends.Display wantsVR(@org.jetbrains.annotations.NotNull()
                                                                graphics.scenery.backends.Display $receiver) {
        return null;
    }

    private final graphics.scenery.backends.opengl.OpenGLRenderer.OpenGLBuffer findBuffer(java.lang.String name) {
        return null;
    }

    protected final synchronized boolean updateDefaultUBOs() {
        return false;
    }

    /**
     * * Update a [Node]'s geometry, if needed and run it's preDraw() routine.
     * *
     * * @param[n] The Node to update and preDraw()
     */
    private final void preDrawAndUpdateGeometryForNode(graphics.scenery.Node n) {
    }

    /**
     * * Set a [GLProgram]'s uniforms according to a [Node]'s [ShaderProperty]s.
     * *
     * * This functions uses reflection to query for a Node's declared fields and checks
     * * whether they are marked up with the [ShaderProperty] annotation. If this is the case,
     * * the [GLProgram]'s uniform with the same name as the field is set to its value.
     * *
     * * Currently limited to GLVector, GLMatrix, Int and Float properties.
     * *
     * * @param[n] The Node to search for [ShaderProperty]s
     * * @param[program] The [GLProgram] used to render the Node
     */
    @kotlin.Suppress(names = {"unused"})
    private final void setShaderPropertiesForNode(graphics.scenery.Node n, cleargl.GLProgram program) {
    }

    private final void blitFramebuffers(cleargl.GLFramebuffer source, cleargl.GLFramebuffer target, graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D sourceOffset, graphics.scenery.backends.opengl.OpenGLRenderpass.Rect2D targetOffset, boolean colorOnly, boolean depthOnly, java.lang.String sourceName) {
    }

    private final void updateInstanceBuffers(java.util.List<? extends graphics.scenery.Node> sceneObjects) {
    }

    private final graphics.scenery.backends.opengl.OpenGLObjectState updateInstanceBuffer(graphics.scenery.Node parentNode, graphics.scenery.backends.opengl.OpenGLObjectState state) {
        return null;
    }

    protected final void destroyNode(@org.jetbrains.annotations.NotNull()
                                         graphics.scenery.Node node) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.Node[] getPreviousSceneObjects() {
        return null;
    }

    protected final void setPreviousSceneObjects(@org.jetbrains.annotations.NotNull()
                                                     graphics.scenery.Node[] p0) {
    }

    /**
     * * Renders the [Scene].
     * *
     * * The general rendering workflow works like this:
     * *
     * * 1) All visible elements of the Scene are gathered into the renderOrderList, based on their position
     * * 2) Nodes that are an instance of another Node, as indicated by their instanceOf property, are gathered
     * *    into the instanceGroups map.
     * * 3) The eye-dependent geometry buffers are cleared, both color and depth buffers.
     * * 4) First for the non-instanced Nodes, then for the instanced Nodes the following steps are executed
     * *    for each eye:
     * *
     * *      i) The world state of the given Node is updated
     * *     ii) Model, view, and model-view-projection matrices are calculated for each. If a HMD is present,
     * *         the transformation coming from that is taken into account.
     * *    iii) The Node's geometry is updated, if necessary.
     * *     iv) The eye's geometry buffer is activated and the Node drawn into it.
     * *
     * * 5) The deferred shading pass is executed, together with eventual post-processing steps, such as SSAO.
     * * 6) If HDR is active, Exposure/Gamma tone mapping is performed. Else, this part is skipped.
     * * 7) The resulting image is drawn to the screen, or -- if a HMD is present -- submitted to the OpenVR
     * *    compositor.
     */
    @java.lang.Override()
    public synchronized void render() {
    }

    /**
     * * Renders a fullscreen quad, using from an on-the-fly generated
     * * Node that is saved in [nodeStore], with the [GLProgram]'s ID.
     * *
     * * @param[program] The [GLProgram] to draw into the fullscreen quad.
     */
    public final void renderFullscreenQuad(@org.jetbrains.annotations.NotNull()
                                               graphics.scenery.backends.opengl.OpenGLShaderProgram program) {
    }

    /**
     * * Initializes a given [Node].
     * *
     * * This function initializes a Node, equipping its metadata with an [OpenGLObjectState],
     * * generating VAOs and VBOs. If the Node has a [Material] assigned, a [GLProgram] fitting
     * * this Material will be used. Else, a default GLProgram will be used.
     * *
     * * For the assigned Material case, the GLProgram is derived either from the class name of the
     * * Node (if useClassDerivedShader is set), or from a set [ShaderMaterial] which may define
     * * the whole shader pipeline for the Node.
     * *
     * * If the [Node] implements [HasGeometry], it's geometry is also initialized by this function.
     * *
     * * @param[node]: The [Node] to initialise.
     * * @return True if the initialisation went alright, False if it failed.
     */
    public final synchronized boolean initializeNode(@org.jetbrains.annotations.NotNull()
                                                         graphics.scenery.Node node) {
        return false;
    }

    private final int materialToMaterialType(@org.jetbrains.annotations.NotNull()
                                                 graphics.scenery.Node $receiver) {
        return 0;
    }

    /**
     * * Initializes a default set of textures that the renderer can fall back to and provide a non-intrusive
     * * hint to the user that a texture could not be loaded.
     */
    private final void prepareDefaultTextures() {
    }

    /**
     * * Loads textures for a [Node]. The textures either come from a [Material.transferTextures] buffer,
     * * or from a file. This is indicated by stating fromBuffer:bufferName in the textures hash map.
     * *
     * * @param[node] The [Node] to load textures for.
     * * @param[s] The [Node]'s [OpenGLObjectState]
     */
    @kotlin.Suppress(names = {"USELESS_ELVIS"})
    private final graphics.scenery.backends.opengl.OpenGLObjectState loadTexturesForNode(graphics.scenery.Node node, graphics.scenery.backends.opengl.OpenGLObjectState s) {
        return null;
    }

    /**
     * * Reshape the renderer's viewports
     * *
     * * This routine is called when a change in window size is detected, e.g. when resizing
     * * it manually or toggling fullscreen. This function updates the sizes of all used
     * * geometry buffers and will also create new buffers in case vr.Active is changed.
     * *
     * * This function also clears color and depth buffer bits.
     * *
     * * @param[newWidth] The resized window's width
     * * @param[newHeight] The resized window's height
     */
    @java.lang.Override()
    public void reshape(int newWidth, int newHeight) {
    }

    /**
     * * Creates VAOs and VBO for a given [Node]'s vertices.
     * *
     * * @param[node] The [Node] to create the VAO/VBO for.
     */
    public final void setVerticesAndCreateBufferForNode(@org.jetbrains.annotations.NotNull()
                                                            graphics.scenery.Node node) {
    }

    /**
     * * Updates a [Node]'s vertices.
     * *
     * * @param[node] The [Node] to update the vertices for.
     */
    public final void updateVertices(@org.jetbrains.annotations.NotNull()
                                         graphics.scenery.Node node) {
    }

    /**
     * * Creates VAOs and VBO for a given [Node]'s normals.
     * *
     * * @param[node] The [Node] to create the normals VBO for.
     */
    public final void setNormalsAndCreateBufferForNode(@org.jetbrains.annotations.NotNull()
                                                           graphics.scenery.Node node) {
    }

    /**
     * * Updates a given [Node]'s normals.
     * *
     * * @param[node] The [Node] whose normals need updating.
     */
    public final void updateNormals(@org.jetbrains.annotations.NotNull()
                                        graphics.scenery.Node node) {
    }

    /**
     * * Creates VAOs and VBO for a given [Node]'s texcoords.
     * *
     * * @param[node] The [Node] to create the texcoord VBO for.
     */
    public final void setTextureCoordsAndCreateBufferForNode(@org.jetbrains.annotations.NotNull()
                                                                 graphics.scenery.Node node) {
    }

    /**
     * * Updates a given [Node]'s texcoords.
     * *
     * * @param[node] The [Node] whose texcoords need updating.
     */
    public final void updateTextureCoords(@org.jetbrains.annotations.NotNull()
                                              graphics.scenery.Node node) {
    }

    /**
     * * Creates a index buffer for a given [Node]'s indices.
     * *
     * * @param[node] The [Node] to create the index buffer for.
     */
    public final void setIndicesAndCreateBufferForNode(@org.jetbrains.annotations.NotNull()
                                                           graphics.scenery.Node node) {
    }

    /**
     * * Updates a given [Node]'s indices.
     * *
     * * @param[node] The [Node] whose indices need updating.
     */
    public final void updateIndices(@org.jetbrains.annotations.NotNull()
                                        graphics.scenery.Node node) {
    }

    /**
     * * Draws a given [Node], either in element or in index draw mode.
     * *
     * * @param[node] The node to be drawn.
     * * @param[offset] offset in the array or index buffer.
     */
    public final void drawNode(@org.jetbrains.annotations.NotNull()
                                   graphics.scenery.Node node, int offset, @org.jetbrains.annotations.Nullable()
                                   java.lang.Integer count) {
    }

    /**
     * * Draws a given instanced [Node] either in element or in index draw mode.
     * *
     * * @param[node] The node to be drawn.
     * * @param[offset] offset in the array or index buffer.
     */
    protected final void drawNodeInstanced(@org.jetbrains.annotations.NotNull()
                                               graphics.scenery.Node node, long offset) {
    }

    @java.lang.Override()
    public void screenshot(@org.jetbrains.annotations.NotNull()
                               java.lang.String filename, boolean overwrite) {
    }

    @kotlin.Suppress(names = {"unused"})
    public final void recordMovie() {
    }

    private final int toOpenGL(@org.jetbrains.annotations.NotNull()
                                   graphics.scenery.Blending.BlendFactor $receiver) {
        return 0;
    }

    private final int toOpenGL(@org.jetbrains.annotations.NotNull()
                                   graphics.scenery.Blending.BlendOp $receiver) {
        return 0;
    }

    /**
     * * Sets the rendering quality, if the loaded renderer config file supports it.
     * *
     * * @param[quality] The [RenderConfigReader.RenderingQuality] to be set.
     */
    @java.lang.Override()
    public void setRenderingQuality(@org.jetbrains.annotations.NotNull()
                                        graphics.scenery.backends.RenderConfigReader.RenderingQuality quality) {
    }

    /**
     * * Closes this renderer instance.
     */
    @java.lang.Override()
    public void close() {
    }

    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public final graphics.scenery.utils.SceneryPanel getEmbedIn() {
        return null;
    }

    @java.lang.Override()
    public final void setEmbedIn(@org.jetbrains.annotations.Nullable()
                                     graphics.scenery.utils.SceneryPanel p0) {
    }

    /**
     * * OpenGL Buffer class, creates a buffer associated with the context [gl] and size [size] in bytes.
     * *
     * * @author Ulrik Guenther <hello@ulrik.is>
     */
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\bJ\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u0005J\u0006\u0010\'\u001a\u00020%J\u0010\u0010(\u001a\u00020\u000e2\b\b\u0002\u0010)\u001a\u00020\u0005R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0018@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006*"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLRenderer$OpenGLBuffer;", "", "gl", "Lcom/jogamp/opengl/GL4;", "size", "", "(Lcom/jogamp/opengl/GL4;I)V", "<set-?>", "", "alignment", "getAlignment", "()J", "setAlignment", "(J)V", "Ljava/nio/ByteBuffer;", "buffer", "getBuffer", "()Ljava/nio/ByteBuffer;", "setBuffer", "(Ljava/nio/ByteBuffer;)V", "getGl", "()Lcom/jogamp/opengl/GL4;", "setGl", "(Lcom/jogamp/opengl/GL4;)V", "", "id", "getId", "()[I", "setId", "([I)V", "getSize", "()I", "setSize", "(I)V", "advance", "align", "copyFromStagingBuffer", "", "remaining", "reset", "resize", "newSize", "scenery"})
    public static final class OpenGLBuffer {

        /**
         * Temporary buffer for data before it is sent to the GPU.
         */
        @org.jetbrains.annotations.NotNull()
        private java.nio.ByteBuffer buffer;

        /**
         * OpenGL id of the buffer.
         */
        @org.jetbrains.annotations.NotNull()
        private int[] id;

        /**
         * Required buffer offset alignment for uniform buffers, determined from [GL4.GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT]
         */
        private long alignment;
        @org.jetbrains.annotations.NotNull()
        private com.jogamp.opengl.GL4 gl;
        private int size;

        public OpenGLBuffer(@org.jetbrains.annotations.NotNull()
                                com.jogamp.opengl.GL4 gl, int size) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final java.nio.ByteBuffer getBuffer() {
            return null;
        }

        private final void setBuffer(java.nio.ByteBuffer p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final int[] getId() {
            return null;
        }

        private final void setId(int[] p0) {
        }

        public final long getAlignment() {
            return 0L;
        }

        private final void setAlignment(long p0) {
        }

        /**
         * Copies the [buffer] from main memory to GPU memory.
         */
        public final void copyFromStagingBuffer() {
        }

        /**
         * Resets staging buffer position and limit
         */
        public final void reset() {
        }

        /**
         * * Resizes the backing buffer to [newSize], which is 1.5x the original size by default,
         * * and returns the staging buffer.
         */
        @org.jetbrains.annotations.NotNull()
        public final java.nio.ByteBuffer resize(int newSize) {
            return null;
        }

        /**
         * * Returns the [buffer]'s remaining bytes.
         */
        public final int remaining() {
            return 0;
        }

        /**
         * * Advances the backing buffer for population, aligning it by [alignment], or any given value
         * * that overrides it (not recommended), returns the buffers new position.
         */
        public final int advance(long align) {
            return 0;
        }

        @org.jetbrains.annotations.NotNull()
        public final com.jogamp.opengl.GL4 getGl() {
            return null;
        }

        public final void setGl(@org.jetbrains.annotations.NotNull()
                                    com.jogamp.opengl.GL4 p0) {
        }

        public final int getSize() {
            return 0;
        }

        public final void setSize(int p0) {
        }
    }

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLRenderer$Companion;", "", "()V", "MATERIAL_HAS_ALPHAMASK", "", "MATERIAL_HAS_AMBIENT", "MATERIAL_HAS_DIFFUSE", "MATERIAL_HAS_NORMAL", "MATERIAL_HAS_SPECULAR", "WINDOW_RESIZE_TIMEOUT", "", "scenery"})
    public static final class Companion {

        private Companion() {
            super();
        }
    }

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lgraphics/scenery/backends/opengl/OpenGLRenderer$ResizeHandler;", "", "(Lgraphics/scenery/backends/opengl/OpenGLRenderer;)V", "lastHeight", "", "getLastHeight", "()I", "setLastHeight", "(I)V", "lastResize", "", "getLastResize", "()J", "setLastResize", "(J)V", "lastWidth", "getLastWidth", "setLastWidth", "queryResize", "", "scenery"})
    public final class ResizeHandler {
        private volatile long lastResize;
        private int lastWidth;
        private int lastHeight;

        public ResizeHandler() {
            super();
        }

        public final long getLastResize() {
            return 0L;
        }

        public final void setLastResize(long p0) {
        }

        public final int getLastWidth() {
            return 0;
        }

        public final void setLastWidth(int p0) {
        }

        public final int getLastHeight() {
            return 0;
        }

        public final void setLastHeight(int p0) {
        }

        public final synchronized void queryResize() {
        }
    }
}
