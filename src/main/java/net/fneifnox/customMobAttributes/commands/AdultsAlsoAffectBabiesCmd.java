package net.fneifnox.customMobAttributes.commands;

import net.fneifnox.customMobAttributes.Main;
import net.fneifnox.customMobAttributes.utils.MessageUtils;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class AdultsAlsoAffectBabiesCmd implements CommandExecutor {

    private final Main plugin;

    public AdultsAlsoAffectBabiesCmd(Main main) {
        this.plugin = main;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (!(commandSender instanceof Player player)) return false;
        if (!player.hasPermission("custommobattributes.command.adultsalsoaffectbabies") && !player.hasPermission("custommobattributes.admin")) {
            MessageUtils.sendLocalizedMessage(player, "generell.noPermission");
            return true;
        }

        try {
            boolean bool = Boolean.parseBoolean(args[0]);
            plugin.getConfig().set("adultsAlsoAffectBabies", bool);
            plugin.saveConfig();
            plugin.configManager.setConfigCache();
            for (World world : Bukkit.getWorlds()) {
                for (Entity entity : world.getEntitiesByClass(Ageable.class)) {
                    plugin.attributeUpdater.configureEntityAttributes((LivingEntity) entity);
                }
            }
            MessageUtils.sendLocalizedMessage(player, bool ? "adultsAlsoAffectBabies.worked.true" : "adultsAlsoAffectBabies.worked.false");
            return true;
        }
        catch (Exception e) {
            MessageUtils.sendLocalizedMessage(player, "adultsAlsoAffectBabies.generellUsage");
            return true;
        }
    }
}
