import java.util.Scanner;

public class BackIn30Minutes_04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int hours=Integer.parseInt(scan.nextLine());
		int minutes=Integer.parseInt(scan.nextLine());
		
		int finalMinutes=minutes+30;
		if(finalMinutes>=60) {
			finalMinutes=finalMinutes-60;
			hours++;
		}
		if(hours==24) {
			hours=0;
		}
		System.out.printf("%d:%02d", hours, finalMinutes);
	}

}
