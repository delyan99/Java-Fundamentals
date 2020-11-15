import java.util.Scanner;

public class VowelsCount_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int result = getVowelsCount(input);
		System.out.println(result);
	}

	private static int getVowelsCount(String input) {
		int counter = 0;
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'o' || input.charAt(i) == 'i' || input.charAt(i) == 'u' || input.charAt(i) == 'y' || input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'O' || input.charAt(i) == 'I' || input.charAt(i) == 'U' || input.charAt(i) == 'Y') {
				counter++;
			}
		}
		return counter;
	}

}
