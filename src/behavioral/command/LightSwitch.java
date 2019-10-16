package behavioral.command;

public class LightSwitch {

	public void executeCommand(Command command) {
		command.execute();
	}
}
