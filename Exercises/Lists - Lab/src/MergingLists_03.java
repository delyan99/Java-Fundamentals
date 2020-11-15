import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] firstLine = scan.nextLine().split(" ");
		String[] secondLine = scan.nextLine().split(" ");
		
		int[] firstArray = new int[firstLine.length];
		int[] secondArray = new int[secondLine.length];
		
		List<Integer> firstList = new ArrayList<>();
		List<Integer> secondList = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = Integer.parseInt(firstLine[i]);
			
			firstList.add(firstArray[i]);
		}
		
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = Integer.parseInt(secondLine[i]);
			
			secondList.add(secondArray[i]);
		}
		
		int size = 0;
		if(firstList.size() <= secondList.size()) {
			size = firstList.size();
		}else {
			size = secondList.size();
		}
		int index = 0;
		for (int i = 0; i < size; i++) {
			result.add(firstList.get(i));
			result.add(secondList.get(i));
			index += 2;
		}
		int length = 0;
		if(firstList.size() <= secondList.size()) {
			length = firstList.size();
			for (int j = 0; j < length; j++) {
				secondList.remove(0);
			}
			for (int i = 0; i < secondList.size(); i++, index++) {
				result.add(index, secondList.get(i));
			}
			
		}else {
			length = secondList.size();
			for (int j = 0; j < length; j++) {
				firstList.remove(0);
			}
			for (int i = 0; i < firstList.size(); i++, index++) {
				result.add(index, firstList.get(i));
			}
		}
		
		for (Integer integer : result) {
			System.out.print(integer + " ");
		}
	}

}
