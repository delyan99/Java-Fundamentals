import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List <Integer> firstHand = new ArrayList<>();
		List <Integer> secondHand = new ArrayList<>();
		String[] firstArray = scan.nextLine().split("\\s+");
		Integer[] intArray = new Integer[firstArray.length];
		String[] secondArray = scan.nextLine().split("\\s+");
		Integer[] intSecondArray = new Integer[firstArray.length];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(firstArray[i]);
			firstHand.add(intArray[i]);
		}
		for (int i = 0; i < secondArray.length; i++) {
			intSecondArray[i] = Integer.parseInt(secondArray[i]);
			secondHand.add(intSecondArray[i]);
		}
		
		while (firstHand.size() > 0 && secondHand.size() > 0) {
			if(firstHand.get(0) > secondHand.get(0)) {
				firstHand.add(firstHand.get(0));
				firstHand.add(secondHand.get(0));
				firstHand.remove(0);
				secondHand.remove(0);
			}else if(firstHand.get(0) < secondHand.get(0)) {
				secondHand.add(secondHand.get(0));
				secondHand.add(firstHand.get(0));
				firstHand.remove(0);
				secondHand.remove(0);
			}else if(firstHand.get(0).equals(secondHand.get(0))) {
				firstHand.remove(0);
				secondHand.remove(0);
			}
		}
		int sum = 0;
		if(firstHand.size() != 0) {
			for (int i = 0; i < firstHand.size(); i++) {
				sum += firstHand.get(i);
			}
			System.out.printf("First player wins! Sum: %d", sum);
		}else {
			for (int i = 0; i < secondHand.size(); i++) {
				sum += secondHand.get(i);
			}
			System.out.printf("Second player wins! Sum: %d", sum);
		}


	}

}
