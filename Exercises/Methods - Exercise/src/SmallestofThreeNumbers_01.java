import java.util.Scanner;

public class SmallestofThreeNumbers_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstNumber = Integer.parseInt(scan.nextLine());
		int secondNumber = Integer.parseInt(scan.nextLine());
		int thirdNumber = Integer.parseInt(scan.nextLine());
		int result = getSmallestNumber(firstNumber, secondNumber, thirdNumber);
		System.out.println(result);
	}

	private static int getSmallestNumber(int firstNumber, int secondNumber, int thirdNumber) {
		int smallest=firstNumber;
		if(secondNumber<firstNumber && secondNumber<thirdNumber) {
			smallest=secondNumber;
		}else if(thirdNumber<firstNumber && thirdNumber<secondNumber){
			smallest=thirdNumber;
		}
		return smallest;
	}

}
