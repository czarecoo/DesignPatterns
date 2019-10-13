package stuctural.facade;

public class RestaurantFacade {
	Waiter waiter = new Waiter();
	Kitchen kitchen = new Kitchen();

	public void takeOrder() {
		waiter.takeOrder();
		waiter.passOrderToKitchen();
		kitchen.takeOrder();
		kitchen.prepareOrder();
		kitchen.notifyWaiter();
		waiter.serveClient();
	}
}
