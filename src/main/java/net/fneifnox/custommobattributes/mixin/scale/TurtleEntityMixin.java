package net.fneifnox.custommobattributes.mixin.scale;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.entity.passive.TurtleEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(TurtleEntity.class)
public class TurtleEntityMixin {

    @ModifyReturnValue(method = "getScaleFactor", at = @At("RETURN"))
    private float changeTurtleScale(float original) {
        TurtleEntity turtle = (TurtleEntity)(Object)this;
        float multiplier =  (float) turtle.getAttributeValue(CustomMobAttributes.SCALE);
        return original * multiplier;
    }
}
