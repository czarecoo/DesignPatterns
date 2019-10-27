package behavioral.mediator.withcommand;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	List<Light> lights = new ArrayList<>();

	public void register(Light light) {
		lights.add(light);
	}

	public void turnOnAllTheLights() {
		for (Light light : lights) {
			light.turnOn();
		}
	}

	public void turnOffAllTheLights() {
		for (Light light : lights) {
			light.turnOff();
		}
	}
}
