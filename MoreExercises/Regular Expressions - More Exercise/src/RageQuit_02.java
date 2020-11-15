import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String regexNumber = "(?<number>[\\d]+)";
		Pattern patternNumber = Pattern.compile(regexNumber);
		StringBuilder output = new StringBuilder();
		String symbolsToRepeat = "";
		String input = scan.nextLine();
		Matcher matcherNumber = patternNumber.matcher(input);
		int position = 0;
		while(matcherNumber.find()) {
			String string = input.substring(position, matcherNumber.end() - matcherNumber.group().length());
			position = matcherNumber.end();
			int number = Integer.parseInt(matcherNumber.group(0));
			for (int i = 0; i < number; i++) {
				output.append(string.toUpperCase());
			}
		}
		for (int i = 0; i < output.length(); i++) {
			if(!symbolsToRepeat.contains(String.valueOf(output.charAt(i)))) {
				symbolsToRepeat += String.valueOf(output.charAt(i));
			}
		}
		System.out.println(String.format("Unique symbols used: %d", symbolsToRepeat.length()));
		System.out.println(output);

	}

}