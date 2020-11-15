import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Courses_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		Map<String , List<String>> map = new LinkedHashMap<>();
		while(!"end".equals(input)) {
			String command[] = input.split(" : ");
			map.putIfAbsent(command[0], new ArrayList<>());
			map.get(command[0]).add(command[1]);
			input = scan.nextLine();
		}
		System.out.println();
		map
		.entrySet()
		.stream()
		.sorted((l, r) -> {
			int firstSize = l.getValue().size();
			int secondSize = r.getValue().size();
			int result = secondSize - firstSize;
			return result;
		})
		.forEach(p ->{
			System.out.println(p.getKey() + ": " + p.getValue().size());
			p
			.getValue()
			.stream()
			.sorted((l, r) -> l.compareTo(r))
			.forEach(e -> System.out.println("-- " + e));
		});
	}

}
