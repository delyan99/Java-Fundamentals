package Articles2_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		List<Article> articles = new ArrayList<>();
		for (int i = 0; i < number; i++) {
			String[] tokens = scan.nextLine().split(", ");
			Article article = new Article(tokens[0], tokens[1], tokens[2]);
			articles.add(article);
		}
		String command = scan.nextLine();
		if(command.equals("author")) {
			articles.stream().sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor())).forEach(a -> System.out.println(a.toString()));
		}else if(command.equals("title")) {
			articles.stream().sorted((a1, a2) -> a1.getTitle().compareTo(a2.getTitle())).forEach(a -> System.out.println(a.toString()));
		}else if(command.equals("content")) {
			articles.stream().sorted((a1, a2) -> a1.getContent().compareTo(a2.getContent())).forEach(a -> System.out.println(a.toString()));
		}

	}

}
