package net.fneifnox.custommobattributes.mixin.scale;

import net.fneifnox.custommobattributes.CustomMobAttributes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public abstract class EntityRidingScaleMixin {

    @Inject(method = "positionRider(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity$MoveFunction;)V",
            at = @At("HEAD"), cancellable = true)
    private void onUpdatePassengerPosition(Entity passenger, Entity.MoveFunction positionUpdater, CallbackInfo ci) {
        LivingEntity livingEntity = (LivingEntity)(Object)this;
        if (!((Object)(this) instanceof LivingEntity)) return;
        if (!livingEntity.hasPassenger(passenger)) return;

        double scale = livingEntity.getAttributeValue(CustomMobAttributes.SCALE);

        double posX = livingEntity.getX();
        double posY = livingEntity.getY() + (livingEntity.getBbHeight() - (livingEntity.getBbHeight() / scale / 1.85));
        double posZ = livingEntity.getZ();

        positionUpdater.accept(passenger, posX, posY, posZ);

        ci.cancel();
    }
}
