package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.TurtleEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(TurtleEntity.class)
public abstract class TurtleMixin {

    @ModifyReturnValue(method = "createTurtleAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyTurtleAttributes(DefaultAttributeContainer.Builder original) {
        double health = 30.0 * CONFIG.healthMultiplierForTurtle() * CONFIG.healthMultiplierForAll();
        double speed = 0.25 * CONFIG.speedMultiplierForTurtle() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForTurtle() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
