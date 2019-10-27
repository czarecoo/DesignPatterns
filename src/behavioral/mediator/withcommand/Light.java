package behavioral.mediator.withcommand;

public class Light {
	private String name;
	boolean isOn = false;

	public Light(String name) {
		this.name = name;
	}

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
			System.out.println(capitalize(name) + " is on.");
		} else {
			System.out.println(capitalize(name) + " is off");
		}
	}

	private String capitalize(String str) {
		if (str == null)
			return str;
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}