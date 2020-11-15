import java.util.Scanner;

public class DataTypes_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String data = scan.nextLine();
		switch (input) {
		case "int":
			int dataInteger = Integer.parseInt(data);
			getDataType(dataInteger);
			break;

		case "real":
			double dataReal = Double.parseDouble(data);
			getDataType(dataReal);
			break;
		case "string":
			getDataType(data);
			break;
		}
		
	}

	private static void getDataType(String input) {
		System.out.println("$" + input + "$");
		
	}
	private static void getDataType(int input) {
		System.out.println(input * 2);
		
	}
	private static void getDataType(double input) {
		System.out.printf("%.2f", input * 1.5);
		
	}

}
