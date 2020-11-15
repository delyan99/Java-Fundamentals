import java.util.Scanner;

public class TribonacciSequence_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		getTribonacciSequence(number); 
	}

	private static void getTribonacciSequence(int number) {
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		int sum = 0;
		for (int i = 0; i < number; i++) {
			if(i == 0) {
				firstNumber = 0;
				secondNumber = 0;
				thirdNumber = 1;
			}else if(i == 1){
				firstNumber = 0;
				secondNumber = 0;
				thirdNumber = sum;
			}else {
				firstNumber = secondNumber;
				secondNumber = thirdNumber;
				thirdNumber = sum;
			}
			sum = firstNumber + secondNumber + thirdNumber;
			System.out.print(sum + " ");
		}
		
	}

}
