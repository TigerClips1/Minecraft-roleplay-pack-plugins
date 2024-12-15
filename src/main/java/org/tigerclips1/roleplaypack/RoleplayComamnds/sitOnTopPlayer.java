//package all the classes in one jar file that paper will excute
package org.tigerclips1.roleplaypack.RoleplayComamnds;

// Import the required minecraft classes
import dev.geco.gsit.api.GSitAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class sitOnTopPlayer implements Listener {
    // Regsiter the event
    @EventHandler
    public  void handleSitOnTopOfPlayer(PlayerInteractEvent event)
    {
        Player player = event.getPlayer();
        if(player.isSneaking() && event.getAction().isRightClick())
        {
            GSitAPI.sitOnPlayer(player,player);
        }
    }
}
