import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbers_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("\\s+");
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			numbers.add(Integer.parseInt(input[i]));
		}
		String[] bombs = scan.nextLine().split("\\s+");
		int[] bomb = new int[bombs.length];
		for (int i = 0; i < bomb.length; i++) {
			bomb[i] = Integer.parseInt(bombs[i]);
		}
		int specialNumber = bomb[0];
		int power = bomb[1];

		for (int i = 0; i < numbers.size(); i++) {

			if(numbers.get(i) == specialNumber) {
				int firstIndex = Math.max(i - power, 0);
				int lastIndex = Math.min(i + power, numbers.size() - 1);
				for (int j = lastIndex; j >= firstIndex; j--) {
					numbers.remove(j);
				}
				i = -1;
			}
			
		}
		
		int sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		
		System.out.println(sum);

	}

}
