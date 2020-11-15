import java.util.Scanner;

public class DataTypeFinder_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String in=input.nextLine();
		while (!in.equals("END")) {
			Scanner scan = new Scanner(in);
			if (scan.hasNextBoolean()) {
				System.out.printf("%s is boolean type%n", in);
			}else if (scan.hasNextInt()) {
				System.out.printf("%s is integer type%n", in);
			} else if (scan.hasNextDouble()) {
				System.out.printf("%s is floating point type%n", in);
			} else if (scan.hasNextLine()) {
				System.out.printf("%s is string type%n", in);
			} else {
				System.out.printf("%s is character type%n", in);
			}
			in=input.nextLine();
		}

	}

}
