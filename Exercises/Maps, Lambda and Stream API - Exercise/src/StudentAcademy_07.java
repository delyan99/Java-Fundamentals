import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Double> studentInfo = new LinkedHashMap<>();
		int n = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < n; i++) {
			String name = scan.nextLine();
			double grade = Double.parseDouble(scan.nextLine());
			if(!studentInfo.containsKey(name)){
				studentInfo.put(name, grade);
			}else {
				double newGrade = (studentInfo.get(name) + grade) / 2;
				studentInfo.put(name, newGrade);
			}
		}
		
		studentInfo.entrySet().stream()
		.filter(p -> p.getValue() >= 4.5)
		.sorted((l, r) ->r.getValue().compareTo(l.getValue()))
		.forEach(p->System.out.println(String.format("%s -> %.2f", p.getKey(),p.getValue())));

	}

}
