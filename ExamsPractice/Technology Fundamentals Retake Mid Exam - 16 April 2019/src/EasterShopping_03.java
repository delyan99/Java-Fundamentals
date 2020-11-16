import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EasterShopping_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] shop = scan.nextLine().split("\\s+");
		List<String> shops = new ArrayList<>();
		for (int i = 0; i < shop.length; i++) {
			shops.add(shop[i]);
		}
		int n = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < n; i++) {
			String[] command = scan.nextLine().split("\\s+");
			switch (command[0]) {
			case "Include":
				String shopInput = command[1];
				shops.add(shopInput);
				break;

			case "Visit":
				String firstOrLast = command[1];
				int numberOfShops = Integer.parseInt(command[2]);
				if(numberOfShops >= 0 && numberOfShops <= shops.size()){
					if(firstOrLast.equals("first")){
						for (int j = 0; j < numberOfShops; j++) {
							shops.remove(0);
						}
					}else {
						for (int j = 0; j < numberOfShops; j++) {
							shops.remove(shops.size() - 1);
						}
					}
				}
				break;
			case "Prefer":
				int shopIndex1 = Integer.parseInt(command[1]);
				int shopIndex2 = Integer.parseInt(command[2]);	
				if(shopIndex1 >= 0 && shopIndex1 < shops.size() && shopIndex2 >= 0 && shopIndex2 < shops.size()) {
					String current = shops.get(shopIndex1);
					shops.set(shopIndex1, shops.get(shopIndex2));
					shops.set(shopIndex2, current);
				}
				break;
			case "Place":
				String shopIns = command[1];
				int indx = Integer.parseInt(command[2]);
				indx = indx+1;
				if(indx >= 1 && indx < shops.size() + 1) {
					shops.add(indx, shopIns);
				}
				break;

			}
		}
		
		System.out.println("Shops left:");
		System.out.print(String.join(" ", shops));

	}

}