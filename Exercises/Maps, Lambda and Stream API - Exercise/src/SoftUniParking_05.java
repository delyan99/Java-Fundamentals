import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		Map <String, String> database = new LinkedHashMap<>();
		for (int i = 0; i < number; i++) {
			String[] command = scan.nextLine().split("\\s+");
			String username = command[1];
			switch(command[0]) {
			case "register":
				String licensePlateNumber = command[2];
				if(database.containsKey(username)) {
					String currentLicensePlateNumber = database.get(username);
					System.out.printf("ERROR: already registered with plate number %s%n", currentLicensePlateNumber);
				}else {
					database.put(username, licensePlateNumber);
					System.out.printf( "%s registered %s successfully%n", username, licensePlateNumber);
				}
				
				break;
			case "unregister":
				if(!database.containsKey(username)) {
					System.out.printf("ERROR: user %s not found%n", username);
				}else {
					database.remove(username);
					System.out.printf("%s unregistered successfully%n", username);
				}
				break;
			}
		}
		database
		.entrySet()
		.forEach((p) ->System.out.println(p.getKey() + " => " + p.getValue()));

	}

}
