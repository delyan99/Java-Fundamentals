import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String regex = "[$]{6,10}|[#]{6,10}|[@]{6,10}|[\\^]{6,10}";
		Pattern pattern = Pattern.compile(regex);
		String[] input = scan.nextLine().split(",\\s+");
		for (String ticket : input) {
			if(ticket.length() != 20) {
				System.out.println("invalid ticket");
			}else {
				String firstHalf = ticket.substring(0, 10);
				String secondHalf = ticket.substring(10, 20);
				Matcher matcherfirstHalf = pattern.matcher(firstHalf);
				Matcher matcherSeconHalf = pattern.matcher(secondHalf);
				String characterFirstHalf = "";
				String firstHaftTicket = "";
				String characterSecondHalf = "";
				String secondHaftTicket = "";
				if(matcherfirstHalf.find()){
					characterFirstHalf = matcherfirstHalf.group(0).substring(0, 1);
					firstHaftTicket = matcherfirstHalf.group(0); 
				}
				
				if(matcherSeconHalf.find()) {
					characterSecondHalf = matcherSeconHalf.group(0).substring(0, 1);
					secondHaftTicket = matcherSeconHalf.group(0);
				}
				
				if(firstHaftTicket.equals(secondHaftTicket) && firstHaftTicket.length() == 10 && firstHaftTicket.length() == secondHaftTicket.length()) {
					System.out.println(String.format("ticket \"%s\" - %d%s Jackpot!", ticket, firstHaftTicket.length(), characterSecondHalf));
				}else if(firstHaftTicket.length() >= 6 && secondHaftTicket.length() >= 6 && characterFirstHalf.equals(characterSecondHalf)){
					if(firstHaftTicket.length() > secondHaftTicket.length()) {
						firstHaftTicket = secondHaftTicket;
					}
					System.out.println(String.format("ticket \"%s\" - %d%s", ticket, firstHaftTicket.length(), characterFirstHalf));
				}else {
					System.out.println(String.format("ticket \"%s\" - no match", ticket));
				}
				
			}
			
			
		}
	}

}
