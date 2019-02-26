package graphics.scenery.backends.vulkan;

/**
 * * Vulkan Renderer
 * *
 * * @param[hub] Hub instance to use and attach to.
 * * @param[applicationName] The name of this application.
 * * @param[scene] The [Scene] instance to initialize first.
 * * @param[windowWidth] Horizontal window size.
 * * @param[windowHeight] Vertical window size.
 * * @param[embedIn] An optional [SceneryPanel] in which to embed the renderer instance.
 * * @param[renderConfigFile] The file to create a [RenderConfigReader.RenderConfig] from.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 */
@kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 \u0088\u00032\u00020\u00012\u00020\u0002:\u0016\u0086\u0003\u0087\u0003\u0088\u0003\u0089\u0003\u008a\u0003\u008b\u0003\u008c\u0003\u008d\u0003\u008e\u0003\u008f\u0003\u0090\u0003BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000fJ\n\u0010\u00a5\u0002\u001a\u00030\u00a6\u0002H\u0002J\n\u0010\u00a7\u0002\u001a\u00030\u00a6\u0002H\u0016J\b\u0010\u00a8\u0002\u001a\u00030\u00a6\u0002J\u0011\u0010\u00a9\u0002\u001a\u000207H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J&\u0010\u00aa\u0002\u001a\u00030\u0085\u00012\u001a\b\u0002\u0010\u00ab\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u000603j\t\u0012\u0004\u0012\u00020\u0006`\u00ac\u0002H\u0002J&\u0010\u00ad\u0002\u001a\u00030\u00ae\u00022\u0006\u0010B\u001a\u00020C2\b\u0010\u00af\u0002\u001a\u00030\u0095\u00012\b\u0010\u00b0\u0002\u001a\u00030\u00ae\u0002H\u0002J\u0012\u0010\u00b1\u0002\u001a\u00030\u00a6\u00022\b\u0010\u00af\u0002\u001a\u00030\u0095\u0001J\u0018\u0010\u00b2\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020?0\u0015H\u0002\u00f8\u0001\u0000J\u001e\u0010\u00b3\u0002\u001a\u00020S2\b\u0010\u00af\u0002\u001a\u00030\u0095\u00012\t\b\u0002\u0010\u00b4\u0002\u001a\u00020SH\u0002J\u0011\u0010\u00b5\u0002\u001a\u00020S2\b\u0010\u00af\u0002\u001a\u00030\u0095\u0001J\n\u0010\u00b6\u0002\u001a\u00030\u00a6\u0002H\u0016J\u001e\u0010\u00b7\u0002\u001a\u00030\u00ae\u00022\b\u0010\u00af\u0002\u001a\u00030\u0095\u00012\b\u0010\u00b8\u0002\u001a\u00030\u00ae\u0002H\u0004J\t\u0010\u00b9\u0002\u001a\u00020SH\u0002J\'\u0010\u00ba\u0002\u001a\u00030\u00a6\u00022\u0006\u0010B\u001a\u00020C2\u0013\u0010\u00bb\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0018\u0010\u00bc\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020;0\u0015H\u0004\u00f8\u0001\u0000J\u0012\u0010\u00bd\u0002\u001a\u00030\u00a6\u00022\u0006\u0010B\u001a\u00020CH\u0004J\u001d\u0010\u00be\u0002\u001a\u00030\u00a6\u00022\u0006\u00106\u001a\u000207H\u0004\u00f8\u0001\u0000\u00a2\u0006\u0005\b\u00bf\u0002\u0010,J$\u0010\u00c0\u0002\u001a\u00030\u00a6\u00022\b\u0010\u00b9\u0001\u001a\u00030\u00b8\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0004J\u001a\u0010\u00c1\u0002\u001a\u0010\u0012\u0005\u0012\u00030\u00e2\u0001\u0012\u0005\u0012\u00030\u00e3\u00010\u0015H\u0004\u00f8\u0001\u0000J\u0017\u0010\u00c2\u0002\u001a\u0010\u0012\u0005\u0012\u00030\u0093\u0002\u0012\u0005\u0012\u00030\u0094\u00020\u0015H\u0004J\b\u0010\u00b4\u0001\u001a\u00030\u00a6\u0002J\u001e\u0010\u00c3\u0002\u001a\u00030\u00a6\u00022\b\u0010\u00c4\u0002\u001a\u00030\u00c1\u00012\b\u0010\u00c5\u0002\u001a\u00030\u00c6\u0002H\u0002J[\u0010\u00c7\u0002\u001a\u00030\u00a6\u00022\b\u0010\u00c4\u0002\u001a\u00030\u00c1\u00012\b\u0010\u00c5\u0002\u001a\u00030\u00c6\u00022\u0015\u0010\u00c8\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0095\u00010\\0\u00c9\u00022\u0019\b\u0002\u0010\u00ca\u0002\u001a\u0012\u0012\u0005\u0012\u00030\u0095\u0001\u0012\u0004\u0012\u00020S\u0018\u00010\u00cb\u00022\t\b\u0002\u0010\u00cc\u0002\u001a\u00020SH\u0002J\n\u0010\u00cd\u0002\u001a\u00030\u00a6\u0002H\u0016J\u001c\u0010\u00ce\u0002\u001a\u00030\u00a6\u00022\u0007\u0010\u00cf\u0002\u001a\u00020\n2\u0007\u0010\u00d0\u0002\u001a\u00020\nH\u0016J\u001c\u0010\u00d1\u0002\u001a\u00030\u00a6\u00022\u0007\u0010\u00d2\u0002\u001a\u00020\u00062\u0007\u0010\u00d3\u0002\u001a\u00020SH\u0016J\u0010\u0010\u00d4\u0002\u001a\u00030\u00a6\u00022\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\u00d5\u0002\u001a\u00030\u00a6\u00022\b\u0010\u00d6\u0002\u001a\u00030\u00d7\u0002H\u0016J3\u0010\u00d8\u0002\u001a\u00020(2\b\u0010\u0084\u0001\u001a\u00030\u0085\u00012\f\u0010\u00d9\u0002\u001a\u00070\nj\u0003`\u00da\u00022\u0007\u0010\u00db\u0002\u001a\u00020\"H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00dc\u0002J2\u0010\u00dd\u0002\u001a\u00030\u00a6\u00022\b\u0010\u00ae\u0001\u001a\u00030\u00af\u00012\b\u0010\u00c4\u0002\u001a\u00030\u00c1\u00012\b\u0010\u00c5\u0002\u001a\u00030\u00c6\u00022\b\u0010\u00de\u0002\u001a\u00030\u00a2\u0001H\u0002J\b\u0010\u00df\u0002\u001a\u00030\u00a6\u0002J\b\u0010\u00e0\u0002\u001a\u00030\u00a6\u0002J\b\u0010\u0088\u0002\u001a\u00030\u00a6\u0002J\u0011\u0010\u00e1\u0002\u001a\u00020S2\u0006\u0010B\u001a\u00020CH\u0002J&\u0010\u00e2\u0002\u001a\u00030\u00ae\u00022\u0006\u0010B\u001a\u00020C2\b\u0010\u00e3\u0002\u001a\u00030\u0095\u00012\b\u0010\u00b0\u0002\u001a\u00030\u00ae\u0002H\u0002J!\u0010\u00e4\u0002\u001a\u00030\u00a6\u00022\u0015\u0010\u00c8\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0095\u00010\\0\u00c9\u0002H\u0002J\u0012\u0010\u00e5\u0002\u001a\u00030\u00a6\u00022\b\u0010\u00af\u0002\u001a\u00030\u0095\u0001J\n\u0010\u00e6\u0002\u001a\u00030\u00a6\u0002H\u0002J\u001e\u0010\u00e7\u0002\u001a\u00030\u0094\u00022\b\u0010\u00af\u0002\u001a\u00030\u0095\u00012\b\u0010\u00e8\u0002\u001a\u00030\u0094\u0002H\u0004J\r\u0010\u00e9\u0002\u001a\u00030\u009c\u0002*\u00030\u009c\u0002J)\u0010\u00ea\u0002\u001a\u00020S*\u00030\u00fe\u00012\b\u0010\u00eb\u0002\u001a\u00030\u00ec\u00022\u0007\u0010\u00ed\u0002\u001a\u00020\n2\u0006\u0010B\u001a\u00020CH\u0004J\'\u0010\u00ee\u0002\u001a\t\u0012\u0005\u0012\u00030\u00ef\u00020\\*\u0017\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u00010\u00f0\u0002J+\u0010\u00f1\u0002\u001a\u00030\u00fe\u0001*\u00030\u0095\u00012\u0007\u0010\u00f2\u0002\u001a\u00020\u00062\u0007\u0010\u00f3\u0002\u001a\u00020S2\b\u0010\u00f4\u0002\u001a\u00030\u00fe\u0001H\u0004J\u0018\u0010\u00f5\u0002\u001a\u00020\n*\u00030\u0095\u00012\b\u0010\u00b8\u0002\u001a\u00030\u00ae\u0002H\u0004JW\u0010\u00f6\u0002\u001a\t\u0012\u0005\u0012\u0003H\u00f7\u00020\\\"\u0005\b\u0000\u0010\u00f8\u0002\"\u0005\b\u0001\u0010\u00f7\u0002*\n\u0012\u0005\u0012\u0003H\u00f8\u00020\u00f9\u00022\t\b\u0002\u0010\u00fa\u0002\u001a\u00020\n2\n\b\u0002\u0010\u00fb\u0002\u001a\u00030\u00fc\u00022\u0016\u0010\u00fd\u0002\u001a\u0011\u0012\u0005\u0012\u0003H\u00f8\u0002\u0012\u0005\u0012\u0003H\u00f7\u00020\u00cb\u0002J\u0011\u0010\u00fe\u0002\u001a\u0005\u0018\u00010\u00ae\u0002*\u00030\u0095\u0001H\u0002J\"\u0010\u00ff\u0002\u001a\u00020\n*\u00030\u0080\u00032\b\u0010\u00c4\u0002\u001a\u00030\u00c1\u00012\b\u0010\u0081\u0003\u001a\u00030\u0082\u0003H\u0002J\u000b\u0010\u0083\u0003\u001a\u00020\n*\u00020\nJ\u0011\u0010\u0084\u0003\u001a\u0005\u0018\u00010\u0085\u0003*\u00030\u0085\u0003H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001f\u0010\'\u001a\u00020(X\u0084\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R&\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020/0\u0015X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u000603X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001f\u00106\u001a\u000207X\u0084\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010-\u001a\u0004\b8\u0010*\"\u0004\b9\u0010,R)\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020;0\u0015X\u0084\u000e\u00f8\u0001\u0000\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0018\"\u0004\b=\u0010\u001aR)\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020?0\u0015X\u0084\u000e\u00f8\u0001\u0000\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0018\"\u0004\bA\u0010\u001aR\u001a\u0010B\u001a\u00020CX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010L\u001a\u0004\u0018\u00010MX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010T\u001a\u00020S2\u0006\u0010R\u001a\u00020S@TX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u000e\u0010Y\u001a\u00020ZX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00060\\X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010]\u001a\u00020\n2\u0006\u0010R\u001a\u00020\n@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001a\u0010b\u001a\u00020\nX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010_\"\u0004\bd\u0010aR\u001a\u0010e\u001a\u00020fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\u001c\u0010k\u001a\u0004\u0018\u00010lX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001a\u0010q\u001a\u00020rX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001d\u0010{\u001a\u0004\u0018\u00010|X\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\'\u0010\u0081\u0001\u001a\u00020S2\u0006\u0010R\u001a\u00020S@DX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010V\"\u0005\b\u0083\u0001\u0010XR \u0010\u0084\u0001\u001a\u00030\u0085\u0001X\u0084\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R \u0010\u008a\u0001\u001a\u00030\u008b\u0001X\u0096\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001e\u0010\u0090\u0001\u001a\u00030\u0091\u0001X\u0084\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010*\"\u0005\b\u0093\u0001\u0010,R$\u0010\u0094\u0001\u001a\u0017\u0012\u0005\u0012\u00030\u0095\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u00010\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0098\u0001\u001a\u00030\u0099\u00018DX\u0084\u0084\u0002\u00a2\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001d\u0010\u009e\u0001\u001a\u00020SX\u0096\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010V\"\u0005\b\u00a0\u0001\u0010XR \u0010\u00a1\u0001\u001a\u00030\u00a2\u0001X\u0084\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a3\u0001\u0010\u00a4\u0001\"\u0006\b\u00a5\u0001\u0010\u00a6\u0001R#\u0010\u00a7\u0001\u001a\u00030\u00a8\u0001X\u0084\u000e\u00f8\u0001\u0000\u00a2\u0006\u0012\n\u0002\u0010-\u001a\u0005\b\u00a9\u0001\u0010*\"\u0005\b\u00aa\u0001\u0010,R\u001d\u0010\u00ab\u0001\u001a\u00020SX\u0096\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ac\u0001\u0010V\"\u0005\b\u00ad\u0001\u0010XR \u0010\u00ae\u0001\u001a\u00030\u00af\u0001X\u0084\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b0\u0001\u0010\u00b1\u0001\"\u0006\b\u00b2\u0001\u0010\u00b3\u0001R\u001d\u0010\u00b4\u0001\u001a\u00020SX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b5\u0001\u0010V\"\u0005\b\u00b6\u0001\u0010XR\u0010\u0010\u00b7\u0001\u001a\u00030\u00b8\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\'\u0010\u000e\u001a\u00020\u00062\u0007\u0010\u00b9\u0001\u001a\u00020\u0006@FX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ba\u0001\u0010\u0011\"\u0005\b\u00bb\u0001\u0010\u0013R\u001e\u0010\u00bc\u0001\u001a\u00030\u0091\u0001X\u0084\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bd\u0001\u0010*\"\u0005\b\u00be\u0001\u0010,R%\u0010\u00bf\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030\u00c1\u00010\u00c0\u0001X\u0084\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00c2\u0001\u0010\u00c3\u0001R\u001e\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00c4\u0001\u0010\u00c5\u0001\"\u0006\b\u00c6\u0001\u0010\u00c7\u0001R*\u0010\u00c8\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u00c9\u0001X\u0084\u000e\u00a2\u0006\u0015\n\u0003\u0010\u00ce\u0001\u001a\u0006\b\u00ca\u0001\u0010\u00cb\u0001\"\u0006\b\u00cc\u0001\u0010\u00cd\u0001R%\u0010\u00cf\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u000103X\u0084\u000e\u00a2\u0006\u0011\n\u0000\u001a\u0005\b\u00d0\u0001\u00105\"\u0006\b\u00d1\u0001\u0010\u00d2\u0001R!\u0010\u00d3\u0001\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00d4\u0001\u0010\u00d5\u0001\"\u0006\b\u00d6\u0001\u0010\u00d7\u0001R\u000f\u0010\u00d8\u0001\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00d9\u0001\u001a\u00020SX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00da\u0001\u001a\u00020SX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u00db\u0001\u001a\u00030\u00dc\u0001X\u0084\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00dd\u0001\u0010\u00de\u0001\"\u0006\b\u00df\u0001\u0010\u00e0\u0001R.\u0010\u00e1\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u00e2\u0001\u0012\u0005\u0012\u00030\u00e3\u00010\u0015X\u0084\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e4\u0001\u0010\u0018\"\u0005\b\u00e5\u0001\u0010\u001aR \u0010\u00e6\u0001\u001a\u00030\u00e7\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00e8\u0001\u0010\u00e9\u0001\"\u0006\b\u00ea\u0001\u0010\u00eb\u0001R\u001d\u0010\u00ec\u0001\u001a\u00020SX\u0096\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ed\u0001\u0010V\"\u0005\b\u00ee\u0001\u0010XR*\u0010\u00ef\u0001\u001a\u0015\u0012\u0004\u0012\u00020S\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\\0\u00f0\u0001X\u0084\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00f1\u0001\u0010\u00f2\u0001R \u0010\u00f3\u0001\u001a\u00030\u00f4\u0001X\u0084\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00f5\u0001\u0010\u00f6\u0001\"\u0006\b\u00f7\u0001\u0010\u00f8\u0001R\u001c\u0010\u00f9\u0001\u001a\u00070\u00fa\u0001R\u00020\u0000X\u0084\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00fb\u0001\u0010\u00fc\u0001R*\u0010\u00fd\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030\u00fe\u00010\u0015X\u0084\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ff\u0001\u0010\u0018\"\u0005\b\u0080\u0002\u0010\u001aR \u0010\u0081\u0002\u001a\u00030\u008b\u0001X\u0084\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0082\u0002\u0010\u008d\u0001\"\u0006\b\u0083\u0002\u0010\u008f\u0001R#\u0010\u0084\u0002\u001a\u00030\u0085\u0002X\u0084\u000e\u00f8\u0001\u0000\u00a2\u0006\u0012\n\u0002\u0010-\u001a\u0005\b\u0086\u0002\u0010*\"\u0005\b\u0087\u0002\u0010,R\u000f\u0010\u0088\u0002\u001a\u00020SX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0089\u0002\u001a\u00030\u0091\u0001X\u0084\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0002\u0010*\"\u0005\b\u008b\u0002\u0010,R \u0010\u008c\u0002\u001a\u00030\u00af\u0001X\u0084\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008d\u0002\u0010\u00b1\u0001\"\u0006\b\u008e\u0002\u0010\u00b3\u0001R\u001d\u0010\u008f\u0002\u001a\u00020SX\u0084\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0002\u0010V\"\u0005\b\u0091\u0002\u0010XR+\u0010\u0092\u0002\u001a\u0010\u0012\u0005\u0012\u00030\u0093\u0002\u0012\u0005\u0012\u00030\u0094\u00020\u0015X\u0084\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0002\u0010\u0018\"\u0005\b\u0096\u0002\u0010\u001aR\u0015\u0010\u0097\u0002\u001a\u00030\u0098\u00028F\u00a2\u0006\b\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0010\u0010\u009b\u0002\u001a\u00030\u009c\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u009d\u0002\u001a\u00020SX\u0084\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009e\u0002\u0010VR \u0010\u009f\u0002\u001a\u00030\u00a0\u0002X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a1\u0002\u0010\u00a2\u0002\"\u0006\b\u00a3\u0002\u0010\u00a4\u0002\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0091\u0003"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer;", "Lgraphics/scenery/backends/Renderer;", "Ljava/lang/AutoCloseable;", "hub", "Lgraphics/scenery/Hub;", "applicationName", "", "scene", "Lgraphics/scenery/Scene;", "windowWidth", "", "windowHeight", "embedIn", "Lgraphics/scenery/utils/SceneryPanel;", "renderConfigFile", "(Lgraphics/scenery/Hub;Ljava/lang/String;Lgraphics/scenery/Scene;IILgraphics/scenery/utils/SceneryPanel;Ljava/lang/String;)V", "getApplicationName", "()Ljava/lang/String;", "setApplicationName", "(Ljava/lang/String;)V", "buffers", "Ljava/util/concurrent/ConcurrentHashMap;", "Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "getBuffers", "()Ljava/util/concurrent/ConcurrentHashMap;", "setBuffers", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "commandPools", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "getCommandPools", "()Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "setCommandPools", "(Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;)V", "debugCallback", "Lorg/lwjgl/vulkan/VkDebugReportCallbackEXT;", "getDebugCallback", "()Lorg/lwjgl/vulkan/VkDebugReportCallbackEXT;", "setDebugCallback", "(Lorg/lwjgl/vulkan/VkDebugReportCallbackEXT;)V", "debugCallbackHandle", "Lvkk/entities/VkDebugReportCallback;", "getDebugCallbackHandle", "()J", "setDebugCallbackHandle-pYGiOoE", "(J)V", "J", "defaultUBOs", "Lgraphics/scenery/backends/vulkan/VulkanUBO;", "getDefaultUBOs", "setDefaultUBOs", "defaultValidationLayers", "Ljava/util/ArrayList;", "getDefaultValidationLayers", "()Ljava/util/ArrayList;", "descriptorPool", "Lvkk/entities/VkDescriptorPool;", "getDescriptorPool", "setDescriptorPool-_1NyhOE", "descriptorSetLayouts", "Lvkk/entities/VkDescriptorSetLayout;", "getDescriptorSetLayouts", "setDescriptorSetLayouts", "descriptorSets", "Lvkk/entities/VkDescriptorSet;", "getDescriptorSets", "setDescriptorSets", "device", "Lgraphics/scenery/backends/vulkan/VulkanDevice;", "getDevice", "()Lgraphics/scenery/backends/vulkan/VulkanDevice;", "setDevice", "(Lgraphics/scenery/backends/vulkan/VulkanDevice;)V", "getEmbedIn", "()Lgraphics/scenery/utils/SceneryPanel;", "setEmbedIn", "(Lgraphics/scenery/utils/SceneryPanel;)V", "encoder", "Lgraphics/scenery/utils/H264Encoder;", "getEncoder", "()Lgraphics/scenery/utils/H264Encoder;", "setEncoder", "(Lgraphics/scenery/utils/H264Encoder;)V", "<set-?>", "", "firstImageReady", "getFirstImageReady", "()Z", "setFirstImageReady", "(Z)V", "firstWaitSemaphore", "Ljava/nio/LongBuffer;", "flow", "", "fps", "getFps", "()I", "setFps", "(I)V", "frames", "getFrames", "setFrames", "geometryPool", "Lgraphics/scenery/backends/vulkan/VulkanBufferPool;", "getGeometryPool", "()Lgraphics/scenery/backends/vulkan/VulkanBufferPool;", "setGeometryPool", "(Lgraphics/scenery/backends/vulkan/VulkanBufferPool;)V", "gpuStats", "Lgraphics/scenery/utils/GPUStats;", "getGpuStats", "()Lgraphics/scenery/utils/GPUStats;", "setGpuStats", "(Lgraphics/scenery/utils/GPUStats;)V", "heartbeatTimer", "Ljava/util/Timer;", "getHeartbeatTimer", "()Ljava/util/Timer;", "setHeartbeatTimer", "(Ljava/util/Timer;)V", "getHub", "()Lgraphics/scenery/Hub;", "setHub", "(Lgraphics/scenery/Hub;)V", "imageBuffer", "Ljava/nio/ByteBuffer;", "getImageBuffer", "()Ljava/nio/ByteBuffer;", "setImageBuffer", "(Ljava/nio/ByteBuffer;)V", "initialized", "getInitialized", "setInitialized", "instance", "Lorg/lwjgl/vulkan/VkInstance;", "getInstance", "()Lorg/lwjgl/vulkan/VkInstance;", "setInstance", "(Lorg/lwjgl/vulkan/VkInstance;)V", "lastFrameTime", "", "getLastFrameTime", "()F", "setLastFrameTime", "(F)V", "lastTime", "", "getLastTime", "setLastTime", "lateResizeInitializers", "Lgraphics/scenery/Node;", "Lkotlin/Function0;", "", "logger", "Lorg/slf4j/Logger;", "getLogger", "()Lorg/slf4j/Logger;", "logger$delegate", "Lkotlin/Lazy;", "managesRenderLoop", "getManagesRenderLoop", "setManagesRenderLoop", "ph", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$PresentHelpers;", "getPh", "()Lgraphics/scenery/backends/vulkan/VulkanRenderer$PresentHelpers;", "setPh", "(Lgraphics/scenery/backends/vulkan/VulkanRenderer$PresentHelpers;)V", "pipelineCache", "Lvkk/entities/VkPipelineCache;", "getPipelineCache", "setPipelineCache-gg8K6Xs", "pushMode", "getPushMode", "setPushMode", "queue", "Lorg/lwjgl/vulkan/VkQueue;", "getQueue", "()Lorg/lwjgl/vulkan/VkQueue;", "setQueue", "(Lorg/lwjgl/vulkan/VkQueue;)V", "recordMovie", "getRecordMovie", "setRecordMovie", "renderConfig", "Lgraphics/scenery/backends/RenderConfigReader$RenderConfig;", "config", "getRenderConfigFile", "setRenderConfigFile", "renderDelay", "getRenderDelay", "setRenderDelay", "renderpasses", "", "Lgraphics/scenery/backends/vulkan/VulkanRenderpass;", "getRenderpasses", "()Ljava/util/Map;", "getScene", "()Lgraphics/scenery/Scene;", "setScene", "(Lgraphics/scenery/Scene;)V", "sceneArray", "", "getSceneArray", "()[Lgraphics/scenery/Node;", "setSceneArray", "([Lgraphics/scenery/Node;)V", "[Lgraphics/scenery/Node;", "sceneUBOs", "getSceneUBOs", "setSceneUBOs", "(Ljava/util/ArrayList;)V", "screenshotBuffer", "getScreenshotBuffer", "()Lgraphics/scenery/backends/vulkan/VulkanBuffer;", "setScreenshotBuffer", "(Lgraphics/scenery/backends/vulkan/VulkanBuffer;)V", "screenshotFilename", "screenshotOverwriteExisting", "screenshotRequested", "semaphoreCreateInfo", "Lorg/lwjgl/vulkan/VkSemaphoreCreateInfo;", "getSemaphoreCreateInfo", "()Lorg/lwjgl/vulkan/VkSemaphoreCreateInfo;", "setSemaphoreCreateInfo", "(Lorg/lwjgl/vulkan/VkSemaphoreCreateInfo;)V", "semaphores", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$StandardSemaphores;", "Lvkk/entities/VkSemaphoreArray;", "getSemaphores", "setSemaphores", "settings", "Lgraphics/scenery/Settings;", "getSettings", "()Lgraphics/scenery/Settings;", "setSettings", "(Lgraphics/scenery/Settings;)V", "shouldClose", "getShouldClose", "setShouldClose", "strictValidation", "Lkotlin/Pair;", "getStrictValidation", "()Lkotlin/Pair;", "swapchain", "Lgraphics/scenery/backends/vulkan/Swapchain;", "getSwapchain", "()Lgraphics/scenery/backends/vulkan/Swapchain;", "setSwapchain", "(Lgraphics/scenery/backends/vulkan/Swapchain;)V", "swapchainRecreator", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$SwapchainRecreator;", "getSwapchainRecreator", "()Lgraphics/scenery/backends/vulkan/VulkanRenderer$SwapchainRecreator;", "textureCache", "Lgraphics/scenery/backends/vulkan/VulkanTexture;", "getTextureCache", "setTextureCache", "time", "getTime", "setTime", "timestampQueryPool", "Lvkk/entities/VkQueryPool;", "getTimestampQueryPool", "setTimestampQueryPool-R-f1u6g", "toggleFullscreen", "totalFrames", "getTotalFrames", "setTotalFrames", "transferQueue", "getTransferQueue", "setTransferQueue", "validation", "getValidation", "setValidation", "vertexDescriptors", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDataKinds;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDescription;", "getVertexDescriptors", "setVertexDescriptors", "vkDev", "Lorg/lwjgl/vulkan/VkDevice;", "getVkDev", "()Lorg/lwjgl/vulkan/VkDevice;", "vulkanProjectionFix", "Lcleargl/GLMatrix;", "wantsOpenGLSwapchain", "getWantsOpenGLSwapchain", "window", "Lgraphics/scenery/backends/SceneryWindow;", "getWindow", "()Lgraphics/scenery/backends/SceneryWindow;", "setWindow", "(Lgraphics/scenery/backends/SceneryWindow;)V", "beginFrame", "", "close", "closeInternal", "createDescriptorPool", "createInstance", "requiredExtensions", "Lkotlin/collections/ArrayList;", "createVertexBuffers", "Lgraphics/scenery/backends/vulkan/VulkanObjectState;", "node", "state", "destroyNode", "getDescriptorCache", "initializeCustomShadersForNode", "addInitializer", "initializeNode", "initializeScene", "loadTexturesForNode", "s", "pollEvents", "prepareDefaultBuffers", "bufferStorage", "prepareDefaultDescriptorSetLayouts", "prepareDefaultTextures", "prepareDescriptorSets", "prepareDescriptorSets-_1NyhOE", "prepareRenderpassesFromConfig", "prepareStandardSemaphores", "prepareStandardVertexDescriptors", "recordPostprocessRenderCommands", "pass", "commandBuffer", "Lgraphics/scenery/backends/vulkan/VulkanCommandBuffer;", "recordSceneRenderCommands", "sceneObjects", "Lkotlinx/coroutines/Deferred;", "customNodeFilter", "Lkotlin/Function1;", "forceRerecording", "render", "reshape", "newWidth", "newHeight", "screenshot", "filename", "overwrite", "setCurrentScene", "setRenderingQuality", "quality", "Lgraphics/scenery/backends/RenderConfigReader$RenderingQuality;", "setupDebugging", "flags", "Lvkk/VkDebugReportFlagsEXT;", "callback", "(Lorg/lwjgl/vulkan/VkInstance;ILorg/lwjgl/vulkan/VkDebugReportCallbackEXT;)J", "submitFrame", "present", "switchFullscreen", "toggleDebug", "updateDefaultUBOs", "updateInstanceBuffer", "parentNode", "updateInstanceBuffers", "updateNodeGeometry", "updateTimings", "vertexDescriptionFromInstancedNode", "template", "applyVulkanCoordinateSystem", "canBeReused", "other", "Lgraphics/scenery/GenericTexture;", "miplevels", "getFormatsAndRequiredAttributeSize", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$AttributeInfo;", "Ljava/util/HashMap;", "loadTextureFromJar", "texture", "generateMipmaps", "fallback", "materialTypeFromTextures", "parallelMap", "R", "T", "", "numThreads", "exec", "Ljava/util/concurrent/ExecutorService;", "transform", "rendererMetadata", "setRequiredDescriptorSetsPostprocess", "Lgraphics/scenery/backends/vulkan/VulkanRenderpass$VulkanMetadata;", "pipeline", "Lgraphics/scenery/backends/vulkan/VulkanPipeline;", "toggle", "wantsVR", "Lgraphics/scenery/backends/Display;", "AttributeInfo", "CommandPools", "Companion", "DescriptorSet", "DeviceAndGraphicsQueueFamily", "Pipeline", "PresentHelpers", "StandardSemaphores", "SwapchainRecreator", "VertexDataKinds", "VertexDescription", "scenery"})
public class VulkanRenderer extends graphics.scenery.backends.Renderer implements java.lang.AutoCloseable {
    public static final graphics.scenery.backends.vulkan.VulkanRenderer.Companion Companion = null;
    private static final int VK_FLAGS_NONE = 0;
    private static final int MAX_TEXTURES = 32768;
    private static final int MAX_UBOS = 2048;
    private static final int MAX_INPUT_ATTACHMENTS = 32;
    private static final long UINT64_MAX = -1L;
    private static final int MATERIAL_HAS_DIFFUSE = 1;
    private static final int MATERIAL_HAS_AMBIENT = 2;
    private static final int MATERIAL_HAS_SPECULAR = 4;
    private static final int MATERIAL_HAS_NORMAL = 8;
    private static final int MATERIAL_HAS_ALPHAMASK = 16;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy logger$delegate = null;
    private final java.util.concurrent.ConcurrentHashMap<graphics.scenery.Node, kotlin.jvm.functions.Function0<java.lang.Object>> lateResizeInitializers = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, graphics.scenery.backends.vulkan.VulkanRenderpass> renderpasses = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Pair<java.lang.Boolean, java.util.List<java.lang.Integer>> strictValidation = null;
    private final boolean wantsOpenGLSwapchain = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<java.lang.String> defaultValidationLayers = null;
    @org.jetbrains.annotations.NotNull()
    private final graphics.scenery.backends.vulkan.VulkanRenderer.SwapchainRecreator swapchainRecreator = null;
    private final cleargl.GLMatrix vulkanProjectionFix = null;
    /**
     * Debug callback to be used upon encountering validation messages or errors
     */
    @org.jetbrains.annotations.NotNull()
    private org.lwjgl.vulkan.VkDebugReportCallbackEXT debugCallback;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.Hub hub;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String applicationName;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Settings settings;
    private boolean shouldClose;
    private boolean toggleFullscreen;
    private boolean managesRenderLoop;
    private float lastFrameTime;
    private boolean initialized;
    private boolean firstImageReady;
    private boolean screenshotRequested;
    private boolean screenshotOverwriteExisting;
    private java.lang.String screenshotFilename;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.backends.vulkan.VulkanBuffer screenshotBuffer;
    @org.jetbrains.annotations.Nullable()
    private java.nio.ByteBuffer imageBuffer;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.utils.H264Encoder encoder;
    private boolean recordMovie;
    private boolean pushMode;
    private java.nio.LongBuffer firstWaitSemaphore;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Scene scene;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.Node[] sceneArray;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools commandPools;
    private boolean validation;
    @org.jetbrains.annotations.NotNull()
    private org.lwjgl.vulkan.VkInstance instance;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.vulkan.VulkanDevice device;
    private long debugCallbackHandle;
    private long timestampQueryPool;
    @org.jetbrains.annotations.NotNull()
    private org.lwjgl.vulkan.VkSemaphoreCreateInfo semaphoreCreateInfo;
    @org.jetbrains.annotations.NotNull()
    private org.lwjgl.vulkan.VkQueue queue;
    @org.jetbrains.annotations.NotNull()
    private org.lwjgl.vulkan.VkQueue transferQueue;
    private long descriptorPool;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.vulkan.Swapchain swapchain;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.vulkan.VulkanRenderer.PresentHelpers ph;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.SceneryWindow window;
    private long pipelineCache;
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<graphics.scenery.backends.vulkan.VulkanRenderer.VertexDataKinds, graphics.scenery.backends.vulkan.VulkanRenderer.VertexDescription> vertexDescriptors;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<graphics.scenery.Node> sceneUBOs;
    @org.jetbrains.annotations.NotNull()
    private graphics.scenery.backends.vulkan.VulkanBufferPool geometryPool;
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<graphics.scenery.backends.vulkan.VulkanRenderer.StandardSemaphores, vkk.entities.VkSemaphoreArray> semaphores;
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanBuffer> buffers;
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanUBO> defaultUBOs;
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanTexture> textureCache;
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, vkk.entities.VkDescriptorSetLayout> descriptorSetLayouts;
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, vkk.entities.VkDescriptorSet> descriptorSets;
    private long lastTime;
    private float time;
    private int fps;
    private int frames;
    private long totalFrames;
    private long renderDelay;
    @org.jetbrains.annotations.NotNull()
    private java.util.Timer heartbeatTimer;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.utils.GPUStats gpuStats;
    private graphics.scenery.backends.RenderConfigReader.RenderConfig renderConfig;
    private java.util.List<java.lang.String> flow;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String renderConfigFile;
    @org.jetbrains.annotations.Nullable()
    private graphics.scenery.utils.SceneryPanel embedIn;

    public VulkanRenderer(@org.jetbrains.annotations.NotNull()
                              graphics.scenery.Hub hub, @org.jetbrains.annotations.NotNull()
                              java.lang.String applicationName, @org.jetbrains.annotations.NotNull()
                              graphics.scenery.Scene scene, int windowWidth, int windowHeight, @org.jetbrains.annotations.Nullable()
                              graphics.scenery.utils.SceneryPanel embedIn, @org.jetbrains.annotations.NotNull()
                              java.lang.String renderConfigFile) {
        super();
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.slf4j.Logger getLogger() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkDebugReportCallbackEXT getDebugCallback() {
        return null;
    }

    public final void setDebugCallback(@org.jetbrains.annotations.NotNull()
                                           org.lwjgl.vulkan.VkDebugReportCallbackEXT p0) {
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

    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getApplicationName() {
        return null;
    }

    protected final void setApplicationName(@org.jetbrains.annotations.NotNull()
                                                java.lang.String p0) {
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

    @java.lang.Override()
    public boolean getShouldClose() {
        return false;
    }

    @java.lang.Override()
    public void setShouldClose(boolean p0) {
    }

    @java.lang.Override()
    public boolean getManagesRenderLoop() {
        return false;
    }

    public void setManagesRenderLoop(boolean p0) {
    }

    @java.lang.Override()
    public float getLastFrameTime() {
        return 0.0F;
    }

    @java.lang.Override()
    public void setLastFrameTime(float p0) {
    }

    @java.lang.Override()
    public final boolean getInitialized() {
        return false;
    }

    @java.lang.Override()
    protected final void setInitialized(boolean p0) {
    }

    @java.lang.Override()
    public boolean getFirstImageReady() {
        return false;
    }

    @java.lang.Override()
    protected void setFirstImageReady(boolean p0) {
    }

    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.backends.vulkan.VulkanBuffer getScreenshotBuffer() {
        return null;
    }

    public final void setScreenshotBuffer(@org.jetbrains.annotations.Nullable()
                                              graphics.scenery.backends.vulkan.VulkanBuffer p0) {
    }

    @org.jetbrains.annotations.Nullable()
    public final java.nio.ByteBuffer getImageBuffer() {
        return null;
    }

    public final void setImageBuffer(@org.jetbrains.annotations.Nullable()
                                         java.nio.ByteBuffer p0) {
    }

    @org.jetbrains.annotations.Nullable()
    public final graphics.scenery.utils.H264Encoder getEncoder() {
        return null;
    }

    public final void setEncoder(@org.jetbrains.annotations.Nullable()
                                     graphics.scenery.utils.H264Encoder p0) {
    }

    public final boolean getRecordMovie() {
        return false;
    }

    public final void setRecordMovie(boolean p0) {
    }

    @java.lang.Override()
    public boolean getPushMode() {
        return false;
    }

    @java.lang.Override()
    public void setPushMode(boolean p0) {
    }

    @org.jetbrains.annotations.NotNull()
    public final graphics.scenery.Scene getScene() {
        return null;
    }

    public final void setScene(@org.jetbrains.annotations.NotNull()
                                   graphics.scenery.Scene p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.Node[] getSceneArray() {
        return null;
    }

    protected final void setSceneArray(@org.jetbrains.annotations.NotNull()
                                           graphics.scenery.Node[] p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools getCommandPools() {
        return null;
    }

    protected final void setCommandPools(@org.jetbrains.annotations.NotNull()
                                             graphics.scenery.backends.vulkan.VulkanRenderer.CommandPools p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.Map<java.lang.String, graphics.scenery.backends.vulkan.VulkanRenderpass> getRenderpasses() {
        return null;
    }

    protected final boolean getValidation() {
        return false;
    }

    protected final void setValidation(boolean p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final kotlin.Pair<java.lang.Boolean, java.util.List<java.lang.Integer>> getStrictValidation() {
        return null;
    }

    protected final boolean getWantsOpenGLSwapchain() {
        return false;
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<java.lang.String> getDefaultValidationLayers() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.lwjgl.vulkan.VkInstance getInstance() {
        return null;
    }

    protected final void setInstance(@org.jetbrains.annotations.NotNull()
                                         org.lwjgl.vulkan.VkInstance p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.vulkan.VulkanDevice getDevice() {
        return null;
    }

    protected final void setDevice(@org.jetbrains.annotations.NotNull()
                                       graphics.scenery.backends.vulkan.VulkanDevice p0) {
    }

    protected final long getDebugCallbackHandle() {
        return 0L;
    }

    protected final long getTimestampQueryPool() {
        return 0L;
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.lwjgl.vulkan.VkSemaphoreCreateInfo getSemaphoreCreateInfo() {
        return null;
    }

    protected final void setSemaphoreCreateInfo(@org.jetbrains.annotations.NotNull()
                                                    org.lwjgl.vulkan.VkSemaphoreCreateInfo p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.lwjgl.vulkan.VkQueue getQueue() {
        return null;
    }

    protected final void setQueue(@org.jetbrains.annotations.NotNull()
                                      org.lwjgl.vulkan.VkQueue p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final org.lwjgl.vulkan.VkQueue getTransferQueue() {
        return null;
    }

    protected final void setTransferQueue(@org.jetbrains.annotations.NotNull()
                                              org.lwjgl.vulkan.VkQueue p0) {
    }

    protected final long getDescriptorPool() {
        return 0L;
    }

    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.vulkan.Swapchain getSwapchain() {
        return null;
    }

    protected final void setSwapchain(@org.jetbrains.annotations.NotNull()
                                          graphics.scenery.backends.vulkan.Swapchain p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.vulkan.VulkanRenderer.PresentHelpers getPh() {
        return null;
    }

    protected final void setPh(@org.jetbrains.annotations.NotNull()
                                   graphics.scenery.backends.vulkan.VulkanRenderer.PresentHelpers p0) {
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

    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.vulkan.VulkanRenderer.SwapchainRecreator getSwapchainRecreator() {
        return null;
    }

    protected final long getPipelineCache() {
        return 0L;
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.ConcurrentHashMap<graphics.scenery.backends.vulkan.VulkanRenderer.VertexDataKinds, graphics.scenery.backends.vulkan.VulkanRenderer.VertexDescription> getVertexDescriptors() {
        return null;
    }

    protected final void setVertexDescriptors(@org.jetbrains.annotations.NotNull()
                                                  java.util.concurrent.ConcurrentHashMap<graphics.scenery.backends.vulkan.VulkanRenderer.VertexDataKinds, graphics.scenery.backends.vulkan.VulkanRenderer.VertexDescription> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<graphics.scenery.Node> getSceneUBOs() {
        return null;
    }

    protected final void setSceneUBOs(@org.jetbrains.annotations.NotNull()
                                          java.util.ArrayList<graphics.scenery.Node> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.vulkan.VulkanBufferPool getGeometryPool() {
        return null;
    }

    protected final void setGeometryPool(@org.jetbrains.annotations.NotNull()
                                             graphics.scenery.backends.vulkan.VulkanBufferPool p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.ConcurrentHashMap<graphics.scenery.backends.vulkan.VulkanRenderer.StandardSemaphores, vkk.entities.VkSemaphoreArray> getSemaphores() {
        return null;
    }

    protected final void setSemaphores(@org.jetbrains.annotations.NotNull()
                                           java.util.concurrent.ConcurrentHashMap<graphics.scenery.backends.vulkan.VulkanRenderer.StandardSemaphores, vkk.entities.VkSemaphoreArray> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanBuffer> getBuffers() {
        return null;
    }

    protected final void setBuffers(@org.jetbrains.annotations.NotNull()
                                        java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanBuffer> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanUBO> getDefaultUBOs() {
        return null;
    }

    protected final void setDefaultUBOs(@org.jetbrains.annotations.NotNull()
                                            java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanUBO> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanTexture> getTextureCache() {
        return null;
    }

    protected final void setTextureCache(@org.jetbrains.annotations.NotNull()
                                             java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanTexture> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.ConcurrentHashMap<java.lang.String, vkk.entities.VkDescriptorSetLayout> getDescriptorSetLayouts() {
        return null;
    }

    protected final void setDescriptorSetLayouts(@org.jetbrains.annotations.NotNull()
                                                     java.util.concurrent.ConcurrentHashMap<java.lang.String, vkk.entities.VkDescriptorSetLayout> p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.ConcurrentHashMap<java.lang.String, vkk.entities.VkDescriptorSet> getDescriptorSets() {
        return null;
    }

    protected final void setDescriptorSets(@org.jetbrains.annotations.NotNull()
                                               java.util.concurrent.ConcurrentHashMap<java.lang.String, vkk.entities.VkDescriptorSet> p0) {
    }

    protected final long getLastTime() {
        return 0L;
    }

    protected final void setLastTime(long p0) {
    }

    protected final float getTime() {
        return 0.0F;
    }

    protected final void setTime(float p0) {
    }

    public final int getFps() {
        return 0;
    }

    protected final void setFps(int p0) {
    }

    protected final int getFrames() {
        return 0;
    }

    protected final void setFrames(int p0) {
    }

    protected final long getTotalFrames() {
        return 0L;
    }

    protected final void setTotalFrames(long p0) {
    }

    protected final long getRenderDelay() {
        return 0L;
    }

    protected final void setRenderDelay(long p0) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.Timer getHeartbeatTimer() {
        return null;
    }

    protected final void setHeartbeatTimer(@org.jetbrains.annotations.NotNull()
                                               java.util.Timer p0) {
    }

    @org.jetbrains.annotations.Nullable()
    protected final graphics.scenery.utils.GPUStats getGpuStats() {
        return null;
    }

    protected final void setGpuStats(@org.jetbrains.annotations.Nullable()
                                         graphics.scenery.utils.GPUStats p0) {
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

    @org.jetbrains.annotations.NotNull()
    public final org.lwjgl.vulkan.VkDevice getVkDev() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED"})
    public final <T extends java.lang.Object, R extends java.lang.Object> java.util.List<R> parallelMap(@org.jetbrains.annotations.NotNull()
                                                                                                            java.lang.Iterable<? extends T> $receiver, int numThreads, @org.jetbrains.annotations.NotNull()
                                                                                                            java.util.concurrent.ExecutorService exec, @org.jetbrains.annotations.NotNull()
                                                                                                            kotlin.jvm.functions.Function1<? super T, ? extends R> transform) {
        return null;
    }

    @kotlin.Suppress(names = {"UNUSED"})
    public final void setCurrentScene(@org.jetbrains.annotations.NotNull()
                                          graphics.scenery.Scene scene) {
    }

    /**
     * * This function should initialize the current scene contents.
     */
    @java.lang.Override()
    public void initializeScene() {
    }

    public final void updateNodeGeometry(@org.jetbrains.annotations.NotNull()
                                             graphics.scenery.Node node) {
    }

    /**
     * * Returns the material type flag for a Node, considering it's [Material]'s textures.
     */
    protected final int materialTypeFromTextures(@org.jetbrains.annotations.NotNull()
                                                     graphics.scenery.Node $receiver, @org.jetbrains.annotations.NotNull()
                                                     graphics.scenery.backends.vulkan.VulkanObjectState s) {
        return 0;
    }

    /**
     * * Initialises a given [node] with the metadata required by the [VulkanRenderer].
     */
    public final boolean initializeNode(@org.jetbrains.annotations.NotNull()
                                            graphics.scenery.Node node) {
        return false;
    }

    private final boolean initializeCustomShadersForNode(graphics.scenery.Node node, boolean addInitializer) {
        return false;
    }

    public final void destroyNode(@org.jetbrains.annotations.NotNull()
                                      graphics.scenery.Node node) {
    }

    /**
     * * Returns true if the current VulkanTexture can be reused to store the information in the [GenericTexture]
     * * [other]. Returns false otherwise.
     */
    protected final boolean canBeReused(@org.jetbrains.annotations.NotNull()
                                            graphics.scenery.backends.vulkan.VulkanTexture $receiver, @org.jetbrains.annotations.NotNull()
                                            graphics.scenery.GenericTexture other, int miplevels, @org.jetbrains.annotations.NotNull()
                                            graphics.scenery.backends.vulkan.VulkanDevice device) {
        return false;
    }

    /**
     * * Loads a texture given as string in [texture] from the classpath of this Node. Emits an error and falls back
     * * to [fallback] in case the texture cannot be located.
     */
    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.vulkan.VulkanTexture loadTextureFromJar(@org.jetbrains.annotations.NotNull()
                                                                                          graphics.scenery.Node $receiver, @org.jetbrains.annotations.NotNull()
                                                                                          java.lang.String texture, boolean generateMipmaps, @org.jetbrains.annotations.NotNull()
                                                                                          graphics.scenery.backends.vulkan.VulkanTexture fallback) {
        return null;
    }

    /**
     * * Loads or reloads the textures for [node], updating it's internal renderer state stored in [s].
     */
    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.vulkan.VulkanObjectState loadTexturesForNode(@org.jetbrains.annotations.NotNull()
                                                                                               graphics.scenery.Node node, @org.jetbrains.annotations.NotNull()
                                                                                               graphics.scenery.backends.vulkan.VulkanObjectState s) {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.ConcurrentHashMap<java.lang.String, vkk.entities.VkDescriptorSetLayout> prepareDefaultDescriptorSetLayouts() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.ConcurrentHashMap<graphics.scenery.backends.vulkan.VulkanRenderer.VertexDataKinds, graphics.scenery.backends.vulkan.VulkanRenderer.VertexDescription> prepareStandardVertexDescriptors() {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    public final java.util.List<graphics.scenery.backends.vulkan.VulkanRenderer.AttributeInfo> getFormatsAndRequiredAttributeSize(@org.jetbrains.annotations.NotNull()
                                                                                                                                      java.util.HashMap<java.lang.String, kotlin.jvm.functions.Function0<java.lang.Object>> $receiver) {
        return null;
    }

    @org.jetbrains.annotations.NotNull()
    protected final graphics.scenery.backends.vulkan.VulkanRenderer.VertexDescription vertexDescriptionFromInstancedNode(@org.jetbrains.annotations.NotNull()
                                                                                                                             graphics.scenery.Node node, @org.jetbrains.annotations.NotNull()
                                                                                                                             graphics.scenery.backends.vulkan.VulkanRenderer.VertexDescription template) {
        return null;
    }

    protected final void prepareDefaultTextures(@org.jetbrains.annotations.NotNull()
                                                    graphics.scenery.backends.vulkan.VulkanDevice device) {
    }

    protected final void prepareRenderpassesFromConfig(@org.jetbrains.annotations.NotNull()
                                                           graphics.scenery.backends.RenderConfigReader.RenderConfig config, int windowWidth, int windowHeight) {
    }

    @org.jetbrains.annotations.NotNull()
    protected final java.util.concurrent.ConcurrentHashMap<graphics.scenery.backends.vulkan.VulkanRenderer.StandardSemaphores, vkk.entities.VkSemaphoreArray> prepareStandardSemaphores() {
        return null;
    }

    /**
     * * Polls for window events and triggers swapchain recreation if necessary.
     * * Returns true if the swapchain has been recreated, or false if not.
     */
    private final boolean pollEvents() {
        return false;
    }

    private final void beginFrame() {
    }

    @kotlin.Suppress(names = {"unused"})
    public final void recordMovie() {
    }

    private final void submitFrame(org.lwjgl.vulkan.VkQueue queue, graphics.scenery.backends.vulkan.VulkanRenderpass pass, graphics.scenery.backends.vulkan.VulkanCommandBuffer commandBuffer, graphics.scenery.backends.vulkan.VulkanRenderer.PresentHelpers present) {
    }

    /**
     * * This function renders the scene
     */
    @java.lang.Override()
    public void render() {
    }

    private final void updateTimings() {
    }

    private final org.lwjgl.vulkan.VkInstance createInstance(java.util.ArrayList<java.lang.String> requiredExtensions) {
        return null;
    }

    private final long setupDebugging(org.lwjgl.vulkan.VkInstance instance, int flags, org.lwjgl.vulkan.VkDebugReportCallbackEXT callback) {
        return 0L;
    }

    private final graphics.scenery.backends.vulkan.VulkanObjectState createVertexBuffers(graphics.scenery.backends.vulkan.VulkanDevice device, graphics.scenery.Node node, graphics.scenery.backends.vulkan.VulkanObjectState state) {
        return null;
    }

    private final graphics.scenery.backends.vulkan.VulkanObjectState updateInstanceBuffer(graphics.scenery.backends.vulkan.VulkanDevice device, graphics.scenery.Node parentNode, graphics.scenery.backends.vulkan.VulkanObjectState state) {
        return null;
    }

    private final long createDescriptorPool() {
        return 0L;
    }

    private final void prepareDefaultBuffers(graphics.scenery.backends.vulkan.VulkanDevice device, java.util.concurrent.ConcurrentHashMap<java.lang.String, graphics.scenery.backends.vulkan.VulkanBuffer> bufferStorage) {
    }

    private final graphics.scenery.backends.vulkan.VulkanObjectState rendererMetadata(@org.jetbrains.annotations.NotNull()
                                                                                          graphics.scenery.Node $receiver) {
        return null;
    }

    private final void recordSceneRenderCommands(graphics.scenery.backends.vulkan.VulkanRenderpass pass, graphics.scenery.backends.vulkan.VulkanCommandBuffer commandBuffer, kotlinx.coroutines.Deferred<? extends java.util.List<? extends graphics.scenery.Node>> sceneObjects, kotlin.jvm.functions.Function1<? super graphics.scenery.Node, java.lang.Boolean> customNodeFilter, boolean forceRerecording) {
    }

    private final void recordPostprocessRenderCommands(graphics.scenery.backends.vulkan.VulkanRenderpass pass, graphics.scenery.backends.vulkan.VulkanCommandBuffer commandBuffer) {
    }

    private final int setRequiredDescriptorSetsPostprocess(@org.jetbrains.annotations.NotNull()
                                                               graphics.scenery.backends.vulkan.VulkanRenderpass.VulkanMetadata $receiver, graphics.scenery.backends.vulkan.VulkanRenderpass pass, graphics.scenery.backends.vulkan.VulkanPipeline pipeline) {
        return 0;
    }

    private final void updateInstanceBuffers(kotlinx.coroutines.Deferred<? extends java.util.List<? extends graphics.scenery.Node>> sceneObjects) {
    }

    @org.jetbrains.annotations.NotNull()
    public final cleargl.GLMatrix applyVulkanCoordinateSystem(@org.jetbrains.annotations.NotNull()
                                                                  cleargl.GLMatrix $receiver) {
        return null;
    }

    private final graphics.scenery.backends.Display wantsVR(@org.jetbrains.annotations.NotNull()
                                                                graphics.scenery.backends.Display $receiver) {
        return null;
    }

    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, vkk.entities.VkDescriptorSet> getDescriptorCache() {
        return null;
    }

    private final boolean updateDefaultUBOs(graphics.scenery.backends.vulkan.VulkanDevice device) {
        return false;
    }

    @kotlin.Suppress(names = {"UNUSED"})
    @java.lang.Override()
    public void screenshot(@org.jetbrains.annotations.NotNull()
                               java.lang.String filename, boolean overwrite) {
    }

    public final int toggle(int $receiver) {
        return 0;
    }

    @kotlin.Suppress(names = {"UNUSED"})
    public final void toggleDebug() {
    }

    /**
     * * Closes the current instance of [VulkanRenderer].
     */
    @java.lang.Override()
    public void close() {
    }

    public final void closeInternal() {
    }

    @java.lang.Override()
    public void reshape(int newWidth, int newHeight) {
    }

    @kotlin.Suppress(names = {"UNUSED"})
    public final void toggleFullscreen() {
    }

    public final void switchFullscreen() {
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

    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public final graphics.scenery.utils.SceneryPanel getEmbedIn() {
        return null;
    }

    @java.lang.Override()
    public final void setEmbedIn(@org.jetbrains.annotations.Nullable()
                                     graphics.scenery.utils.SceneryPanel p0) {
    }

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDataKinds;", "", "(Ljava/lang/String;I)V", "None", "PositionNormalTexcoord", "PositionTexcoords", "PositionNormal", "scenery"})
    public static enum VertexDataKinds {
        /*public static final*/ None /* = new None() */,
        /*public static final*/ PositionNormalTexcoord /* = new PositionNormalTexcoord() */,
        /*public static final*/ PositionTexcoords /* = new PositionTexcoords() */,
        /*public static final*/ PositionNormal /* = new PositionNormal() */;

        VertexDataKinds() {
        }
    }

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer$StandardSemaphores;", "", "(Ljava/lang/String;I)V", "RenderComplete", "ImageAvailable", "PresentComplete", "scenery"})
    public static enum StandardSemaphores {
        /*public static final*/ RenderComplete /* = new RenderComplete() */,
        /*public static final*/ ImageAvailable /* = new ImageAvailable() */,
        /*public static final*/ PresentComplete /* = new PresentComplete() */;

        StandardSemaphores() {
        }
    }

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B:\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0011\u0010 \u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\bH\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b%\u0010&J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020-H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer$PresentHelpers;", "", "signalSemaphore", "Lvkk/entities/VkSemaphore;", "waitSemaphore", "commandBuffers", "Lorg/lwjgl/PointerBuffer;", "waitStages", "Ljava/nio/IntBuffer;", "submitInfo", "Lorg/lwjgl/vulkan/VkSubmitInfo;", "(JJLorg/lwjgl/PointerBuffer;Ljava/nio/IntBuffer;Lorg/lwjgl/vulkan/VkSubmitInfo;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCommandBuffers", "()Lorg/lwjgl/PointerBuffer;", "setCommandBuffers", "(Lorg/lwjgl/PointerBuffer;)V", "getSignalSemaphore", "()J", "setSignalSemaphore-6Aavuyc", "(J)V", "J", "getSubmitInfo", "()Lorg/lwjgl/vulkan/VkSubmitInfo;", "setSubmitInfo", "(Lorg/lwjgl/vulkan/VkSubmitInfo;)V", "getWaitSemaphore", "setWaitSemaphore-6Aavuyc", "getWaitStages", "()Ljava/nio/IntBuffer;", "setWaitStages", "(Ljava/nio/IntBuffer;)V", "component1", "component2", "component3", "component4", "component5", "copy", "copy-dyxI85A", "(JJLorg/lwjgl/PointerBuffer;Ljava/nio/IntBuffer;Lorg/lwjgl/vulkan/VkSubmitInfo;)Lgraphics/scenery/backends/vulkan/VulkanRenderer$PresentHelpers;", "equals", "", "other", "hashCode", "", "toString", "", "scenery"})
    public static final class PresentHelpers {
        private long signalSemaphore;
        private long waitSemaphore;
        @org.jetbrains.annotations.NotNull()
        private org.lwjgl.PointerBuffer commandBuffers;
        @org.jetbrains.annotations.NotNull()
        private java.nio.IntBuffer waitStages;
        @org.jetbrains.annotations.NotNull()
        private org.lwjgl.vulkan.VkSubmitInfo submitInfo;

        private PresentHelpers(long signalSemaphore, long waitSemaphore, org.lwjgl.PointerBuffer commandBuffers, java.nio.IntBuffer waitStages, org.lwjgl.vulkan.VkSubmitInfo submitInfo) {
            super();
        }

        private PresentHelpers() {
            super();
        }

        public final long getSignalSemaphore() {
            return 0L;
        }

        public final long getWaitSemaphore() {
            return 0L;
        }

        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.PointerBuffer getCommandBuffers() {
            return null;
        }

        public final void setCommandBuffers(@org.jetbrains.annotations.NotNull()
                                                org.lwjgl.PointerBuffer p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final java.nio.IntBuffer getWaitStages() {
            return null;
        }

        public final void setWaitStages(@org.jetbrains.annotations.NotNull()
                                            java.nio.IntBuffer p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.vulkan.VkSubmitInfo getSubmitInfo() {
            return null;
        }

        public final void setSubmitInfo(@org.jetbrains.annotations.NotNull()
                                            org.lwjgl.vulkan.VkSubmitInfo p0) {
        }

        public final long component1() {
            return 0L;
        }

        public final long component2() {
            return 0L;
        }

        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.PointerBuffer component3() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.nio.IntBuffer component4() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.vulkan.VkSubmitInfo component5() {
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

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer$VertexDescription;", "", "state", "Lorg/lwjgl/vulkan/VkPipelineVertexInputStateCreateInfo;", "attributeDescription", "Lorg/lwjgl/vulkan/VkVertexInputAttributeDescription$Buffer;", "bindingDescription", "Lorg/lwjgl/vulkan/VkVertexInputBindingDescription$Buffer;", "(Lorg/lwjgl/vulkan/VkPipelineVertexInputStateCreateInfo;Lorg/lwjgl/vulkan/VkVertexInputAttributeDescription$Buffer;Lorg/lwjgl/vulkan/VkVertexInputBindingDescription$Buffer;)V", "getAttributeDescription", "()Lorg/lwjgl/vulkan/VkVertexInputAttributeDescription$Buffer;", "getBindingDescription", "()Lorg/lwjgl/vulkan/VkVertexInputBindingDescription$Buffer;", "getState", "()Lorg/lwjgl/vulkan/VkPipelineVertexInputStateCreateInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scenery"})
    public static final class VertexDescription {
        @org.jetbrains.annotations.NotNull()
        private final org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo state = null;
        @org.jetbrains.annotations.Nullable()
        private final org.lwjgl.vulkan.VkVertexInputAttributeDescription.Buffer attributeDescription = null;
        @org.jetbrains.annotations.Nullable()
        private final org.lwjgl.vulkan.VkVertexInputBindingDescription.Buffer bindingDescription = null;

        public VertexDescription(@org.jetbrains.annotations.NotNull()
                                     org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo state, @org.jetbrains.annotations.Nullable()
                                     org.lwjgl.vulkan.VkVertexInputAttributeDescription.Buffer attributeDescription, @org.jetbrains.annotations.Nullable()
                                     org.lwjgl.vulkan.VkVertexInputBindingDescription.Buffer bindingDescription) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo getState() {
            return null;
        }

        @org.jetbrains.annotations.Nullable()
        public final org.lwjgl.vulkan.VkVertexInputAttributeDescription.Buffer getAttributeDescription() {
            return null;
        }

        @org.jetbrains.annotations.Nullable()
        public final org.lwjgl.vulkan.VkVertexInputBindingDescription.Buffer getBindingDescription() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo component1() {
            return null;
        }

        @org.jetbrains.annotations.Nullable()
        public final org.lwjgl.vulkan.VkVertexInputAttributeDescription.Buffer component2() {
            return null;
        }

        @org.jetbrains.annotations.Nullable()
        public final org.lwjgl.vulkan.VkVertexInputBindingDescription.Buffer component3() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanRenderer.VertexDescription copy(@org.jetbrains.annotations.NotNull()
                                                                                                org.lwjgl.vulkan.VkPipelineVertexInputStateCreateInfo state, @org.jetbrains.annotations.Nullable()
                                                                                                org.lwjgl.vulkan.VkVertexInputAttributeDescription.Buffer attributeDescription, @org.jetbrains.annotations.Nullable()
                                                                                                org.lwjgl.vulkan.VkVertexInputBindingDescription.Buffer bindingDescription) {
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

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0012\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004B0\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u001f\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001f\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001f\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR\u001f\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "", "commandPool", "Lvkk/entities/VkCommandPool;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Standard", "Render", "Compute", "Transfer", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCompute", "()J", "setCompute-78nvDYs", "(J)V", "J", "getRender", "setRender-78nvDYs", "getStandard", "setStandard-78nvDYs", "getTransfer", "setTransfer-78nvDYs", "component1", "component2", "component3", "component4", "copy", "copy-V4HtOmE", "(JJJJ)Lgraphics/scenery/backends/vulkan/VulkanRenderer$CommandPools;", "equals", "", "other", "hashCode", "", "toString", "", "scenery"})
    public static final class CommandPools {
        private long Standard;
        private long Render;
        private long Compute;
        private long Transfer;

        private CommandPools(long Standard, long Render, long Compute, long Transfer) {
            super();
        }

        private CommandPools() {
            super();
        }

        private CommandPools(long commandPool) {
            super();
        }

        public final long getStandard() {
            return 0L;
        }

        public final long getRender() {
            return 0L;
        }

        public final long getCompute() {
            return 0L;
        }

        public final long getTransfer() {
            return 0L;
        }

        public final long component1() {
            return 0L;
        }

        public final long component2() {
            return 0L;
        }

        public final long component3() {
            return 0L;
        }

        public final long component4() {
            return 0L;
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

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nH\u00c6\u0003JI\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer$DeviceAndGraphicsQueueFamily;", "", "device", "Lorg/lwjgl/vulkan/VkDevice;", "graphicsQueue", "", "computeQueue", "presentQueue", "transferQueue", "memoryProperties", "Lorg/lwjgl/vulkan/VkPhysicalDeviceMemoryProperties;", "(Lorg/lwjgl/vulkan/VkDevice;IIIILorg/lwjgl/vulkan/VkPhysicalDeviceMemoryProperties;)V", "getComputeQueue", "()I", "getDevice", "()Lorg/lwjgl/vulkan/VkDevice;", "getGraphicsQueue", "getMemoryProperties", "()Lorg/lwjgl/vulkan/VkPhysicalDeviceMemoryProperties;", "getPresentQueue", "getTransferQueue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "scenery"})
    public static final class DeviceAndGraphicsQueueFamily {
        @org.jetbrains.annotations.Nullable()
        private final org.lwjgl.vulkan.VkDevice device = null;
        private final int graphicsQueue = 0;
        private final int computeQueue = 0;
        private final int presentQueue = 0;
        private final int transferQueue = 0;
        @org.jetbrains.annotations.Nullable()
        private final org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties memoryProperties = null;

        public DeviceAndGraphicsQueueFamily(@org.jetbrains.annotations.Nullable()
                                                org.lwjgl.vulkan.VkDevice device, int graphicsQueue, int computeQueue, int presentQueue, int transferQueue, @org.jetbrains.annotations.Nullable()
                                                org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties memoryProperties) {
            super();
        }

        public DeviceAndGraphicsQueueFamily() {
            super();
        }

        @org.jetbrains.annotations.Nullable()
        public final org.lwjgl.vulkan.VkDevice getDevice() {
            return null;
        }

        public final int getGraphicsQueue() {
            return 0;
        }

        public final int getComputeQueue() {
            return 0;
        }

        public final int getPresentQueue() {
            return 0;
        }

        public final int getTransferQueue() {
            return 0;
        }

        @org.jetbrains.annotations.Nullable()
        public final org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties getMemoryProperties() {
            return null;
        }

        @org.jetbrains.annotations.Nullable()
        public final org.lwjgl.vulkan.VkDevice component1() {
            return null;
        }

        public final int component2() {
            return 0;
        }

        public final int component3() {
            return 0;
        }

        public final int component4() {
            return 0;
        }

        public final int component5() {
            return 0;
        }

        @org.jetbrains.annotations.Nullable()
        public final org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties component6() {
            return null;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanRenderer.DeviceAndGraphicsQueueFamily copy(@org.jetbrains.annotations.Nullable()
                                                                                                           org.lwjgl.vulkan.VkDevice device, int graphicsQueue, int computeQueue, int presentQueue, int transferQueue, @org.jetbrains.annotations.Nullable()
                                                                                                           org.lwjgl.vulkan.VkPhysicalDeviceMemoryProperties memoryProperties) {
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

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001c\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006R\u001f\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001f\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00f8\u0001\u0000\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer$Pipeline;", "", "pipeline", "Lvkk/entities/VkPipeline;", "layout", "Lvkk/entities/VkPipelineLayout;", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLayout", "()J", "setLayout-83XpTMI", "(J)V", "J", "getPipeline", "setPipeline-eOUw4p0", "scenery"})
    public static final class Pipeline {
        private long pipeline;
        private long layout;

        private Pipeline(long pipeline, long layout) {
            super();
        }

        private Pipeline() {
            super();
        }

        public final long getPipeline() {
            return 0L;
        }

        public final long getLayout() {
            return 0L;
        }
    }

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:\u0004\f\r\u000e\u000fB\u001e\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0010\u0011\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer$DescriptorSet;", "", "id", "Lvkk/entities/VkDescriptorSet;", "name", "", "(JLjava/lang/String;)V", "getId", "()J", "J", "getName", "()Ljava/lang/String;", "Companion", "DynamicSet", "None", "Set", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$DescriptorSet$None;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$DescriptorSet$Set;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$DescriptorSet$DynamicSet;", "scenery"})
    public static abstract class DescriptorSet {
        public static final graphics.scenery.backends.vulkan.VulkanRenderer.DescriptorSet.Companion Companion = null;
        private final long id = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;

        private DescriptorSet(long id, java.lang.String name) {
            super();
        }

        public final long getId() {
            return 0L;
        }

        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }

        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0003"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer$DescriptorSet$None;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$DescriptorSet;", "()V", "scenery"})
        public static final class None extends graphics.scenery.backends.vulkan.VulkanRenderer.DescriptorSet {
            public static final graphics.scenery.backends.vulkan.VulkanRenderer.DescriptorSet.None INSTANCE = null;

            private None() {
                super(0L, null);
            }
        }

        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\f\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer$DescriptorSet$Set;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$DescriptorSet;", "setId", "Lvkk/entities/VkDescriptorSet;", "setName", "", "(JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSetId", "()J", "J", "getSetName", "()Ljava/lang/String;", "component1", "component2", "copy", "copy-X_N8RzU", "(JLjava/lang/String;)Lgraphics/scenery/backends/vulkan/VulkanRenderer$DescriptorSet$Set;", "equals", "", "other", "", "hashCode", "", "toString", "scenery"})
        public static final class Set extends graphics.scenery.backends.vulkan.VulkanRenderer.DescriptorSet {
            private final long setId = 0L;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String setName = null;

            private Set(long setId, java.lang.String setName) {
                super(0L, null);
            }

            public final long getSetId() {
                return 0L;
            }

            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getSetName() {
                return null;
            }

            public final long component1() {
                return 0L;
            }

            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component2() {
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

        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\"\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u0003\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer$DescriptorSet$DynamicSet;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$DescriptorSet;", "setId", "Lvkk/entities/VkDescriptorSet;", "offset", "", "setName", "", "(JILjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOffset", "()I", "getSetId", "()J", "J", "getSetName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "copy-UdTcBCQ", "(JILjava/lang/String;)Lgraphics/scenery/backends/vulkan/VulkanRenderer$DescriptorSet$DynamicSet;", "equals", "", "other", "", "hashCode", "toString", "scenery"})
        public static final class DynamicSet extends graphics.scenery.backends.vulkan.VulkanRenderer.DescriptorSet {
            private final long setId = 0L;
            private final int offset = 0;
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String setName = null;

            private DynamicSet(long setId, int offset, java.lang.String setName) {
                super(0L, null);
            }

            public final long getSetId() {
                return 0L;
            }

            public final int getOffset() {
                return 0;
            }

            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getSetName() {
                return null;
            }

            public final long component1() {
                return 0L;
            }

            public final int component2() {
                return 0;
            }

            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component3() {
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

        @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer$DescriptorSet$Companion;", "", "()V", "setOrNull", "Lgraphics/scenery/backends/vulkan/VulkanRenderer$DescriptorSet;", "id", "Lvkk/entities/VkDescriptorSet;", "setName", "", "setOrNull-JWbP2YQ", "scenery"})
        public static final class Companion {

            private Companion() {
                super();
            }
        }
    }

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer$AttributeInfo;", "", "format", "Lvkk/VkFormat;", "elementByteSize", "", "elementCount", "(Lvkk/VkFormat;II)V", "getElementByteSize", "()I", "getElementCount", "getFormat", "()Lvkk/VkFormat;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "scenery"})
    public static final class AttributeInfo {
        @org.jetbrains.annotations.NotNull()
        private final vkk.VkFormat format = null;
        private final int elementByteSize = 0;
        private final int elementCount = 0;

        public AttributeInfo(@org.jetbrains.annotations.NotNull()
                                 vkk.VkFormat format, int elementByteSize, int elementCount) {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final vkk.VkFormat getFormat() {
            return null;
        }

        public final int getElementByteSize() {
            return 0;
        }

        public final int getElementCount() {
            return 0;
        }

        @org.jetbrains.annotations.NotNull()
        public final vkk.VkFormat component1() {
            return null;
        }

        public final int component2() {
            return 0;
        }

        public final int component3() {
            return 0;
        }

        @org.jetbrains.annotations.NotNull()
        public final graphics.scenery.backends.vulkan.VulkanRenderer.AttributeInfo copy(@org.jetbrains.annotations.NotNull()
                                                                                            vkk.VkFormat format, int elementByteSize, int elementCount) {
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

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00120\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer$Companion;", "", "()V", "MATERIAL_HAS_ALPHAMASK", "", "MATERIAL_HAS_AMBIENT", "MATERIAL_HAS_DIFFUSE", "MATERIAL_HAS_NORMAL", "MATERIAL_HAS_SPECULAR", "MAX_INPUT_ATTACHMENTS", "MAX_TEXTURES", "MAX_UBOS", "UINT64_MAX", "", "VK_FLAGS_NONE", "getStrictValidation", "Lkotlin/Pair;", "", "", "scenery"})
    public static final class Companion {

        private Companion() {
            super();
        }

        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Boolean, java.util.List<java.lang.Integer>> getStrictValidation() {
            return null;
        }
    }

    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0013\u001a\u00020\u0006R*\u0010\u0003\u001a\u0012\u0012\b\u0012\u00060\u0000R\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lgraphics/scenery/backends/vulkan/VulkanRenderer$SwapchainRecreator;", "", "(Lgraphics/scenery/backends/vulkan/VulkanRenderer;)V", "afterRecreateHook", "Lkotlin/Function1;", "Lgraphics/scenery/backends/vulkan/VulkanRenderer;", "", "getAfterRecreateHook", "()Lkotlin/jvm/functions/Function1;", "setAfterRecreateHook", "(Lkotlin/jvm/functions/Function1;)V", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "mustRecreate", "", "getMustRecreate", "()Z", "setMustRecreate", "(Z)V", "recreate", "scenery"})
    public final class SwapchainRecreator {
        private final java.util.concurrent.locks.ReentrantLock lock = null;
        private boolean mustRecreate;
        @org.jetbrains.annotations.NotNull()
        private kotlin.jvm.functions.Function1<? super graphics.scenery.backends.vulkan.VulkanRenderer.SwapchainRecreator, kotlin.Unit> afterRecreateHook;

        public SwapchainRecreator() {
            super();
        }

        public final boolean getMustRecreate() {
            return false;
        }

        public final void setMustRecreate(boolean p0) {
        }

        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<graphics.scenery.backends.vulkan.VulkanRenderer.SwapchainRecreator, kotlin.Unit> getAfterRecreateHook() {
            return null;
        }

        public final void setAfterRecreateHook(@org.jetbrains.annotations.NotNull()
                                                   kotlin.jvm.functions.Function1<? super graphics.scenery.backends.vulkan.VulkanRenderer.SwapchainRecreator, kotlin.Unit> p0) {
        }

        public final synchronized void recreate() {
        }
    }
}
