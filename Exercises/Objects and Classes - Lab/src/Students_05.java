import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		List<Student> students = new ArrayList<>();
		while (!input.equals("end")) {
			String[] tokens = input.split("\\s+");
			int age = Integer.parseInt(tokens[2]);
			Student std = new Student(tokens[0], tokens[1], age, tokens[3]);
			students.add(std);
			input = scan.nextLine();
		}
		String city = scan.nextLine();
		
		for (Student student : students) {
			if(student.getHometown().equals(city)) {
				System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
			}
		}

	}

}
