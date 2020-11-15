import java.util.Scanner;

public class StrongNumber_06 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=Integer.parseInt(scan.nextLine());
		String copyNumber=""+number;
		int sum=1,s1=0;
		for(int i=copyNumber.length();i>0;i--) {
			String n=Character.toString(copyNumber.charAt(i-1));
			int num=Integer.parseInt(n);
			for(int j=num;j>0;j--) {
				sum*=j;
			}
			s1+=sum;
			sum=1;
		}
		if(s1==number) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		

	}

}
