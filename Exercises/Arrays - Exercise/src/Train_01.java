import java.util.Scanner;

public class Train_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int people = Integer.parseInt(scan.nextLine());
			arr[i] = people;
			sum += arr[i];
		}
		for (int i : arr) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		System.out.println(sum);

	}

}
