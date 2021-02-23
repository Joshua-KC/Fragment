package gson.framework;

import gson.framework.commands.CommandHandler;
import gson.framework.listeners.ListenerHandler;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class Fragment extends JavaPlugin {

    @Getter
    private static Fragment instance;

    @Override
    public void onEnable() {
        instance = this;

        FragmentAPI.INSTANCE.start(this);

        CommandHandler.INSTANCE.init(this);
        ListenerHandler.INSTANCE.init(this);
    }

    @Override
    public void onDisable() {
        FragmentAPI.INSTANCE.stop(this);
    }
}