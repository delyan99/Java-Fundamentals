import java.util.Scanner;

public class CharactersinRange_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char firstCharacter = scan.nextLine().charAt(0);
		char secondCharacter = scan.nextLine().charAt(0);
		rangeOfCharacters(firstCharacter, secondCharacter);
	}

	private static void rangeOfCharacters(char firstCharacter, char secondCharacter) {
		char result = 0;
		if(secondCharacter>=firstCharacter) {
			for (char i = (char) (firstCharacter+1); i < secondCharacter; i++) {
				System.out.print(i+ " ");
			}
		}else {
			for (char i = (char) (secondCharacter+1); i < firstCharacter; i++) {
				System.out.print(i+ " ");
			}
		}
	}

}
