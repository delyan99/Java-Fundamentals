import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesofCodeandLogicVII_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> hitPoints = new HashMap<>();
		Map<String, Integer> manaPoints = new HashMap<>();
		int n = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < n; i++) {
			String[] heroes = scan.nextLine().split(" ");
			String heroName = heroes[0];
			int HP = Integer.parseInt(heroes[1]);
			int MP = Integer.parseInt(heroes[2]);
			if(HP > 100) {
				HP = 100;
			}
			if(MP > 200) {
				MP = 200;
			}
			hitPoints.put(heroName, HP);
			manaPoints.put(heroName, MP);
		}
		String input = scan.nextLine();
		while(!"End".equals(input)) {
			String[] tokens = input.split(" - ");
			String command = tokens[0];
			String heroName = tokens[1];
			switch(command) {
			case "CastSpell":
				int MPNeeded = Integer.parseInt(tokens[2]);
				String spellName = tokens[3];
				int mana = manaPoints.get(heroName);		
				if(mana >= MPNeeded) {
					int newMana = mana - MPNeeded;
					manaPoints.put(heroName, newMana);
					System.out.println(String.format("%s has successfully cast %s and now has %d MP!", heroName, spellName, newMana));
				}else {
					System.out.println(String.format("%s does not have enough MP to cast %s!", heroName, spellName));
				}				
				break;
			case "TakeDamage":
				int damage = Integer.parseInt(tokens[2]);
				String attacker = tokens[3];
				int health = hitPoints.get(heroName);
				if(health > damage) {
					int newHealth = health - damage;
					hitPoints.put(heroName, newHealth);
					System.out.println(String.format("%s was hit for %d HP by %s and now has %d HP left!", heroName, damage, attacker, newHealth));
				}else {
					hitPoints.remove(heroName);
					System.out.println(String.format("%s has been killed by %s!", heroName, attacker));
				}
				
				break;
			case "Recharge":
				int rechargeAmount = Integer.parseInt(tokens[2]);
				int currentMana = manaPoints.get(heroName);
				int newMana = currentMana + rechargeAmount;
				if(newMana > 200) {
					newMana = 200;
					rechargeAmount = 200 - currentMana;
				}
				manaPoints.put(heroName, newMana);
				System.out.println(String.format("%s recharged for %d MP!", heroName, rechargeAmount));
				break;
			case "Heal":
				int healAmount = Integer.parseInt(tokens[2]);
				int currentHealth = hitPoints.get(heroName);
				int newHeal = currentHealth + healAmount;
				if(newHeal > 100) {
					newHeal = 100;
					healAmount = 100 - currentHealth;
				}
				hitPoints.put(heroName, newHeal);
				System.out.println(String.format("%s healed for %d HP!", heroName, healAmount));
				break;
			}
			
			input = scan.nextLine();
		}
		hitPoints
		.entrySet()
		.stream()
		.sorted((l, r)->{
			int result = r.getValue().compareTo(l.getValue());
			if(result == 0 ) {
				result = l.getKey().compareTo(r.getKey());
			}
			return result;
		})
		.forEach(p->{
			System.out.println(p.getKey());
			System.out.println("HP: " + p.getValue());
			System.out.println("MP: " + manaPoints.get(p.getKey()));
		});
	}

}
