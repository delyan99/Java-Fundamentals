import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = Integer.parseInt(scan.nextLine());
		System.out.println(generateRandomFakeAdvertisementMessage(input));

	}

	private static String generateRandomFakeAdvertisementMessage(int input) {
		String[] phrases = new String[] {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
		String[] events = new String[] {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
		String[] authors = new String [] {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
		String[] cities = new String[] {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
		for (int i = 0; i < input; i++) {
			Random rand = new Random();
			phrases[i] = phrases[rand.nextInt(6)];
			events[i] = events[rand.nextInt(6)];
			authors[i] = authors[rand.nextInt(8)];
			cities[i] = cities[rand.nextInt(5)];
			String result = phrases[i]+ " " +events[i] + " " + authors[i] +"-"+ cities[i];
			return result;
		}
		return null;
		
	}

}
