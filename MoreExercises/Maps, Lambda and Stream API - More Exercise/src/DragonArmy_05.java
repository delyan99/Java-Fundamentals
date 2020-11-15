import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DragonArmy_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, TreeMap<String, int[]>> database = new LinkedHashMap<>();
		int n = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < n; i++) {
			String[] command = scan.nextLine().split("\\s+");
			String type = command[0];
			String name = command[1];
			if(command[2].equals("null")) {
				command[2] = "45";
			}
			if(command[3].equals("null")) {
				command[3] = "250"; 
			}
			if(command[4].equals("null")) {
				command[4] = "10";
			}
			int damage = Integer.parseInt(command[2]);
			int health = Integer.parseInt(command[3]);
			int armor = Integer.parseInt(command[4]);
			
			
			
		}

	}

}
