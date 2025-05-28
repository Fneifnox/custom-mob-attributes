package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.VexEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(VexEntity.class)
public abstract class VexMixin {

    @ModifyReturnValue(method = "createVexAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyVexAttributes(DefaultAttributeContainer.Builder original) {
        double health = 14.0 * CONFIG.healthMultiplierForVex() * CONFIG.healthMultiplierForAll();
        double damage = 9.0 * CONFIG.damageMultiplierForVex() * CONFIG.damageMultiplierForAll();
        double speed = 0.7 * CONFIG.speedMultiplierForVex() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForVex() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, damage)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
