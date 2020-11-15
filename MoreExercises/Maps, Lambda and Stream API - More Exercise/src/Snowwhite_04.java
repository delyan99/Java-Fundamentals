import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Snowwhite_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Map<String, Integer>> database = new LinkedHashMap<>();
		String input = scan.nextLine();
		while (!"Once upon a time".equals(input)) {
			String[] command = input.split(" <:> ");
			String dwarfName = command[0];
			String dwarfHatColor = command[1];
			int dwarfPhysics = Integer.parseInt(command[2]);
			if (!database.containsKey(dwarfHatColor)) {
				Map<String, Integer> currentDatabase = new LinkedHashMap<>();
				currentDatabase.put(dwarfName, dwarfPhysics);
				database.put(dwarfHatColor, currentDatabase);
			} else if (!database.get(dwarfHatColor).containsKey(dwarfName)) {
				Map<String, Integer> currentDatabase = database.get(dwarfHatColor);
				currentDatabase.put(dwarfName, dwarfPhysics);
				database.put(dwarfHatColor, currentDatabase);
			} else {
				int currentDwarfPhysics = database.get(dwarfHatColor).get(dwarfName);
				if (currentDwarfPhysics < dwarfPhysics) {
					Map<String, Integer> currentDatabase = database.get(dwarfHatColor);
					currentDatabase.put(dwarfName, dwarfPhysics);
					database.put(dwarfHatColor, currentDatabase);
				}
			}

			input = scan.nextLine();
		}

		Map<String, Integer> currentDatabase = new LinkedHashMap<>();
		for (Map.Entry<String, Map<String, Integer>> cr : database.entrySet()) {
			for (Map.Entry<String, Integer> cr1 : cr.getValue().entrySet()) {
				currentDatabase.put(cr.getKey() + " " + cr1.getKey() + " " + cr.getValue().size(), cr1.getValue());
			}
		}

		currentDatabase
		.entrySet()
		.stream()
		.sorted((l, r)->{
			int result = r.getValue().compareTo(l.getValue());
			if(result == 0) {
				String[] firstArray = l.getKey().split(" ");
				String[] secondArray = r.getKey().split(" ");
				
				result = secondArray[2].compareTo(firstArray[2]);
			}
			return result;
		}).forEach(p1 -> {
				String[] array = p1.getKey().split(" ");
				System.out.print(String.format("(%s) %s <-> %d%n", array[0], array[1], p1.getValue()));
			});
		

	}

}
