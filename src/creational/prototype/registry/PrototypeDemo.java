package creational.prototype.registry;

public class PrototypeDemo {
	public static void main(String args[]) {
		Registry reg = new Registry();
		System.out.println(reg);
		Movie movie = (Movie) reg.copyItem("Movie");
		System.out.println(movie);
		Movie anotherMovie = (Movie) reg.copyItem("Movie");
		System.out.println(anotherMovie);
	}
}
