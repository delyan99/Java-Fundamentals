import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		List<String> guests = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			String[] input = scan.nextLine().split("\\s+");
			if (input.length == 3) {
				if (!guests.contains(input[0])) {
					guests.add(input[0]);
				} else if (guests.contains(input[0])) {
					System.out.printf("%s is already in the list!%n", input[0]);
				}
			} else if (input.length == 4) {
				if (guests.contains(input[0])) {
					guests.remove(input[0]);
				} else if (!guests.contains(input[0])) {
					System.out.printf("%s is not in the list!%n", input[0]);
				}
			}
		}
		for (String guest : guests) {
			System.out.println(guest);
		}
	}

}
