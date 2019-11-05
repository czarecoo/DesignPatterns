package behavioral.memento.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class Serializator {
	private Serializator() {
	}

	public static Employee deserialize(String filename) throws IOException, ClassNotFoundException {
		File file = new File(filename);
		try (FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			return (Employee) objectInputStream.readObject();
		}
	}

	public static void serialize(Employee employee, String filename) throws IOException {
		File file = new File(filename);
		if (!file.createNewFile()) {
			System.out.println("Overwriting existing file.");
		}
		try (FileOutputStream fileOutputStream = new FileOutputStream(file);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(employee);
		}
	}
}