package net.fneifnox.custommobattributes.mixin.baby;

import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

import static net.fneifnox.custommobattributes.AttributeUpdater.ATTRIBUTE_HANDLERS;

@Mixin(AgeableMob.class)
public class PassiveEntityMixin {

    // To change the multipliers of a just grown up baby to the multipliers of an adult. Without this inject this would only happen when the config would be changed or the mob would get loaded.
    @Inject(method = "ageBoundaryReached", at = @At("TAIL"))
    private void changeMultipliersFromBabyToAdult(CallbackInfo ci) {
        AgeableMob passiveEntity = (AgeableMob)(Object)this;
        if (passiveEntity instanceof LivingEntity living && !passiveEntity.level().isClientSide()) {
            Consumer<LivingEntity> handler = ATTRIBUTE_HANDLERS.get(passiveEntity.getType());
            if (handler != null) {
                handler.accept(living);
            }
        }
    }
}
