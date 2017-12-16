package no.fireflake.core;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Listener implements org.bukkit.event.Listener {
	
	@EventHandler
	public void onCommand(PlayerCommandPreprocessEvent e) {
		for (Command command : Core.plugin.handler.getList()) {
			if (e.getMessage().equals(command.command)) {
				command.run(e.getPlayer());
				e.setCancelled(true);
			}
		}
	}
	
}
