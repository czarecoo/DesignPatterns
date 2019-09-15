package creational.builder;

public class Sandwich {
	private final String bread;
	private final String dressing1;
	private final String dressing2;

	public Sandwich(Builder b) {
		bread = b.bread;
		dressing1 = b.dressing1;
		dressing2 = b.dressing2;
	}

	public String getBread() {
		return bread;
	}

	public String getDressing1() {
		return dressing1;
	}

	public String getDressing2() {
		return dressing2;
	}

	@Override
	public String toString() {
		return "Sandwich [bread=" + bread + ", dressing1=" + dressing1 + ", dressing2=" + dressing2 + "]";
	}

	public static class Builder {
		private String bread;
		private String dressing1;
		private String dressing2;

		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public Builder dressing1(String dressing1) {
			this.dressing1 = dressing1;
			return this;
		}

		public Builder dressing2(String dressing2) {
			this.dressing2 = dressing2;
			return this;
		}

		public Sandwich build() {
			return new Sandwich(this);
		}
	}
}
