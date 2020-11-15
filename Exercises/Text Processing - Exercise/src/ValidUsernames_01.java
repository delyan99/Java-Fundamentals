import java.util.Scanner;

public class ValidUsernames_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(", ");
		boolean flag = false;
		for (int i = 0; i < input.length; i++) {
			if(input[i].length() >= 3 && input[i].length() < 16) {
				for (int j = 0; j < input[i].length(); j++) {
					if(Character.isLetter(input[i].charAt(j)) || Character.isDigit(input[i].charAt(j)) || input[i].charAt(j) == '-' || input[i].charAt(j) == '_') {
						flag = true;
					}else {
						flag = false;
						break;
					}
				}
				if(flag) {
					System.out.println(input[i]);
				}
			}
		}

	}

}
