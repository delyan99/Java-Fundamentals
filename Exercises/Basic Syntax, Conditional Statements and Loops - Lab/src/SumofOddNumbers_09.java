import java.util.Scanner;

public class SumofOddNumbers_09 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		int sum=0;
			for(int j=1;j<=2*n;j+=2) {
				System.out.println(j);
				sum+=j;
			}
		
		System.out.printf("Sum: %d", sum);
	}

}
