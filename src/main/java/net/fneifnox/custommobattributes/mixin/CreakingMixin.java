package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.CowEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(CowEntity.class)
public abstract class CreakingMixin {

    @ModifyReturnValue(method = "createCowAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyCowAttributes(DefaultAttributeContainer.Builder original) {
        double health = 10.0 * CONFIG.healthMultiplierForCow() * CONFIG.healthMultiplierForAll();
        double speed = 0.20000000298023224 * CONFIG.speedMultiplierForCow() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForCow() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}