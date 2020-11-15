import java.util.Scanner;

public class ZigZagArrays_03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		String[] firstOutput=new String[n];
		String[] secondtOutput=new String[n];
		int j=0;
		for(int i=1;i<=n;i++) {
			String[] array=scan.nextLine().split(" ");
			if(i%2==0) {
				secondtOutput[j]=array[0];
				firstOutput[j]=array[1];
				j++;
			}else {
				firstOutput[j]=array[0];
				secondtOutput[j]=array[1];
				j++;
			}
		}
		
		for (String string : firstOutput) {
			System.out.printf("%s ", string);
		}
		System.out.println();
		for (String string : secondtOutput) {
			System.out.printf("%s ", string);
		}

	}

}
