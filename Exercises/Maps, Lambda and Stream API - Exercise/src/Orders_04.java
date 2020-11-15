import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> productsQuantity = new LinkedHashMap<>();
		Map<String, Double> productsPrice = new LinkedHashMap<>();
		String input = scan.nextLine();
		while(!"buy".equals(input)) {
			String[] ps = input.split("\\s+");
			String product = ps[0];
			double price = Double.parseDouble(ps[1]);
			int quantity = Integer.parseInt(ps[2]);
			productsQuantity.putIfAbsent(product, 0);
			int current = productsQuantity.get(product) + quantity;
			productsQuantity.put(product, current);
			productsPrice.put(product, price);
			
			input = scan.nextLine();
		}
		productsQuantity.forEach((k, v) -> System.out.println(String.format("%s -> %.2f", k, v * productsPrice.get(k))));

	}

}
