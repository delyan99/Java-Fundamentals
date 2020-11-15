import java.util.Scanner;

public class TheatrePromotion_07 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String dayType=scan.nextLine();
		int age=Integer.parseInt(scan.nextLine());
		switch(dayType) {
		case "Weekday":
			if(age>=0 && age<=18) {
				System.out.println("12$");
			}else if(age>18 && age<=64){
				System.out.println("18$");
			}else if(age>64 && age<=122) {
				System.out.println("12$");
			}else {
				System.out.println("Error!");
			}
			break;
		case "Weekend":
			if(age>=0 && age<=18) {
				System.out.println("15$");
			}else if(age>18 && age<=64){
				System.out.println("20$");
			}else if(age>64 && age<=122) {
				System.out.println("15$");
			}else {
				System.out.println("Error!");
			}
			break;
		case "Holiday":
			if(age>=0 && age<=18) {
				System.out.println("5$");
			}else if(age>18 && age<=64){
				System.out.println("12$");
			}else if(age>64 && age<=122) {
				System.out.println("10$");
			}else {
				System.out.println("Error!");
			}
			break;
			
		}

	}

}
