import java.util.Scanner;

public class LongestIncreasingSubsequence_04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		String[] inputArray=input.split(" ");
		int[] array=new int[inputArray.length];
		for (int i = 0; i < array.length; i++) {
			array[i]=Integer.parseInt(inputArray[i]);
		}
		
		for (int i = 0; i < array.length; i++) {
			array[i]=1;
			for (int j = 0; j < i; j++) {
				
			}
		}
		
		for (int i : array) {
			System.out.println(i);
		}

	}

}
