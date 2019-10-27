package behavioral.mediator.fans.withoutmediator;

public class PowerSupplier {
	private boolean isOn;

	public void turnOff() {
		isOn = false;
		System.out.println("Turned off power supplier.");
	}

	public void turnOn() {
		isOn = true;
		System.out.println("Turned on power supplier.");
	}

}
