package gson.framework.commands;

import co.aikar.commands.PaperCommandManager;
import gson.framework.Fragment;
import gson.framework.commands.debug.TestCommand;
import gson.framework.commands.general.HelpCommand;
import gson.framework.commands.general.PingCommand;
import gson.framework.commands.staff.NightVisionCommand;
import gson.framework.commands.staff.SpeedCommand;
import lombok.Getter;

import java.util.Arrays;

@Getter
public enum CommandHandler {

    INSTANCE;

    private final PaperCommandManager paperCommandManager = new PaperCommandManager(Fragment.getInstance());

    public void init(final Fragment plugin){
        assert plugin != null : "Something went wrong! The handler was null. (CommandHandler.INSTANCE.init)";

        Arrays.asList(
                //DEBUG: Commands
                new TestCommand(),
                //PLAYER: Commands
                new PingCommand(), new HelpCommand(),
                //STAFF: Commands
                new NightVisionCommand(), new SpeedCommand()
        ).forEach(paperCommandManager::registerCommand);
   }
}
