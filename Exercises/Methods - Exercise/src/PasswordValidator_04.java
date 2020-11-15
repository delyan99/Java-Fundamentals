import java.util.Scanner;

public class PasswordValidator_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		characterLenghts(password);
		characterLettersAndDigits(password);
		characterDigits(password);
		validPassword(password);

	}

	private static void characterLettersAndDigits(String password) {
		boolean flag = false;
		for (int i = 0; i < password.length(); i++) {
			if ((password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
					|| (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
					|| (password.charAt(i) >= '0' && password.charAt(i) <= '9')) {

				flag = false;

			} else {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Password must consist only of letters and digits");
		}

	}

	private static void characterDigits(String password) {
		int counter = 0;
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
				counter++;
			}
		}
		if (counter < 2) {
			System.out.println("Password must have at least 2 digits");
		}

	}

	private static void characterLenghts(String password) {
		if (password.length() < 6 || password.length() > 10) {
			System.out.println("Password must be between 6 and 10 characters");
		}

	}

	private static void validPassword(String password) {
		int counter = 0;
		boolean flag = false;
		if (password.length() >= 6 && password.length() <= 10) {
			for (int i = 0; i < password.length(); i++) {
				if ((password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
						|| (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
						|| (password.charAt(i) >= '0' && password.charAt(i) <= '9')) {
					if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
						counter++;
					}

						if (counter >= 2) {
							flag = true;
					}
				}else {
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("Password is valid");
		}
	}

}
