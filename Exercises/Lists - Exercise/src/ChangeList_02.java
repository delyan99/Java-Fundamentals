import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] array = scan.nextLine().split("\\s+");
		List<Integer> list = new ArrayList<>();
		for (String element : array) {
			int elem = Integer.parseInt(element);
			list.add(elem);
		}
		String input = scan.nextLine();
		
		while (!input.equals("end")) {
		String[] arrayInput = input.split("\\s+");
		
		switch (arrayInput[0]) {
		case "Delete":
			int element = Integer.parseInt(arrayInput[1]);
			while (list.contains(element)) {
				list.remove(Integer.valueOf(element));
			}
			break;

		case "Insert":
			int elementInsert = Integer.parseInt(arrayInput[1]);
			int position = Integer.parseInt(arrayInput[2]);
			if(position >= 0 && position < list.size()) {
				list.add(position, elementInsert);
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
