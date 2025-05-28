package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.WolfEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(WolfEntity.class)
public abstract class WolfMixin {

    @ModifyReturnValue(method = "createWolfAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyWolfAttributes(DefaultAttributeContainer.Builder original) {
        double health = 8.0 * CONFIG.healthMultiplierForWolf() * CONFIG.healthMultiplierForAll();
        double damage = 4.0 * CONFIG.damageMultiplierForWolf() * CONFIG.damageMultiplierForAll();
        double speed = 0.30000001192092896 * CONFIG.speedMultiplierForWolf() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForWolf() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, damage)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
