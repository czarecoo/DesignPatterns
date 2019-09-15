package creational.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		System.out.println(shop);
	}

}
