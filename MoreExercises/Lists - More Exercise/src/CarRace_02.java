import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRace_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input  = scan.nextLine().split("\\s+");
		Integer[] array = new Integer[input.length];
		List <Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(input[i]);
			list.add(array[i]);
		}
		double sumOfFirstCar = 0;
		double sumOfSecondCar = 0;
		for (int i = 0; i < list.size()/2; i++) {
			if(list.get(i) == 0) {
				sumOfFirstCar *= 0.8;
			}
			sumOfFirstCar += list.get(i);
		}
		
		for (int i = list.size() - 1; i > list.size()/2; i--) {
			if(list.get(i) == 0) {
				sumOfSecondCar *= 0.8;
			}
			sumOfSecondCar += list.get(i);
		}
		if(sumOfFirstCar < sumOfSecondCar) {
			System.out.printf("The winner is left with total time: %.1f", sumOfFirstCar);
		}else {
			System.out.printf("The winner is right with total time: %.1f", sumOfSecondCar);
		}

	}

}
