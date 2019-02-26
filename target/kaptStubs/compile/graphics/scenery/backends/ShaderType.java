package graphics.scenery.backends;

/**
 * * Enum for all the supported shader types.
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lgraphics/scenery/backends/ShaderType;", "", "(Ljava/lang/String;I)V", "VertexShader", "TessellationControlShader", "TessellationEvaluationShader", "GeometryShader", "FragmentShader", "ComputeShader", "scenery"})
public enum ShaderType {
    /*public static final*/ VertexShader /* = new VertexShader() */,
    /*public static final*/ TessellationControlShader /* = new TessellationControlShader() */,
    /*public static final*/ TessellationEvaluationShader /* = new TessellationEvaluationShader() */,
    /*public static final*/ GeometryShader /* = new GeometryShader() */,
    /*public static final*/ FragmentShader /* = new FragmentShader() */,
    /*public static final*/ ComputeShader /* = new ComputeShader() */;

    ShaderType() {
    }
}
