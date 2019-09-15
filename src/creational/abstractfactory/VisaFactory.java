package creational.abstractfactory;

public class VisaFactory extends AbstractCardFactory {
	@Override
	public Card getCard(CardType type) {
		switch (type) {
		case DEBT:
			return new VisaDebtCard();
		case CREDIT: {
			return new VisaCreditCard();
		}
		default:
			return null;
		}
	}
}
