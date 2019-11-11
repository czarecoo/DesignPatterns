package behavioral.state.withstate;

public class FanOffState implements State {
	private Fan fan;

	public FanOffState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void switchState() {
		System.out.println("Switching fan to low");
		fan.setState(fan.getLowState());
	}

	@Override
	public void printState() {
		System.out.println("Fan is off");
	}
}