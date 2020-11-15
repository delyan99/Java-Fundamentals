import java.util.Scanner;

public class Substring_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstString = scan.nextLine();
		String secondString = scan.nextLine();
		char[] array = secondString.toCharArray();
		String output = "";
		while(secondString.contains(firstString)) {
			//int firstIndex = secondString.indexOf(firstString);
			//secondString = secondString.substring(0, firstIndex) + secondString.substring(firstIndex + firstString.length(), secondString.length());
			secondString = secondString.replace(firstString, "");
		}
		System.out.println(secondString);
		
	}

}
