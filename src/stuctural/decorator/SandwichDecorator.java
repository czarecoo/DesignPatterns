package stuctural.decorator;

public abstract class SandwichDecorator {
	protected Sandwich sandwich;

	SandwichDecorator(Sandwich sandwich) {
		this.sandwich = sandwich;
	}
}
