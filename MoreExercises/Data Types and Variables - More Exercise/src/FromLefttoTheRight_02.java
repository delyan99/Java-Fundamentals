import java.util.Scanner;

public class FromLefttoTheRight_02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		for(int i=1;i<=n;i++) {
			long sum=0L;
			String line=scan.nextLine();
			String[] numbers=line.split(" ");
			String numberOne=numbers[0];
			String numberTwo=numbers[1];
			long numberOneInteger=Long.parseLong(numberOne);
			long numberTwoInteger=Long.parseLong(numberTwo);
			if(numberOneInteger>numberTwoInteger) {
				long numberOneIntegerCoppy=Math.abs(numberOneInteger);
				while(numberOneIntegerCoppy>0) {
					sum+=numberOneIntegerCoppy%10;
					numberOneIntegerCoppy=numberOneIntegerCoppy/10;
				}
				System.out.println(Math.abs(sum));
			}else {
				long numberTwoIntegerCoppy=Math.abs(numberTwoInteger);
				while(numberTwoIntegerCoppy>0) {
					sum+=numberTwoIntegerCoppy%10;
					numberTwoIntegerCoppy=numberTwoIntegerCoppy/10;
				}
				System.out.println(Math.abs(sum));
			}
		}
	}

}
