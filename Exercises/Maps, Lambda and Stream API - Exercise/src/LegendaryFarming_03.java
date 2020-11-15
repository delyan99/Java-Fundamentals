import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> keyMaterials = new LinkedHashMap<>();
		Map<String, Integer> junkMaterials = new LinkedHashMap<>();
		boolean flag = false;
		while(!flag) {
			String[] input = scan.nextLine().split("\\s+");
			for (int i = 0; i < input.length - 1; i = i +2) {
				int quantity = Integer.parseInt(input[i]);
				String material = input[i+1].toLowerCase();
				if(material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
					keyMaterials.putIfAbsent("shards", 0);
					keyMaterials.putIfAbsent("fragments", 0);
					keyMaterials.putIfAbsent("motes", 0);
					int newQuantity = keyMaterials.get(material) + quantity;
					keyMaterials.put(material, newQuantity);
					if(newQuantity >= 250) {
						if(material.equals("shards")) {	
							keyMaterials.put(material, newQuantity - 250);
							System.out.println("Shadowmourne obtained!");
						}else if(material.equals("fragments")) {
							keyMaterials.put(material, newQuantity - 250);
							System.out.println("Valanyr obtained!");
						}else if(material.equals("motes")) {
							keyMaterials.put(material, newQuantity - 250);
							System.out.println("Dragonwrath obtained!");
						}
						flag = true;
						break;
					}
				}else {
					junkMaterials.putIfAbsent(material, 0);
					int newQuantity = junkMaterials.get(material) + quantity;
					junkMaterials.put(material, newQuantity);
				}
			}
			
		}
		keyMaterials
		.entrySet()
		.stream()
		.sorted((l, r) -> l.getKey().compareTo(r.getKey()))
		.sorted((l, r) -> r.getValue().compareTo(l.getValue()))
		.forEach(p -> System.out.println(p.getKey() + ": " + p.getValue()));
		
		junkMaterials
		.entrySet()
		.stream()
		.sorted((l, r) ->l.getKey().compareTo(r.getKey()))
		.forEach(p -> System.out.println(p.getKey() + ": " + p.getValue()));

	}

}
