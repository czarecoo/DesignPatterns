package behavioral.observer.twitter;

public class Demo {
	public static void main(String[] args) {
		Twitter twitter = new Twitter();

		Client client1 = new Client("1");
		Client client2 = new Client("2");

		twitter.register(client1);
		twitter.register(client2);

		twitter.post("Hello friends");
	}
}
