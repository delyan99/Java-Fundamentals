import java.util.Scanner;

public class BeerKegs_08 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		double volume=Double.MIN_VALUE;
		String result="";
		for(int i=0;i<n;i++) {
			String model =scan.nextLine();
			double radius =Double.parseDouble(scan.nextLine());
			int height =Integer.parseInt(scan.nextLine());
			double v=Math.PI * radius*radius * height;
			if(v>=volume) {
				volume=v;
				result=model;
			}
		}
		System.out.println(result);
	}

}
