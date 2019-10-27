package behavioral.mediator.fans.withoutmediator;

public class Fan {
	private boolean isOn;
	private PowerSupplier powerSupplier;

	public Fan(PowerSupplier powerSupplier) {
		this.powerSupplier = powerSupplier;
	}

	public void turnOn() {
		System.out.println("Turned on fan.");
		powerSupplier.turnOn();
		isOn = true;
	}

	public void turnOff() {
		System.out.println("Turned off fan.");
		isOn = false;
		powerSupplier.turnOff();
	}

	public boolean isOn() {
		return isOn;
	}
}