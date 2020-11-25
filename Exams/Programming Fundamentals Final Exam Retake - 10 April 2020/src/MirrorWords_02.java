import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String regex = "([#@])(?<firstWord>[A-Za-z]{3,})\\1\\1(?<seconWord>[A-Za-z]{3,})\\1";
		Pattern pattern = Pattern.compile(regex);
		int counter = 0;
		Matcher matcher = pattern.matcher(input);
		List<String> mirrorWords = new ArrayList<>();
		boolean flag = false;
		boolean mirrorWordsFlag = false;
		while (matcher.find()) {
			flag = true;
			counter++;
			String firstWord = matcher.group("firstWord");
			String secondWord = matcher.group("seconWord");
			StringBuilder sb = new StringBuilder(matcher.group("seconWord"));
			String secondWordReversed = sb.reverse().toString();
			if (firstWord.equals(secondWordReversed)) {
				mirrorWordsFlag = true;
				mirrorWords.add(firstWord + " <=> " + secondWord);
			}
		}
		if (flag == true) {
			System.out.println(String.format("%d word pairs found!", counter));
			if (mirrorWordsFlag == true) {
				System.out.println("The mirror words are:");
				for (int i = 0; i < mirrorWords.size(); i++) {
					if (i == mirrorWords.size() - 1) {
						System.out.print(mirrorWords.get(i));
					} else {
						System.out.print(mirrorWords.get(i) + ", ");
					}
				}
			}else {
				System.out.println("No mirror words!");
			}
		} else {
			System.out.println("No word pairs found!");
			System.out.println("No mirror words!");
		}
	}

}
