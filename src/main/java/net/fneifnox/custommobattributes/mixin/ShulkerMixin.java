package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.ShulkerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(ShulkerEntity.class)
public abstract class ShulkerMixin {

    @ModifyReturnValue(method = "createShulkerAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyShulkerAttributes(DefaultAttributeContainer.Builder original) {
        double health = 30.0 * CONFIG.healthMultiplierForShulker() * CONFIG.healthMultiplierForAll();
        double speed = 0.7 * CONFIG.speedMultiplierForShulker() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForShulker() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}
