package behavioral.mediator.fans.withmediator;

public class Demo {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		PowerSupplier powerSupplier = new PowerSupplier(mediator);
		Button btn = new Button(mediator);
		Fan fan = new Fan(mediator);
		btn.press();
		btn.press();
		btn.press();
	}
}
