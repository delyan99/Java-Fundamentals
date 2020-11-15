import java.util.Scanner;

public class SpiceMustFlow_09 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int startingYield =Integer.parseInt(scan.nextLine());	
		int workersYield=0;
		int days=0;
		while(startingYield>=100) {
			int startingYieldWorkers=startingYield;
			startingYieldWorkers-=26;
			workersYield+=startingYieldWorkers;
			startingYield-=10;
			days++;
		}
		if(workersYield>=26) {
			workersYield-=26;
		}
		System.out.println(days);
		System.out.println(workersYield);
	}

}
