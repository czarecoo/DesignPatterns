package behavioral.observer.shopdisplays;

public class Demo {
	public static void main(String[] args) {
		BuyItemTopic buyItemTopic = new BuyItemTopic(new Item("Backpack", "$19"));

		CashierDisplay cashierDisplay = new CashierDisplay(buyItemTopic);
		CustomerDisplay customerDisplay = new CustomerDisplay(buyItemTopic);

		buyItemTopic.buyItem();
	}
}
