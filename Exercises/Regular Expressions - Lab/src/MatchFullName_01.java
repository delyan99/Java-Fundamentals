import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String redix = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
		String input = scan.nextLine();
		Pattern pattern = Pattern.compile(redix);
		Matcher matcher = pattern.matcher(input);
		while(matcher.find()) {
			System.out.printf(matcher.group() + " ");
		}
		
		

	}

}
