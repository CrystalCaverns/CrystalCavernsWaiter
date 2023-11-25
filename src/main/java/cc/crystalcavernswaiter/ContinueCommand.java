package cc.crystalcavernswaiter;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ContinueCommand implements CommandExecutor {
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, String[] args) {
        if (!(sender instanceof ConsoleCommandSender)) {
            sender.sendMessage("§f\uDBF7\uDC35 §cCannot execute command.");
            return false;
        }
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("Connect");
        out.writeUTF("crystal_forest");
        Player player = Bukkit.getPlayerExact(args[0]);
        assert player != null;
        player.sendPluginMessage(CrystalCavernsWaiter.getPlugin(), "BungeeCord", out.toByteArray());
        return false;
    }
}
