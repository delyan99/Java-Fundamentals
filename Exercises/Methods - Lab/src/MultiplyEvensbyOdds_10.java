import java.util.Scanner;

public class MultiplyEvensbyOdds_10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		int result=multiplyEvensByOdds(number);
		System.out.println(result);

	}

	private static int multiplyEvensByOdds(int number) {
		int evenSum=0, oddSum=0, curentNumber=0;
		if(number<0) {
			number=Math.abs(number);
		}
		while(number>0) {
			curentNumber=number%10;
			number=number/10;
			if(curentNumber%2==0) {
				evenSum+=curentNumber;
			}else {
				oddSum+=curentNumber;
			}
		}
		return evenSum*oddSum;
	}

}
