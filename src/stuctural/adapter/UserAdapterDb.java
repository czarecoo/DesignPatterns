package stuctural.adapter;

public class UserAdapterDb implements User {

	private UserDb instance;

	public UserAdapterDb(UserDb user) {
		instance = user;
	}

	@Override
	public int getIdentificator() {
		return Integer.parseInt(instance.getId());
	}

	@Override
	public String getFirstName() {
		return instance.getName();
	}

	@Override
	public String getLastName() {
		return instance.getSurname();
	}

	@Override
	public String getEmailAddress() {
		return instance.getEmail();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[identificator=");
		builder.append(getIdentificator());
		builder.append(", firstName=");
		builder.append(getFirstName());
		builder.append(", lastName=");
		builder.append(getLastName());
		builder.append(", emailAddress=");
		builder.append(getEmailAddress());
		builder.append("]");
		return builder.toString();
	}
}