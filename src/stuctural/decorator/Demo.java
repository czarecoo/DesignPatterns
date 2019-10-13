package stuctural.decorator;

public class Demo {
	public static void main(String[] args) {
		Sandwich mySandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		System.out.println(mySandwich.make());
	}
}
