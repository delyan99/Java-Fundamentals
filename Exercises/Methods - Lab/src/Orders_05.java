import java.util.Scanner;

public class Orders_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String product = scan.nextLine();
		int quantity = Integer.parseInt(scan.nextLine());
		totalPrice(product, quantity);
	}

	public static void totalPrice(String product, int quantity) {
		switch (product) {
		case "coffee":
			System.out.printf("%.2f", quantity*1.5);
			break;
		case "water":
			System.out.printf("%.2f", quantity*1.0);
			break;
		case "coke":
			System.out.printf("%.2f", quantity*1.4);
			break;
		case "snacks":
			System.out.printf("%.2f", quantity*2.0);
			break;
		}
	}

}
