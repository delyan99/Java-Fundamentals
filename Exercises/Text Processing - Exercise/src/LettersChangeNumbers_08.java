import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LettersChangeNumbers_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("\\s+");
		String result = "";
		int number = 0;
		double sum = 0;
		List<Double> list = new ArrayList<>(); 
		for (int i = 0; i < input.length; i++) {
			double finalResult = 0;
			char[] array = input[i].toCharArray();
			for (int j = 0; j < array.length; j++) {
				int beginIndex = -1;
				if (Character.isDigit(array[j])) {
					beginIndex = j;
					int counter = 0;
					for (int k = j; k < array.length; k++) {
						if(Character.isDigit(array[k])) {
							counter++;
						}
					}
					number = Integer.parseInt(input[i].substring(beginIndex, beginIndex + counter));
					result = input[i].substring(0, beginIndex) + input[i].substring(beginIndex + counter, array.length);
					char firstLetter = result.charAt(0);
					char secondLetter = result.charAt(1);
					if(Character.isLowerCase(firstLetter)) {
						finalResult = 1.0 * number * (int)(firstLetter - 96);
					}else {
						finalResult = 1.0 * number / (int)(firstLetter - 64);
					}
					if(Character.isLowerCase(secondLetter)) {
						finalResult = finalResult + (int)(secondLetter - 96);
					}else {
						finalResult = finalResult - (int)(secondLetter - 64);
					}
					list.add(finalResult);
					
					break;
				}
			}
			
		}
		for (Double elements : list) {
			sum += elements;
		}
		System.out.printf("%.2f", sum);
	}

}
