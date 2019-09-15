package creational.prototype.registry;

public class Movie extends Item {
	private int runTimeInMins;

	public int getRunTimeInMins() {
		return runTimeInMins;
	}

	public void setRunTimeInMins(int runTimeInMins) {
		this.runTimeInMins = runTimeInMins;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Movie [runTimeInMins=");
		builder.append(runTimeInMins);
		builder.append(", getRunTimeInMins()=");
		builder.append(getRunTimeInMins());
		builder.append(", getCost()=");
		builder.append(getCost());
		builder.append(", getTitle()=");
		builder.append(getTitle());
		builder.append(", getAuthor()=");
		builder.append(getAuthor());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}