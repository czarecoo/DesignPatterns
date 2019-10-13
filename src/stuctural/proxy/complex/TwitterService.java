package stuctural.proxy.complex;

public interface TwitterService {
	String getTimeline();

	void postToTimeline(String message);
}