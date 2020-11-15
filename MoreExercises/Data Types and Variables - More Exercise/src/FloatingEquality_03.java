import java.util.Scanner;

public class FloatingEquality_03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double numberOne=Double.parseDouble(scan.nextLine());
		double numberTwo=Double.parseDouble(scan.nextLine());
		if(numberOne>numberTwo) {
			if(Math.abs((numberOne-numberTwo))<=0.000001) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
			
		}else {
			if(Math.abs((numberTwo-numberOne))<=0.000001) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}
	}

}
