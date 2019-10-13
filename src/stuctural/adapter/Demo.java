package stuctural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();

		users.add(new UserHost(0, "Adam", "Malysz", "adam.malysz@malpa.pl"));

		// users.add(new UserDb("1", "Czareg", "Czarecki",
		// "czarek.czarecki@czarkowniki.cz"));

		users.add(new UserAdapterDb(new UserDb("1", "Czareg", "Czarecki", "czarek.czarecki@czarkowniki.cz")));
		System.out.print(users);
	}
}
