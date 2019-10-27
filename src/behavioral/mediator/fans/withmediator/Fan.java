package behavioral.mediator.fans.withmediator;

public class Fan {
	private Mediator mediator;
	private boolean isOn;

	public Fan(Mediator mediator) {
		this.mediator = mediator;
		mediator.setFan(this);
	}

	public void turnOn() {
		System.out.println("Turned on fan.");
		mediator.turnOnPower();
		isOn = true;
	}

	public void turnOff() {
		System.out.println("Turned off fan.");
		isOn = false;
		mediator.turnOffPower();
	}

	public boolean isOn() {
		return isOn;
	}
}