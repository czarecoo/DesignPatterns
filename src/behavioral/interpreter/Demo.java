package behavioral.interpreter;

import java.util.Scanner;

import behavioral.command.Command;
import behavioral.command.Light;
import behavioral.command.LightSwitch;

public class Demo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Light light = new Light();
		LightSwitch lightSwitch = new LightSwitch();
		for (;;) {
			System.out.println("Write the command (exit to quit)");
			String input = scanner.nextLine();
			if (input.contains("exit")) {
				break;
			}
			Interpreter commandInterpreter = buildInterpreter(light);
			Command command = commandInterpreter.interpret(input);
			if (command != null) {
				lightSwitch.executeCommand(command);
			} else {
				System.err.println("Unknown command: " + input);
			}
		}
		scanner.close();
	}

	private static Interpreter buildInterpreter(Light light) {
		return new TurnCommandInterpreter(light);
	}
}