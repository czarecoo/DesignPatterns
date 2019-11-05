package behavioral.observer.shopdisplays;

public class CustomerDisplay extends Observer {
	public CustomerDisplay(Topic topic) {
		topic.register(this);
	}

	@Override
	public void update(String str) {
		System.out.println("[CustomerDisplay] " + str);
	}
}
