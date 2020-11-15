import java.util.Scanner;

public class ExtractPersonInformation_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < number; i++) {
			String[] word = scan.nextLine().split("\\s+");
			String name = "";
			String age = "";
			for (int j = 0; j < word.length; j++) {
				int startIndex = -1;
				int endIndex = -1;
				for (int j2 = 0; j2 < word[j].length(); j2++) {
					if (word[j].charAt(j2) == '@') {
						startIndex = j2;
						for (int k = 0; k < word[j].length(); k++) {
							if (word[j].charAt(k) == '|') {
								endIndex = k;
								name = word[j].substring(startIndex + 1, endIndex);
								break;
							}
						}
					}
					if (word[j].charAt(j2) == '#') {
						startIndex = j2;
						for (int k = 0; k < word[j].length(); k++) {
							if (word[j].charAt(k) == '*') {
								endIndex = k;
								age = word[j].substring(startIndex + 1, endIndex);
								break;
							}
						}
					}
				}
			}
			System.out.println(String.format("%s is %s years old.", name, age));
		}

	}

}
