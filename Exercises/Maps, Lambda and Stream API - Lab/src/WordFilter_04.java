import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFilter_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> words = Arrays.stream(scan.nextLine().split("\\s+"))
				.map(p -> p)
				.filter(p -> p.length() % 2 == 0)
				.collect(Collectors.toList());
		
		for (String word : words) {
			System.out.println(word);
		}
	}

}
