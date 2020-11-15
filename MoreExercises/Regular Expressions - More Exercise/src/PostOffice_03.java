import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> map = new LinkedHashMap<>();
		String[] input = scan.nextLine().split("\\|");
		String regexFirstHalf = "([$#%&*])(?<letters>[A-Z]+)\\1";
		Pattern patternFirstHalf = Pattern.compile(regexFirstHalf);
		Matcher matcherFirstHalf = patternFirstHalf.matcher(input[0]);
		StringBuilder sb = new StringBuilder();
		if (matcherFirstHalf.find()) {
			sb.append(matcherFirstHalf.group("letters"));
		}

		String regexSecondHalf = "(?<match>[\\d]{2}):(?<length>[\\d]{2})";
		Pattern patternSecondHalf = Pattern.compile(regexSecondHalf);
		Matcher matcherSecondHalf = patternSecondHalf.matcher(input[1]);
		while (matcherSecondHalf.find()) {
			String currentSb = sb.toString();
			for (int i = 0; i < currentSb.length(); i++) {
				String cr = matcherSecondHalf.group("match");
				char letter = (char) (Integer.parseInt(cr));
				if (String.valueOf(currentSb.charAt(i)).equals(String.valueOf(letter))) {
					if (!map.containsKey(String.valueOf(letter))) {
						map.put(String.valueOf(currentSb.charAt(i)),
								Integer.parseInt(matcherSecondHalf.group("length")) + 1);
					}
				}
			}
		}

		
        /*String[] thirdText = input[2].split("\\s+");
        for (int i = 0; i < sb.length(); i++) {
 
            String firstLetter = String.valueOf(sb.toString().charAt(i));
            int length = map.get(firstLetter);
 
            for (String word : thirdText) {
 
                int lengthWord = word.length();
                String wordFirstChar = word.substring(0, 1);
                String firstChar = String.valueOf(wordFirstChar.charAt(0));
 
                if (lengthWord == length && firstLetter.equals(firstChar)) {
                    System.out.println(word);
                }
            }
        }*/
		
		
		String[] thirdHalfWord = input[2].split("\\s+");
		for (int l = 0; l < sb.length(); l++) {
			String letter = String.valueOf(sb.charAt(l));
			int size = map.get(letter);
			for (int i = 0; i < thirdHalfWord.length; i++) {
				boolean flag = false;
				if (letter.equals(String.valueOf(thirdHalfWord[i].charAt(0)))) {

					if (thirdHalfWord[i].length() == size
							&& letter.equals(String.valueOf(thirdHalfWord[i].charAt(0)))) {
						System.out.println(thirdHalfWord[i]);
						flag = true;
						break;
					}
					if (flag) {
						break;
					}

				}
			}
		}

		/*
		 * for (int i = 0; i < thirdHalfWord.length; i++) { if
		 * (Character.isUpperCase(thirdHalfWord[i].charAt(0))) { if
		 * (sb.toString().contains(String.valueOf(thirdHalfWord[i].charAt(0)))) { String
		 * character = String.valueOf(thirdHalfWord[i].charAt(0)); int size =
		 * map.get(character); if(thirdHalfWord[i].length() == size) {
		 * System.out.println(thirdHalfWord[i]); } }
		 * 
		 * }
		 */

	}

}
