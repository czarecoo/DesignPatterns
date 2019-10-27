package behavioral.mediator.fans.withmediator;

public class PowerSupplier {
	public PowerSupplier(Mediator mediator) {
		mediator.setPowerSupplier(this);
	}

	public void turnOff() {
		System.out.println("Turned off power supplier.");
	}

	public void turnOn() {
		System.out.println("Turned on power supplier.");
	}
}
