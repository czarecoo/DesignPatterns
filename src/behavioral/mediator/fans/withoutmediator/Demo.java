package behavioral.mediator.fans.withoutmediator;

public class Demo {
	public static void main(String[] args) {
		PowerSupplier powerSupplier = new PowerSupplier();
		Fan fan = new Fan(powerSupplier);
		Button btn = new Button(fan);
		btn.press();
		btn.press();
		btn.press();
	}
}
