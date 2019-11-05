package behavioral.memento.caretaker;

import java.util.ArrayDeque;
import java.util.Deque;

public class Caretaker {
	Deque<EmployeeMemento> deque = new ArrayDeque<>();

	public void save(Employee employee) {
		deque.push(employee.save());
	}

	public void revert(Employee employee) {
		employee.revert(deque.pop());
	}
}
