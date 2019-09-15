package creational.prototype.constructor;

public class Movie extends Item {
	private int runTimeInMins;

	public Movie() {
	}

	public Movie(Movie movie) {
		super(movie);
		if (movie != null) {
			runTimeInMins = movie.runTimeInMins;
		}
	}

	public int getRunTimeInMins() {
		return runTimeInMins;
	}

	public void setRunTimeInMins(int runTimeInMins) {
		this.runTimeInMins = runTimeInMins;
	}

	@Override
	public Item clone() {
		return new Movie(this);
	}
}