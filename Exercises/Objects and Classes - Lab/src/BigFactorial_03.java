import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = Integer.parseInt(scan.nextLine());
		BigInteger bInt = new BigInteger("1");
		
		for (int i = 1; i <= input; i++) {
			bInt = bInt.multiply(BigInteger.valueOf(i));
		}
		System.out.println(bInt);

	}

}
