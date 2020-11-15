import java.util.Scanner;

public class MaxSequenceofEqualElements_07 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] input=scan.nextLine().split(" ");
		int counter=0, curentCounter=1, element=0;
		int i = 0;
		for (; i < input.length-1; i++) {
			if(input[i].equals(input[i+1])) {
				curentCounter++;
			}else {
				if(counter<curentCounter) {
					counter=curentCounter;
					element=Integer.parseInt(input[i]);
				}
				curentCounter=1;
			}
		}
		if(counter<curentCounter) {
			counter=curentCounter;
			element=Integer.parseInt(input[i]);
		}
		int[] output=new int[counter];
		for (int j = 0; j < output.length; j++) {
			output[j]=element;
		}
		for (int j : output) {
			System.out.print(j+" ");
		}

	}

}
