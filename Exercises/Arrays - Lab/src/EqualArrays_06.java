import java.util.Scanner;

public class EqualArrays_06 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String arrOne=scan.nextLine();
		String arrTwo=scan.nextLine();
		String[] FirstArr=arrOne.split(" ");
		String[] SecondArr=arrTwo.split(" ");
		int sum=0, index=-1;
		int[] elementsFromFirstArr=new int[FirstArr.length];
		int[] elementsFromSecondArr=new int[SecondArr.length];
		
		for(int i=0;i<FirstArr.length;i++) {
			elementsFromFirstArr[i]=Integer.parseInt(FirstArr[i]);
			sum+=elementsFromFirstArr[i];
		}
		for(int i=0;i<SecondArr.length;i++) {
			elementsFromSecondArr[i]=Integer.parseInt(SecondArr[i]);
		}

			

			if(elementsFromFirstArr.length>=elementsFromSecondArr.length) {
				for(int i=0;i<elementsFromFirstArr.length;i++) {
					if(elementsFromFirstArr[i]!=elementsFromSecondArr[i]) {
						index=i;
						break;
					}
				}
			}else {
				for(int i=0;i<elementsFromSecondArr.length;i++) {
					if(elementsFromFirstArr[i]!=elementsFromSecondArr[i]) {
						index=i;
						break;
					}
				}
			}
			if(index==-1) {
				System.out.printf("Arrays are identical. Sum: %d", sum);
			}else {
				System.out.printf("Arrays are not identical. Found difference at %d index.", index);
			}

		
	}

}
