import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoftUniCoursePlanning_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] lessons = scan.nextLine().split(", ");
		List<String> list = new ArrayList<>();
		for (int i = 0; i < lessons.length; i++) {
			list.add(lessons[i]);
		}
		String input = scan.nextLine();
		while (!"course start".equals(input)) {
			String[] array = input.split(":");
			switch (array[0]) {
			case "Add":
				String lessonTitle = array[1];
				if(!list.contains(lessonTitle)) {
					list.add(lessonTitle);
				}
				break;
			case "Insert":
				String insertLessonTitle = array[1];
				int index = Integer.parseInt(array[2]);
				if(!list.contains(insertLessonTitle)) {
					list.add(index, insertLessonTitle);
				}
				break;
			case "Remove":
				String removeLessonTitle = array[1];
				if(list.contains(removeLessonTitle)) {
					if(list.contains(removeLessonTitle+"-Exercise")) {
						list.remove(removeLessonTitle);
						list.remove(removeLessonTitle+"-Exercise");
					}else {
						list.remove(removeLessonTitle);
					}
				}
				break;
			case "Swap":
				String firstLessonTitle = array[1];
				String secondLessonTitle = array[2];
				int firstIndex = list.indexOf(firstLessonTitle);
				int secondIndex = list.indexOf(secondLessonTitle);
				if(list.contains(firstLessonTitle) && list.contains(secondLessonTitle)) {
					if(list.contains(firstLessonTitle + "-Exercise") && list.contains(secondLessonTitle + "-Exercise")) {
						list.remove(firstIndex);
						list.remove(firstIndex);
						list.add(firstIndex, secondLessonTitle);
						list.add(firstIndex, secondLessonTitle + "-Exercise");
						
						list.remove(secondIndex);
						list.remove(secondIndex);
						list.add(secondIndex, firstLessonTitle);
						list.add(secondIndex, firstLessonTitle + "-Exercise");
					}else if(list.contains(firstLessonTitle + "-Exercise")){
						list.remove(firstIndex);
						list.remove(firstIndex);
						list.add(firstIndex, secondLessonTitle);
					
						
						list.remove(secondIndex);
						list.add(secondIndex, firstLessonTitle);
						list.add(secondIndex + 1 , secondLessonTitle + "-Exercise");
					}else if(list.contains(secondLessonTitle + "-Exercise")){
						list.remove(firstIndex);
						list.add(firstIndex, secondLessonTitle);
						list.add(firstIndex + 1 , secondLessonTitle + "-Exercise");
						
						list.remove(secondIndex + 1);
						list.remove(secondIndex + 1 );
						list.add(secondIndex + 1, firstLessonTitle);
						
					}
					else {
						list.remove(firstIndex);
						list.add(firstIndex, secondLessonTitle);
						list.remove(secondIndex);
						list.add(secondIndex, firstLessonTitle);
					}
				}
				
				break;
			case "Exercise":
				String exercise = array[1];
				if(!list.contains(exercise) && !list.contains(exercise+"-Exercise")) {
					list.add(exercise);
					list.add(exercise+"-Exercise");
				}else if(list.contains(exercise) && !list.contains(exercise+"-Exercise")) {
					int indexExercise = list.indexOf(exercise);
					list.add(indexExercise + 1, exercise+"-Exercise");;
				}
				break;
			}
			input = scan.nextLine();
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d.%s", i+1, list.get(i));
			System.out.println();
		}
	}

}
