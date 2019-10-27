package behavioral.mediator.withcommand;

import behavioral.command.Command;

public class TurnOffAllTheLightsCommand implements Command {

	private Mediator mediator;

	public TurnOffAllTheLightsCommand(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void execute() {
		mediator.turnOffAllTheLights();
	}
}
