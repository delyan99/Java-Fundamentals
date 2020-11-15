import java.util.Scanner;

public class Mathoperations_11 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int firstNumber=Integer.parseInt(scan.nextLine());
		String operator=scan.nextLine();
		int secondNumber=Integer.parseInt(scan.nextLine());
		int result=mathOperations(firstNumber, operator, secondNumber);
		System.out.println(result);
	}

	private static int mathOperations(int firstNumber, String operator, int secondNumber) {
		int result=0;
		if(operator.equals("+")) {
			result=firstNumber+secondNumber;
		}else if(operator.equals("-")) {
			result=firstNumber-secondNumber;
		}else if(operator.equals("*")) {
			result=firstNumber*secondNumber;
		}else if(operator.equals("/")) {
			result=firstNumber/secondNumber;
		}
		return result;
	}

}