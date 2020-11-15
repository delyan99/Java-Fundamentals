import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double number=Double.parseDouble(scan.nextLine());
		int power=Integer.parseInt(scan.nextLine());
		System.out.printf(new DecimalFormat("0.###").format(pow(number, power)));

	}
	
	public static double pow(double number, int pow) {
		return Math.pow(number, pow);
	}

}
