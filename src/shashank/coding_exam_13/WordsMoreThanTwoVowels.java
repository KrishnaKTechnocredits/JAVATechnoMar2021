package shashank.coding_exam_13;

import java.util.ArrayList;

public class WordsMoreThanTwoVowels {

	ArrayList<String> getWordsMoreThanTwoVowels(String input[]) {
		ArrayList<String> list = new ArrayList<String>();

		for (int index = 0; index < input.length; index++) {
			char ch[] = input[index].toCharArray();
			int count = 0;
			for (int innerIndex = 0; innerIndex < input[index].length(); innerIndex++) {
				input[index].toLowerCase();

				if (ch[innerIndex] == 'a' || ch[innerIndex] == 'e' || ch[innerIndex] == 'i' || ch[innerIndex] == 'o'
						|| ch[innerIndex] == 'u') {
					count++;
				}
			}
			if (count > 2)
				list.add(input[index]);
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input[] = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };
		WordsMoreThanTwoVowels wordsMoreThanTwoVowels = new WordsMoreThanTwoVowels();
		ArrayList<String> output = wordsMoreThanTwoVowels.getWordsMoreThanTwoVowels(input);
		System.out.println(output);
	}

}
