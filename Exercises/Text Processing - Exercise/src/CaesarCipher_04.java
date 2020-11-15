import java.util.Scanner;

public class CaesarCipher_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		char[] array = input.toCharArray();
		String output = "";
		for (int i = 0; i < array.length; i++) {
			char current = (char) (array[i] + 3);
			output += current;
		}
		System.out.println(output);
	}

}
