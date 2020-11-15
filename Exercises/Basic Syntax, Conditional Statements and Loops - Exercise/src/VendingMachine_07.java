import java.util.Scanner;

public class VendingMachine_07 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String inputCoints=scan.nextLine();
		double sum=0;
		while(!inputCoints.equals("Start")) {
			double coins=Double.parseDouble(inputCoints);
			if(coins==0.1 || coins==0.2 || coins==0.5 || coins==1 || coins==2) {
				sum+=coins;
			}else {
				System.out.printf("Cannot accept %.2f%n", coins);
			}
			inputCoints=scan.nextLine();
		}
		String inputPurchase=scan.nextLine();
		while(!inputPurchase.equals("End")) {
			switch(inputPurchase) {
			case "Nuts":
				if(sum>=2.0) {
					sum-=2.0;
					System.out.printf("Purchased %s%n", inputPurchase);
				}else {
					System.out.println("Sorry, not enough money");
				}	
				break;
			case "Water":
				if(sum>=0.7) {
					sum-=0.7;
					System.out.printf("Purchased %s%n", inputPurchase);
				}else {
					System.out.println("Sorry, not enough money");
				}
				break;
			case "Crisps":
				if(sum>=1.5) {
					sum-=1.5;
					System.out.printf("Purchased %s%n", inputPurchase);
				}else {
					System.out.println("Sorry, not enough money");
				}
				break;
			case "Soda":
				if(sum>=0.8) {
					sum-=0.8;
					System.out.printf("Purchased %s%n", inputPurchase);
				}else {
					System.out.println("Sorry, not enough money");
				}
				break;
			case "Coke":
				if(sum>=1.0) {
					sum-=1.0;
					System.out.printf("Purchased %s%n", inputPurchase);
				}else {
					System.out.println("Sorry, not enough money");
				}
				break;
				default:
					System.out.println("Invalid product");
					break;
				
			}
			inputPurchase=scan.nextLine();
		}
		System.out.printf("Change: %.2f", sum);

	}

}
