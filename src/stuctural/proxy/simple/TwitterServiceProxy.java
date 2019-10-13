package stuctural.proxy.simple;

public class TwitterServiceProxy implements TwitterService {
	TwitterService service = new TwitterServiceImpl();

	@Override
	public String getTimeline() {
		return service.getTimeline();
	}

	@Override
	public void postToTimeline(String message) {
		throw new IllegalAccessError("Posting is currently disabled");
	}
}
