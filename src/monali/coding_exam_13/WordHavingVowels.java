package monali.coding_exam_13;

import java.util.ArrayList;

public class WordHavingVowels {

	ArrayList<String> getVowels(ArrayList<String> str) {
		ArrayList<String> output = new ArrayList<String>();
		for (int index = 0; index < str.size(); index++) {
			String name = str.get(index);
			int count = 0;
			for (int i = 0; i < name.length(); i++) {
				char ch = name.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					count++;
			}
			if (count > 2)
				output.add(str.get(index));
		}
		return output;
	}

	public static void main(String[] args) {
		WordHavingVowels vowels = new WordHavingVowels();
		ArrayList<String> str = new ArrayList<String>();
		str.add("aashay");
		str.add("sandesh");
		str.add("madhavi");
		str.add("ankit");
		str.add("ami");
		str.add("priyanka");
		ArrayList<String> output = vowels.getVowels(str);
		System.out.println("words having more than two vowels are " + output);
	}

}
