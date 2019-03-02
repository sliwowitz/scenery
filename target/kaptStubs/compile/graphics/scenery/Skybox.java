package graphics.scenery;

import java.lang.System;

/**
 * * Skybox class. Sets a [ShaderMaterial] using a shader that will always cause
 * * the depth test to fail if there is geometry in front, creating the illusion of a far
 * * away box.
 * *
 * * @author Ulrik Günther <hello@ulrik.is>
 * * @constructor Creates a [Box] with the magic skybox shader as material.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lgraphics/scenery/Skybox;", "Lgraphics/scenery/Box;", "()V", "scenery"})
public class Skybox extends graphics.scenery.Box {
    
    public Skybox() {
        super(null, false);
    }
}