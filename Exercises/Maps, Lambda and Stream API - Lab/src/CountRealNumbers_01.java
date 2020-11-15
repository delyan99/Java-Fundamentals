import java.text.DecimalFormat;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] numbers = scan.nextLine().split("\\s+");
		Map<Double, Integer> map = new TreeMap<Double, Integer>();
		for (String number : numbers) {
			if(map.containsKey(Double.parseDouble(number))) {
				Integer curent = map.get(Double.parseDouble((number))) + 1;
				map.put(Double.parseDouble(number), curent);
				
			}else {
				map.put(Double.parseDouble(number), 1);
			}
		}
		for (Entry<Double, Integer> m: map.entrySet()) {
			DecimalFormat df = new DecimalFormat("#.#######");
			System.out.printf("%s -> %d%n", df.format(m.getKey()) , m.getValue());
		}

	}

}
