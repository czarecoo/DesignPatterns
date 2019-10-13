package stuctural.facade;

public class Waiter {
	public void takeOrder() {
		System.out.println("Waiter is taking order");
	}

	public void passOrderToKitchen() {
		System.out.println("Waiter is passing order to kitchen");
	}

	public void serveClient() {
		System.out.println("Waiter is serving client the order");
	}
}
