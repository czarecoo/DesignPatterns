package stuctural.flyweight;

public class Order {
	Item item;
	int orderNumber;

	public Order(Item item, int orderNumber) {
		this.item = item;
		this.orderNumber = orderNumber;
	}

	public void processOrder() {
		System.out.println(String.format("Processing order no: %s, item: %s", orderNumber, item));
	}
}
