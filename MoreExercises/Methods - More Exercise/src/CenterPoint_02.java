import java.util.Scanner;

public class CenterPoint_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X1 = Integer.parseInt(scan.nextLine());
		int Y1 = Integer.parseInt(scan.nextLine());
		int X2 = Integer.parseInt(scan.nextLine());
		int Y2 = Integer.parseInt(scan.nextLine());
		ClosestToTheCenterPoint(X1, Y1, X2, Y2);

	}

	private static void ClosestToTheCenterPoint(int x1, int y1, int x2, int y2) {
		double firstPoint = Math.sqrt(Math.pow(Math.abs(x1), 2) + Math.pow(Math.abs(y1), 2));
		double secondPoint = Math.sqrt(Math.pow(Math.abs(x2), 2) + Math.pow(Math.abs(y2), 2));
		if(firstPoint <= secondPoint) {
			System.out.print("(" + x1 +", " + y1 + ")");
		}else {
			System.out.print("(" + x2 +", " + y2 + ")");
		}
		
		
	}

}
