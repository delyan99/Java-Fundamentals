import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ForceBook_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		Map<String, List<String>> map = new LinkedHashMap<>();
		while(!"Lumpawaroo".equals(input)) {
			if(input.contains("|")) {
				String[] command = input.split(" \\| ");
				String forceSide1 = command[0];
				String forceUser1 = command[1];
				boolean flag = false;
				for (Map.Entry<String, List<String>> m : map.entrySet()) {
					if(m.getValue().contains(forceUser1)) {
						flag = true;
						break;
					}
				}
				
				if(!flag) {
					map.putIfAbsent(forceSide1, new ArrayList<>());
					map.get(forceSide1).add(forceUser1);
				}

				
				
				
			}else if(input.contains("->")) {
				String[] command = input.split(" -> ");
				String forceSide2 = command[1];
				String forceUser2 = command[0];
				for (Map.Entry<String, List<String>> m : map.entrySet()) {
					if(m.getValue().contains(forceUser2)) {
						map.get(m.getKey()).remove(forceUser2);
						break;
					}
				}
				
				map.putIfAbsent(forceSide2, new ArrayList<>());
				map.get(forceSide2).add(forceUser2);
				System.out.println(String.format("%s joins the %s side!", forceUser2, forceSide2));
				
			}
			
			input = scan.nextLine();
		}

		map
		.entrySet()
		.stream()
		.sorted((l, r) -> {
			int result = Integer.compare(r.getValue().size(), l.getValue().size());
			if(result == 0) {
				result = l.getKey().compareTo(r.getKey());
			}
			return result;
		})
		.forEach(p -> {
			if(!(p.getValue().size() == 0)) {
				System.out.println(String.format("Side: %s, Members: %d", p.getKey(), p.getValue().size()));
				p.getValue()
				.stream()
				.sorted((i1, i2) -> i1.compareTo(i2))
				.forEach(item -> System.out.println("! " + item.replaceAll("[\\[\\]\"]", "")));
			}

		});
	}

}
