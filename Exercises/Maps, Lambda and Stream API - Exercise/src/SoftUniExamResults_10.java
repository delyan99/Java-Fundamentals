import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> results = new LinkedHashMap<>();
		Map<String, Integer> languages = new LinkedHashMap<>();
		String input = scan.nextLine();
		while (!"exam finished".equals(input)) {
			String[] command = input.split("-");
			if (command.length == 3) {
				String username = command[0];
				String language = command[1];
				int points = Integer.parseInt(command[2]);
				results.putIfAbsent(username, 0);
				if(results.get(username) > points) {
					points = results.get(username);
				}
				results.put(username, points);
				
				languages.putIfAbsent(language, 0);
				int newQuantity = languages.get(language) + 1;
				languages.put(language, newQuantity);
				
				
			}else if(command.length == 2) {
				String username = command[0];
				results.remove(username);
				
			}

			input = scan.nextLine();
		}
		System.out.println("Results:");
		results
		.entrySet()
		.stream()
		.sorted((l, r) -> {
			int res = r.getValue().compareTo(l.getValue());
			if(res == 0) {
				res = l.getKey().compareTo(r.getKey());
			}
			return res;
		})
		.forEach(p -> System.out.println(p.getKey() + " | " + p.getValue()));
		
		System.out.println("Submissions:");
		languages
		.entrySet()
		.stream()
		.sorted((l, r) -> {
			int rz = r.getValue().compareTo(l.getValue());
			if(rz == 0 ) {
				rz = l.getKey().compareTo(r.getKey());
			}
			return rz;
		})
		.forEach(p -> System.out.println(p.getKey() + " - " + p.getValue()));
		
	}

}
