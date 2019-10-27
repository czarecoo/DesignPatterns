package behavioral.interpreter;

import behavioral.command.Command;
import behavioral.command.Light;
import behavioral.command.TurnOffLightCommand;
import behavioral.command.TurnOnLightCommand;

public class OnOffCommandInterpreter implements Interpreter {
	private Light light;

	public OnOffCommandInterpreter(Light light) {
		this.light = light;
	}

	@Override
	public Command interpret(String context) {
		if (context.toLowerCase().contains("on".toLowerCase())) {
			return new TurnOnLightCommand(light);
		}
		if (context.toLowerCase().contains("off".toLowerCase())) {
			return new TurnOffLightCommand(light);
		}
		return null;
	}
}