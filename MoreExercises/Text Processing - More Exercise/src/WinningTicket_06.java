import java.util.Scanner;

public class WinningTicket_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine().replace(" ", "");
		String[] tickets = input.split(",");
		for (String ticket : tickets) {
			if (ticket.length() < 20 || ticket.length() > 20) {
				System.out.println("invalid ticket");
			} else {
				String firstHalfTicket = ticket.substring(0, 10);
				String secondHalfTicket = ticket.substring(10);
				int firstCounter = 1, firstCounter1 = 1, firstCounter2 = 1, firstCounter3 = 1, firstCounter4 = 1;
				int secondCounter = 1, secondCounter1 = 1, secondCounter2 = 1, secondCounter3 = 1, secondCounter4 = 1;
				String symbol = "";
				for (int i = 1; i < firstHalfTicket.length(); i++) {
					if (firstHalfTicket.charAt(i - 1) == firstHalfTicket.charAt(i)
							&& (firstHalfTicket.charAt(i - 1) == '@')) {
						firstCounter1++;
						symbol = String.valueOf(firstHalfTicket.charAt(i - 1));
					} else if (firstCounter1 < 6) {
						firstCounter1 = 1;
					}
					
					if (firstHalfTicket.charAt(i - 1) == firstHalfTicket.charAt(i)
							&& ( firstHalfTicket.charAt(i - 1) == '#')) {
						firstCounter2++;
						symbol = String.valueOf(firstHalfTicket.charAt(i - 1));
					} else if (firstCounter2 < 6) {
						firstCounter2 = 1;
					}
					
					if (firstHalfTicket.charAt(i - 1) == firstHalfTicket.charAt(i)
							&& (firstHalfTicket.charAt(i - 1) == '$')) {
						firstCounter3++;
						symbol = String.valueOf(firstHalfTicket.charAt(i - 1));
					} else if (firstCounter3 < 6) {
						firstCounter3 = 1;
					}
					
					if (firstHalfTicket.charAt(i - 1) == firstHalfTicket.charAt(i)
							&& (firstHalfTicket.charAt(i - 1) == '^')) {
						firstCounter4++;
						symbol = String.valueOf(firstHalfTicket.charAt(i - 1));
					} else if (firstCounter4 < 6) {
						firstCounter4 = 1;
					}		
				}
				
				if(firstCounter1 >  firstCounter2  && firstCounter1 >  firstCounter3 && firstCounter1 >  firstCounter4) {
					symbol = "@";
					firstCounter = firstCounter1;
				}else if(firstCounter2 > firstCounter3 && firstCounter2 > firstCounter1 && firstCounter2 > firstCounter4) {
					symbol = "#";
					firstCounter = firstCounter2;
				}else if(firstCounter3 > firstCounter1 && firstCounter3 > firstCounter2 && firstCounter3 > firstCounter4) {
					symbol = "$";
					firstCounter = firstCounter3;
				}else {
					symbol = "^";
					firstCounter = firstCounter4;
				}
				
				for (int i = 1; i < secondHalfTicket.length(); i++) {
					if (secondHalfTicket.charAt(i - 1) == secondHalfTicket.charAt(i)
							&& (secondHalfTicket.charAt(i - 1) == '@')) {
						secondCounter1++;
						symbol = String.valueOf(firstHalfTicket.charAt(i - 1));
					} else if (secondCounter1 < 6) {
						secondCounter1 = 1;
					}
					
					if (secondHalfTicket.charAt(i - 1) == secondHalfTicket.charAt(i)
							&& ( secondHalfTicket.charAt(i - 1) == '#')) {
						secondCounter2++;
						symbol = String.valueOf(secondHalfTicket.charAt(i - 1));
					} else if (secondCounter2 < 6) {
						secondCounter2 = 1;
					}
					
					if (secondHalfTicket.charAt(i - 1) == secondHalfTicket.charAt(i)
							&& (secondHalfTicket.charAt(i - 1) == '$')) {
						secondCounter3++;
						symbol = String.valueOf(secondHalfTicket.charAt(i - 1));
					} else if (secondCounter3 < 6) {
						secondCounter3 = 1;
					}
					
					if (secondHalfTicket.charAt(i - 1) == secondHalfTicket.charAt(i)
							&& (secondHalfTicket.charAt(i - 1) == '^')) {
						secondCounter4++;
						symbol = String.valueOf(secondHalfTicket.charAt(i - 1));
					} else if (secondCounter4 < 6) {
						secondCounter4 = 1;
					}		
				}
				
				if(secondCounter1 >  secondCounter2  && secondCounter1 >  secondCounter3 && secondCounter1 >  secondCounter4) {
					symbol = "@";
					secondCounter = secondCounter1;
				}else if(secondCounter2 > secondCounter3 && secondCounter2 > secondCounter1 && secondCounter2 > secondCounter4) {
					symbol = "#";
					secondCounter = secondCounter2;
				}else if(secondCounter3 > secondCounter1 && secondCounter3 > secondCounter2 && secondCounter3 > secondCounter4) {
					symbol = "$";
					secondCounter = secondCounter3;
				}else {
					symbol = "^";
					secondCounter = secondCounter4;
				}
				
				int counter = Math.min(firstCounter, secondCounter);
				if (counter < 6) {
					System.out.println(String.format("ticket \"%s\" - no match", ticket));
				} else if (counter != 10) {
					System.out.println(String.format("ticket \"%s\" - %d%s", ticket, counter, symbol));
				} else {
					System.out.println(String.format("ticket \"%s\" - %d%s Jackpot!", ticket, counter, symbol));
				}
			}
		}

	}

}
