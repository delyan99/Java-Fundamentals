import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] array = input.split(" ");
		int[] integerArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			integerArray[i] = Integer.parseInt(array[i]);
		}
		String command = scan.nextLine();
		while (!command.equals("end")) {
			String[] tokens = command.split(" ");
			String cmd = tokens[0];
			switch (cmd) {
			case "exchange":
				int exchangeIndex = Integer.parseInt(tokens[1]);
				if (exchangeIndex >= integerArray.length || exchangeIndex < 0) {
					System.out.println("Invalid index");
				} else {
					exchange(integerArray, exchangeIndex);
				}
				break;
			case "max":
				switch (tokens[1]) {
				case "even":
					maxEven(integerArray);
					break;
				case "odd":
					maxOdd(integerArray);
					break;
				}

				break;
			case "min":
				switch (tokens[1]) {
				case "even":
					minEven(integerArray);
					break;
				case "odd":
					minOdd(integerArray);
					break;
				}
				break;
			case "first":
				int count = Integer.parseInt(tokens[1]);
				if (count > integerArray.length) {
					System.out.println("Invalid count");
				} else {
					switch (tokens[2]) {
					case "even":
						firstEven(integerArray, count);
						break;
					case "odd":
						firstOdd(integerArray, count);
						break;
					}
				}
				break;
			case "last":
				int counter = Integer.parseInt(tokens[1]);
				if (counter > integerArray.length) {
					System.out.println("Invalid count");
				} else {
					switch (tokens[2]) {
					case "even":
						lastEven(integerArray, counter);
						break;
					case "odd":
						lastOdd(integerArray, counter);
						break;
					}
				}
				break;
			}

			command = scan.nextLine();
		}
		System.out.println(Arrays.toString(integerArray));

	}

	private static void exchange(int[] integerArray, int exchangeIndex) {
		exchangeIndex = exchangeIndex + 1;
		int[] coppyIntegerArray = new int[integerArray.length];

		for (int i = 0; i < coppyIntegerArray.length; i++) {
			int exchangeIndexPlusI = exchangeIndex + i;
			if (exchangeIndex + i >= coppyIntegerArray.length) {
				exchangeIndexPlusI = exchangeIndex + i - integerArray.length;
			}
			coppyIntegerArray[i] = integerArray[exchangeIndexPlusI];
		}

		for (int i = 0; i < integerArray.length; i++) {
			integerArray[i] = coppyIntegerArray[i];
		}

	}

	private static void maxEven(int[] integerArray) {
		int position = -1;
		int maxEvenNumber = Integer.MIN_VALUE;
		boolean flag = true;
		for (int i = 0; i < integerArray.length; i++) {
			if (integerArray[i] % 2 == 0) {
				flag = false;
				if (maxEvenNumber <= integerArray[i]) {
					maxEvenNumber = integerArray[i];
					position = i;
				}

			}

		}
		if (flag) {
			System.out.println("No matches");
		} else {
			System.out.println(position);
		}

	}

	private static void maxOdd(int[] integerArray) {
		int position = -1;
		boolean flag = true;
		int maxEvenNumber = Integer.MIN_VALUE;
		for (int i = 0; i < integerArray.length; i++) {
			if (integerArray[i] % 2 == 1) {
				flag = false;
				if (maxEvenNumber <= integerArray[i]) {
					maxEvenNumber = integerArray[i];
					position = i;
				}

			}

		}
		if (flag) {
			System.out.println("No matches");
		} else {
			System.out.println(position);
		}

	}

	private static void minEven(int[] integerArray) {
		int position = 0;
		boolean flag = true;
		int minEvenNumber = Integer.MAX_VALUE;
		for (int i = 0; i < integerArray.length; i++) {
			if (integerArray[i] % 2 == 0) {
				flag = false;
				if (minEvenNumber >= integerArray[i]) {
					minEvenNumber = integerArray[i];
					position = i;
				}

			}

		}
		if (flag) {
			System.out.println("No matches");
		} else {
			System.out.println(position);
		}

	}

	private static void minOdd(int[] integerArray) {
		int position = 0;
		boolean flag = true;
		int minOddNumber = Integer.MAX_VALUE;
		for (int i = 0; i < integerArray.length; i++) {
			if (integerArray[i] % 2 == 1) {
				flag = false;
				if (minOddNumber >= integerArray[i]) {
					minOddNumber = integerArray[i];
					position = i;
				}

			}

		}
		if (flag) {
			System.out.println("No matches");
		} else {
			System.out.println(position);
		}

	}

	private static void firstEven(int[] integerArray, int count) {

		int j = 0, counter = 0;

		for (int i = 0; i < integerArray.length; i++) {
			if (integerArray[i] % 2 == 0) {
				counter++;
			}
		}

		if (counter > count) {
			counter = count;
		}

		int[] firstEvenArray = new int[counter];

		for (int i = 0; i < integerArray.length; i++) {
			if (j == counter) {
				break;
			}
			if (integerArray[i] % 2 == 0) {
				firstEvenArray[j] = integerArray[i];
				j++;
			}
		}

		System.out.println(Arrays.toString(firstEvenArray));

	}

	private static void firstOdd(int[] integerArray, int count) {

		int j = 0, counter = 0;

		for (int i = 0; i < integerArray.length; i++) {
			if (integerArray[i] % 2 == 1) {
				counter++;
			}
		}
		if (counter > count) {
			counter = count;
		}
		int[] firstOddArray = new int[counter];

		for (int i = 0; i < integerArray.length; i++) {
			if (j == counter) {
				break;
			}
			if (integerArray[i] % 2 == 1) {
				firstOddArray[j] = integerArray[i];
				j++;
			}
			if (j == count) {
				break;
			}
		}

		System.out.println(Arrays.toString(firstOddArray));
	}

	private static void lastEven(int[] integerArray, int counter) {

		int j = 0, count = 0;

		for (int i = integerArray.length - 1; i >= 0; i--) {
			if (integerArray[i] % 2 == 0 && integerArray[i] != 0) {
				count++;
			}
		}

		if (counter < count) {
			count = counter;
		}

		int[] lastEvenArray = new int[count];

		for (int i = integerArray.length - 1; i >= 0; i--) {
			if (j == counter) {
				break;
			}
			if (integerArray[i] % 2 == 0 && integerArray[i] != 0) {
				lastEvenArray[j] = integerArray[i];
				j++;
			}
			if (j == count) {
				break;
			}
		}
		int coppyArray[] = new int[lastEvenArray.length];
		if (lastEvenArray.length != 0) {
			int k = 0;
			for (int i = coppyArray.length - 1; i >= 0; i--) {
				coppyArray[k] = lastEvenArray[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(coppyArray));
	}

	private static void lastOdd(int[] integerArray, int counter) {

		int j = 0, count = 0;

		for (int i = integerArray.length - 1; i >= 0; i--) {
			if (integerArray[i] % 2 == 1) {
				count++;
			}
		}

		if (counter < count) {
			count = counter;
		}

		int[] lastOddArray = new int[count];

		for (int i = integerArray.length - 1; i >= 0; i--) {
			if (j == count) {
				break;
			}
			if (integerArray[i] % 2 == 1) {
				lastOddArray[j] = integerArray[i];
				j++;
			}
		}

		int coppyArray[] = new int[lastOddArray.length];
		if (lastOddArray.length != 0) {
			int k = 0;
			for (int i = coppyArray.length - 1; i >= 0; i--) {
				coppyArray[k] = lastOddArray[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(coppyArray));

	}

}
