import java.util.Scanner;

public class EvenandOddSubtraction_05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		String[] items=input.split(" ");
		int[] arr =new int[items.length];
		int sumEven=0, sumOdd=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(items[i]);
			if(arr[i]%2==0) {
				sumEven+=arr[i];
			}else {
				sumOdd+=arr[i];
			}
		}
		System.out.println(sumEven-sumOdd);

	}

}
