package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.ChickenEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(ChickenEntity.class)
public abstract class ChickenMixin {

    @ModifyReturnValue(method = "createChickenAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyChickenAttributes(DefaultAttributeContainer.Builder original) {
        double health = 4.0 * CONFIG.healthMultiplierForChicken() * CONFIG.healthMultiplierForAll();
        double speed = 0.25 * CONFIG.speedMultiplierForChicken() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForChicken() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
