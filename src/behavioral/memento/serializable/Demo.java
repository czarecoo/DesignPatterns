package behavioral.memento.serializable;

import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		try {
			String filename = "cezary.txt";
			Employee employee = new Employee(0, "Cezary", "Pazura");
			Serializator.serialize(employee, filename);
			Employee deserializedEmployee = Serializator.deserialize(filename);
			System.out.println(deserializedEmployee);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}