package stuctural.proxy.simple;

public interface TwitterService {
	String getTimeline();

	void postToTimeline(String message);
}