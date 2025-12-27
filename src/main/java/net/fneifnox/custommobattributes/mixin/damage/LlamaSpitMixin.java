package net.fneifnox.custommobattributes.mixin.damage;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraft.world.entity.animal.horse.TraderLlama;
import net.minecraft.world.entity.projectile.LlamaSpit;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import java.util.Objects;

@Mixin(LlamaSpit.class)
public class LlamaSpitMixin {
    @ModifyArg(method = "onHitEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
    private float injectCustomDamage(float originalDamage) {
        LlamaSpit llamaSpitEntity = (LlamaSpit)(Object)this;
        double multiplier = 1;
        if (Objects.requireNonNull(llamaSpitEntity.getOwner()).getType() == EntityType.LLAMA) {
            Llama llamaEntity = (Llama) llamaSpitEntity.getOwner();
            if (Config.VANILLA.adultsAlsoAffectBabies.get() && llamaEntity.isBaby()) {
                multiplier = Config.VANILLA.damageMultiplierForBabyLlama.get() * Config.VANILLA.damageMultiplierForBabyAll.get() * Config.VANILLA.damageMultiplierForLlama.get() * Config.VANILLA.damageMultiplierForAll.get();
            }
            else {
                multiplier = llamaEntity.isBaby() ? Config.VANILLA.damageMultiplierForBabyLlama.get() * Config.VANILLA.damageMultiplierForBabyAll.get() : Config.VANILLA.damageMultiplierForLlama.get() * Config.VANILLA.damageMultiplierForAll.get();
            }
        }
        else if (Objects.requireNonNull(llamaSpitEntity.getOwner()).getType() == EntityType.TRADER_LLAMA) {
            TraderLlama traderLlamaEntity = (TraderLlama) llamaSpitEntity.getOwner();
            if (Config.VANILLA.adultsAlsoAffectBabies.get() && traderLlamaEntity.isBaby()) {
                multiplier = Config.VANILLA.damageMultiplierForBabyTraderLlama.get() * Config.VANILLA.damageMultiplierForBabyAll.get() * Config.VANILLA.damageMultiplierForTraderLlama.get() * Config.VANILLA.damageMultiplierForAll.get();
            }
            else {
                multiplier = traderLlamaEntity.isBaby() ? Config.VANILLA.damageMultiplierForBabyTraderLlama.get() * Config.VANILLA.damageMultiplierForBabyAll.get() : Config.VANILLA.damageMultiplierForTraderLlama.get() * Config.VANILLA.damageMultiplierForAll.get();
            }
        }
        return (float) (originalDamage * multiplier);
    }
}
