import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String inputCoppy = input;
		List<Integer> listOfNumbers = new ArrayList<>();
		List<String> listOfNotNumbers = new ArrayList<>();
		List<Integer> takeList = new ArrayList<>();
		List<Integer> splitList = new ArrayList<>();
		inputCoppy = inputCoppy.replaceAll("[0-9]","");
		
		for (int i = 0; i < inputCoppy.length(); i++) {
			listOfNotNumbers.add(inputCoppy.charAt(i) + "");
		}
		
		input = input.replaceAll("[^\\d]", "");
		
		for (int i = 0; i < input.length(); i++) {
			String sth = input.charAt(i) + "";
			listOfNumbers.add(Integer.parseInt(sth));
		}
		for (int i = 0; i < listOfNumbers.size(); i++) {
			if(i%2 == 0) {
				takeList.add(listOfNumbers.get(i));
			}else {
				splitList.add(listOfNumbers.get(i));
			}

		}
		String result = "";
	
		int p = 0;
		int i = 0;
		int curent = 0;
		for (; i < takeList.size(); i++) {
			
			int take = takeList.get(i);
			int moment = curent;
			for (int j = curent; j < take + moment; j++) {
				if(listOfNotNumbers.size() == curent) {
					break;
				}
				result += listOfNotNumbers.get(j); 
				curent++;
			}
			if(listOfNotNumbers.size() == curent) {
				break;
			}
			for (; p < splitList.size();) {
				int skip = splitList.get(p);
				for (int k = 0; k < skip; k++) {
					curent++;
				}
				p++;
				break;
			}
		}
		System.out.println(result);
	}

}
