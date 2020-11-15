import java.util.Scanner;

public class DigitsLettersandOther_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();
		sb.append(scan.nextLine());
		for (int i = 0; i < sb.length(); i++) {
			if(Character.isDigit(sb.charAt(i))) {
				sb2.append(sb.charAt(i));
				sb.deleteCharAt(i);
				i = i - 1;
			}
			
		}
		for (int i = 0; i < sb.length(); i++) {
			if(Character.isLetter(sb.charAt(i))) {
				sb3.append(sb.charAt(i));
				sb.deleteCharAt(i);
				i = i - 1;
			}
		}
		
		System.out.println(sb2);
		System.out.println(sb3);
		System.out.println(sb);

	}

}
