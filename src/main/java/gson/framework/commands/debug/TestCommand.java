package gson.framework.commands.debug;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.*;
import gson.framework.utilities.MessageUtilities;
import org.bukkit.entity.Player;

public class TestCommand extends BaseCommand {

    @CommandAlias("test")
    @CommandPermission("fragment.command.test")

    @CommandCompletion("@players")
    public void onDefault(final Player player){
        player.sendMessage(MessageUtilities.colourFormat("&aTest"));
    }
}
