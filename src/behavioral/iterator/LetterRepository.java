package behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class LetterRepository implements Iterable<Letter> {
	private Letter[] letters;
	private int index;

	public LetterRepository() {
		index = 0;
		letters = new Letter[1];
	}

	public Iterator<Letter> iterator() {
		return new Iterator<Letter>() {
			private int currIndex = 0;

			@Override
			public boolean hasNext() {
				if (currIndex < letters.length && letters[currIndex] != null) {
					return true;
				}
				return false;
			}

			@Override
			public Letter next() {
				return letters[currIndex++];
			}
		};
	}

	public Iterator<Letter> backIterator() {
		return new Iterator<Letter>() {
			private int currIndex = letters.length - 1;

			@Override
			public boolean hasNext() {
				if (currIndex >= 0) {
					return true;
				}
				return false;
			}

			@Override
			public Letter next() {
				return letters[currIndex--];
			}
		};
	}

	public void add(Letter letter) {
		if (index == letters.length) {
			letters = Arrays.copyOf(letters, letters.length * 2);
		}
		letters[index++] = letter;
	}

	public int size() {
		return letters.length;
	}
}