package behavioral.mediator.fans.withmediator;

public class Mediator {
	private Fan fan;
	private PowerSupplier powerSupplier;

	/**
	 * if more than one fan or power supplie were created, references and setters
	 * should be replaced with collection and register method
	 */
	public void setFan(Fan fan) {
		this.fan = fan;
	}

	public void setPowerSupplier(PowerSupplier powerSupplier) {
		this.powerSupplier = powerSupplier;
	}

	public void pressButton() {
		if (fan.isOn()) {
			fan.turnOff();
		} else {
			fan.turnOn();
		}
	}

	public void turnOnPower() {
		powerSupplier.turnOn();
	}

	public void turnOffPower() {
		powerSupplier.turnOff();
	}
}