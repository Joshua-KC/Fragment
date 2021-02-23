package gson.framework.listeners;

import gson.framework.Fragment;
import gson.framework.listeners.crafting.GodAppleListener;
import lombok.Getter;

import java.util.Arrays;

@Getter
public enum ListenerHandler {

    INSTANCE;

    public void init(final Fragment plugin) {
        assert plugin != null : "Something went wrong! The handler was null. (ListenerHandler.INSTANCE.init)";

        Arrays.asList(
              new GodAppleListener()
        ).forEach(listener -> plugin.getServer().getPluginManager().registerEvents(listener, plugin));
    }
}
