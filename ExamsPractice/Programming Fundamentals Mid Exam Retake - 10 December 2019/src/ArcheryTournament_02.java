import java.util.Iterator;
import java.util.Scanner;

public class ArcheryTournament_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] targets = scan.nextLine().split("\\|");
		int t[] = new int[targets.length];
		int points = 0;
		for (int i = 0; i < targets.length; i++) {
			t[i] = Integer.parseInt(targets[i]);
		}

		String input = scan.nextLine();
		while (!"Game over".equals(input)) {
			String[] array = input.split("\\s+");
			switch (array[0]) {
			case "Shoot":
				String[] leftOrRight = array[1].split("@");
				int startIndex = Integer.parseInt(leftOrRight[1]);
				int lenght = Integer.parseInt(leftOrRight[2]);
				if (startIndex <= t.length - 1 && startIndex >= 0) {
					switch (leftOrRight[0]) {

					case "Left":
						int curentPosLeft = startIndex;
						for (int i = 0; i < lenght; i++) {
							curentPosLeft--;
							if (curentPosLeft < 0) {
								curentPosLeft = t.length - 1;
							}
						}
						t[curentPosLeft] = t[curentPosLeft] - 5;
						points += 5;
						if (t[curentPosLeft] < 0) {
							points -= 5;
							points += 5 + t[curentPosLeft];
						}
						if (t[curentPosLeft] < 0) {
							t[curentPosLeft] = 0;
						}

						break;

					case "Right":
						int curentPosRight = startIndex;
						for (int i = 0; i < lenght; i++) {
							curentPosRight++;
							if (curentPosRight > t.length - 1) {
								curentPosRight = 0;
							}
						}
						points += 5;
						t[curentPosRight] = t[curentPosRight] - 5;
						if (t[curentPosRight] < 0) {
							points -= 5;
							points += 5 + t[curentPosRight];
						}
						if (t[curentPosRight] < 0) {
							t[curentPosRight] = 0;
						}
					}
				}
				break;
			case "Reverse":
				if (t.length % 2 == 1) {
					int[] targetsCopy = new int[t.length];
					for (int i = 0; i < targetsCopy.length; i++) {
						targetsCopy[i] = t[i];
					}
					for (int i = 0; i < targets.length / 2; i++) {
						t[i] = targetsCopy[(targets.length - 1) - i];
					}

					for (int i = targets.length - 1; i > targets.length / 2; i--) {
						t[i] = targetsCopy[(targets.length - 1) - i];
					}
				} else {
					int[] targetsCopy = new int[t.length];
					for (int i = 0; i < targetsCopy.length; i++) {
						targetsCopy[i] = t[i];
					}
					for (int i = 0; i < targets.length / 2; i++) {
						t[i] = targetsCopy[(targets.length - 1) - i];
					}

					for (int i = targets.length - 1; i > targets.length / 2 - 1; i--) {
						t[i] = targetsCopy[(targets.length - 1) - i];
					}
				}
				break;
			}

			input = scan.nextLine();
		}
		for (int i = 0; i < t.length; i++) {
			if (i == t.length - 1) {
				System.out.print(t[i]);
			} else {
				System.out.print(t[i] + " - ");
			}
		}
		System.out.println();
		System.out.printf("Iskren finished the archery tournament with %d points!", points);

	}

}