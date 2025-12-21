package net.fneifnox.custommobattributes.mixin.damage;

import net.fneifnox.custommobattributes.config.Config;
import net.minecraft.world.entity.projectile.LlamaSpit;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(LlamaSpit.class)
public class LlamaSpitMixin {
    @ModifyArg(method = "onHitEntity", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;hurt(Lnet/minecraft/world/damagesource/DamageSource;F)Z"))
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
