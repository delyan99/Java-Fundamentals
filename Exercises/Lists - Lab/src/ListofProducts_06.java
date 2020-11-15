import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListofProducts_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextLine());
		}
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d.%s", i + 1, list.get(i));
			System.out.println();
		}

	}

}
