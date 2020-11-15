import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Judge_02 {

	static int i = 1;
	static int o = 1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Map<String, Integer>> database = new LinkedHashMap<>();
		Map<String, Integer> databaseTotal = new LinkedHashMap<>();
		String input = scan.nextLine();
		while (!"no more time".equals(input)) {
			String[] command = input.split(" -> ");
			String username = command[0];
			String contest = command[1];
			int totalPoints = 0;
			int points = Integer.parseInt(command[2]);
			if (!database.containsKey(contest)) {
				Map<String, Integer> currentMap = new LinkedHashMap<>();
				currentMap.put(username, points);
				database.put(contest, currentMap);
				if (!databaseTotal.containsKey(username)) {
					databaseTotal.put(username, points);
				} else {
					totalPoints = databaseTotal.get(username) + points;
					databaseTotal.put(username, totalPoints);
				}
			} else {
				if (!database.get(contest).containsKey(username)) {
					Map<String, Integer> currentMap = database.get(contest);
					currentMap.put(username, points);
					database.put(contest, currentMap);
					if (!databaseTotal.containsKey(username)) {
						databaseTotal.put(username, points);
					} else {
						totalPoints = databaseTotal.get(username) + points;
						databaseTotal.put(username, totalPoints);
					}
				} else {
					Integer currentPoints = database.get(contest).get(username);
					if (currentPoints < points) {
						Map<String, Integer> currentMap = database.get(contest);
						currentMap.put(username, points);
						database.put(contest, currentMap);
						if (!databaseTotal.containsKey(username)) {
							databaseTotal.put(username, points);
						} else {
							totalPoints = totalPoints - database.get(contest).get(username) + points;
							databaseTotal.put(username, totalPoints);
						}
					}
					if (points > databaseTotal.get(username)) {
						if (!databaseTotal.containsKey(username)) {
							databaseTotal.put(username, points);
						} else {
							totalPoints = totalPoints + points;
							databaseTotal.put(username, totalPoints);
						}
					}
				}

			}
			input = scan.nextLine();
		}

		database.entrySet().stream().forEach(p -> {
			System.out.println(p.getKey() + ": " + p.getValue().size() + " participants");
			i = 1;
			p.getValue().entrySet().stream().sorted((l, r) -> {
				int result = r.getValue().compareTo(l.getValue());
				if (result == 0) {
					result = l.getKey().compareTo(r.getKey());
				}
				return result;
			}).forEach(m -> {

				System.out.println(i + ". " + m.getKey() + " <::> " + m.getValue());
				i++;
			});
		});
		System.out.println("Individual standings:");
		databaseTotal.entrySet().stream().sorted((l, r) -> {
			int result = r.getValue().compareTo(l.getValue());
			if (result == 0) {
				result = l.getKey().compareTo(r.getKey());
			}
			return result;
		}).forEach(m -> System.out.println(String.format("%d. %s -> %d", o++, m.getKey(), m.getValue())));
	}

}
