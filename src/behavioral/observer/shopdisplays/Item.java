package behavioral.observer.shopdisplays;

public class Item {
	String name;
	String cost;

	public Item(String name, String cost) {
		this.name = name;
		this.cost = cost;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [name=");
		builder.append(name);
		builder.append(", cost=");
		builder.append(cost);
		builder.append("]");
		return builder.toString();
	}
}
