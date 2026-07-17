package net.fneifnox.customMobAttributes.config;

import net.fneifnox.customMobAttributes.Main;
import org.bukkit.Registry;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;

public class ConfigManager {

    private final Main plugin;

    public ConfigManager(Main main) {
        this.plugin = main;
    }

    // Using a cache for the config values as this is way better for the performance (especially when checking and updating often)
    public void setConfigCache() {
        plugin.configCache.clear();

        for (EntityType entityType : Registry.ENTITY_TYPE) {
            Class<? extends Entity> entityClass = entityType.getEntityClass();

            if (entityClass == null) continue;
            if (LivingEntity.class.isAssignableFrom(entityClass)) {
                plugin.configCache.put(entityType.name().toLowerCase(), new MobMultiplier(
                        getMultiplierValue(entityType, "health_multiplier", false),
                        getMultiplierValue(entityType, "damage_multiplier", false),
                        getMultiplierValue(entityType, "speed_multiplier", false),
                        getMultiplierValue(entityType, "scale_multiplier", false)));

                if (Ageable.class.isAssignableFrom(entityType.getEntityClass())) {
                    plugin.configCache.put("baby_" + entityType.name().toLowerCase(), new MobMultiplier(
                            getMultiplierValue(entityType, "health_multiplier", true),
                            getMultiplierValue(entityType, "damage_multiplier", true),
                            getMultiplierValue(entityType, "speed_multiplier", true),
                            getMultiplierValue(entityType, "scale_multiplier", true)));
                }
            }
        }
    }

    private double getMultiplierValue(EntityType entityType, String multiplierName, boolean isBaby) {
        var allMultiplier = plugin.getConfig().getDouble("all_mobs." + multiplierName, 1.0);
        var allBabyMultiplier = plugin.getConfig().getDouble("all_baby_mobs." + multiplierName, 1.0);

        var mobMultiplier = plugin.getConfig().getDouble("mobs." + entityType.name() + "." + multiplierName, 1.0);
        var babyMobMultiplier = plugin.getConfig().getDouble("mobs." + entityType.name() + ".baby." + multiplierName, 1.0);

        if (isBaby) {
            if (plugin.getConfig().getBoolean("adultsAlsoAffectBabies")) {
                return allMultiplier * allBabyMultiplier * mobMultiplier * babyMobMultiplier;
            }
            else {
                return allBabyMultiplier * babyMobMultiplier;
            }
        }
        else {
            return allMultiplier * mobMultiplier;
        }
    }

    public double getMinConfigValue(String attribute) {
        return attribute.equals("health") ? 0.0001 : attribute.equals("scale") ? 0.0625 : 0.0;
    }

    public double getMaxConfigValue(String attribute) {
        return attribute.equals("health") ? 1024.0 : attribute.equals("scale") ? 16 : Double.MAX_VALUE;
    }

    public void registerCorrectConfigValues() {
        boolean configModified = false;

        for (String path : plugin.getConfig().getKeys(true)) {

            if (plugin.getConfig().isConfigurationSection(path)) continue;

            if (path.endsWith("health_multiplier")) {
                if (checkAndCorrectConfigDoubles(path, getMinConfigValue("health"), getMaxConfigValue("health"))) configModified = true;
            }
            else if (path.endsWith("damage_multiplier")) {
                if (checkAndCorrectConfigDoubles(path, getMinConfigValue("damage"), getMaxConfigValue("damage"))) configModified = true;
            }
            else if (path.endsWith("speed_multiplier")) {
                if (checkAndCorrectConfigDoubles(path, getMinConfigValue("speed"), getMaxConfigValue("speed"))) configModified = true;
            }
            else if (path.endsWith("scale_multiplier")) {
                if (checkAndCorrectConfigDoubles(path, getMinConfigValue("scale"), getMaxConfigValue("scale"))) configModified = true;
            }

            if (path.endsWith("adultsAlsoAffectBabies")) {
                if (checkAndCorrectConfigBooleans(path, true)) configModified = true;
            }
        }

        if (configModified) {
            plugin.saveConfig();
            plugin.getLogger().warning("Some values in the config were set incorrectly and were automatically corrected");
        }
    }

    private boolean checkAndCorrectConfigDoubles(String path, double min, double max) {
        if (!plugin.getConfig().contains(path)) return false;

        Object value = plugin.getConfig().get(path);

        if (!(value instanceof Number)) {
            plugin.getConfig().set(path, 1.0);
            return true;
        }

        double currentValue = ((Number) value).doubleValue();
        double clampedValue = Math.clamp(currentValue, min, max);

        if (currentValue != clampedValue) {
            plugin.getConfig().set(path, clampedValue);
            return true;
        }

        return false;
    }

    private boolean checkAndCorrectConfigBooleans(String path, boolean defaultValue) {
        if (!plugin.getConfig().isBoolean(path)) {
            plugin.getConfig().set(path, defaultValue);
            return true;
        }
        return false;
    }
}
