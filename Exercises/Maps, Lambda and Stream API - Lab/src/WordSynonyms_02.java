import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = Integer.parseInt(scan.nextLine());
		Map<String, List<String>> map = new LinkedHashMap<>();
		for (int i = 0; i < number; i++) {
			String word = scan.nextLine();
			String synonym = scan.nextLine();
			if(!map.containsKey(word)) {
				List<String> list = new ArrayList<>();
				list.add(synonym);
				map.put(word, list);
			}else {
				
				List<String> list1 = new ArrayList<>();
				list1 = map.get(word);
				list1.add(synonym);
				
				map.put(word, list1);
			}
		}

		for (Map.Entry<String, List<String>> output : map.entrySet()) {
			System.out.println(output.getKey() + " - " + output.getValue().toString().replaceAll("[\\]\\[]", ""));
		}
	}

}
