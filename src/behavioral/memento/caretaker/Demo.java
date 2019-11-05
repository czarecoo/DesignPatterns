package behavioral.memento.caretaker;

public class Demo {
	public static void main(String[] args) {
		Employee employee = new Employee(0, "Cezary", "Pazura");
		Caretaker caretaker = new Caretaker();
		
		System.out.println(employee);
		caretaker.save(employee);
		System.out.println(employee);
		employee.setId(1);
		System.out.println(employee);
		caretaker.save(employee);
		System.out.println(employee);
		employee.setName("Pazura");
		System.out.println(employee);
		caretaker.save(employee);
		System.out.println(employee);
		employee.setSurname("Cezary");
		System.out.println(employee);
		caretaker.revert(employee);
		System.out.println(employee);
		caretaker.revert(employee);
		System.out.println(employee);
		caretaker.revert(employee);
		System.out.println(employee);
	}
}
