package graphics.scenery.controls.behaviours;

import java.lang.System;

/**
 * * Gamepad Axis Event Behaviour Interface
 * *
 * * Tracks the given axis of a gamepad
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lgraphics/scenery/controls/behaviours/GamepadBehaviour;", "Lorg/scijava/ui/behaviour/Behaviour;", "axis", "", "Lnet/java/games/input/Component$Identifier;", "getAxis", "()Ljava/util/List;", "axisEvent", "", "value", "", "scenery"})
public abstract interface GamepadBehaviour extends org.scijava.ui.behaviour.Behaviour {
    
    /**
     * The axis of the controller this behaviour is assigned to 
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<net.java.games.input.Component.Identifier> getAxis();
    
    /**
     * * This function is called when the given axis is triggered
     *     *
     *     * @param[axis] The gamepad axis.
     *     * @param[value] The absolute position of the axis.
     */
    public abstract void axisEvent(@org.jetbrains.annotations.NotNull()
    net.java.games.input.Component.Identifier axis, float value);
}