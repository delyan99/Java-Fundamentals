import java.util.Scanner;

public class MiddleCharacters_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String result = getMiddleCharacter(input);
		System.out.println(result);

	}

	private static String getMiddleCharacter(String input) {
		String result = "";
		if(input.length()%2==0) {
			for (int i=input.length()/2-1 ; i <= (input.length()/2); i++) {
				result += input.charAt(i)+"";
			}
		}else {
			for (int i=input.length()/2 ; i < (input.length()/2)+1; i++) {
				result = input.charAt(i)+"";
			}
		}
		return result;
	}

}
