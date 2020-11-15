import java.util.Scanner;

public class TopNumber_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		getTopNumber(number);

	}

	private static void getTopNumber(int number) {
		for (int i = 1; i <= number; i++) {
			int sumOfDigits = 0;
			boolean flag = false;
			int iCoppy = i;
			while (iCoppy > 0) {
				int digit = iCoppy%10;
				sumOfDigits += digit;
				if(digit%2 == 1) {
					flag = true;
				}
				iCoppy = iCoppy / 10;
			}
			if(flag && sumOfDigits%8==0) {
				System.out.println(i);
			}
		}
		
		
	}

}
