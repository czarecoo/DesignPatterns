package stuctural.proxy.complex;

import java.util.ArrayList;
import java.util.List;

public class TwitterServiceImpl implements TwitterService {
	List<String> timeline = new ArrayList<>();

	@Override
	public String getTimeline() {
		return timeline.toString();
	}

	@Override
	public void postToTimeline(String message) {
		timeline.add(message);
	}
}
