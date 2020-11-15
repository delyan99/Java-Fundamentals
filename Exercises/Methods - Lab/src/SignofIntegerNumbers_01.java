import java.util.Scanner;

public class SignofIntegerNumbers_01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int input=Integer.parseInt(scan.nextLine());
		signOfInteger(input);

	}
	
	public static void signOfInteger(int input) {
		if(input>0) {
			System.out.printf("The number %d is positive.", input);
		}else if(input<0) {
			System.out.printf("The number %d is negative.", input);
		}else {
			System.out.printf("The number %d is zero.", input);
		}
	}

}
