package behavioral.command;

public class Demo {
	public static void main(String[] args) {
		Light light = new Light();
		LightSwitch lightSwitch = new LightSwitch();
		Command turnOffLight = new TurnOffLightCommand(light);
		Command turnOnLight = new TurnOnLightCommand(light);
		light.printState();
		lightSwitch.executeCommand(turnOnLight);
		light.printState();
		lightSwitch.executeCommand(turnOffLight);
		light.printState();
	}
}
