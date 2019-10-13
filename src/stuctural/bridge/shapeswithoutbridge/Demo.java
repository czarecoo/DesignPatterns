package stuctural.bridge.shapeswithoutbridge;

public class Demo {

	public static void main(String[] args) {
		Circle blueCircle = new BlueCircle();
		Square redSquare = new RedSquare();

		blueCircle.applyColor();
		redSquare.applyColor();
	}

}
