import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		List<Song> songs = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String[] input = scan.nextLine().split("_");
			
			String typeList = input[0];
			String name = input[1];
			String time = input[2];
			
			Song song = new Song();
			song.setName(name);
			song.setTime(time);
			song.setTypeList(typeList);
			
			songs.add(song);
		}
		
		String printList = scan.nextLine();
		
		if(printList.equals("all")) {
			for (Song song : songs) {
				System.out.println(song.getName());
			}
		}else {
			for (Song song : songs) {
				if(printList.equals(song.getTypeList())) {
					System.out.println(song.getName());
				}
			}
		}

	}

}
