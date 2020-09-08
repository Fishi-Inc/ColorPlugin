package ColorPlugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ColorPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().fine("Plugin wird geladen.");

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().fine("Plugin wird deaktiviert.");
    }
}
