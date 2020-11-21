import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String coolThreshold = "";
		long coolThresholdSum = 1;
		int emojis = 0; 
		List<String> emogies = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			if(Character.isDigit(input.charAt(i))) {
				coolThreshold += (input.charAt(i));
			}
		}
		for (int i = 0; i < coolThreshold.length(); i++) {
			coolThresholdSum *= Long.parseLong(String.valueOf(coolThreshold.charAt(i)));
		}
		
		String regex = "([:*])\\1(?<emogies>[A-Z][a-z][a-z]+)\\1\\1";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		while(matcher.find()) {
			emojis++;
			long sumEmogies = 0;
			for (int i = 0; i < matcher.group("emogies").length(); i++) {
				sumEmogies += Long.parseLong(String.valueOf((int)(matcher.group("emogies").charAt(i))));
			}
			if(sumEmogies >= coolThresholdSum) {
				emogies.add(matcher.group(0));
			}
		}
		System.out.println(String.format("Cool threshold: %s", coolThresholdSum));
		System.out.println(String.format("%d emojis found in the text. The cool ones are:", emojis));
		for (int i = 0; i < emogies.size(); i++) {
			System.out.println(emogies.get(i));
		}
	}

}
