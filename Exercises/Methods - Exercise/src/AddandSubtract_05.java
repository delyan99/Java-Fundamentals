import java.util.Scanner;

public class AddandSubtract_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstNumber = Integer.parseInt(scan.nextLine());
		int secondNumber = Integer.parseInt(scan.nextLine());
		int thirdNumber = Integer.parseInt(scan.nextLine());
		int sum = sum(firstNumber, secondNumber);
		int substract = substract(sum, thirdNumber);
		System.out.println(substract);
		
	}

	private static int sum(int firstNumber, int secondNumber) {
		int result = 0;
		result = firstNumber + secondNumber;
		return result;
	}
	
	private static int substract(int sum, int thirdNumber) {
		int substract = sum - thirdNumber;
		return substract;
	}

}
