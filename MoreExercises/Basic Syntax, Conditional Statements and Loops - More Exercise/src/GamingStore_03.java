import java.util.Scanner;

public class GamingStore_03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double currentBalance = Double.parseDouble(scan.nextLine());
		double currentBalanceCoppy=currentBalance;
		String command=scan.nextLine();
		while(!command.equals("Game Time")) {
			switch(command) {
			case "OutFall 4":
				currentBalanceCoppy-=39.99;
				if(currentBalanceCoppy<0) {
					currentBalanceCoppy+=39.99;
					System.out.println("Too Expensive");
				}else {
					System.out.println("Bought " +command);
				}
				break;
			case "CS: OG":
				currentBalanceCoppy-=15.99;
				if(currentBalanceCoppy<0) {
					currentBalanceCoppy+=15.99;
					System.out.println("Too Expensive");
				}else {
					System.out.println("Bought " +command);
				}
				break;
			case "Zplinter Zell":
				currentBalanceCoppy-=19.99;
				if(currentBalanceCoppy<0) {
					currentBalanceCoppy+=19.99;
					System.out.println("Too Expensive");
				}else {
					System.out.println("Bought " +command);
				}
				break;
			case "Honored 2":
				currentBalanceCoppy-=59.99;
				if(currentBalanceCoppy<0) {
					currentBalanceCoppy+=59.99;
					System.out.println("Too Expensive");
				}else {
					System.out.println("Bought " +command);
				}
				break;
			case "RoverWatch":
				currentBalanceCoppy-=29.99;
				if(currentBalanceCoppy<0) {
					currentBalanceCoppy+=29.99;
					System.out.println("Too Expensive");
				}else {
					System.out.println("Bought " +command);
				}
				break;
			case "RoverWatch Origins Edition":
				currentBalanceCoppy-=39.99;
				if(currentBalanceCoppy<0) {
					currentBalanceCoppy+=39.99;
					System.out.println("Too Expensive");
				}else {
					System.out.println("Bought " +command);
				}
				break;
				default: 
					System.out.println("Not Found");
			}
			if(currentBalanceCoppy==0) {
				System.out.println("Out of money!");
				break;
			}
			
			command=scan.nextLine();
		}
		if(currentBalanceCoppy>0) {
			System.out.printf("Total spent: $%.2f. Remaining: $%.2f", currentBalance-currentBalanceCoppy, currentBalanceCoppy);
			
		}
	}

}
