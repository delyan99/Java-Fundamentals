import java.util.Scanner;

public class ExtractFile_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] inputArray = scan.nextLine().split("\\\\");
		String test = inputArray[inputArray.length - 1];
		String[] output = test.split("\\.");
		System.out.println(String.format("File name: %s", output[0]));
		System.out.println(String.format("File extension: %s", output[1]));

	}

}
