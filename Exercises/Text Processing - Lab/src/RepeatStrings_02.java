import java.util.Scanner;

public class RepeatStrings_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] array = scan.nextLine().split("\\s+");
		String output = "";
		for (int i = 0; i < array.length; i++) {
			int repeatTimes = array[i].length();
			for (int j = 0; j < repeatTimes; j++) {
				output += array[i];
			}
		}
		System.out.println(output);
	}

}
