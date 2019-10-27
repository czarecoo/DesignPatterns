package behavioral.mediator.lights;

public class Demo {
	public static void main(String[] args) {
		LightMediator lightMediator = new LightMediator();
		Light green = new Light("Green", lightMediator);
		Light yellow = new Light("Yellow", lightMediator);
		Light red = new Light("Red", lightMediator);

		lightMediator.printLightStates();
		green.turnOn();
		lightMediator.printLightStates();
		yellow.turnOn();
		lightMediator.printLightStates();
		red.turnOn();
		lightMediator.printLightStates();
	}
}
