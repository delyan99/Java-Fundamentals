import java.util.Scanner;

public class HTML_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String title = scan.nextLine();
		//(<h1></h1>); 
		System.out.println("<h1>");
		System.out.println("    " + title);
		System.out.println("</h1>");
		String content = scan.nextLine();
		System.out.println("<article>");
		System.out.println("    " + content);
		System.out.println("</article>");
		String comments = scan.nextLine();	
		while(!"end of comments".equals(comments)) {
			System.out.println("<div>");
			System.out.println("    " + comments);
			System.out.println("</div>");
			comments = scan.nextLine();		
		}
		

	}

}
