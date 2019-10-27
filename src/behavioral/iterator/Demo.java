package behavioral.iterator;

import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		LetterRepository repo = new LetterRepository();
		System.out.println(repo.size());
		repo.add(new Letter("A"));
		System.out.println(repo.size());
		repo.add(new Letter("B"));
		System.out.println(repo.size());
		repo.add(new Letter("C"));
		System.out.println(repo.size());

		for (Letter letter : repo) {
			System.out.println(letter);
		}
		System.out.println("___________________");
		Iterator<Letter> backInterator = repo.backIterator();
		while (backInterator.hasNext()) {
			System.out.println(backInterator.next());
		}
	}
}
