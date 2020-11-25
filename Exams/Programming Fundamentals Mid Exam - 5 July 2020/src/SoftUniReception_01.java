import java.util.Scanner;

public class SoftUniReception_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int countOfStudentsFirstEmploee = Integer.parseInt(scan.nextLine());
		int countOfStudentsSecondEmploee = Integer.parseInt(scan.nextLine());
		int countOfStudentsThirdEmploee = Integer.parseInt(scan.nextLine());
		int studentsCount = Integer.parseInt(scan.nextLine());
		int hours = 0;
		int allEmploee = countOfStudentsFirstEmploee + countOfStudentsSecondEmploee + countOfStudentsThirdEmploee;
		while (studentsCount > 0) {
			hours++;
			studentsCount -= allEmploee;
			if(hours % 4 == 0) {
				hours++;
			}
		}
		System.out.printf("Time needed: %dh.", hours);
	}

}
