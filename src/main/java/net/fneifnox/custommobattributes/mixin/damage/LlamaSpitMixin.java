package net.fneifnox.custommobattributes.mixin.damage;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.LlamaEntity;
import net.minecraft.entity.passive.TraderLlamaEntity;
import net.minecraft.entity.projectile.LlamaSpitEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

import java.util.Objects;

import static net.fneifnox.custommobattributes.CustomMobAttributes.CONFIG;

@Mixin(LlamaSpitEntity.class)
public class LlamaSpitMixin {
    @ModifyArg(method = "onEntityHit", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;damage(Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/entity/damage/DamageSource;F)Z"))
    private float injectCustomDamage(float originalDamage) {
        LlamaSpitEntity llamaSpitEntity = (LlamaSpitEntity)(Object)this;
        double multiplier = 1;
        if (Objects.requireNonNull(llamaSpitEntity.getOwner()).getType() == EntityType.LLAMA) {
            LlamaEntity llamaEntity = (LlamaEntity) llamaSpitEntity.getOwner();
            multiplier = llamaEntity.isBaby() ? CONFIG.babyLlama.damageMultiplierForBabyLlama() * CONFIG.damageMultiplierForBabyAll() : CONFIG.damageMultiplierForLlama() * CONFIG.damageMultiplierForAll();
        }
        else if (Objects.requireNonNull(llamaSpitEntity.getOwner()).getType() == EntityType.TRADER_LLAMA) {
            TraderLlamaEntity traderLlamaEntity = (TraderLlamaEntity) llamaSpitEntity.getOwner();
            multiplier = traderLlamaEntity.isBaby() ? CONFIG.babyTraderLlama.damageMultiplierForBabyTraderLlama() * CONFIG.damageMultiplierForBabyAll() : CONFIG.damageMultiplierForTraderLlama() * CONFIG.damageMultiplierForAll();
        }
        return (float) (originalDamage * multiplier);
    }
}
