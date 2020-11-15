import java.util.Scanner;

public class MultiplicationSign_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstNum = Integer.parseInt(scan.nextLine());
		int secondNum = Integer.parseInt(scan.nextLine());
		int thirdNum = Integer.parseInt(scan.nextLine());
		getMultiplicationSign(firstNum, secondNum, thirdNum);
	}

	private static void getMultiplicationSign(int firstNum, int secondNum, int thirdNum) {
		if(firstNum == 0 || secondNum == 0 || thirdNum == 0) {
			System.out.println("zero");
		}else if(firstNum < 0 && secondNum < 0 && thirdNum < 0) {
			System.out.println("negative");
		}else if(firstNum < 0 && secondNum > 0 && thirdNum > 0) {
			System.out.println("negative");
		}else if(firstNum > 0 && secondNum < 0 && thirdNum > 0) {
			System.out.println("negative");
		}else if(firstNum > 0 && secondNum > 0 && thirdNum < 0) {
			System.out.println("negative");
		}else {
			System.out.println("positive");
		}
		
	}

}
