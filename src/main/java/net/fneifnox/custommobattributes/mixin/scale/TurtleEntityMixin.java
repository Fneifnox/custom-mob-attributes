package net.fneifnox.custommobattributes.mixin.scale;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.world.entity.animal.Turtle;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Turtle.class)
public class TurtleEntityMixin {

    @ModifyReturnValue(method = "getScale", at = @At("RETURN"))
    private float changeTurtleScale(float original) {
        Turtle turtle = (Turtle)(Object)this;
        float multiplier =  (float) turtle.getAttributeValue(CustomMobAttributes.SCALE);
        return original * multiplier;
    }
}
