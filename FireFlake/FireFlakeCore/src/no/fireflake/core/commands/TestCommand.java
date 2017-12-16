package no.fireflake.core.commands;

import org.bukkit.entity.Player;

import no.fireflake.core.Command;

public class TestCommand extends Command {

	@Override
	public void initCommand() {
		command = "/test";
	}

	@Override
	public void run(Player player) {
		player.sendMessage("Test! Dette var en rar test-melding ;) - Spoch");
	}

}
