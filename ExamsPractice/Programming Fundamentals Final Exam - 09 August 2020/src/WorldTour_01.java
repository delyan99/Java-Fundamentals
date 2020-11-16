import java.util.Scanner;

public class WorldTour_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder stops = new StringBuilder(scan.nextLine());
		String input = scan.nextLine();
		while (!"Travel".equals(input)) {
			String[] command = input.split(":");
			switch (command[0]) {
			case "Add Stop":
				int index = Integer.parseInt(command[1]);
				if (index >= 0 && index < stops.length()) {
					stops.insert(index, command[2]);
					System.out.println(stops);
				}else {
					System.out.println(stops);
				}
				break;
			case "Remove Stop":
				int startIndex = Integer.parseInt(command[1]);
				int endIndex = Integer.parseInt(command[2]);
				if (startIndex >= 0 && startIndex < stops.length() && endIndex >= 0 && endIndex < stops.length()) {
					stops.delete(startIndex, endIndex + 1);
					System.out.println(stops);
				}else {
					System.out.println(stops);
				}
				break;
			case "Switch":
				boolean flag =false;
				String toBeReplaced = command[1];
				String newReplacement = command[2];
				while (stops.toString().contains(toBeReplaced)) {
					String currentStops = stops.toString().replace(toBeReplaced, newReplacement);
					stops.delete(0, stops.length());
					stops.append(currentStops);
					flag = true;
					System.out.println(stops);
				}
				if(!flag) {
					System.out.println(stops);
				}
				break;
			}
			input = scan.nextLine();
		}
		System.out.println(String.format("Ready for world tour! Planned stops: %s", stops));
	}

}
