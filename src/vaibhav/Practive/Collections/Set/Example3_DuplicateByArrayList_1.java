package vaibhav.Practive.Collections.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example3_DuplicateByArrayList_1 {

	static ArrayList<String> replaceWord(ArrayList<String> wordList, String word) {

		while (wordList.contains(word)) {
			int index = wordList.indexOf(word);
			wordList.set(index, "*");
		}
		return wordList;
	}

	public static void main(String[] args) {

		String[] names = { "Techno", "Credits", "Techno", "Credits", "Techno" };
		List<String> list = Arrays.asList(names);
		ArrayList<String> arrList = new ArrayList<String>(list);

		for (String word : arrList) {
			if ((arrList.indexOf(word) != arrList.lastIndexOf(word)) && !word.equals("*")) {
				System.out.println("Duplicate word : " + word);
				replaceWord(arrList, word);
			}

			/*if (list.indexOf(word) != list.lastIndexOf(word)) {
				System.out.println("Duplicate word : " + word);
				replaceWord(arrList, word);
			}*/
		}
	}
}
