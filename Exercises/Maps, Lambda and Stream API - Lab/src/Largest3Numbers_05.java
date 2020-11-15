import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
				.map(p -> Integer.parseInt(p))
				.sorted((p, k) -> k.compareTo(p))
				.collect(Collectors.toList());
				
		if(numbers.size() >= 3) {
			for (int i = 0; i < 3; i++) {
				System.out.print(numbers.get(i) + " ");
			}
		}else {
			for (Integer num : numbers) {
				System.out.print(num + " ");
			}
		}

	}

}
