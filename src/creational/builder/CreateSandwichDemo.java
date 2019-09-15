package creational.builder;

public class CreateSandwichDemo {

	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder();

		builder.bread("white").dressing1("ham").dressing2("cheese");

		Sandwich mySandwich = builder.build();

		System.out.println(mySandwich);
	}

}
