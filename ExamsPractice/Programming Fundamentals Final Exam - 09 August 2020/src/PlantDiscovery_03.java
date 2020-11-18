import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> databaseRarity = new LinkedHashMap<>();
		Map<String, List<Double>> databaseRating = new LinkedHashMap<>();
		int n = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < n; i++) {
			String[] plantsInformation = scan.nextLine().split("<->");
			String plant = plantsInformation[0];
			int rarity = Integer.parseInt(plantsInformation[1]);
			databaseRarity.put(plant, rarity);
			databaseRating.put(plant, new ArrayList<>());
		}

		String input = scan.nextLine();
		while (!"Exhibition".equals(input)) {
			String[] command = input.split(": ");
			switch (command[0]) {
			case "Rate":
				String[] cmd = command[1].split(" - ");
				String plant = cmd[0];
				if (databaseRarity.containsKey(plant)) {
					Double newRarity = Double.parseDouble(cmd[1]);
					List<Double> list = new ArrayList<>();
					if (databaseRating.get(plant) != null) {
						list = databaseRating.get(plant);
					}
					list.add(newRarity);
					databaseRating.put(plant, list);
				} else {
					System.out.println("error");
				}

				break;
			case "Update":
				String[] cmnd = command[1].split(" - ");
				String plantSecond = cmnd[0];
				if (databaseRarity.containsKey(plantSecond)) {
					int newRaritySecond = Integer.parseInt(cmnd[1]);
					databaseRarity.put(plantSecond, newRaritySecond);
				} else {
					System.out.println("error");
				}
				break;
			case "Reset":
				String plantThird = command[1];
				if (databaseRarity.containsKey(plantThird)) {
					List<Double> list1 = new ArrayList<>();
					databaseRating.put(plantThird, list1);
				} else {
					System.out.println("error");
				}
				break;
			default:
				System.out.println("error");
				break;
			}
			input = scan.nextLine();
		}
		System.out.println("Plants for the exhibition:");

		Map<String, Integer> map = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> cr : databaseRarity.entrySet()) {
			for (Map.Entry<String, List<Double>> cr1 : databaseRating.entrySet()) {
				if (cr.getKey().equals(cr1.getKey())) {
					int listSize = cr1.getValue().size();
					if (listSize == 0) {
						map.put(cr.getKey() + " " + 0.00, cr.getValue());
					} else {
						double sum = 0.0;
						for (Double cur : cr1.getValue()) {
							sum += cur;
						}
						double rating = sum / listSize;
						map.put(cr.getKey() + " " + rating, cr.getValue());
					}
				}
			}
		}

		map.entrySet().stream().sorted((l, r) -> {
			int result = 0;
			if (r.getValue().compareTo(l.getValue()) == 0) {

				String[] commandRight = r.getKey().split(" ");
				double ratingRight = Double.parseDouble(commandRight[1]);
				String[] commandLeft = l.getKey().split(" ");
				double ratingLeft = Double.parseDouble(commandLeft[1]);
				result = Double.compare(ratingRight, ratingLeft);
			} else {
				result = r.getValue().compareTo(l.getValue());
			}
			return result;
		}).forEach(p -> {
			String[] command = p.getKey().split(" ");
			String plantName = command[0];
			Double rating = Double.parseDouble(command[1]);
			System.out.println(String.format("- %s; Rarity: %d; Rating: %.2f", plantName, p.getValue(), rating));
		});

	}

}
