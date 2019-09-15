package creational.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AbstractCardFactory factory = AbstractCardFactory.getCardFactory(CompanyType.MASTERCARD);
		Card card = factory.getCard(CardType.DEBT);
		System.out.println(card);
	}

}
