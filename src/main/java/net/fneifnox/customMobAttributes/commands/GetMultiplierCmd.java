package net.fneifnox.customMobAttributes.commands;

import net.fneifnox.customMobAttributes.Main;
import net.fneifnox.customMobAttributes.utils.MessageUtils;
import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GetMultiplierCmd implements CommandExecutor {

    private final Main plugin;

    public GetMultiplierCmd(Main main) {
        this.plugin = main;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (!(commandSender instanceof Player player)) return false;
        if (!player.hasPermission("custommobattributes.command.getmultiplier") && !player.hasPermission("custommobattributes.admin")) {
            MessageUtils.sendLocalizedMessage(player, "generell.noPermission");
            return true;
        }

        if (args.length != 1) {
            MessageUtils.sendLocalizedMessage(player, "getMultiplier.generellUsage");
            return true;
        }

        String mob = args[0];

        String configPath;


        // Mob check
        if (getCorrectMobPath(mob) != null) {
            configPath = getCorrectMobPath(mob) + ".";
        }
        else {
            MessageUtils.sendLocalizedMessage(player, "getMultiplier.usage.mob.notValid", mob);
            return true;
        }


        Component finalMessage = MessageUtils.getLocalizedMessageComponent("getMultiplier.worked.header", true, mob.replace("_", " "));

        if (plugin.getConfig().contains(configPath + "health_multiplier")) {
            Component healthLine = MessageUtils.getLocalizedMessageComponent("getMultiplier.worked.health_multiplier", false, plugin.getConfig().getDouble(configPath + "health_multiplier"));
            finalMessage = finalMessage.append(healthLine);
        }

        if (plugin.getConfig().contains(configPath + "damage_multiplier")) {
            Component damageLine = MessageUtils.getLocalizedMessageComponent("getMultiplier.worked.damage_multiplier", false, plugin.getConfig().getDouble(configPath + "damage_multiplier"));
            finalMessage = finalMessage.append(damageLine);
        }

        if (plugin.getConfig().contains(configPath + "speed_multiplier")) {
            Component speedLine = MessageUtils.getLocalizedMessageComponent("getMultiplier.worked.speed_multiplier", false, plugin.getConfig().getDouble(configPath + "speed_multiplier"));
            finalMessage = finalMessage.append(speedLine);
        }

        if (plugin.getConfig().contains(configPath + "scale_multiplier")) {
            Component scaleLine = MessageUtils.getLocalizedMessageComponent("getMultiplier.worked.scale_multiplier", false, plugin.getConfig().getDouble(configPath + "scale_multiplier"));
            finalMessage = finalMessage.append(scaleLine);
        }

        player.sendMessage(finalMessage);
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
}
