package dev.ash.wFly.commands;

import dev.ash.wFly.WFly;
import dev.ash.wFly.utils.ColorUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class FlyCommand implements CommandExecutor {

    private final WFly plugin;

    public FlyCommand(WFly plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {

        if (sender instanceof Player player) {
            if (player.hasPermission("wfly.fly")) {

                player.getScheduler().run(plugin, (task) -> {
                    if (player.getAllowFlight()) {
                        player.setAllowFlight(false);

                        String msgFlyOff = plugin.getConfig().getString("fly-off");
                        player.sendMessage(ColorUtil.parse(msgFlyOff));
                    } else {
                        player.setAllowFlight(true);

                        String msgFlyOn = plugin.getConfig().getString("fly-on");
                        player.sendMessage(ColorUtil.parse(msgFlyOn));
                    }
                }, null);
            }
        }
        return true;
    }
}
