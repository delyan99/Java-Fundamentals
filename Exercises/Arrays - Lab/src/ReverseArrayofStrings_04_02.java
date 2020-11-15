import java.util.Scanner;

public class ReverseArrayofStrings_04_02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		String[] arr=input.split(" ");
		for(int i=0;i<arr.length/2;i++) {
			String a=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=a;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%s ",arr[i]);
		}

	}

}
