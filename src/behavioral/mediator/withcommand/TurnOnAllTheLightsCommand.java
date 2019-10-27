package behavioral.mediator.withcommand;

import behavioral.command.Command;

public class TurnOnAllTheLightsCommand implements Command {

	private Mediator mediator;

	public TurnOnAllTheLightsCommand(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void execute() {
		mediator.turnOnAllTheLights();
	}
}
