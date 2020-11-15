import java.util.Scanner;

public class Articles_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(", ");
		int number = Integer.parseInt(scan.nextLine());
		Article article = new Article(input[0], input[1], input[2]);
		for (int i = 0; i < number; i++) {
			String[] inputCommand = scan.nextLine().split(": ");
			if(inputCommand[0].equals("Edit")) {
				article.edit(inputCommand[1]);
			}else if(inputCommand[0].equals("ChangeAuthor")) {
				article.changeAuthor(inputCommand[1]);
			}else if(inputCommand[0].equals("Rename")) {
				article.rename(inputCommand[1]);
			}
		}
		System.out.println(article);

	}

}
