import java.util.Scanner;

public class WaterOverflow_07 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		int capacity=255;
		int result=0;
		for(int i=0;i<n;i++) {
			int quantitiesWater=Integer.parseInt(scan.nextLine());
			result+=quantitiesWater;
			capacity-=quantitiesWater;
			if(capacity<0) {
				result-=quantitiesWater;
				capacity+=quantitiesWater;
				System.out.println("Insufficient capacity!");
			}
		}
		System.out.println(result);

	}
}
