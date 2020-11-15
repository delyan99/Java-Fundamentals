import java.util.Scanner;

public class NxNMatrix_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputNumber = Integer.parseInt(scan.nextLine());
		getMatrix(inputNumber);

	}

	private static void getMatrix(int inputNumber) {
		for (int i = 1; i <= inputNumber; i++) {
			for (int j = 1; j <= inputNumber; j++) {
				System.out.print(inputNumber+ " ");
			}
			System.out.println();
		}
		
	}

}
