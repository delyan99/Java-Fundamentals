import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		Map<String, Integer> populationMap = new HashMap<>();
		Map<String, Integer> goldMap = new HashMap<>();
		while (!"Sail".equals(input)) {
			String[] parts = input.split("\\|\\|");
			String city = parts[0];
			int population = Integer.parseInt(parts[1]);
			int gold = Integer.parseInt(parts[2]);

			populationMap.putIfAbsent(city, 0);
			population += populationMap.get(city);
			populationMap.put(city, population);

			goldMap.putIfAbsent(city, 0);
			gold += goldMap.get(city);
			goldMap.put(city, gold);

			input = scan.nextLine();
		}

		String secondInput = scan.nextLine();
		while (!"End".equals(secondInput)) {
			String[] command = secondInput.split("=>");
			switch (command[0]) {
			case "Plunder":
				String townPlunder = command[1];
				int peoplePlunder = Integer.parseInt(command[2]);
				int goldPlunder = Integer.parseInt(command[3]);
				boolean flag = true;
				System.out.println(String.format("%s plundered! %d gold stolen, %d citizens killed.", townPlunder,
						goldPlunder, peoplePlunder));

				int currentPoputation = populationMap.get(townPlunder);
				currentPoputation = currentPoputation - peoplePlunder;
				if (currentPoputation > 0) {
					populationMap.put(townPlunder, currentPoputation);
				} else {
					flag = false;
					populationMap.remove(townPlunder);
					goldMap.remove(townPlunder);
					System.out.println(String.format("%s has been wiped off the map!", townPlunder));
				}
				if (flag) {
					int currentGold = goldMap.get(townPlunder);
					currentGold = currentGold - goldPlunder;
					if (currentGold > 0) {
						goldMap.put(townPlunder, currentGold);
					} else {
						populationMap.remove(townPlunder);
						goldMap.remove(townPlunder);
						System.out.println(String.format("%s has been wiped off the map!", townPlunder));
					}
				}
				break;
			case "Prosper":
				String townProsper = command[1];
				int goldProsper = Integer.parseInt(command[2]);
				if (goldProsper < 0) {
					System.out.println(String.format("Gold added cannot be a negative number!"));
				} else {
					int newGold = goldMap.get(townProsper) + goldProsper;
					goldMap.put(townProsper, newGold);
					System.out.println(String.format("%d gold added to the city treasury. %s now has %d gold.",
							goldProsper, townProsper, newGold));
				}

				break;
			}

			secondInput = scan.nextLine();
		}
		Map<String, Integer> currentMap = new HashMap<>();
		for (Map.Entry<String, Integer> mapPopulation : populationMap.entrySet()) {
			for (Map.Entry<String, Integer> mapGold : goldMap.entrySet()) {
				if (mapPopulation.getKey().equals(mapGold.getKey())) {
					String townAndPopulation = mapPopulation.getKey() + "," + String.valueOf(mapPopulation.getValue());
					int gold = mapGold.getValue();
					currentMap.put(townAndPopulation, gold);
				}
			}
		}
		if (currentMap.size() == 0) {
			System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
		} else {
			System.out.println(
					String.format("Ahoy, Captain! There are %d wealthy settlements to go to:", currentMap.size()));
			currentMap.entrySet().stream().sorted((l, r) -> {
				int result = r.getValue().compareTo(l.getValue());
				if (result == 0) {
					String[] arrayRight = r.getKey().split(",");
					String[] arrayLeft = l.getKey().split(",");
					result = arrayLeft[0].compareTo(arrayRight[0]);
				}
				return result;
			}).forEach(p -> {
				String[] array = p.getKey().split(",");
				String town = array[0];
				int people = Integer.parseInt(array[1]);
				System.out.println(
						String.format("%s -> Population: %d citizens, Gold: %d kg", town, people, p.getValue()));
			});
		}
	}

}
