import java.util.Scanner;

public class DecryptingMessage_05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int key=Integer.parseInt(scan.nextLine());
		int n=Integer.parseInt(scan.nextLine());
		String result="";
		for(int i=0;i<n;i++) {
			char characters=scan.nextLine().charAt(0);
			result+=Character.toString((char) (key+characters));
		}
		System.out.println(result);

	}

}
