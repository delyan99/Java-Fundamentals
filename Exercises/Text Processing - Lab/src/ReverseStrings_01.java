import java.util.Scanner;

public class ReverseStrings_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		while(!"end".equals(input)) {
			char[] array = input.toCharArray();
			String output = "";
			for (int i = array.length - 1; i >= 0 ; i--) {
				output += array[i];
			}
			System.out.println(String.format("%s = %s", input, output));
			
			input = scan.nextLine();
		}

	}

}
