import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Map<Integer, Double>> database = new LinkedHashMap<>();
		String[] input = scan.nextLine().split(",\\s*");
		List<String> demons = new ArrayList<>();
		for (String string : input) {
			String add = string.replaceAll(" ", "");
			demons.add(add);
		}
		String healthRegex = "[^\\d.+\\-*\\/]";
		String damageRegex = "[+\\-]?\\d+\\.?\\d*";
		Pattern healtPattern = Pattern.compile(healthRegex);
		Pattern damagePattern = Pattern.compile(damageRegex);
		for (int i = 0; i < demons.size(); i++) {
			String name = demons.get(i);
			Matcher healthMatcher = healtPattern.matcher(demons.get(i));
			Matcher damageMatcher = damagePattern.matcher(demons.get(i));
			StringBuilder sb = new StringBuilder();
			while (healthMatcher.find()) {
				sb.append(healthMatcher.group(0));
			}
			String health = sb.toString();
			Integer healthPoints = 0;
			for (int j = 0; j < health.length(); j++) {
				healthPoints += health.charAt(j);
			}
			double damagePoints = 0;
			while (damageMatcher.find()) {
				if (damageMatcher.group().length() > 1) {
					if (Character.isDigit(damageMatcher.group().charAt(0))
							|| (damageMatcher.group().charAt(0) == ('+') || damageMatcher.group().charAt(0) == ('-'))) {
						if (damageMatcher.group().charAt(0) == ('+')) {
							String substring = damageMatcher.group().substring(1, damageMatcher.group().length());
							damagePoints += Double.parseDouble(substring);
						}
						if (damageMatcher.group().charAt(0) == ('-')) {
							String substring = damageMatcher.group().substring(1, damageMatcher.group().length());
							damagePoints -= Double.parseDouble(substring);
						} else if(Character.isDigit(damageMatcher.group().charAt(0))){
							damagePoints += Double.parseDouble(damageMatcher.group());
						}
					}
				} else if(Character.isDigit(damageMatcher.group().charAt(0))){
					damagePoints += Double.parseDouble(damageMatcher.group());
				}
			}
			for (int j = 0; j < demons.get(i).length(); j++) {
				if(demons.get(i).charAt(j) == '*') {
					damagePoints *= 2;
				}else if(demons.get(i).charAt(j) == '/') {
					damagePoints /= 2;
				}
			}
		
			Map<Integer, Double> currentMap = new LinkedHashMap<>();
			currentMap.put(healthPoints, damagePoints);
			database.put(name, currentMap);
		}

		database.entrySet().stream().sorted((l, r) -> l.getKey().compareTo(r.getKey())).forEach(p -> {
			p.getValue().entrySet().stream().forEach(l -> System.out
					.println(String.format("%s - %d health, %.2f damage", p.getKey(), l.getKey(), l.getValue())));
		});

	}

}