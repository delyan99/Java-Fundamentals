import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumofRealNumbers_03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int endValue=Integer.parseInt(scan.nextLine());
		BigDecimal sum=new BigDecimal(0);
		for(int i=0;i<endValue;i++) {
			BigDecimal n=new BigDecimal(scan.nextLine());
			sum=sum.add(n);
		}
		System.out.println(sum);
	}

}
