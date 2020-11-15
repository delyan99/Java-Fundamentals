import java.util.Scanner;

public class PokeMon_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int m = Integer.parseInt(scan.nextLine());
		int y = Integer.parseInt(scan.nextLine());
		int counter = 0, nCoppy = n;
		while (nCoppy >= m) {
			nCoppy = nCoppy - m;
			counter++;
			if (n == nCoppy * 2) {
				if (y != 0) {
					nCoppy = nCoppy / y;
				}
			}
		}
		System.out.println(nCoppy);
		System.out.println(counter);
	}

}
