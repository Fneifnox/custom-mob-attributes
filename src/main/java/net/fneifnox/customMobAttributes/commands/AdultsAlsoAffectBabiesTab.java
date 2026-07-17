package net.fneifnox.customMobAttributes.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AdultsAlsoAffectBabiesTab implements TabCompleter {

    @Override
    public @Nullable List<String> onTabComplete(@NonNull CommandSender sender, @NonNull Command command, @NonNull String label, @NonNull String[] args) {
        List<String> completions = new ArrayList<>();

        if (args.length == 1) {
            completions.add("true");
            completions.add("false");
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
