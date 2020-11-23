import java.util.Scanner;

public class PasswordReset_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		String input = scan.nextLine();
		while(!"Done".equals(input)) {
			String[] tokens = input.split(" ");
			String command = tokens[0];
			switch(command) {
			case "TakeOdd":
				String newPassword = "";
				for (int i = 1; i < password.length(); i = i+2) {
					newPassword += password.charAt(i);
				}
				password = newPassword;
				System.out.println(password);
				break;
			case "Cut":
				int index = Integer.parseInt(tokens[1]);
				int length = Integer.parseInt(tokens[2]);
				password = password.substring(0, index) + password.substring(index + length);
				System.out.println(password);
				break;
			case "Substitute":
				String substring = tokens[1];
				String substitute = tokens[2];
				if(password.contains(substring)) {
					password = password.replace(substring, substitute);
					System.out.println(password);
				}else {
					System.out.println("Nothing to replace!");
				}
				break;
			}
			
			input = scan.nextLine();
		}
		System.out.println(String.format("Your password is: %s", password));
	}

}
