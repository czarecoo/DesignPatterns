package behavioral.mediator.fans.withmediator;

public class Button {
	private Mediator mediator;

	public Button(Mediator mediator) {
		this.mediator = mediator;
	}

	public void press() {
		mediator.pressButton();
	}
}