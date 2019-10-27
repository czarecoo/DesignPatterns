package behavioral.mediator.withcommand;

import behavioral.command.Command;

public class Demo {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		Light bedroomLight = new Light("main bedroom light");
		Light kitchenLight = new Light("main kitchen light");
		Light atticLight = new Light("attic light");

		mediator.register(bedroomLight);
		mediator.register(kitchenLight);
		mediator.register(atticLight);

		Command turnOnAllTheLights = new TurnOnAllTheLightsCommand(mediator);
		turnOnAllTheLights.execute();

		Command turnOffAllTheLights = new TurnOffAllTheLightsCommand(mediator);
		turnOffAllTheLights.execute();
	}
}
