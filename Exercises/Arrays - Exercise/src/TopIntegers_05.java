import java.util.Scanner;

public class TopIntegers_05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] inputArray=scan.nextLine().split(" ");
		boolean ifTrue=true;
		int counter=0;
		int[] integerArray=new int[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			integerArray[i]=Integer.parseInt(inputArray[i]);
		}
		for (int i = 0; i < inputArray.length; i++) {
			for(int j=i+1;j<inputArray.length;j++) {
				if(integerArray[i]<=integerArray[j]) {
					ifTrue=false;
					break;
				}
			}
			if(ifTrue==true) {
				counter++;
			}else {
				ifTrue=true;
			}
		}
		int[] outputArray=new int[counter];
		int p=0;
		for (int i = 0; i < inputArray.length; i++) {
			for(int j=i+1;j<inputArray.length;j++) {
				if(integerArray[i]<=integerArray[j]) {
					ifTrue=false;
					break;
				}
			}
			if(ifTrue==true) {
				outputArray[p]=integerArray[i];
				p++;
			}else {
				ifTrue=true;
			}
		}
		for (int i : outputArray) {
			System.out.printf("%d ",i);
		}
	}

}
