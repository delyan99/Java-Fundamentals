import java.util.Scanner;

public class Division_02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=Integer.parseInt(scan.nextLine());
		int division=Integer.MIN_VALUE;
		if(number%10==0) {
			division=10;
			System.out.printf("The number is divisible by %d", division);
		}else if(number%7==0) {
			division=7;
			System.out.printf("The number is divisible by %d", division);
		}else if(number%6==0) {
			division=6;
			System.out.printf("The number is divisible by %d", division);
		}else if(number%3==0) {
			division=3;
			System.out.printf("The number is divisible by %d", division);
		}else if(number%2==0) {
			division=2;
			System.out.printf("The number is divisible by %d", division);
		}else {
			System.out.println("Not divisible");
		}
		
	}

}
