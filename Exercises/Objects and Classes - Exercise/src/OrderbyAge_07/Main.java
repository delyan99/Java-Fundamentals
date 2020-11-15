package OrderbyAge_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		List<Person> people = new ArrayList<>();
		while(!"End".equals(input)) {
			String[] tokens = input.split("\\s+");
			String name = tokens[0];
			String ID = tokens[1];
			int age = Integer.parseInt(tokens[2]);
			Person person = new Person(name, ID, age);
			people.add(person);
			input = scan.nextLine();
		}

		people.stream().sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())).forEach(p -> System.out.println(p.toString()));
	}

}
