import java.util.Scanner;

public class SumofChars_04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int endValue=Integer.parseInt(scan.nextLine());
		int sum=0;
		for(int i=1;i<=endValue;i++) {
			char charcter=scan.nextLine().charAt(0);
			sum+=charcter;
		}
		System.out.printf("The sum equals: %d", sum);
	}

}
