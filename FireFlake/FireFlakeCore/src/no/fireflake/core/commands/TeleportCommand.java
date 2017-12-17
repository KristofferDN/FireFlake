package no.fireflake.core.commands;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;
import no.fireflake.core.Command;

public class TeleportCommand extends Command {

	@Override
	public void initCommand() {
		command = "/tp";
	}

	@Override
	public void run(Player player, String[] args) {
		if (args.length == 1) {
			Player pOne = player;
			Player pTwo = Bukkit.getPlayer(args[0]);

			if (pTwo != null) {
				pOne.teleport(pTwo);
				pOne.sendMessage(ChatColor.GREEN + "Du har blitt teleportert til " + ChatColor.GRAY + args[0]);
			} else {
				pOne.sendMessage(
						ChatColor.GREEN + "Player " + ChatColor.GRAY + args[1] + ChatColor.GREEN + " does not exist");
			}
		}
		if (args.length >= 2) {
			Player pOne = Bukkit.getPlayer(args[0]);
			Player pTwo = Bukkit.getPlayer(args[1]);

			if (pOne != null) {
				if (pTwo != null) {
					pOne.teleport(pTwo);
					player.sendMessage(ChatColor.GREEN + "Du har teleportert " + ChatColor.GRAY + args[0] + ChatColor.GREEN + " til " + ChatColor.GREEN + args[1]);
					pOne.sendMessage(ChatColor.GREEN + "Du har blitt teleportert til " + ChatColor.GRAY + args[0]);
				} else {
					player.sendMessage(ChatColor.GREEN + "Player " + ChatColor.GRAY + args[1] + ChatColor.GREEN
							+ " does not exist");
				}
			} else {
				player.sendMessage(
						ChatColor.GREEN + "Player " + ChatColor.GRAY + args[0] + ChatColor.GREEN + " does not exist");
			}
		}
	}

}
