import java.util.Scanner;

public class Elevator_03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int people=Integer.parseInt(scan.nextLine());
		int peoplePerCourse=Integer.parseInt(scan.nextLine());
		int courses=0;
		if(people<=peoplePerCourse) {
			courses++;
		}else {
			courses=people/peoplePerCourse;
			if(people%peoplePerCourse!=0) {
				courses++;
			}

		}
		System.out.println(courses);
		
	}

}
