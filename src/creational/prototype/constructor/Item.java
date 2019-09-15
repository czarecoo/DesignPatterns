package creational.prototype.constructor;

public abstract class Item implements Cloneable {
	private String title;
	private float cost;
	private String author;

	public Item() {
	}

	public Item(Item item) {
		if (item != null) {
			this.title = item.title;
			this.cost = item.cost;
			this.author = item.author;
		}
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public abstract Item clone();
}
