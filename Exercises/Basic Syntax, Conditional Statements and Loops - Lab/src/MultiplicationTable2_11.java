import java.util.Scanner;

public class MultiplicationTable2_11 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=Integer.parseInt(scan.nextLine());
		int fromNumber=Integer.parseInt(scan.nextLine());
		for(int i=fromNumber;i<=10;i++) {
			System.out.printf("%d X %d = %d%n",number, i, number*i);
		}
		if(fromNumber>=10) {
			System.out.printf("%d X %d = %d%n",number, fromNumber, number*fromNumber);
		}
	}

}
