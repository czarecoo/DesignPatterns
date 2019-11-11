package behavioral.state.withstate;

public class FanMedState implements State {
	private Fan fan;

	public FanMedState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void switchState() {
		System.out.println("Switching fan to high");
		fan.setState(fan.getHighState());
	}

	@Override
	public void printState() {
		System.out.println("Fan is on med setting");
	}
}