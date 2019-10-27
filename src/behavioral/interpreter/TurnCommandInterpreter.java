package behavioral.interpreter;

import behavioral.command.Command;
import behavioral.command.Light;

public class TurnCommandInterpreter implements Interpreter {

	Interpreter onOffInterpreter;

	public TurnCommandInterpreter(Light light) {
		onOffInterpreter = new OnOffCommandInterpreter(light);
	}

	@Override
	public Command interpret(String context) {
		if (context.toLowerCase().contains("turn".toLowerCase())) {
			return onOffInterpreter.interpret(context);
		}
		return null;
	}
}