import java.util.Scanner;

public class EqualSums_06 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] inputStringArray=scan.nextLine().split(" ");
		int[] integerArray=new int[inputStringArray.length];
		int sum=0;
		for (int i = 0; i < integerArray.length; i++) {
			integerArray[i]=Integer.parseInt(inputStringArray[i]);
		}
		int leftSum=0, rightSum=0, index=0;
		boolean isTrue=false;
		for (int i = 0; i < integerArray.length; i++) {
			for (int j = 0; j < i; j++) {
				leftSum+=integerArray[j];
			}
			for (int j = i+1; j < integerArray.length; j++) {
				rightSum+=integerArray[j];
			}
			
			if(leftSum==rightSum) {
				isTrue=true;
				index=i;
				break;
			}
			rightSum=0;
			leftSum=0;
		}
		if(isTrue) {
			System.out.println(index);
		}else {
			System.out.println("no");
		}

	}

}
