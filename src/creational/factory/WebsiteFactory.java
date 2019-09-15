package creational.factory;

public class WebsiteFactory {
	private WebsiteFactory() {
	}

	static Website getWebsite(WebsiteType type) {
		switch (type) {
		case SHOP:
			return new ShopWebsite();
		case SPORT:
			return new SportWebsite();
		default:
			return null;
		}
	}
}
