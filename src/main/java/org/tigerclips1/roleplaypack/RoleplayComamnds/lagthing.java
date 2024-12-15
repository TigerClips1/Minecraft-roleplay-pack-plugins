//package all the classes in one jar file that paper will excute
package org.tigerclips1.roleplaypack.RoleplayComamnds;

// Import the required minecraft classes
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;

public class lagthing implements Listener, CommandExecutor {
    /**
     * Executes the given command, returning its success.
     * <br>
     * If false is returned, then the "usage" plugin.yml entry for this command
     * (if defined) will be sent to the player.
     *
     * @param sender  Source of the command
     * @param command Command which was executed
     * @param label   Alias of the command which was used
     * @param args    Passed command arguments
     * @return true if a valid command, otherwise false
     */
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            String playerName = player.getName();
            player.sendMessage("You laguthing right now " + playerName);
            Location location = player.getLocation();
            player.getWorld().spawnParticle(Particle.VILLAGER_HAPPY, location, 20, 0, 0, 0);
        }
        return true;
    }
}
