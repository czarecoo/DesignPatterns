package creational.abstractfactory;

public abstract class AbstractCardFactory {

	public static AbstractCardFactory getCardFactory(CompanyType type) {
		switch (type) {
		case MASTERCARD:
			return new MasterCardFactory();
		case VISA:
			return new VisaFactory();
		default:
			return null;
		}
	}

	public abstract Card getCard(CardType type);
}
