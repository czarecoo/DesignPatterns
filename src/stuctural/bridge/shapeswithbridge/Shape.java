package stuctural.bridge.shapeswithbridge;

public abstract class Shape {
	private Color color;

	Shape(Color color) {
		this.color = color;
	}

	abstract String getShape();

	void applyColor() {
		System.out.println("Applying " + color.getColor() + " to " + getShape());
	}
}
