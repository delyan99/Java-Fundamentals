import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		String regex = "\\+359([ -])2\\1[0-9]{3}\\1[0-9]{4}\\b";
		String text = scan.nextLine();
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		String output = "";
		while(matcher.find()) {
			output += matcher.group() + ", ";
		}
		if(output != "") {
			output = output.substring(0, output.length() - 2);
			System.out.print(output);
		}
		
		
		

	}

}