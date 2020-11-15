import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] words = scan.nextLine().split("\\s+");
		
		Random rand = new Random();
		for (int i = 0; i < words.length; i++) {
			int index = rand.nextInt(words.length);
			
			String current = words[i];
			words[i] = words[index];
			words[index] = current;
		}
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}

}
