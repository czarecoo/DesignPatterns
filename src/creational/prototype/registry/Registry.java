package creational.prototype.registry;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	Map<String, Item> items = new HashMap<>();

	public Registry() {
		loadItems();
	}

	private void loadItems() {
		Movie movie = new Movie();
		movie.setAuthor("Adam Mickiewicz");
		movie.setCost(20);
		movie.setTitle("Wojna");
		movie.setRunTimeInMins(120);
		items.put("Movie", movie);

		Book book = new Book();
		book.setAuthor("Czareg");
		book.setCost(10);
		book.setTitle("Rozpacz matki nad zasranym dzieckiem");
		book.setNumberOfPages(333);
		items.put("Book", book);
	}

	public Item copyItem(String type) {
		return (Item) items.get(type).clone();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Registry [items=");
		builder.append(items);
		builder.append("]");
		return builder.toString();
	}

}
