package net.fneifnox.customMobAttributes.commands;

import net.fneifnox.customMobAttributes.Main;
import net.fneifnox.customMobAttributes.utils.MessageUtils;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class SetMultiplierCmd implements CommandExecutor {

    private final Main plugin;

    public SetMultiplierCmd(Main main) {
        this.plugin = main;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (!(commandSender instanceof Player player)) return false;
        if (!player.hasPermission("custommobattributes.command.setmultiplier") && !player.hasPermission("custommobattributes.admin")) {
            MessageUtils.sendLocalizedMessage(player, "generell.noPermission");
            return true;
        }

        if (args.length != 3) {
            MessageUtils.sendLocalizedMessage(player, "setMultiplier.generellUsage");
            return true;
        }

        String mob = args[0];
        String attribute = args[1].toLowerCase();
        String value = args[2];

        String configPath;

        // Mob check
        if (getCorrectMobPath(mob) != null) {
            configPath = getCorrectMobPath(mob) + "." + attribute.toLowerCase() + "_multiplier";
        }
        else {
            MessageUtils.sendLocalizedMessage(player, "setMultiplier.usage.mob.notValid", mob);
            return true;
        }

        // Attribute check
        if (!Objects.equals(attribute, "health") && !Objects.equals(attribute, "damage") && !Objects.equals(attribute, "speed") && !Objects.equals(attribute, "scale")) {
            MessageUtils.sendLocalizedMessage(player, "setMultiplier.usage.attribute.notValid", attribute);
            return true;
        }

        // Value check
        double parsedValue;
        double clampedValue;
        double minValue = plugin.configManager.getMinConfigValue(attribute);
        double maxValue = plugin.configManager.getMaxConfigValue(attribute);
        try {
            parsedValue = Double.parseDouble(value);
            clampedValue = Math.clamp(parsedValue, minValue, maxValue);
        }
        catch (NumberFormatException e) {
            MessageUtils.sendLocalizedMessage(player, "setMultiplier.usage.value.nonNumber", value);
            return true;
        }

        String attributeColorTag = switch (attribute) {
            case "health" -> "health_color";
            case "damage" -> "damage_color";
            case "speed" -> "speed_color";
            default -> "scale_color";
        };

        if (!plugin.getConfig().contains(configPath)) {
            MessageUtils.sendLocalizedMessage(player, "setMultiplier.usage.mob.mobDoesntHasAttribute", mob, attribute, clampedValue, attributeColorTag);
            return true;
        }

        plugin.getConfig().set(configPath, clampedValue);
        plugin.saveConfig();

        plugin.configManager.setConfigCache();

        if (mob.equalsIgnoreCase("all_mobs")) {
            plugin.attributeUpdater.configureEveryEntity();
        }
        else if (mob.equalsIgnoreCase("all_baby_mobs")) {
            for (World world : Bukkit.getWorlds()) {
                for (LivingEntity livingEntity : world.getEntitiesByClass(Ageable.class)) {
                    plugin.attributeUpdater.configureEntityAttributes(livingEntity);
                }
            }
        }
        else {
            EntityType entityType = getCorrectEntityType(mob);
            for (World world : Bukkit.getWorlds()) {
                for (Entity entity : world.getEntitiesByClass(entityType.getEntityClass())) {
                    plugin.attributeUpdater.configureEntityAttributes((LivingEntity) entity);
                }
            }
        }

        if (parsedValue != clampedValue) {
            MessageUtils.sendLocalizedMessage(player, "setMultiplier.workedWithCorrection", mob.replace("_", " "), attribute, clampedValue, attributeColorTag, minValue, maxValue);
            return true;
        }

        MessageUtils.sendLocalizedMessage(player, "setMultiplier.worked", mob.replace("_", " "), attribute, clampedValue, attributeColorTag);

        return true;
    }

    private String getCorrectMobPath(String mob) {
        switch (mob.toLowerCase()) {
            case "armor_stand", "player", "mannequin" -> {
                return null;
            }
        }

        if (mob.equalsIgnoreCase("all_mobs") || mob.equalsIgnoreCase("all_baby_mobs")) {
            return mob;
        }

        try {
            if (mob.toLowerCase().startsWith("baby_")) {
                if (!EntityType.valueOf(mob.substring(5).toUpperCase()).isAlive()) return null;
                return "mobs." + mob.substring(5).toUpperCase() + ".baby";
            }
            if (!EntityType.valueOf(mob.toUpperCase()).isAlive()) return null;
            return "mobs." + mob.toUpperCase();
        }
        catch (IllegalArgumentException e) {
            return null;
        }
    }

    private EntityType getCorrectEntityType(String mob) {
        try {
            if (mob.toLowerCase().startsWith("baby_")) {
                return EntityType.valueOf(mob.substring(5).toUpperCase());
            }
            EntityType.valueOf(mob.toUpperCase());
            return EntityType.valueOf(mob.toUpperCase());
        }
        catch (IllegalArgumentException e) {
            return null;
        }
    }
}
