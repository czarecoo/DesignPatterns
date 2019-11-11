package behavioral.state.withstate;

public class Demo {
	public static void main(String[] args) {
		Fan fan = new Fan();

		fan.printState();
		fan.pushButton();

		fan.printState();
		fan.pushButton();

		fan.printState();
		fan.pushButton();

		fan.printState();
		fan.pushButton();
	}
}