import java.util.Scanner;

public class Grades_02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double grade=Double .parseDouble(scan.nextLine());
		grades(grade);

	}
	
	public static void grades(double input) {
		if(input>=2 && input<=2.99) {
			System.out.println("Fail");
		}else if(input>=3 && input<=3.49) {
			System.out.println("Poor");
		}else if(input>=3.5 && input<=4.49) {
			System.out.println("Good");
		}else if(input>=4.5 && input<=5.49) {
			System.out.println("Very good");
		}else if(input>=5.5 && input<=6) {
			System.out.println("Excellent");
		}
	}

}
