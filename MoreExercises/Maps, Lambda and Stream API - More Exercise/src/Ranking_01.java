import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ranking_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> firstInputMap = new LinkedHashMap<>();
		Map<String, Map<String, Integer>> secondMap = new LinkedHashMap<>();
		String input = scan.nextLine();
		while(!"end of contests".equals(input)) {
			String[] command = input.split(":");
			String contest = command[0];
			String passwordForContest = command[1];
			firstInputMap.putIfAbsent(contest, "");
			String newPassword = firstInputMap.get(contest) + passwordForContest;
			firstInputMap.put(contest, newPassword);
			
			input= scan.nextLine();
		}
		
		String secondInput = scan.nextLine();
		while(!"end of submissions".equals(secondInput)) {
			String[] command = secondInput.split("=>");
			String contest = command[0];
			String password = command[1];
			String username = command[2];
			int points = Integer.parseInt(command[3]);
			boolean flag = false;
			for (Map.Entry<String, String> map : firstInputMap.entrySet()) {
				if(map.getKey().contains(contest)) {
					flag = true;
					break;
				}
			}
			if(flag) {
				if(firstInputMap.get(contest).equals(password)){
					secondMap.putIfAbsent(username, new LinkedHashMap<String, Integer>());
					Map<String, Integer> m = new LinkedHashMap<String, Integer>();
					m.putIfAbsent(contest, 0);
					int newPoints = m.get(contest) + points;
					if(secondMap.containsKey(username) && secondMap.get(username).containsKey(contest) && newPoints < secondMap.get(username).get(contest)) {
						
					}else {
					m.put(contest, newPoints);
					Map<String, Integer> currentMap = secondMap.get(username);
					currentMap.putAll(m);
					secondMap.put(username, currentMap);
					}
					
				}
			}
			
			secondInput = scan.nextLine();
		}
		int totalPlonts = 0;
		for (Map.Entry<String, Map<String, Integer>> map : secondMap.entrySet()) {
			int sum = map.getValue().values().stream().mapToInt(p-> p).sum();
			if(sum > totalPlonts) {
				totalPlonts = sum;
			}
		}
		
		for (Map.Entry<String, Map<String, Integer>> map : secondMap.entrySet()) {
			int sum = map.getValue().values().stream().mapToInt(p-> p).sum();
			if(sum == totalPlonts) {
				System.out.println(String.format("Best candidate is %s with total %d points.", map.getKey(), totalPlonts));
			}
		}
		System.out.println("Ranking: ");
		secondMap
		.entrySet()
		.stream()
		.sorted((l, r) ->l.getKey().compareTo(r.getKey()))
		.forEach(p -> {
			System.out.println(p.getKey());
			p.getValue()
			.entrySet()
			.stream()
			.sorted((l, r) -> Integer.compare(r.getValue(), l.getValue()))
			.forEach(p1-> System.out.println("#  " + p1.getKey() + " -> " + p1.getValue()));
		});
		
		
	}

}
