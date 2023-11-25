package cc.crystalcavernswaiter;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class CrystalCavernsWaiter extends JavaPlugin {

    @Override
    public void onEnable() {
        plugin = this;
        Objects.requireNonNull(getCommand("continue")).setExecutor(new ContinueCommand());
        this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
    }
    public static Plugin getPlugin() {
        return plugin;
    }
    public static JavaPlugin plugin;
}
