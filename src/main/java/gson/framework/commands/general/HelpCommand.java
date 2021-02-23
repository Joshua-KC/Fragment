package gson.framework.commands.general;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandCompletion;
import co.aikar.commands.annotation.CommandPermission;
import gson.framework.utilities.MessageUtilities;
import org.bukkit.entity.Player;

public class HelpCommand extends BaseCommand {

    @CommandAlias("help")
    @CommandPermission("fragment.command.help")

    @CommandCompletion("@players")
    public void onDefault(final Player player){
        player.sendMessage(MessageUtilities.colourFormat("&c&lDESIGN -> HELP MESSAGE <- DESIGN"));
    }
}
