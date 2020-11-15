import java.util.Scanner;

public class TextFilter_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(", ");
		String text = scan.nextLine();
		for (int i = 0; i < input.length; i++) {
			String stars = getStars(input[i].length());
			/*
			 * String stars = ""; for (int j = 0; j < input[i].length(); j++) { stars +=
			 * "*"; }
			 */
			text = text.replace(input[i], stars);
		}
		System.out.println(text);
	}

	private static String getStars(int length) {
		String result = "";
		for (int i = 0; i < length; i++) {
			result += "*";
		}
		return result;
	}

}
