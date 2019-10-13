package stuctural.proxy.complex;

public class Demo {
	public static void main(String[] args) {
		TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

		service.postToTimeline("msg1");
		service.postToTimeline("msg2");

		System.out.println(service.getTimeline());
	}
}
