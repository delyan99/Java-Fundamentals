import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] array = scan.nextLine().split("\\s+");
		List<Integer> list = new ArrayList<>();
		for (String element : array) {
			list.add(Integer.parseInt(element));
		}
		String input = scan.nextLine();
		while (!input.equals("End")) {
			String tokens[] = input.split("\\s+");
			String operation = tokens[0];
			String leftOrRight = tokens[1];
			switch (operation) {
			case "Add":
				int number = Integer.parseInt(tokens[1]);
				list.add(Integer.valueOf(number));
				break;
			case "Insert":
				int numberInsert = Integer.parseInt(tokens[1]);
				int index = Integer.parseInt(tokens[2]);
				if(index >= 0 && index <= list.size()) {
					list.add(index, numberInsert);
				}else {
					System.out.println("Invalid index");
				}
				break;
			case "Remove":
				int numberRemove = Integer.parseInt(tokens[1]);
				if(numberRemove >=0 && numberRemove < list.size()) {
					list.remove(numberRemove);
				}else {
					System.out.println("Invalid index");
				}
				break;
			case "Shift":
				switch (leftOrRight) {
				case "left":
					int count = Integer.parseInt(tokens[2]);
					for (int i = 0; i < count; i++) {
						int curent = list.get(0);
						list.remove(0);
						list.add(curent);
					}
					break;

				case "right":
					int counter = Integer.parseInt(tokens[2]);
					for (int i = 0; i < counter; i++) {
						int curent = list.get(list.size() - 1);
						list.remove(list.size() - 1);
						list.add(0, curent);
					}
					break;
				}
				break;
			}
			
			input = scan.nextLine();
		}
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}

}
