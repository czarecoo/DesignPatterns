package behavioral.observer.shopdisplays;

public class BuyItemTopic extends Topic {
	private Item item;

	public BuyItemTopic(Item item) {
		this.item = item;
	}

	public void buyItem() {
		notifyObservers("Bought item " + item);
	}
}
