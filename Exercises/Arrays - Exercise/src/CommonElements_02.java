import java.util.Scanner;

public class CommonElements_02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[] firstArray=scan.nextLine().split(" ");
		String[] secondArray=scan.nextLine().split(" ");
		int counter=0, k=0;
		for(int i=0;i<secondArray.length;i++) {
			for(int j=0;j<firstArray.length;j++) {
				if(secondArray[i].equals(firstArray[j])) {
					counter++;
				}
			}
		}
		String[] finalArray = new String[counter];
		for(int i=0;i<secondArray.length;i++) {
			for(int j=0;j<firstArray.length;j++) {
				if(secondArray[i].equals(firstArray[j])) {
						finalArray[k]=secondArray[i];
						k++;
				}
			}
		}

			System.out.printf(String.join(" ", finalArray));
	}

}
