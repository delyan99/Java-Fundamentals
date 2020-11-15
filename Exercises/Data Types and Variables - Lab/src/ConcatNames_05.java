import java.util.Scanner;

public class ConcatNames_05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String firstName=scan.nextLine();
		String secondName=scan.nextLine();
		String delimiter=scan.nextLine();
		System.out.println(firstName+delimiter+secondName);
	}

}
