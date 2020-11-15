import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokemonDontGo_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("\\s+");
		Integer[] array = new Integer[input.length];
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(input[i]);
			list.add(array[i]);
		}
		int sum = 0;
		String inputIndex = scan.nextLine();
		while (true) {
			int index = Integer.parseInt(inputIndex);		
			if (index <= list.size() - 1 && index >= 0) {
				int curent = list.get(index);
				list.remove(index);
				sum += curent;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) <= curent) {
						int curentNumber = list.get(i);
						list.remove(i);
						list.add(i, curentNumber + curent);
					} else {
						int curentNumber = list.get(i);
						list.remove(i);
						list.add(i, curentNumber - curent);
					}
				}
				if (list.size() == 0) {
					break;
				}
			}else if(index < 0) {
				int c = list.get(0);
				sum += c;
				list.remove(0);
				list.add(0, list.get(list.size() - 1));
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) <= c) {
						int curentNumber = list.get(i);
						list.remove(i);
						list.add(i, curentNumber + c);
					} else {
						int curentNumber = list.get(i);
						list.remove(i);
						list.add(i, curentNumber - c);
					}
				}
			}else if(index >= list.size()) {
				int cr = list.get(list.size() - 1);
				sum += cr;
				list.remove(list.size() - 1);
				list.add(list.get(0));
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i) <= cr) {
						int curentNumber = list.get(i);
						list.remove(i);
						list.add(i, curentNumber + cr);
					} else {
						int curentNumber = list.get(i);
						list.remove(i);
						list.add(i, curentNumber - cr);
					}
				}
			}
			inputIndex = scan.nextLine();
		}
		System.out.println(sum);
	}

}
