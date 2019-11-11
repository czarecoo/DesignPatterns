package behavioral.state.withstate;

public class FanLowState implements State {
	private Fan fan;

	public FanLowState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void switchState() {
		System.out.println("Switching fan to med");
		fan.setState(fan.getMedState());
	}

	@Override
	public void printState() {
		System.out.println("Fan is on low setting");
	}
}