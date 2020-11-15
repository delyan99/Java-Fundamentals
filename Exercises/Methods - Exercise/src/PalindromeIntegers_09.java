import java.util.Scanner;

public class PalindromeIntegers_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		while (!input.equals("END")) {
			int toInteger = Integer.parseInt(input);
			if (toInteger < 0) {
				break;
			}
			boolean flag = getPalindrome(input);
			System.out.println(flag);
			input = scan.nextLine();
		}

	}

	private static boolean getPalindrome(String input) {
		String firstHalf = "";
		String secondHalf = "";
		for (int i = 0; i < input.length() / 2; i++) {
			firstHalf += input.charAt(i);
		}
		if (input.length() % 2 == 1) {
			for (int i = input.length()-1 ; i >= input.length() / 2 + 1; i--) {
				secondHalf += input.charAt(i);
			}
			if (firstHalf.equals(secondHalf)) {
				return true;
			} else {
				return false;
			}
		} else {
			for (int i = input.length()-1 ; i >= input.length() / 2; i--) {
				secondHalf += input.charAt(i);
			}
			if (firstHalf.equals(secondHalf)) {
				return true;
			} else {
				return false;
			}
		}

	}

}
