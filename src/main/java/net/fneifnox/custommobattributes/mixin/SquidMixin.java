package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.fneifnox.custommobattributes.Updater;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.SquidEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(SquidEntity.class)
public abstract class SquidMixin {

    @ModifyReturnValue(method = "createSquidAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifySquidAttributes(DefaultAttributeContainer.Builder original) {
        double health = 10.0 * CONFIG.healthMultiplierForSquid() * CONFIG.healthMultiplierForAll();
        double speed = 0.7 * CONFIG.speedMultiplierForSquid() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForSquid() * CONFIG.scaleMultiplierForAll();

        return original
                .add(Updater.GENERIC_MAX_HEALTH, health)
                .add(Updater.GENERIC_MOVEMENT_SPEED, speed)
                .add(Updater.GENERIC_SCALE, scale);
    }
}