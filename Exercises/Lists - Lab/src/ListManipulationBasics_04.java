import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulationBasics_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] inputList = scan.nextLine().split(" ");
		int[] array = new int[inputList.length];
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(inputList[i]);
			
			list.add(array[i]);
		}
		String input = scan.nextLine();
		while(!input.equals("end")) {
			String[] inputArray = input.split(" ");
			switch (inputArray[0]) {
			case "Add":
				add(list, inputArray[1]);
				break;
			case "Remove":
				remove(list, inputArray[1]);
				break;
			case "RemoveAt":
				removeAt(list, inputArray[1]);
				break;
			case "Insert":
				insert(list, inputArray[1], inputArray[2]);
				break;
			}
			
			input = scan.nextLine();
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}

	}

	private static void add(List<Integer> list, String add) {
		int addAtTheEnd = Integer.parseInt(add);
		list.add(addAtTheEnd);
		
	}

	private static void remove(List<Integer> list, String remove) {
		int removeFromList = Integer.parseInt(remove);
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) == removeFromList) {
				list.remove(i);
			}
		}
		
	}

	private static void removeAt(List<Integer> list, String remove) {
		int removeIndex = Integer.parseInt(remove);
		for (int i = 0; i < list.size(); i++) {
			if(i == removeIndex) {
				list.remove(i);
			}
		}
	}

	private static void insert(List<Integer> list, String number, String index) {
		int inputNumber = Integer.parseInt(number);
		int inputIndex = Integer.parseInt(index);
		list.add(inputIndex, inputNumber);
		
	}



}
