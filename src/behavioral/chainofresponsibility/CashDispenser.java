package behavioral.chainofresponsibility;

public class CashDispenser extends Dispenser {
	private int value;

	public CashDispenser(int value, Dispenser next) {
		super(next);
		this.value = value;
	}

	@Override
	public void dispense(int userValue) {
		int num = userValue / value;
		int mod = userValue % value;
		System.out.println("Dispensed " + num + " x " + value);
		if (mod != 0 && next != null) {
			next.dispense(mod);
		}
	}
}