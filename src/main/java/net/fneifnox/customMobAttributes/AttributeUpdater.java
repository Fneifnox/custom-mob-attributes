package net.fneifnox.customMobAttributes;

import net.fneifnox.customMobAttributes.config.MobMultiplier;
import net.fneifnox.customMobAttributes.utils.MessageUtils;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.world.EntitiesLoadEvent;
import org.bukkit.inventory.EquipmentSlotGroup;

public class AttributeUpdater implements Listener {

    private final Main plugin;
    private final NamespacedKey HEALTH_MODIFIER_ID;
    private final NamespacedKey DAMAGE_MODIFIER_ID;
    private final NamespacedKey SPEED_MODIFIER_ID;
    private final NamespacedKey SCALE_MODIFIER_ID;

    public AttributeUpdater(Main main) {
        this.plugin = main;

        this.HEALTH_MODIFIER_ID = new NamespacedKey(plugin, "health_modifier");
        this.DAMAGE_MODIFIER_ID = new NamespacedKey(plugin, "damage_modifier");
        this.SPEED_MODIFIER_ID = new NamespacedKey(plugin, "speed_modifier");
        this.SCALE_MODIFIER_ID = new NamespacedKey(plugin, "scale_modifier");
    }

    @EventHandler
    public void onMobSpawn(CreatureSpawnEvent event) {
        LivingEntity livingEntity = event.getEntity();
        configureEntityAttributes(livingEntity);
    }

    @EventHandler
    public void onEntitiesLoad(EntitiesLoadEvent event) {
        for (Entity entity : event.getEntities()) {
            if (entity instanceof LivingEntity livingEntity) {
                configureEntityAttributes(livingEntity);
            }
        }
    }

    public void configureEveryEntity() {
        for (World world : Bukkit.getWorlds()) {
            for (LivingEntity entity : world.getLivingEntities()) {
                configureEntityAttributes(entity);
            }
        }
    }

    public boolean isBaby(LivingEntity entity) {
        if (entity instanceof Ageable ageable) {
            return !ageable.isAdult();
        }
        return false;
    }

    public String getEntityTypeName(LivingEntity entity) {
        return isBaby(entity) ? "baby_" + entity.getType().name().toLowerCase() : entity.getType().name().toLowerCase();
    }

    public void configureEntityAttributes(LivingEntity entity) {
        if (entity instanceof Player) return;

        MobMultiplier mobMultiplier = plugin.configCache.get(getEntityTypeName(entity));

        if (mobMultiplier == null) return;

        double healthMultiplier = mobMultiplier.healthMultiplier();
        double damageMultiplier = mobMultiplier.damageMultiplier();
        double speedMultiplier = mobMultiplier.speedMultiplier();
        double scaleMultiplier = mobMultiplier.scaleMultiplier();

        var health = entity.getAttribute(Attribute.MAX_HEALTH);
        if (health != null && !Double.isNaN(healthMultiplier)) {
            double val = health.getBaseValue() * healthMultiplier;
            if (health.getValue() != val) {
                updateModifier(entity, Attribute.MAX_HEALTH, HEALTH_MODIFIER_ID, healthMultiplier);
                entity.setHealth((float) val);
            }
        }
        if (!Double.isNaN(damageMultiplier)) {
            updateModifier(entity, Attribute.ATTACK_DAMAGE, DAMAGE_MODIFIER_ID, damageMultiplier);
        }
        if (!Double.isNaN(speedMultiplier)) {
            updateModifier(entity, Attribute.MOVEMENT_SPEED, SPEED_MODIFIER_ID, speedMultiplier);
            if (entity.getAttribute(Attribute.FLYING_SPEED) != null) {
                updateModifier(entity, Attribute.FLYING_SPEED, SPEED_MODIFIER_ID, speedMultiplier);
            }
        }
        if (!Double.isNaN(scaleMultiplier)) {
            updateModifier(entity, Attribute.SCALE, SCALE_MODIFIER_ID, scaleMultiplier);
        }
    }

    private static void updateModifier(
            LivingEntity entity,
            Attribute entry,
            NamespacedKey id,
            double multiplier
    ) {
        var attrInstance = entity.getAttribute(entry);
        if (attrInstance == null) return;

        for (AttributeModifier mod : attrInstance.getModifiers()) {
            if (mod.getKey().equals(id)) {
                attrInstance.removeModifier(mod);
                break;
            }
        }

        if (multiplier == 1.0) return;

        double amount = attrInstance.getBaseValue() * (multiplier - 1);
        AttributeModifier modifier = new AttributeModifier(
                id,
                amount,
                AttributeModifier.Operation.ADD_NUMBER,
                EquipmentSlotGroup.ANY
        );
        attrInstance.addModifier(modifier);
    }

    @EventHandler
    public void onProjectileHit(EntityDamageByEntityEvent event) {
        if (!(event.getDamager() instanceof Projectile projectile)) return;

        if (!(projectile.getShooter() instanceof LivingEntity shooter)) return;

        if (projectile.getShooter() instanceof Player) return;

        double damageMultiplier = plugin.configCache.get(getEntityTypeName(shooter)).damageMultiplier();

        if (damageMultiplier != 1.0) {
            event.setDamage(event.getDamage() * damageMultiplier);
        }
    }

    @EventHandler
    public void onDragonDamage(EntityDamageByEntityEvent event) {
        if (!(event.getEntity() instanceof Player)) return;

        double damageMultiplier = plugin.configCache.get("ender_dragon").damageMultiplier();

        if (event.getDamager() instanceof EnderDragon) {
            event.setDamage(event.getDamage() * damageMultiplier);
        } else if (event.getDamager() instanceof AreaEffectCloud cloud) {
            if (!(cloud.getSource() instanceof EnderDragon)) return;
            event.setDamage(event.getDamage() * damageMultiplier);
        }
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (player.hasPermission("custommobattributes.admin") || player.isOp()) {
            if (plugin.updateAvailable) {
                MessageUtils.sendLocalizedMessage(player, "generell.updateAvailable", plugin.latestVersionString);
            }
        }
    }
}
