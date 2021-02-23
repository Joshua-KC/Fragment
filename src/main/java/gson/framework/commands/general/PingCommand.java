package gson.framework.commands.general;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandCompletion;
import co.aikar.commands.annotation.CommandPermission;
import gson.framework.utilities.MessageUtilities;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class PingCommand extends BaseCommand {

    @CommandAlias("ping")
    @CommandPermission("fragment.command.ping")

    @CommandCompletion("@players")
    public void onDefault(final Player player){
        player.sendMessage(MessageUtilities.colourFormat("&a&lPING » " + "&a" + getPing(player) + " ms"));
    }

    public static int getPing(final Player player) {
        int ping = (((CraftPlayer) player).getHandle()).ping;
        return (int) Math.floor(ping / 2.3D);
    }
}
