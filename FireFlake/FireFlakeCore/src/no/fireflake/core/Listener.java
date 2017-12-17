package no.fireflake.core;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Listener implements org.bukkit.event.Listener {
	
	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent e) {
		for (Command command : Core.plugin.handler.getList()) {
			if (e.getMessage().startsWith(command.command)) {
				String argsString = e.getMessage().replaceFirst(command.command + " ", "");
				String[] args = argsString.split(" ");
				command.run(e.getPlayer(), args);
				e.setCancelled(true);
			}
		}
	}
	
}
