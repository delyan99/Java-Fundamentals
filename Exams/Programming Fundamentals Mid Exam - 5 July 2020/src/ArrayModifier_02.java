import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayModifier_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] number = scan.nextLine().split("\\s+");
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < number.length; i++) {
			numbers.add(Integer.parseInt(number[i]));
		}
		String input = scan.nextLine();
		while (!"end".equals(input)) {
			String command[] = input.split("\\s+");
			switch (command[0]) {
			case "swap":
				int index1 = Integer.parseInt(command[1]);
				int index2 = Integer.parseInt(command[2]);
				int curent = numbers.get(index2);
				numbers.set(index2, numbers.get(index1));
				numbers.set(index1, curent);
				break;

			case "multiply":
				int index11 = Integer.parseInt(command[1]);
				int index22 = Integer.parseInt(command[2]);
				int curent2 = numbers.get(index11) * numbers.get(index22);
				numbers.set(index11, curent2);
				
				break;
			case "decrease":
				for (int i = 0; i < numbers.size(); i++) {
					numbers.set(i, numbers.get(i) - 1);
				}
				break;
			}
			
			input = scan.nextLine();
		}
		for (int i = 0; i < numbers.size(); i++) {
			if(i == numbers.size() - 1) {
				System.out.print(numbers.get(i));
			}else {
				System.out.print(numbers.get(i) +", ");
			}
		}
	}

}