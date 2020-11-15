import java.util.Scanner;

public class ReverseArrayofStrings_04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		String[] items=input.split(" ");
		String[] arr = new String[items.length];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=items[i];
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.printf("%s ",arr[i]);
		}
	}

}
