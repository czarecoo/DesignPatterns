package behavioral.observer.twitter;

public class Client extends Observer {
	protected String name;

	public Client(String name) {
		this.name = name;
	}

	@Override
	public void update(String str) {
		System.out.println("[" + name + "]: New twitter post: " + str);
	}
}
