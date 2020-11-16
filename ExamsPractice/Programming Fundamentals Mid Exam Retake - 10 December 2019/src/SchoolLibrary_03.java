import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolLibrary_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] book = scan.nextLine().split("&");
		List<String> books = new ArrayList<>();
		for (int i = 0; i < book.length; i++) {
			books.add(book[i]);
		}
		String input = scan.nextLine();
		while (!"Done".equals(input)) {
			String[] command = input.split(" \\| ");
			switch (command[0]) {
			case "Add Book":
				if(!books.contains(command[1])) {
					books.add(0, command[1]);
				}
				break;

			case "Take Book":
				if(books.contains(command[1])) {
					books.remove(command[1]);
				}
				break;
			case "Swap Books":
				String firstBookName = command[1];
				String secondBookName = command[2];
				String curentBook = firstBookName;
				int index = 0;
				int index2 = 0;
				for (int i = 0; i < books.size(); i++) {
					if(books.get(i).equals(firstBookName)) {
						index = i;
						break;
					}
				}
				
				for (int i = 0; i < books.size(); i++) {
					if(books.get(i).equals(secondBookName)) {
						index2 = i;
						break;
					}
				}
				
				books.add(index, secondBookName);
				books.remove(index + 1);
				
				
				books.add(index2, curentBook);
				books.remove(index2 + 1);
				break;

			case "Insert Book":
				books.add(command[1]);
				break;
			case "Check Book":
				int index1 = Integer.parseInt(command[1]); 
				if(books.size() - 1 > index1) {
					System.out.println(books.get(index1));
				}
				break;

			}
			
			input = scan.nextLine();
		}
		for (int i = 0; i < books.size(); i++) {
			if(i == books.size() - 1) {
				System.out.println(books.get(i));
			}else {
				System.out.print(books.get(i) + ", ");
			}
		}
	}

}
