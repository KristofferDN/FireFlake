package no.fireflake.core.commands;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import no.fireflake.core.Command;
import no.fireflake.core.Core;

public class TeleportCommand extends Command {

	@Override
	public void initCommand() {
		command = "/tptest";
	}

	@Override
	public void run(Player player) {
		Location loc = Core.plugin.getServer().getWorld("MEMEWorld").getSpawnLocation();
		player.teleport(loc);
	}

}
