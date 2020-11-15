import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUnBarIncome_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String regex = "%(?<customerName>[A-Z][a-z]+)%[^|$%.]*?<(?<product>\\w+)>[^|$%.]*?\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d+)[^|$%.]*?\\$";
		Pattern pattern = Pattern.compile(regex);
		double totalSum = 0;
		while(!"end of shift".equals(input)) {
			Matcher matcher = pattern.matcher(input);
			String name = "";
			String product = "";
			int count = 0;
			double price = 0.0;
			if(matcher.find()) {
				name = matcher.group("customerName");
				product = matcher.group("product");
				price = Double.parseDouble(matcher.group("price"));
				count = Integer.parseInt(matcher.group("count"));
				System.out.println(String.format("%s: %s - %.2f", name, product, price * count));
				totalSum += price * count;
			}
			
			
			input = scan.nextLine();
		}
		System.out.println(String.format("Total income: %.2f", totalSum));

	}

}
