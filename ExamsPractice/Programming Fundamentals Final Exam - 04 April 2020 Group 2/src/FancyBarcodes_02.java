import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String regex = "@#+[A-Z](?<digits>[A-Za-z\\d]{4,})[A-Z]@#+";
		String digit = "\\d";
		Pattern pattern = Pattern.compile(regex);
		Pattern patternForDigit = Pattern.compile(digit);
		for (int i = 0; i < n; i++) {
			String input = scan.nextLine();
			Matcher matcher = pattern.matcher(input);
			if(matcher.find()) {
				String digits = matcher.group("digits");
				String outputDigits = "";
				Matcher matcherForDigits = patternForDigit.matcher(digits);
				if(!matcherForDigits.find()) {
					System.out.println(String.format("Product group: 00"));
				}else {
					for (int j = 0; j < digits.length(); j++) {
						if(Character.isDigit(digits.charAt(j))) {
							outputDigits += String.valueOf(digits.charAt(j));
						}
					}
					System.out.println(String.format("Product group: %s", outputDigits));
				}
			}else {
				System.out.println("Invalid barcode");
			}
			
		}

	}

}
