package net.fneifnox.custommobattributes.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.VillagerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(VillagerEntity.class)
public abstract class VillagerMixin {

    @ModifyReturnValue(method = "createVillagerAttributes", at = @At("RETURN"))
    private static DefaultAttributeContainer.Builder modifyVillagerAttributes(DefaultAttributeContainer.Builder original) {
        double health = 20.0 * CONFIG.healthMultiplierForVillager() * CONFIG.healthMultiplierForAll();
        double speed = 0.5 * CONFIG.speedMultiplierForVillager() * CONFIG.speedMultiplierForAll();
        double scale = 1.0 * CONFIG.scaleMultiplierForVillager() * CONFIG.scaleMultiplierForAll();

        return original
                .add(EntityAttributes.GENERIC_MAX_HEALTH, health)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
                .add(EntityAttributes.GENERIC_SCALE, scale);
    }
}
