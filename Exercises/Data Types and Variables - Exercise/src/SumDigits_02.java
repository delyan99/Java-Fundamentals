import java.util.Scanner;

public class SumDigits_02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		int number=Integer.parseInt(input);
		int sum=0;
		for(int i=input.length()-1;i>=0;i--) {
			String sumString=""+input.charAt(i);
			sum+=Integer.parseInt(sumString);
		}
		System.out.println(sum);
	}

}
