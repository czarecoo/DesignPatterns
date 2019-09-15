package creational.abstractfactory;

public class MasterCardFactory extends AbstractCardFactory {
	@Override
	public Card getCard(CardType type) {
		switch (type) {
		case DEBT:
			return new MasterCardDebtCard();
		case CREDIT: {
			return new MasterCardCreditCard();
		}
		default:
			return null;
		}
	}
}
