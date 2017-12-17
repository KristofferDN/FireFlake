package no.fireflake.core;

import org.bukkit.entity.Player;

public abstract class Command {

	public String command;
	public abstract void initCommand();
	public abstract void run(Player player, String[] args);
	
}
