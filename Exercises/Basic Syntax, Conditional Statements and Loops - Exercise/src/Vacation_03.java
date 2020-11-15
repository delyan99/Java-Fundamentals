import java.util.Scanner;

public class Vacation_03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int people=Integer.parseInt(scan.nextLine());
		String groupType=scan.nextLine();
		String day=scan.nextLine();
		double price=0, totalPrice=0;
		switch(groupType) {
		case "Students":
			switch(day) {
			case "Friday":
				price=8.45;
				break;
			case "Saturday":
				price=9.80;
				break;
			case "Sunday":
				price=10.46;
				break;
			}
			break;
		case "Business":
			switch(day) {
			case "Friday":
				price=10.90;
				break;
			case "Saturday":
				price=15.60;
				break;
			case "Sunday":
				price=16;
				break;
			}
			break;
		case "Regular":
			switch(day) {
			case "Friday":
				price=15;
				break;
			case "Saturday":
				price=20;
				break;
			case "Sunday":
				price=22.50;
				break;
			}
			break;
			
		}
		totalPrice=price*people;
		if(groupType.equals("Students") && people>=30) {
			totalPrice=totalPrice-totalPrice*0.15;
		}else if(groupType.equals("Business") && people>=100) {
			people=people-10;
			totalPrice=price*people;
		}else if(groupType.equals("Regular") && people>=10 && people<=20) {
			totalPrice=totalPrice-totalPrice*0.05;
		}
		System.out.printf("Total price: %.2f", totalPrice);

	}

}
