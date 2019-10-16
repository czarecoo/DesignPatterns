package behavioral.chainofresponsibility;

public class Demo {
	public static void main(String[] args) {
		Dispenser dispenser = new CashDispenser(20,
				new CashDispenser(10, new CashDispenser(5, new CashDispenser(2, new CashDispenser(1, null)))));

		int toDispense = 33;

		dispenser.dispense(toDispense);
	}
}