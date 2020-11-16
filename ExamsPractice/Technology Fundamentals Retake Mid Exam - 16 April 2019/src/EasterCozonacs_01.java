import java.util.Scanner;

public class EasterCozonacs_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double budget = Double.parseDouble(scan.nextLine());
		double priceFor1KgFlour = Double.parseDouble(scan.nextLine());
		double priceOfEggs1Pack = 0.75 * priceFor1KgFlour;
		double priceOfMilk1l = priceFor1KgFlour + priceFor1KgFlour * 0.25;
		double priceOfMilkForRecipe = priceOfMilk1l / 4;
		double priceForOneCozunak = priceFor1KgFlour + priceOfEggs1Pack + priceOfMilkForRecipe;
		int counter = 0;
		int coloredEggs = 0;
		while (budget > 0) {
			budget -= priceForOneCozunak;
			counter++;
			if(budget < 0) {
				budget += priceForOneCozunak;
				counter--;
				break;
			}
			coloredEggs += 3;
			if(counter % 3 == 0) {
				int removeEggs = counter - 2;
				coloredEggs -= removeEggs;
			}
			
		}
		System.out.printf("You made %d cozonacs! Now you have %d eggs and %.2fBGN left.", counter, coloredEggs, budget);
	}

}
