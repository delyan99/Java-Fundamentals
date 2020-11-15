import java.util.Scanner;

public class RefactorSpecialNumbers_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());

		for (int i = 1; i <= number; i++) {
			int sum = 0;
		    int coppyI = i;
		    while (coppyI > 0) {
		        sum += coppyI % 10;
		        coppyI = coppyI / 10;
		    }
			boolean special = false;
			special = (sum == 5) || (sum == 7) || (sum == 11);
			if(special==true) {
				System.out.printf("%d -> True%n", i);
			}else {
				System.out.printf("%d -> False%n", i);
			}
		}


	}

}
