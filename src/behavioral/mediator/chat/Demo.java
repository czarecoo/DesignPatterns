package behavioral.mediator.chat;

public class Demo {
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();

		User user1 = new UserImpl(mediator, "User1");
		User user2 = new UserImpl(mediator, "User2");
		User user3 = new UserImpl(mediator, "User3");

		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);

		user1.send("Hello all!");
		user2.send("Hello User1.");
	}
}