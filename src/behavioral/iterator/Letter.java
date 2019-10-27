package behavioral.iterator;

public class Letter {
	String letter;

	public Letter(String letter) {
		this.letter = letter;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Letter [letter=");
		builder.append(letter);
		builder.append("]");
		return builder.toString();
	}
}
