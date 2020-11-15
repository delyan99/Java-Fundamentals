import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		List<String> attackedPlanets = new ArrayList<>();
		List<String> destroyedPlanets = new ArrayList<>();
		String regex = "@(?<name>[A-Za-z]+)[^@,\\-!:>]*:(?<population>\\d+)[^@,\\-!:>]*!(?<attackOrDestroyed>[AD])![^@,\\-!:>]*->(?<count>\\d+)";
		Pattern pattern = Pattern.compile(regex);
		for (int i = 0; i < n; i++) {
			String input = scan.nextLine();
			StringBuilder decryptedWord = new StringBuilder();
			int counter = 0;
			for (int j = 0; j < input.length(); j++) {
				if(input.charAt(j) == 's' || input.charAt(j) == 't' || input.charAt(j) == 'a' || input.charAt(j) == 'r' || input.charAt(j) == 'S' || input.charAt(j) == 'T' || input.charAt(j) == 'A' || input.charAt(j) == 'R' ) {
					counter++;
				}
			}
			for (int j = 0; j < input.length(); j++) {
				decryptedWord.append((char)(input.charAt(j) - counter));
			}
			String word = decryptedWord.toString();
			Matcher matcher = pattern.matcher(word);
			while(matcher.find()) {
				if(matcher.group("attackOrDestroyed").equals("A")) {
					attackedPlanets.add(matcher.group("name"));
				}else {
					destroyedPlanets.add(matcher.group("name"));
				}
			}
			
		}
		System.out.println(String.format("Attacked planets: %d", attackedPlanets.size()));
		attackedPlanets
		.stream()
		.sorted((l, r)-> l.compareTo(r))
		.forEach(p->System.out.println(String.format("-> %s", p)));
		System.out.println(String.format("Destroyed planets: %d", destroyedPlanets.size()));
		destroyedPlanets
		.stream()
		.sorted((l, r)-> l.compareTo(r))
		.forEach(p->System.out.println(String.format("-> %s", p)));
	}

}
