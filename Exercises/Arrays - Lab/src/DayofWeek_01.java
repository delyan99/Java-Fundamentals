import java.util.Scanner;

public class DayofWeek_01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=Integer.parseInt(scan.nextLine());
		
		String[] days= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		if(number<1 || number>7) {
			System.out.println("Invalid day!");
		}else {
			System.out.println(days[number-1]);
		}

	}

}
