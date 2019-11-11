package behavioral.state.withstate;

public class Fan {
	private State fanOffState;
	private State fanLowState;
	private State fanMedState;
	private State fanHighState;

	private State state;

	public Fan() {
		fanOffState = new FanOffState(this);
		fanLowState = new FanLowState(this);
		fanMedState = new FanMedState(this);
		fanHighState = new FanHighState(this);

		state = fanOffState;
	}

	public void pushButton() {
		state.switchState();
	}

	public void printState() {
		state.printState();
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getLowState() {
		return fanLowState;
	}

	public State getMedState() {
		return fanMedState;
	}

	public State getHighState() {
		return fanHighState;
	}

	public State getOffState() {
		return fanOffState;
	}
}