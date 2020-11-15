import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] array = scan.nextLine().split("\\|");
		List<String> list = new ArrayList<>();
		for (int i = array.length - 1; i >= 0; i--) {
			String[] insideArray = array[i].split("\\s+");
			for (int j = 0; j < insideArray.length; j++) {
				if(!insideArray[j].equals("")) {
					list.add(insideArray[j]);
				}
				
			}
				
			
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
