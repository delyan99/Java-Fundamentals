import java.util.Scanner;

public class PoundstoDollars_02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double pounds=Double.parseDouble(scan.nextLine());
		double dollars=pounds*1.31;
		System.out.printf("%.3f", dollars);
	}

}
