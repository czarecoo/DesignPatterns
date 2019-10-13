package stuctural.composite;

public class Demo {
	public static void main(String[] args) {
		Menu mainMenu = new Menu("main menu", "main");
		MenuItem about = new MenuItem("about page", "/about");
		mainMenu.add(about);
		MenuItem contact = new MenuItem("contact page", "/contact");
		mainMenu.add(contact);
		Menu eventsSubMenu = new Menu("events menu", "/events");
		mainMenu.add(eventsSubMenu);
		MenuItem event1 = new MenuItem("event1 page", "/event1");
		eventsSubMenu.add(event1);
		MenuItem event2 = new MenuItem("event2 page", "/event2");
		eventsSubMenu.add(event2);
		Menu event3 = new Menu("event3 menu", "/event3");
		eventsSubMenu.add(event3);
		MenuItem event3Info = new MenuItem("event3 info page", "/info");
		event3.add(event3Info);
		MenuItem partners = new MenuItem("partners page", "/partners");
		mainMenu.add(partners);

		mainMenu.printUrls();

		System.out.println();

		mainMenu.printTree();
	}
}
