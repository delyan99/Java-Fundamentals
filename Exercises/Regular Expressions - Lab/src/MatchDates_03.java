import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String regex = "\\b(?<day>[0-9][0-9])([///./-])(?<month>[A-Z][a-z][a-z])\\2(?<year>[0-9]{4})\\b";
		String input = scan.nextLine();
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		while(matcher.find()) {
			System.out.printf("Day: %s, Month: %s, Year: %s%n", matcher.group("day"), matcher.group("month"), matcher.group("year"));
		}
		
		
	}

}
