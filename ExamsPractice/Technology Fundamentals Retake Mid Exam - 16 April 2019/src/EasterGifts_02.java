import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EasterGifts_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] gift = scan.nextLine().split("\\s+");
		List<String> gifts = new ArrayList<>();
		for (int i = 0; i < gift.length; i++) {
			gifts.add(gift[i]);
		}
		String input = scan.nextLine();
		while (!"No Money".equals(input)) {
			String command[] = input.split("\\s+");
			switch (command[0]) {
			case "OutOfStock":
				String giftCompare = command[1];
				for (int i = 0; i < gifts.size(); i++) {
					if(gifts.get(i).equals(giftCompare)) {
						gifts.set(i, "None");
					}
				}
				break;

			case "Required":
				String giftCompare1 = command[1];
				int index = Integer.parseInt(command[2]);
				if(index >= 0 && index < gifts.size()) {
					gifts.set(index, giftCompare1);
				}
				break;
			case "JustInCase":
				String giftCompare2 = command[1];
				gifts.set(gifts.size() - 1, giftCompare2);
				break;
			}
			
			input = scan.nextLine();
		}
		for (int i = 0; i < gifts.size(); i++) {
			if(!gifts.get(i).equals("None")) {
				System.out.print(gifts.get(i) + " ");
			}
		}

	}

}
