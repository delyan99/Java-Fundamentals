import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DestinationMapper_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String regex = "([=\\/])(?<destinations>[A-Z][A-Za-z][A-Za-z]+)\\1";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		List<String> destinations = new ArrayList<>();
		while(matcher.find()) {
			destinations.add(matcher.group("destinations"));
		}
		int travelPoints = 0;
		System.out.println(String.format("Destinations: %s", String.join(", ", destinations)));
		for (String destination : destinations) {
			travelPoints += destination.length();
		}
		System.out.println(String.format("Travel Points: %d", travelPoints));
	}

}
