package behavioral.mediator.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
	private List<User> users;

	public ChatMediatorImpl() {
		users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String msg, User sender) {
		for (User user : users) {
			if (user == sender) {
				// do not send msg to original sender
				continue;
			}
			user.receive(msg);
		}
	}
}