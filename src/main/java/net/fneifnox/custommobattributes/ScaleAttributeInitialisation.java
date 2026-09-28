package net.fneifnox.custommobattributes;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.EntityAttributeModificationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = CustomMobAttributes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ScaleAttributeInitialisation {
    @SubscribeEvent
    public static void onEntityAttributeModification(EntityAttributeModificationEvent event) {
        for (EntityType<? extends LivingEntity> entityType : event.getTypes()) {
            if (!event.has(entityType, CustomMobAttributes.SCALE.get())) {
                event.add(entityType, CustomMobAttributes.SCALE.get());
            }
        }
    }
}
