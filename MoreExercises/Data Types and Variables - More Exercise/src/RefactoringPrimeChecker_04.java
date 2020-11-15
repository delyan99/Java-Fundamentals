import java.util.Scanner;

public class RefactoringPrimeChecker_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.nextLine());
		for (int i = 2; i <= n; i++) {
		    boolean isTrue = true;
		    for (int cepitel = 2; cepitel < i; cepitel++) {
		        if (i % cepitel == 0) {
		        	isTrue = false;
		            break;
		        }
		    }
		    System.out.printf("%d -> %b%n", i, isTrue);
		}


	}

}
