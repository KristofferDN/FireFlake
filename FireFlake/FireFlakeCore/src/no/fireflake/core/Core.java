package no.fireflake.core;

import org.bukkit.plugin.java.JavaPlugin;

import no.fireflake.core.commands.TeleportCommand;
import no.fireflake.core.commands.TestCommand;

public class Core extends JavaPlugin {
	
	public static Core plugin;
	
	CommandHandler handler = new CommandHandler();
	
	public void onEnable() {
		plugin = this;
		getServer().getPluginManager().registerEvents(new Listener(), this);
		
		handler.registerCommand(new TestCommand());
		handler.registerCommand(new TeleportCommand());
	}
	
}
