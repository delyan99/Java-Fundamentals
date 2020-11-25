import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Numbers_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("\\s+");
		List<Integer> numbers = new ArrayList<>();
		List<Integer> numbers2 = new ArrayList<>();
		int counter = 0;
		int sum = 0;
		double average = 0;
		for (int i = 0; i < input.length; i++) {
			numbers.add(Integer.parseInt(input[i]));
		}
		for (int i = 0; i < numbers.size(); i++) {
			counter++;
			sum += numbers.get(i);
		}
		average = 1.0 * sum / counter;
		boolean flag = true;
		for (int i = 0; i < numbers.size(); i++) {
			if(numbers.get(i) > average) {
				flag = false;
					numbers2.add(numbers.get(i));
			}
		}
		if(flag) {
			System.out.println("No");
		}else {
			int removeElements = 0;
			if(numbers2.size() > 5) {
				removeElements = numbers2.size() - 5;
				
				for (int i = 0; i < removeElements; i++) {
					int minValue = Integer.MAX_VALUE;
					int cur = 0;
					for (int j = 0; j < numbers2.size(); j++) {
						if(minValue > numbers2.get(j)) {
							minValue = numbers2.get(j);
							cur = j;
						}
					}
					numbers2.remove(cur);
				}
			}
			
			numbers2.stream().sorted((p1, p2)->p2.compareTo(p1)).forEach(p -> System.out.print(p + " "));
		}
	}

}
