import java.util.Scanner;

public class ReverseString_04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		String result="";
		for(int i=input.length()-1;i>=0;i--) {
			result+=Character.toString(input.charAt(i));
		}
		System.out.println(result);
	}

}
