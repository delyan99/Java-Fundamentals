import java.util.Scanner;

public class ReplaceRepeatingChars_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		for (int i = 0; i < string.length() - 1; i++) {
			if(string.charAt(i) == string.charAt(i + 1)) {
				string = string.substring(0,  i) + string.substring(i + 1, string.length());
				i --;
			}
		}
		System.out.println(string);
	}

}
