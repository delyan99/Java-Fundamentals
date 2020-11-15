import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("\\s+");
		Map<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < input.length; i++) {
			if(!map.containsKey(input[i].toLowerCase())) {
				map.put(input[i].toLowerCase(), 1);
			}else {
				int curent = map.get(input[i].toLowerCase()) + 1;
				map.put(input[i].toLowerCase(), curent);
			}
		}
		List<String> list = new ArrayList<>();
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if(m.getValue() % 2 == 1) {
				list.add(m.getKey());
			}
		}
		for (int i = 0; i < list.size(); i++) {
			if(i == list.size() - 1) {
				System.out.print(list.get(i)); 
			}else {
				System.out.print(list.get(i) + ", " );
			}
			
		}

	}

}
