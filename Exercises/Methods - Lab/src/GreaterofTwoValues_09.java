import java.util.Scanner;

public class GreaterofTwoValues_09 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		if(input.equals("int")) {
			int firstNumber=Integer.parseInt(scan.nextLine());
			int secondNumber=Integer.parseInt(scan.nextLine());
			int result=getMax(firstNumber, secondNumber);
			System.out.println(result);
		}else if(input.equals("string")){
			String firstString=scan.nextLine();
			String secondString=scan.nextLine();
			String result=getMax(firstString, secondString);
			System.out.println(result);
		}else if(input.equals("char")) {
			String firstString=scan.nextLine();
			String secondString=scan.nextLine();
			char firstChar=firstString.charAt(0);
			char secondChar=secondString.charAt(0);
			char result=getMax(firstChar, secondChar);
			System.out.println(result);
		}
		

	}

	private static int getMax(int firstNumber, int secondNumber) {
		if(firstNumber>=secondNumber) {
			return firstNumber;
		}else {
			return secondNumber;
		}
	}
	
	private static String getMax(String firstString, String secondString) {
		if(firstString.compareTo(secondString)>=0) {
			return firstString;
		}else {
			return secondString;
		}
		
	}
	
	private static char getMax(char firstString, char secondString) {
		if(firstString>=secondString) {
			return firstString;
		}
		else {
			return secondString;
		}
		
	}

}
