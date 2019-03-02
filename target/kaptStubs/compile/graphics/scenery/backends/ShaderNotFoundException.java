package graphics.scenery.backends;

import java.lang.System;

/**
 * * Exception to be thrown if a shader file cannot be located.
 * *
 * * @author Ulrik Guenther <hello@ulrik.is>
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lgraphics/scenery/backends/ShaderNotFoundException;", "Ljava/io/FileNotFoundException;", "description", "", "(Ljava/lang/String;)V", "scenery"})
public final class ShaderNotFoundException extends java.io.FileNotFoundException {
    
    public ShaderNotFoundException(@org.jetbrains.annotations.NotNull()
    java.lang.String description) {
        super();
    }
}