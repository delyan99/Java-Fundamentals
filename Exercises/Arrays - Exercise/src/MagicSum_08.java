import java.util.Scanner;

public class MagicSum_08 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] input=scan.nextLine().split(" ");
		int n=Integer.parseInt(scan.nextLine());
		int[] arr=new int[input.length];
		for (int i = 0; i < input.length; i++) {
			arr[i]=Integer.parseInt(input[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]+arr[i]==n) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}

	}

}
