package stuctural.bridge.shapeswithoutbridge;

public class BlueCircle extends Circle {

	@Override
	void applyColor() {
		System.out.println("Applying blue to " + getShape());
	}

}
