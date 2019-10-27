package behavioral.interpreter;

import behavioral.command.Command;

public interface Interpreter {
	Command interpret(String context);
}
