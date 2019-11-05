package behavioral.observer.twitter;

import java.util.ArrayList;
import java.util.List;

public abstract class Topic {
	private List<Observer> observers = new ArrayList<>();

	public void register(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers(String line) {
		for (Observer observer : observers) {
			observer.update(line);
		}
	}
}
