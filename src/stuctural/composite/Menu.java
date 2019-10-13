package stuctural.composite;

public class Menu extends MenuComponent {

	public Menu(String name, String url) {
		super(name, url);
	}

	public void add(MenuComponent component) {
		getMenuComponents().add(component);
	}
}