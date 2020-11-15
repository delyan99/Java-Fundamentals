import java.util.Scanner;

public class Login_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String username = scan.nextLine();
		
		String pass = "";
			for (int j = 1; j <= 4; j++) {
				String password = scan.nextLine();
				for (int i = password.length(); i > 0; i--) {
					pass += Character.toString(password.charAt(i - 1));
				}

				if (pass.equals(username)) {
					break;
				} else if(j==4){
					System.out.printf("User %s blocked!", username);
				}else {
					System.out.println("Incorrect password. Try again.");
				}
				pass = "";
			}

		if (pass.equals(username)) {
			System.out.printf("User %s logged in.", username);
		} 

	}

}
