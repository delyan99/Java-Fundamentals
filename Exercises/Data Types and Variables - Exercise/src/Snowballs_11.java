import java.math.BigDecimal;
import java.util.Scanner;

public class Snowballs_11 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		BigDecimal snowballValue=new BigDecimal(Integer.MIN_VALUE);
		int snowballSnow=0, snowballTime=0, snowballQuality=0, snow=0, time=0, quality=0;
		for(int i=0;i<n;i++) {
			snowballSnow=Integer.parseInt(scan.nextLine());
			snowballTime=Integer.parseInt(scan.nextLine());
			snowballQuality=Integer.parseInt(scan.nextLine());
			BigDecimal result=new BigDecimal( Math.pow((snowballSnow / snowballTime), snowballQuality));
			if(result.compareTo(snowballValue)==1 || result.compareTo(snowballValue)==0) {
				snowballValue=result;
				snow=snowballSnow;
				time=snowballTime;
				quality=snowballQuality;
			}
		}
		System.out.printf("%d : %d = %.0f (%d)", snow, time, snowballValue, quality);
	}

}
