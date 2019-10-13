package stuctural.facade;

public class Kitchen {
	public void takeOrder() {
		System.out.println("Kitchen is taking order for a meal");
	}

	public void prepareOrder() {
		System.out.println("Kitchen is preparing order");
	}

	public void notifyWaiter() {
		System.out.println("Kitchen is telling waiter that food is ready");
	}
}
