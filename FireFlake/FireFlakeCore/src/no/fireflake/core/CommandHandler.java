package no.fireflake.core;

import java.util.ArrayList;
import java.util.List;

public class CommandHandler {
	private List<Command> commandList = new ArrayList<Command>();
	
	public void registerCommand(Command command) {
		commandList.add(command);
		command.initCommand();
	}
	
	public void clearCommands() {
		commandList.clear();
	}
	
	public void removeCommand(Command command) {
		commandList.remove(command);
	}
	
	public List<Command> getList() {
		return this.commandList;
	}
	
}
