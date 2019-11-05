package behavioral.observer.shopdisplays;

public class CashierDisplay extends Observer {
	public CashierDisplay(Topic topic) {
		topic.register(this);
	}

	@Override
	public void update(String str) {
		System.out.println("[CashierDisplay] " + str);
	}
}
