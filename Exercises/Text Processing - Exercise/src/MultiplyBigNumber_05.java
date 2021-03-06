import java.util.Scanner;

public class MultiplyBigNumber_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String bigNumber = scan.nextLine();
		int digit = Integer.parseInt(scan.nextLine());
		if(digit == 0) {
			System.out.println("0");
			return;
		}
		while(bigNumber.charAt(0) == '0') {
			bigNumber = bigNumber.substring(1);
		}
		StringBuilder sc = new StringBuilder();
		int add = 0;
		for (int i = bigNumber.length() - 1; i >= 0; i--) {
			int lastNumber = Integer.parseInt("" + bigNumber.charAt(i));
			int result = lastNumber * digit + add;
			add = 0;
			if(result <= 9) {
				sc.append(result);
			}else {
				add = result / 10;			
				sc.append(result % 10);
			}
		}
		if(add != 0) {
			sc.append(add);
		}
		sc.reverse();
		System.out.println(sc);
	}

}
