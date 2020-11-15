import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Messaging_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] numbers = scan.nextLine().split("\\s+");
		
		List<String> list = new ArrayList<>();
		String text = scan.nextLine();
		String output = "";
		for (int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			int size = list.get(i).length();
			int sum = 0;
			for (int j = 0; j < size; j++) {
				String s = list.get(i).charAt(j) + "";
				sum += Integer.parseInt(s);
			}
			int stringSize = text.length();
			while(sum > stringSize) {
				sum = sum - stringSize;
			}
			String curent = text.charAt(sum) + "";
			output += text.charAt(sum);
			text = text.substring(0, sum) + text.substring(sum + 1);
		}
		System.out.println(output);
		

	}

}
