import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MixedupLists_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] firstInput = scan.nextLine().split("\\s+");
		String[] secondInput = scan.nextLine().split("\\s+");
		Integer[] first = new Integer[firstInput.length];
		Integer[] second = new Integer[secondInput.length];
		List<Integer> firstList = new ArrayList<>();
		List<Integer> secondList = new ArrayList<>();
		List<Integer> resultList = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < first.length; i++) {
			first[i] = Integer.parseInt(firstInput[i]);
			firstList.add(first[i]);
		}

		for (int i = 0; i < second.length; i++) {
			second[i] = Integer.parseInt(secondInput[i]);
			secondList.add(second[i]);
		}
		int firstNumber = 0;
		int lastNumber = 0;
		if (firstList.size() > secondList.size()) {
			int p = 0, k = secondList.size() - 1;
			for (int i = 0; i < secondList.size() * 2; i++) {
				if (i % 2 == 0) {
					resultList.add(firstList.get(p));
					p++;
				} else {
					resultList.add(secondList.get(k));
					k--;
				}
			}
			firstNumber = firstList.get(firstList.size() - 2);
			lastNumber = firstList.get(firstList.size() - 1);
		}else {
			int p = secondList.size() - 1, k = 0;
			for (int i = 0; i < firstList.size() * 2; i++) {
				if (i % 2 == 0) {
					resultList.add(firstList.get(k));
					k++;
				} else {
					resultList.add(secondList.get(p));
					p--;
				}
			}
			firstNumber = secondList.get(0);
			lastNumber = secondList.get(1);
		}


		if (firstNumber >= lastNumber) {
			for (int i = 0; i < resultList.size(); i++) {

				int m = resultList.get(i);
				if (m > lastNumber && m < firstNumber) {
					result.add(resultList.get(i));
				}
			}
		} else {
			for (int i = 0; i < resultList.size(); i++) {
				int m = resultList.get(i);
				if (m < lastNumber && m > firstNumber) {
					result.add(resultList.get(i));
				}
			}
		}
		Collections.sort(result);
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
	}

}
