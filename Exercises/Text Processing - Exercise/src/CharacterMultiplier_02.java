import java.util.Scanner;

public class CharacterMultiplier_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] array = scan.nextLine().split("\\s+");
		int totalSum = 0;
		if(array[0].length() == array[1].length()) {
			for (int i = 0; i < array[0].length(); i++) {
				totalSum += array[0].charAt(i) * array[1].charAt(i);
			}
		}else {
			
			int minLenght = array[0].length();
			if(minLenght > array[1].length()) {
				minLenght = array[1].length();
			}
			int maxLenght = array[0].length();
			if(maxLenght < array[1].length()) {
				maxLenght = array[1].length();
			}
			for (int i = 0; i < minLenght; i++) {
				totalSum += array[0].charAt(i) * array[1].charAt(i);
			}
			for (int i = minLenght; i < maxLenght; i++) {
				if(array[0].length() > array[1].length()) {
					totalSum += array[0].charAt(i);
				}else {
					totalSum += array[1].charAt(i);
				}
			}
			
		}
		System.out.println(totalSum);

	}

}
