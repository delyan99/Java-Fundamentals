import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] inputList = scan.nextLine().split(" ");
		
		int[] array = new int[inputList.length];
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(inputList[i]);
			
			list.add(array[i]);
		}
		
		String input = scan.nextLine();
		while (!input.equals("end")) {
			String[] inputSplit = input.split(" "); 
			switch (inputSplit[0]) {
			case "Contains":
				System.out.println(contains(list, inputSplit[1]));
				break;

			case "Print":
				if(inputSplit[1].equals("even")) {
					System.out.println(printEven(list));
				}else {
					System.out.println(printOdd(list));
				}
				break;
			case "Get":
				System.out.println(getSum(list));
				break;
			case "Filter":
				System.out.println(filter(list, inputSplit[1], inputSplit[2]));
				break;
			}
			
			input = scan.nextLine();
		}
		
	}

	private static String contains(List<Integer> list, String contain) {
		int input = Integer.parseInt(contain);
		if(list.contains(input)) {
			return "Yes";
		}else {
			return "No such number";
		}
	}

	private static String printEven(List<Integer> list) {
		String outputEven = "";
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				outputEven += list.get(i) + " ";
			}
		}
		return outputEven;	
	}
	
	private static String printOdd(List<Integer> list) {
		String outputOdd = "";
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 == 1) {
				outputOdd += list.get(i) + " ";
			}
		}
		return outputOdd;
	}
	
	private static int getSum(List<Integer> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
	
	private static String filter(List<Integer> list, String sign, String number) { 
		String output = "";
		int inputNumber = Integer.parseInt(number);
		for (int i = 0; i < list.size(); i++) {
			if(sign.equals(">")) {
				if(list.get(i) > inputNumber) {
					output += list.get(i) + " ";
				}
			}else if(sign.equals(">=")) {
				if(list.get(i) >= inputNumber) {
					output += list.get(i) + " ";
				}
			}else if(sign.equals("<")) {
				if(list.get(i) < inputNumber) {
					output += list.get(i) + " ";
				}
			}else if(sign.equals("<=")) {
				if(list.get(i) <= inputNumber) {
					output += list.get(i) + " ";
				}
			}
		}
		
		return output;
	}

}
