import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int persons = Integer.parseInt(scan.nextLine());
		List<Person> people = new ArrayList<>();
		for (int i = 0; i < persons; i++) {
			String[] tokens = scan.nextLine().split("\\s+");
			int age = Integer.parseInt(tokens[1]);
			if(age > 30) {
				Person person = new Person(tokens[0], age);
				people.add(person);
			}
		
		}
		people.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));

	}

}
