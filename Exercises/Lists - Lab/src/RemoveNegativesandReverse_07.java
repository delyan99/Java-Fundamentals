import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveNegativesandReverse_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] array = scan.nextLine().split(" ");
		int[] intArray = new int[array.length];
		List<Integer> list = new ArrayList<>();
		List<Integer> outputList = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			intArray[i] = Integer.parseInt(array[i]);
			list.add(intArray[i]);
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			if(list.get(i) >= 0) {
				outputList.add(list.get(i));
			}
		}
		boolean flag = true;
		for (int i = 0; i < outputList.size(); i++) {
			flag = false;
			System.out.print(outputList.get(i) + " ");
		}
		if(flag) {
			System.out.println("empty");
		}

	}

}
