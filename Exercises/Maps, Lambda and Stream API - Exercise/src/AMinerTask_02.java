import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		Map<String, Integer> resources = new LinkedHashMap<>();
		while(!"stop".equals(input)) {
			String resource = input;
			int quantity = Integer.parseInt(scan.nextLine());
			if(resources.containsKey(resource)) {
				int current = resources.get(resource) + quantity;
				resources.put(resource, current);
			}else {
				resources.put(resource, quantity);
			}
			
			input = scan.nextLine();
		}
		for (Map.Entry<String, Integer> map : resources.entrySet()) {
			System.out.println(map.getKey() + " -> " + map.getValue());
		}

	}

}
