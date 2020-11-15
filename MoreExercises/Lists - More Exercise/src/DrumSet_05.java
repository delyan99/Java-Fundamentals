import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DrumSet_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double savings = Double.parseDouble(scan.nextLine());
		String[] input = scan.nextLine().split("\\s+");
		Integer[] integerInput = new Integer[input.length];
		for (int i = 0; i < input.length; i++) {
			integerInput[i] = Integer.parseInt(input[i]);
		}
		List<Integer> drumSet = new ArrayList<>();
		List<Integer> resultDrumSet = new ArrayList<>();
		for (int i = 0; i < integerInput.length; i++) {
			drumSet.add(integerInput[i]);
			resultDrumSet.add(integerInput[i]);
		}
		String inputIntegers = scan.nextLine();
		while (!inputIntegers.equals("Hit it again, Gabsy!")) {
			int hitPower = Integer.parseInt(inputIntegers);
			for (int i = 0; i < resultDrumSet.size(); i++) {
				resultDrumSet.set(i, resultDrumSet.get(i) - hitPower);
			}
			for (int i = 0; i < resultDrumSet.size(); i++) {
				if(resultDrumSet.get(i) <= 0) {
					if(savings > drumSet.get(i) * 3) {
						resultDrumSet.set(i, drumSet.get(i));
						savings = savings - drumSet.get(i) * 3;
					}else {
						resultDrumSet.remove(i);
						drumSet.remove(i);
						if(i == 0) {
							i = -1;
						}else if(i != 0 ) {
							i = i - 1;
						}
					}
				}
			}
			
			inputIntegers = scan.nextLine();
		}

		for (int i = 0; i < resultDrumSet.size(); i++) {
			System.out.print(resultDrumSet.get(i) + " "); 
		}
		System.out.println();
		System.out.printf("Gabsy has %.2flv.", savings);
	}

}
