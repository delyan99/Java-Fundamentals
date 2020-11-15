import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortandPrintArray_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		int[] array = new int[number];
		int counter = 0;
		for (int i = 0; i < number; i++) {

			String name = scan.nextLine();
			char[] letter = new char[name.length()];
			for (int j = 0; j < letter.length; j++) {
				letter[j] = name.charAt(j);
			}
			int sum = 0;
			for (int j = 0; j < letter.length; j++) {
				if (letter[j] == 'a' || letter[j] == 'e' || letter[j] == 'i' || letter[j] == 'o' || letter[j] == 'u'
						|| letter[j] == 'A' || letter[j] == 'E' || letter[j] == 'I' || letter[j] == 'O'
						|| letter[j] == 'U') {
					sum += letter[j] * letter.length;
				} else {
					sum += letter[j] / letter.length;
				}
			}
			array[counter] = sum;
			counter++;
		}
		Arrays.sort(array);
		for (int i : array) {
			System.out.println(i);
		}

	}

}
