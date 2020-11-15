import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String regex = "\\s[A-Za-z\\d]+[\\.\\-\\_]?[A-Za-z\\d]+@[A-Za-z\\-]+[\\.][A-Za-z\\-\\.]+";
		Pattern pattern = Pattern.compile(regex);
		String input = scan.nextLine();
		Matcher matcher = pattern.matcher(input);
		List<String> emails = new ArrayList<>();
		while(matcher.find()) {
			if(matcher.group().charAt(matcher.group().length() - 1) == '.') {
				String substring = matcher.group().toString().substring(0, matcher.group().length() - 1);
				String email = substring.replaceAll("[\\s+]+", "");
				emails.add(email);
			}else {
				String email = matcher.group().replaceAll("[\\s+]+", "");
				emails.add(email);
			}
		}
		emails.forEach(p->System.out.println(p));
	}

}
