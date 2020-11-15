import java.util.Scanner;

public class IntegerOperations_01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int numberOne=Integer.parseInt(scan.nextLine());
		int numberTwo=Integer.parseInt(scan.nextLine());
		int numberThree=Integer.parseInt(scan.nextLine());
		int numberFour=Integer.parseInt(scan.nextLine());
		System.out.println((numberOne+numberTwo)/numberThree*numberFour);
	}

}
