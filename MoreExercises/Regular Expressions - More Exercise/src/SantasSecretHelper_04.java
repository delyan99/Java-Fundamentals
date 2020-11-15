import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantasSecretHelper_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int key = Integer.parseInt(scan.nextLine());
		String input = scan.nextLine();
		while(!"end".equals(input)) {
			StringBuilder decripedWord = new StringBuilder ();
			for (int i = 0; i < input.length(); i++) {
				int current = (int)input.charAt(i) - key;
				char currentCharacter = (char) current;
				decripedWord.append(currentCharacter);
			}
			String regexName = "@(?<name>[A-Za-z]+)[^@\\-!:>]+!(?<behaviour>[GN])!";
			Pattern pattern = Pattern.compile(regexName);
			Matcher matcher = pattern.matcher(decripedWord.toString());
			if(matcher.find()) {
				if(matcher.group("behaviour").equals("G")) {
					System.out.println(matcher.group("name"));
				}
				
			}		
			input = scan.nextLine();
		}

	}

}
