package org.tigerclips1.roleplaypack.RoleplayComamnds;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class hoofbump  implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            String playerName = player.getName();
            player.sendMessage("You hoofbump " + playerName);
        }
        return true;
    }

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();
        String command = event.getMessage().substring(1); // Remove the leading slash
        // Check if the command starts with your custom command
        if (command.startsWith("/hoofbump")) {
            String targetPlayerName = command.split(" ")[1]; // Get target player name
            Player targetPlayer = Bukkit.getPlayer(targetPlayerName);
            // Execute your command logic here...
            String playerName = player.getName();
            // Send the command output to players
            Objects.requireNonNull(targetPlayer).sendMessage("You have been hoofbump by " + playerName + command);
            Location location = player.getLocation();
            player.getWorld().spawnParticle(Particle.HEART, location, 20, 0, 0, 0);
        }
    }
}
