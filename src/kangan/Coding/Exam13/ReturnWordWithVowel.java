package kangan.Coding.Exam13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]*/

public class ReturnWordWithVowel {

	ArrayList<String> returnWord(String names[]) {
		ArrayList<String> output = new ArrayList<String>();

		List<String> nameList = new ArrayList<String>(Arrays.asList(names));
		for (int index = 0; index < nameList.size(); index++) {
			String word = nameList.get(index);
			int count = 0;
			for (int innerindex = 0; innerindex < word.length(); innerindex++) {
				char ch = word.charAt(innerindex);
				if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e') {
					count++;
				}
			}
			if (count > 2) {
				output.add(word);
			}
		}
	
		return output;

	}

	public static void main(String[] args) {
		ReturnWordWithVowel returnWordWithVowel = new ReturnWordWithVowel();
		String arr[] = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };
		ArrayList<String> output = returnWordWithVowel.returnWord(arr);
		System.out.println(output);

	}

}
