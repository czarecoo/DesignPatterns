package stuctural.adapter;

public class UserHost implements User {
	public UserHost(int identificator, String firstName, String lastName, String emailAddress) {
		this.identificator = identificator;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

	private int identificator;
	private String firstName;
	private String lastName;
	private String emailAddress;

	@Override
	public int getIdentificator() {
		return identificator;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public String getEmailAddress() {
		return emailAddress;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[identificator=");
		builder.append(identificator);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", emailAddress=");
		builder.append(emailAddress);
		builder.append("]");
		return builder.toString();
	}
}
