package net.fneifnox.customMobAttributes.commands;

import org.bukkit.Registry;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GetMultiplierTab implements TabCompleter {

    @Override
    public @Nullable List<String> onTabComplete(@NonNull CommandSender sender, @NonNull Command command, @NonNull String label, @NonNull String[] args) {
        List<String> completions = new ArrayList<>();

        if (args.length == 1) {
            completions.add("all_mobs");
            completions.add("all_baby_mobs");

            for (EntityType type : Registry.ENTITY_TYPE) {
                if (type.isAlive()) {
                    Class<? extends Entity> entityClass = type.getEntityClass();
                    if (entityClass == null) continue;
                    switch (type.name().toLowerCase()) {
                        case "armor_stand", "player", "mannequin" -> {
                            continue;
                        }
                    }
                    completions.add(type.name().toLowerCase());

                    if (Ageable.class.isAssignableFrom(entityClass)) {
                        completions.add("baby_" + type.name().toLowerCase());
                    }
                }
            }
            return filterCompletions(completions, args[0]);
        }

        return completions;
    }

    private List<String> filterCompletions(List<String> list, String currentArg) {
        return list.stream()
                .filter(s -> s.toLowerCase().startsWith(currentArg.toLowerCase()))
                .collect(Collectors.toList());
    }
}
