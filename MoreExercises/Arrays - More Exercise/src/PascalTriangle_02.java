import java.util.Scanner;

public class PascalTriangle_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		int[] previousArray = new int[number];
		for (int i = 1; i <= number; i++) {
			int[] array = new int[i];

			if (i <= 2) {
				for (int j = 0; j < array.length; j++) {
					array[j] = 1;
				}
			}else {
				for (int j = 0; j < array.length; j++) {
					if(j==0 || j==array.length-1) {
						array[0] = 1;
						array[array.length-1]=1;
					}else {
						array[j]=previousArray[j]+previousArray[j-1];
					}
				}
			}
			
			
			
			for (int j : array) {
				System.out.print(j + " ");
			}
			System.out.println();	
			previousArray=array;
		}

	}

}
