package stuctural.flyweight;

public class Demo {
	public static void main(String[] args) {
		InventorySystem system = new InventorySystem();
		int order = 0;
		system.takeOrder("item1", order++);
		system.takeOrder("item1", order++);
		system.takeOrder("item1", order++);
		system.takeOrder("item2", order++);
		system.takeOrder("item2", order++);
		system.takeOrder("item2", order++);
		system.takeOrder("item3", order++);
		system.takeOrder("item4", order++);

		system.processOrders();

		system.report();
	}
}
