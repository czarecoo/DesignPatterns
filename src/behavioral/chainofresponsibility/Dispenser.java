package behavioral.chainofresponsibility;

public abstract class Dispenser {
	Dispenser next;

	public Dispenser(Dispenser next) {
		this.next = next;
	}

	public abstract void dispense(int userValue);
}
