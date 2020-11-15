import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnonymousThreat_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] array = scan.nextLine().split("\\s+");
		List<String> list = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		String input = scan.nextLine();
		while (!"3:1".equals(input)) {
			String[] insideArray = input.split("\\s+");
			String mergeOrDivide = insideArray[0];
			switch (mergeOrDivide) {
			case "merge":
				int startIndex = Integer.parseInt(insideArray[1]);
				if(startIndex < 0) {
					startIndex = 0;
				}
				int endIndex = Integer.min(Integer.parseInt(insideArray[2]), list.size() - 1);
				for (int i = endIndex; i > startIndex; i--) {
					if (list.size() == 1) {
						break;
					}
					String firstElem = list.get(i);
					String secondElem = list.get(i - 1);
					list.remove(i - 1);
					list.remove(i - 1);
					list.add(i - 1, secondElem + firstElem);
				}
				break;

			case "divide":
				int index = Integer.parseInt(insideArray[1]);
				int partitions = Integer.parseInt(insideArray[2]);
				int letters = (list.get(index).length()) / partitions;
				String[] arrayOfIndex = list.get(index).split("");
				list.remove(index);
				int k = 0;
				for (int i = 0; i < partitions; i++) {
					String adding = "";
					if (i == partitions - 1) {
						for (; k < arrayOfIndex.length ;) {
							adding += arrayOfIndex[k];
							k++;
						}
						list.add(index, adding);
						index++;
					} else {
						for (int j = 0; j < letters; j++) {
							adding += arrayOfIndex[k];
							k++;
						}
						list.add(index, adding);
						index++;
					}
				}
				break;
			}

			input = scan.nextLine();
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
