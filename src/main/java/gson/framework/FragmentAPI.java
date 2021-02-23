package gson.framework;

import lombok.Getter;

@Getter
public enum FragmentAPI {

    INSTANCE;

    private Fragment plugin;

    public void start(final Fragment plugin) {
        this.plugin = plugin;
        assert plugin != null : "Something went wrong! The plugin was null. (Startup)";
    }

    public void stop(final Fragment plugin) {
        this.plugin = plugin;
        assert plugin != null : "Something went wrong! The plugin was null. (Shutdown)";
    }

}
