import java.util.Scanner;

public class SecretChat_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		String input = scan.nextLine();
		while(!"Reveal".equals(input)) {
			String[] tokens = input.split(":\\|:");
			String command = tokens[0];
			switch(command) {
			case "InsertSpace":
				int index = Integer.parseInt(tokens[1]);
				message = message.substring(0, index) + " " + message.substring(index);
				System.out.println(message);
				break;
			case "Reverse":
				String substringReverse = tokens[1];
				StringBuilder sb = new StringBuilder(substringReverse);
				if(message.contains(substringReverse)) {
					int beginIndex = message.indexOf(substringReverse);
					int endIndex = beginIndex + substringReverse.length();
					message = message.substring(0, beginIndex) + message.substring(endIndex);
					message = message + sb.reverse();
					System.out.println(message);
				}else {
					System.out.println("error");
				}
				break;
			case "ChangeAll":
				String substringChange = tokens[1];
				String replacement = tokens[2];
				message = message.replace(substringChange, replacement);
				System.out.println(message);
				break;
			}
			input = scan.nextLine();
		}
		System.out.println(String.format("You have a new text message: %s", message));
	}

}
