package no.fireflake.core.commands;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;
import no.fireflake.core.Command;

public class GamemodeCommand extends Command {

	@Override
	public void initCommand() {
		command = "/gm"
	}

	@Override
	public void run(Player player, String[] args) {
		if (args[0].equals("1") || args[0].equals("c")) {
			player.setGameMode(GameMode.CREATIVE);
			player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7Din spillmodus ble endret til Kreativ!"));
		}

		if (args[0].equals("0") || args[0].equals("s")) {
			player.setGameMode(GameMode.SURVIVAL);
			player.sendMessage(
					ChatColor.translateAlternateColorCodes('&', "&7Din spillmodus ble endret til Overlevelse!"));
		}

		if (args[0].equals("2") || args[0].equals("a")) {
			player.setGameMode(GameMode.ADVENTURE);
			player.sendMessage(
					ChatColor.translateAlternateColorCodes('&', "&7Din spillmodus ble endret til Utforskning!"));
		}
	}

}
