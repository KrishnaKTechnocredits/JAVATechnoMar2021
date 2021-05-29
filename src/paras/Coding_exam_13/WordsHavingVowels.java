/*
2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
	//write your logic
}
 */
package paras.Coding_exam_13;

import java.util.ArrayList;

public class WordsHavingVowels {

	ArrayList<String> getVowels(ArrayList<String> input) {
		ArrayList<String> output = new ArrayList<String>();
		for (int index = 0; index < input.size(); index++) {
			String temp = input.get(index);
			int count = 0;
			for (int innerindex = 0; innerindex < temp.length(); innerindex++) {
				char ch = temp.charAt(innerindex);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					count++;
			}
			if (count > 2)
				output.add(input.get(index));
		}
		return output;

	}

	public static void main(String[] args) {
		WordsHavingVowels wordsHavingVowels = new WordsHavingVowels();
		ArrayList<String> input = new ArrayList<String>();
		input.add("aashay");
		input.add("sandesh");
		input.add("madhavi");
		input.add("ankit");
		input.add("ami");
		input.add("priyanka");
		ArrayList<String> output = wordsHavingVowels.getVowels(input);
		System.out.println(output);
	}
}
