package behavioral.command;

public class Light {
	boolean isOn = false;

	public void turnOn() {
		isOn = true;
		printState();
	}

	public void turnOff() {
		isOn = false;
		printState();
	}

	public void printState() {
		if (isOn) {
			System.out.println("Light is on.");
		} else {
			System.out.println("Light is off");
		}
	}
}