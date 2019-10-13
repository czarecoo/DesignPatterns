package stuctural.proxy.simple;

public class Demo {
	public static void main(String[] args) {
		TwitterService service = new TwitterServiceProxy();

		service.postToTimeline("msg1");
		service.postToTimeline("msg2");

		System.out.println(service.getTimeline());
	}
}
