package creational.prototype.constructor;

public class PrototypeDemo {
	public static void main(String args[]) {
		Movie movie = new Movie();
		movie.setAuthor("Adam Mickiewicz");
		movie.setCost(20);
		movie.setTitle("Wojna");
		movie.setRunTimeInMins(120);
		System.out.println(movie);

		Book book = new Book();
		book.setAuthor("Czareg");
		book.setCost(10);
		book.setTitle("Rozpacz matki nad zasranym dzieckiem");
		book.setNumberOfPages(333);
		System.out.println(book);

		Movie anotherMovie = (Movie) movie.clone();
		System.out.println(anotherMovie);
	}
}
