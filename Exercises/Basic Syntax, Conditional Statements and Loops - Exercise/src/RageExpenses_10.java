import java.util.Scanner;

public class RageExpenses_10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int lostGamesCount=Integer.parseInt(scan.nextLine());
		double headsetPrice=Double.parseDouble(scan.nextLine());
		double mousePrice=Double.parseDouble(scan.nextLine());
		double keyboardPrice=Double.parseDouble(scan.nextLine());
		double displayPrice=Double.parseDouble(scan.nextLine());
		int headsetCount=0, mouseCount=0, keyboardCount=0, displayCount=0;
		for(int i=1;i<=lostGamesCount;i++) {
			if(i%2==0) {
				headsetCount++;
			}
			if(i%3==0) {
				mouseCount++;
			}
			if(i%2==0 && i%3==0) {
				keyboardCount++;
				if(keyboardCount%2==0) {
					displayCount++;
				}
			}
			
			
		}
		double expenses=headsetPrice*headsetCount+mousePrice*mouseCount+keyboardPrice*keyboardCount+displayPrice*displayCount;
		System.out.printf("Rage expenses: %.2f lv.", expenses);
	}

}
