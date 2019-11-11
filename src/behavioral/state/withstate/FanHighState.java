package behavioral.state.withstate;

public class FanHighState implements State {
	private Fan fan;

	public FanHighState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void switchState() {
		System.out.println("Switching fan off");
		fan.setState(fan.getOffState());
	}

	@Override
	public void printState() {
		System.out.println("Fan is on high setting");
	}
}