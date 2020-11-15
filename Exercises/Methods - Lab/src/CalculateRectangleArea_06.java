import java.util.Scanner;

public class CalculateRectangleArea_06 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int width = Integer.parseInt(scan.nextLine());
		int length = Integer.parseInt(scan.nextLine());
		System.out.println(area(width, length));

	}
	
	public static int area(int width, int length) {
		return width*length;
	}
}
