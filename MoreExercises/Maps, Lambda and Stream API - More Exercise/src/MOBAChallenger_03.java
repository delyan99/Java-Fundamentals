import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MOBAChallenger_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Map<String, Integer>> database = new LinkedHashMap<>();
		String input = scan.nextLine();
		while(!"Season end".equals(input)) {
			if(input.contains("vs")) {
				String[] command = input.split(" vs ");
				String firstPlayer = command[0];
				String secondPlayer = command[1];
				if(database.containsKey(firstPlayer) && database.containsKey(secondPlayer)) {
					Map<String, Integer> firstPlayerMap = database.get(firstPlayer);
					Map<String, Integer> secondPlayerMap = database.get(secondPlayer);
					int totalSkillPointsFirstPlayer = 0;
					int totalSkillPointsSecondPlayer = 0;
					for (Map.Entry<String, Integer> map : secondPlayerMap.entrySet()) {
						if(firstPlayerMap.containsKey(map.getKey())) {
							totalSkillPointsFirstPlayer = firstPlayerMap.entrySet().stream().mapToInt(p->p.getValue()).sum();
							totalSkillPointsSecondPlayer = secondPlayerMap.entrySet().stream().mapToInt(p->p.getValue()).sum();
							if(totalSkillPointsFirstPlayer == totalSkillPointsSecondPlayer) {
								
							}else if(totalSkillPointsFirstPlayer < totalSkillPointsSecondPlayer) {
								database.remove(firstPlayer);
							}else {
								database.remove(secondPlayer);
							}
							break;
						}
					}
					
				}
				
			}else {
				String[] command = input.split(" -> ");
				String player = command[0];
				String position = command[1];
				int skill = Integer.parseInt(command[2]);
				if(!database.containsKey(player)) {
					Map<String, Integer> currentDatabase = new LinkedHashMap<>();
					currentDatabase.put(position, skill);
					database.put(player, currentDatabase);
				}else if(!database.get(player).containsKey(position)) {
					Map<String, Integer> currentDatabase = database.get(player);
					currentDatabase.put(position, skill);
					database.put(player, currentDatabase);
				}else {
					if(database.get(player).get(position) < skill) {
						Map<String, Integer> currentDatabase = database.get(player);
						currentDatabase.put(position, skill);
						database.put(player, currentDatabase);
					}
				}
				
			}
			
			input = scan.nextLine();
		}
		database
		.entrySet()
		.stream()
		.sorted((l, r)->{
			Integer first = l.getValue().entrySet().stream().mapToInt(p->p.getValue()).sum();
			Integer second = r.getValue().entrySet().stream().mapToInt(p->p.getValue()).sum();
			if(second.compareTo(first) == 0 ) {
				int result = l.getKey().compareTo(r.getKey());
				return result;
			}else if(second.compareTo(first) > 0){
				return 1;
			}else  {
				return -1;
			}
		}).forEach(p->{
			Integer sum = p.getValue().entrySet().stream().mapToInt(l->l.getValue()).sum();
			System.out.println(String.format("%s: %d skill", p.getKey(), sum));
			p.getValue()
			.entrySet()
			.stream()
			.sorted((l, r) ->{
				int result = r.getValue().compareTo(l.getValue());
				if(result == 0) {
					result = l.getKey().compareTo(r.getKey());
				}
				return result;
			}).forEach(k-> System.out.println(String.format("- %s <::> %d", k.getKey(), k.getValue())));
			
		});
		

	}

}
