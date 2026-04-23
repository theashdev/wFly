package dev.ash.wFly.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("wfly.fly")) {
                player.setAllowFlight(true);
                player.sendMessage(ChatColor.GREEN + "Fly Mode Enabled !");
            }
        }

        return true;
    }
}
