package behavioral.mediator.lights;

import java.util.LinkedHashSet;
import java.util.Set;

public class LightMediator {
	Set<Light> trafficSignal = new LinkedHashSet<>();

	public void registerLight(Light light) {
		trafficSignal.add(light);
	}

	void printLightStates() {
		for (Light light : trafficSignal) {
			System.out.printf("%s is turned %s %n", light.toString(), light.getCurrentState());
		}
		System.out.println("------------------------------");
	}

	public void notifyMediator(Light light) {
		turnOffAllOtherLights(light);
	}

	void turnOffAllOtherLights(Light light) {
		for (Light l : trafficSignal) {
			if (!(l.equals(light))) {
				l.turnOff();
			}
		}
	}
}