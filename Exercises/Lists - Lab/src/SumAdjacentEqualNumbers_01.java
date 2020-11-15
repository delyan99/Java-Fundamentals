import java.util.List;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class SumAdjacentEqualNumbers_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		List<Double> numbers = new ArrayList<>();
		
		String[] elements = input.split(" ");
		
		for (int i = 0; i < elements.length; i++) {
			numbers.add(Double.parseDouble(elements[i]));
		}
		
		for (int i = 0; i < numbers.size() - 1; i++) {
			double curent = numbers.get(i);
			double next = numbers.get(i + 1); 
			if(curent == next) {
				numbers.remove(i);
				numbers.remove(i);
				numbers.add(i, curent + next);
				i = -1;
			}
		}
		
		for (double output : numbers) {
			System.out.print(new DecimalFormat("0.##").format(output) + " ");
		}

	}

}
