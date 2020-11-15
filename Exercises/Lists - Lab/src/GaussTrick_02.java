import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();

		String[] arr = input.split(" ");
		int[] array = new int[arr.clone().length];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(arr[i]);
		}

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}

		List<Integer> result = new ArrayList<>();

		for (int i = 0, k = list.size() - 1; i <= list.size() - 1; i++, k--) {
			if(list.size() == 1) {
				result.add(0, list.get(i));
			}else if (list.size() % 2 == 1) {
				int curunt = list.get(i);
				int last = list.get(k);
				if (i == k) {
					result.add(i, list.get(i));
					break;
				}
				result.add(i, curunt + last);
			}else if (list.size() % 2 == 0){
				int curunt = list.get(i);
				int last = list.get(k);
				if (i + 1 == k) {
					result.add(i, curunt + last);
					break;
				}
				result.add(i, curunt + last);
			}
		}

		for (int j = 0; j < result.size(); j++) {
			System.out.print(result.get(j) + " ");
		}

	}

}
