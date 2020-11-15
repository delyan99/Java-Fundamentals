import java.util.Scanner;

public class PrintandSum_04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int begin=Integer.parseInt(scan.nextLine());
		int end=Integer.parseInt(scan.nextLine());
		int sum=0;
		for(int i=begin;i<=end;i++) {
			System.out.printf("%d ", i);
			sum+=i;
		}
		System.out.println();
		System.out.printf("Sum: %d", sum);

	}

}
