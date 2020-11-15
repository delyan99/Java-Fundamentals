import java.util.Scanner;

public class AsciiSumator_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char firstCharacter = scan.nextLine().charAt(0);
		char lastCharacter = scan.nextLine().charAt(0);
		String string = scan.nextLine();
		int sum = 0;
		char[] charArray = string.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] > firstCharacter && charArray[i] < lastCharacter) {
				sum += charArray[i];
			}
		}
		System.out.println(sum);

	}

}
