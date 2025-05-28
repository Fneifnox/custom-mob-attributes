package net.fneifnox.custommobattributes;

import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class Updater {

    public static final RegistryEntry<EntityAttribute> GENERIC_MAX_HEALTH = Registries.ATTRIBUTE.getEntry(Identifier.of("minecraft", "max_health")).orElseThrow();
    public static final RegistryEntry<EntityAttribute> GENERIC_ATTACK_DAMAGE = Registries.ATTRIBUTE.getEntry(Identifier.of("minecraft", "attack_damage")).orElseThrow();
    public static final RegistryEntry<EntityAttribute> GENERIC_MOVEMENT_SPEED = Registries.ATTRIBUTE.getEntry(Identifier.of("minecraft", "movement_speed")).orElseThrow();
    public static final RegistryEntry<EntityAttribute> GENERIC_SCALE = Registries.ATTRIBUTE.getEntry(Identifier.of("minecraft", "scale")).orElseThrow();
}
