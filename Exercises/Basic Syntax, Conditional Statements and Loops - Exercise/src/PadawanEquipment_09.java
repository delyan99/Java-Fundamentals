import java.util.Scanner;

public class PadawanEquipment_09 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double money = Double.parseDouble(scan.nextLine());
		int studentsCount = Integer.parseInt(scan.nextLine());
		double lightsabersPrice = Double.parseDouble(scan.nextLine());
		double robesPrice = Double.parseDouble(scan.nextLine());
		double beltsPrice = Double.parseDouble(scan.nextLine());
		
		
		double studentsCountCoppy = (int) Math.ceil(studentsCount + studentsCount * 0.1);
		double lightsabersTotalPrice = lightsabersPrice * studentsCountCoppy;
		double robesTotalPrice = robesPrice * studentsCount;
		int studentsCountCoppy2 = studentsCount- (int)Math.floor(studentsCount/6);
		double beltsTotalPrice = beltsPrice * studentsCountCoppy2;
		
		double sum = lightsabersTotalPrice + robesTotalPrice + beltsTotalPrice;
		
		if(sum>money) {
			System.out.printf("Ivan Cho will need %.2flv more.", sum-money);
		}else {
			System.out.printf("The money is enough - it would cost %.2flv.", sum);
		}
	}

}
