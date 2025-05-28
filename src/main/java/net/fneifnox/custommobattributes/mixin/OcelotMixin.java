package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.OcelotEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(OcelotEntity.class)
public abstract class OcelotMixin {

    @ModifyReturnValue(method = "createOcelotAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyOcelotAttributes(DefaultAttributeContainer.Builder original) {
        double health = 10.0 * CONFIG.healthMultiplierForOcelot() * CONFIG.healthMultiplierForAll();
        double damage = 3.0 * CONFIG.damageMultiplierForOcelot() * CONFIG.damageMultiplierForAll();
        double speed = 0.30000001192092896 * CONFIG.speedMultiplierForOcelot() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForOcelot() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, damage)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
