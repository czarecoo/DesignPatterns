package behavioral.state.withoutstate;

public class Fan {
	public enum State {
		OFF, LOW, MED, HIGH
	}

	private State state = State.OFF;

	public void pushButton() {
		if (state == State.OFF) {
			System.out.println("Switching fan to low");
			state = State.LOW;
		} else if (state == State.LOW) {
			System.out.println("Switching fan to med");
			state = State.MED;
		} else if (state == State.MED) {
			System.out.println("Switching fan to high");
			state = State.HIGH;
		} else if (state == State.HIGH) {
			System.out.println("Switching fan off");
			state = State.OFF;
		}
	}

	public void printState() {
		if (state == State.OFF) {
			System.out.println("Fan is off");
		} else if (state == State.LOW) {
			System.out.println("Fan is low setting");
		} else if (state == State.MED) {
			System.out.println("Fan is med setting");
		} else if (state == State.HIGH) {
			System.out.println("Fan is high setting");
		}
	}
}