package stuctural.decorator;

public class MeatDecorator extends SandwichDecorator implements Sandwich {

	MeatDecorator(Sandwich sandwich) {
		super(sandwich);
	}

	@Override
	public String make() {
		return sandwich.make() + " with ham";
	}
}
