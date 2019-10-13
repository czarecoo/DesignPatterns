package stuctural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
	private Map<String, Item> map = new HashMap<>();

	public Item lookUpItem(String name) {
		if (!map.containsKey(name)) {
			map.put(name, new Item(name));
		}
		return map.get(name);
	}

	public int totalItems() {
		return map.size();
	}
}
