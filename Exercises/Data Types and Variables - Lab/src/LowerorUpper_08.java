import java.util.Scanner;

public class LowerorUpper_08 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String character=scan.nextLine();
		char ch=character.charAt(0);
		if(Character.isLowerCase(ch)){
			System.out.println("lower-case");
		}else if(Character.isUpperCase(ch)){
			System.out.println("upper-case");
		}
	}

}
