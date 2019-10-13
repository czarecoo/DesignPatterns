package stuctural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class MenuComponent {
	private String name;
	private String url;
	private List<MenuComponent> menuComponents;

	public MenuComponent(String name, String url) {
		this.name = name;
		this.url = url;
		menuComponents = new ArrayList<>();
	}

	String getName() {
		return name;
	}

	String getUrl() {
		return url;
	}

	public List<MenuComponent> getMenuComponents() {
		return menuComponents;
	}

	public void printUrls() {
		printUrls("");
	}

	void printUrls(String before) {
		String url = before + getUrl();
		if (menuComponents.isEmpty()) {
			System.out.println(url);
		} else {
			Iterator<MenuComponent> it = menuComponents.iterator();
			while (it.hasNext()) {
				MenuComponent component = it.next();
				component.printUrls(url);
			}
		}
	}

	public void printTree() {
		printTree("", "   ");
	}

	public void printTree(String before, String separator) {
		System.out.println(before + getUrl());
		Iterator<MenuComponent> it = menuComponents.iterator();
		while (it.hasNext()) {
			MenuComponent component = it.next();
			component.printTree(before + separator, separator);
		}
	}
}
