import java.util.Scanner;

public class LongerLine_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X1 = Integer.parseInt(scan.nextLine());
		int Y1 = Integer.parseInt(scan.nextLine());
		int X2 = Integer.parseInt(scan.nextLine());
		int Y2 = Integer.parseInt(scan.nextLine());
		int X3 = Integer.parseInt(scan.nextLine());
		int Y3 = Integer.parseInt(scan.nextLine());
		int X4 = Integer.parseInt(scan.nextLine());
		int Y4 = Integer.parseInt(scan.nextLine());
		longestLine(X1, Y1, X2, Y2, X3, Y3, X4, Y4);
	}

	private static void longestLine(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		double distance = Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));
		int X1 = x1;
		int Y1 = y1;
		int X2 = x2;
		int Y2 = y2;
		if(distance < Math.sqrt(Math.pow(Math.abs(x4 - x3), 2) + Math.pow(Math.abs(y4 - y3), 2))) {
			X1 = x3;
			Y1 = y3;
			X2 = x4;
			Y2 = y4;
		}
		ClosestToTheCenterPoint(X1, Y1, X2, Y2);
	}
	
	private static void ClosestToTheCenterPoint(int x1, int y1, int x2, int y2) {
		double firstPoint = Math.sqrt(Math.pow(Math.abs(x1), 2) + Math.pow(Math.abs(y1), 2));
		double secondPoint = Math.sqrt(Math.pow(Math.abs(x2), 2) + Math.pow(Math.abs(y2), 2));
		if(firstPoint <= secondPoint) {
			System.out.print("(" + x1 +", " + y1 + ")");
			System.out.print("(" + x2 +", " + y2 + ")");
		}else {
			System.out.print("(" + x2 +", " + y2 + ")");
			System.out.print("(" + x1 +", " + y1 + ")");
		}
	}

}
