import java.util.Scanner;

public class ActivationKeys_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String key = scan.nextLine();
		String input = scan.nextLine();
		while(!"Generate".equals(input)) {
			String[] command = input.split(">>>");
			switch(command[0]) {
			case "Contains":
				String substring = command[1];
				contains(key, substring);
			break;
			case "Flip":
				String UpperOrLower = command[1];
				int startIndexFlip = Integer.parseInt(command[2]);
				int endIndexFlip = Integer.parseInt(command[3]);
				key = flip(key, UpperOrLower, startIndexFlip, endIndexFlip);
			break;
			case "Slice":
				int startIndexSlice = Integer.parseInt(command[1]);
				int endIndexSlice = Integer.parseInt(command[2]);
				key = slice(key, startIndexSlice, endIndexSlice);
			break;
			}
			
			
			input = scan.nextLine();
		}
		System.out.println(String.format("Your activation key is: %s", key));

	}

	private static String slice(String key, int startIndexSlice, int endIndexSlice) {
		key = key.substring(0, startIndexSlice) + key.substring(endIndexSlice);
		System.out.println(key);
		return key;
	}

	private static String flip(String key, String upperOrLower, int startIndexFlip, int endIndexFlip) {
		String current = "";
		if(upperOrLower.equals("Upper")) {
			for (int i = startIndexFlip; i < endIndexFlip; i++) {
				current += String.valueOf(key.charAt(i)).replace(key.charAt(i), String.valueOf(key.charAt(i)).toUpperCase().charAt(0));
			}
			key = key.substring(0, startIndexFlip) + current + key.substring(endIndexFlip);
		}else {
			for (int i = startIndexFlip; i < endIndexFlip; i++) {
				current += String.valueOf(key.charAt(i)).replace(key.charAt(i), String.valueOf(key.charAt(i)).toLowerCase().charAt(0));
			}
			key = key.substring(0, startIndexFlip) + current + key.substring(endIndexFlip);
		}
		System.out.println(key);
		return key;
	}

	private static void contains(String key, String substring) {
		if(key.contains(substring)) {
			System.out.println(String.format("%s contains %s", key, substring));
		}else {
			System.out.println("Substring not found!");
		}
		
	}

}
