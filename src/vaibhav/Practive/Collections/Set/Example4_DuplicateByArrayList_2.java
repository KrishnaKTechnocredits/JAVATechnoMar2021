package vaibhav.Practive.Collections.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example4_DuplicateByArrayList_2 {

	public static void main(String[] args) {

		String[] names = { "Techno", "Credits", "Techno", "Credits", "Techno" };
		List<String> list = Arrays.asList(names);
		ArrayList<String> newList = new ArrayList<String>();
 
		for (String word : list) {
			if ((list.indexOf(word) != list.lastIndexOf(word)) && !newList.contains(word)) {
				System.out.println("Duplicate word : " + word);
				newList.add(word);
			}
		}
	}
}
