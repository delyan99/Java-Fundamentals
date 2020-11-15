import java.util.Scanner;

public class BalancedBrackets_06 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		int counterOpen=0, counterClose=0, counter=0;
		boolean flag=true;
		for(int i=0;i<n;i++) {
			String input=scan.nextLine();
			if(input.length()==1 && input.equals("(")) {
				counterOpen++;
				counter++;
				counterClose=0;
				if(counterOpen==2) {
					flag=false;
					break;
				}
			}else if(input.length()==1 && input.equals(")")){
				counterClose++;
				counterOpen=0;
				counter++;
				if(counterClose==2) {
					flag=false;
					break;
				}
			}
		}
		if(counter%2==1) {
			flag=false;
		}
		if(flag==true) {
			System.out.println("BALANCED");
		}else {
			System.out.println("UNBALANCED");
		}
	}

}
