import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraytoNumber_07 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] input=scan.nextLine().split(" ");
		int sum=0;
		int[] intArr=Arrays.stream(input).mapToInt(i ->Integer.parseInt(i)).toArray();
		if(input.length==1) {
			System.out.println(input[0]);
			return;
		}else {
			for(int i=0;i<intArr.length-1;i++) {
				int[] arr=new int[intArr.length-1-i];
					for(int j=0;j<arr.length;j++) {
						arr[j]=intArr[j]+intArr[j+1];
							intArr[j]=arr[j];
				}
					
				if(arr.length==2) {
					sum+=arr[0]+arr[1];
					System.out.println(sum);
					return;
				}
			}
		}

	}

}
