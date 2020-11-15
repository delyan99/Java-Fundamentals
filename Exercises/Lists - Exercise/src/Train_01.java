import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] array = scan.nextLine().split(" ");
		List<Integer> list = new ArrayList<>();
		for (String vagons : array) {
			int vagon = Integer.parseInt(vagons);
			list.add(vagon);
		}
		int maxCapacity = Integer.parseInt(scan.nextLine());
		String input = scan.nextLine();
		while(!input.equals("end")) {
			String[] secondArray = input.split(" ");
			if(secondArray[0].equals("Add")) {
				int addNumber = Integer.parseInt(secondArray[1]);
				list.add(addNumber);
			}else {
				int fitPassengers = Integer.parseInt(secondArray[0]);
				for (int i = 0; i < list.size(); i++) {
					if(list.get(i) + fitPassengers <= maxCapacity) {
						list.set(i, list.get(i) + fitPassengers);
						break;
					}
				}
			}
			input = scan.nextLine();
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
