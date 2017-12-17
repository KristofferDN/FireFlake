package no.fireflake.core;

import org.bukkit.plugin.java.JavaPlugin;

import no.fireflake.core.commands.GamemodeCommand;
import no.fireflake.core.commands.TeleportCommand;

public class Core extends JavaPlugin {
	
	public static Core plugin;
	
	CommandHandler handler = new CommandHandler();
	
	public void onEnable() {
		plugin = this;
		getServer().getPluginManager().registerEvents(new Listener(), this);

		handler.registerCommand(new GamemodeCommand());
		handler.registerCommand(new TeleportCommand());
	}
	
}
