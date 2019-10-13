package stuctural.bridge.shapeswithoutbridge;

public class RedSquare extends Square {

	@Override
	void applyColor() {
		System.out.println("Applying red to " + getShape());
	}
}
