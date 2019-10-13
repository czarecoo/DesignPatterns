package stuctural.decorator;

public class DressingDecorator extends SandwichDecorator implements Sandwich {

	DressingDecorator(Sandwich sandwich) {
		super(sandwich);
	}

	@Override
	public String make() {
		return sandwich.make() + " with ketchup";
	}

}
