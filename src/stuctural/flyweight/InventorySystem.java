package stuctural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class InventorySystem {
	private Catalog catalog = new Catalog();
	private List<Order> orders = new ArrayList<>();

	public void takeOrder(String itemName, int orderNumber) {
		Item item = catalog.lookUpItem(itemName);
		Order order = new Order(item, orderNumber);
		orders.add(order);
	}

	public void processOrders() {
		for (Order order : orders) {
			order.processOrder();
		}
		orders.clear();
	}

	public void report() {
		System.out.println("Total number of items created: " + catalog.totalItems());
	}
}