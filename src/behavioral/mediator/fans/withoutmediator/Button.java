package behavioral.mediator.fans.withoutmediator;

public class Button {
	private Fan fan;

	public Button(Fan fan) {
		this.fan = fan;
	}

	public void press() {
		if (fan.isOn()) {
			fan.turnOff();
		} else {
			fan.turnOn();
		}
	}
}