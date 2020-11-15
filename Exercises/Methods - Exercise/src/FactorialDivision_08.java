import java.util.Scanner;

public class FactorialDivision_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstNumber = Integer.parseInt(scan.nextLine());
		int secondNumber = Integer.parseInt(scan.nextLine());
		double result = getFactorialDivision(firstNumber, secondNumber);
		System.out.printf("%.2f", result);

	}

	private static double getFactorialDivision(int firstNumber, int secondNumber) {
		double factorialFirstNum = 1, factorialSecondNum=1;
		for (int i = firstNumber; i > 0; i--) {
			factorialFirstNum *= i;
		}
		
		for (int i = secondNumber; i > 0; i--) {
			factorialSecondNum *= i;
		}
		double result = factorialFirstNum*1.0/factorialSecondNum;
		return result;
	}

}
