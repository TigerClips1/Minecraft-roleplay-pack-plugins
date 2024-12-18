//package all the classes in one jar file that paper will excute
package org.tigerclips1.roleplaypack;

// Import the required minecraft classes
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.tigerclips1.roleplaypack.RoleplayComamnds.*;

import java.util.Objects;

// Make a const class
public final class Roleplaypack extends JavaPlugin {

    @Override
    public void onEnable() {
        //handle Events
        Bukkit.getServer().getPluginManager().registerEvents(new sit(),this);
        Bukkit.getServer().getPluginManager().registerEvents(new sitOnTopPlayer(),this);
        Bukkit.getPluginManager().registerEvents(new boop(), this);
        Bukkit.getPluginManager().registerEvents(new brohoof(), this);
        Bukkit.getPluginManager().registerEvents(new hoofbump(), this);
        Bukkit.getPluginManager().registerEvents(new hug(), this);
        Bukkit.getPluginManager().registerEvents(new nom(), this);
        Bukkit.getPluginManager().registerEvents(new angrey(), this);
        Bukkit.getPluginManager().registerEvents(new fiestbump(), this);
        Bukkit.getPluginManager().registerEvents(new tag(), this);

        // handle commands
        Objects.requireNonNull(getCommand("angrey")).setExecutor(new angrey());
        Objects.requireNonNull(getCommand("boop")).setExecutor(new boop());
        Objects.requireNonNull(getCommand("brohoof")).setExecutor(new brohoof());
        Objects.requireNonNull(getCommand("cry")).setExecutor(new cry());
        Objects.requireNonNull(getCommand("dab")).setExecutor(new dab());
        Objects.requireNonNull(getCommand("depress")).setExecutor(new depress());
        Objects.requireNonNull(getCommand("exctited")).setExecutor(new exctited());
        Objects.requireNonNull(getCommand("fiestbump")).setExecutor(new fiestbump());
        Objects.requireNonNull(getCommand("hug")).setExecutor(new hug());
        Objects.requireNonNull(getCommand("lagthing")).setExecutor(new lagthing());
        Objects.requireNonNull(getCommand("nom")).setExecutor(new nom());
        Objects.requireNonNull(getCommand("scared")).setExecutor(new scared());
        Objects.requireNonNull(getCommand("tag")).setExecutor(new tag());
        Objects.requireNonNull(getCommand("hoofbump")).setExecutor(new hoofbump());
    }
}
