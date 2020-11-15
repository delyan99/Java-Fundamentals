import java.util.Scanner;

public class ArrayRotation_04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] array=scan.nextLine().split(" ");
		int number=Integer.parseInt(scan.nextLine());
		String[] result=new String[array.length];
		int j=0;
		while(number>array.length) {
			number=number-array.length;
		}
		for(int i=number, k=0;k<array.length;i++,k++) {
			if(i>=array.length) {
				i=0;
			}
			result[j]=array[i];
			j++;
		}
		for (String string : result) {
			System.out.printf("%s ", string);
		}

	}

}
