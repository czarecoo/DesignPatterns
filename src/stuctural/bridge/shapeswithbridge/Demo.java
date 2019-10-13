package stuctural.bridge.shapeswithbridge;

public class Demo {

	public static void main(String[] args) {
		Circle greenCircle = new Circle(new Green());
		Square redSquare = new Square(new Red());

		greenCircle.applyColor();
		redSquare.applyColor();
	}

}
