package Students_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numbers = Integer.parseInt(scan.nextLine());
		List<Student> students = new ArrayList<>();
		for (int i = 0; i < numbers; i++) {
			String[] tokens = scan.nextLine().split("\\s+");
			String firstName = tokens[0];
			String lastName = tokens[1];
			double grade = Double.parseDouble(tokens[2]);
			Student student = new Student(firstName, lastName, grade);
			students.add(student);
		}
		students.stream().sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade())).forEach(s -> System.out.println(s.toString()));

	}

}
