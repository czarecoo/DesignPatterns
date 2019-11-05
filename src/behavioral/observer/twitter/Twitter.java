package behavioral.observer.twitter;

public class Twitter extends Topic {
	public void post(String string) {
		notifyObservers(string);
	}
}
