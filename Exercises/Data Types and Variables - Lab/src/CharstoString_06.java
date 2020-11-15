import java.util.Scanner;

public class CharstoString_06 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String characterOne=scan.nextLine();
		String characterTwo=scan.nextLine();
		String characterTree=scan.nextLine();
		String result=Character.toString(characterOne.charAt(0))+Character.toString(characterTwo.charAt(0))+Character.toString(characterTree.charAt(0));
		System.out.println(result);
	}

}
