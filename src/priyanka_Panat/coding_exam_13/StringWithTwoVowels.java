/*
 2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]
 */
package priyanka_Panat.coding_exam_13;

import java.util.ArrayList;

public class StringWithTwoVowels {
	boolean getStringWithTwoVowels(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
					|| ch == 'u' || ch == 'U') {
				count++;
			}
		}
		if (count > 2) {
			return true;
		}
			return false;
	}

	public ArrayList<String> getVowels(String[] words) {
		ArrayList<String> nameList = new ArrayList<String>();
		for (int index = 0; index < words.length; index++) {
			boolean isStringWithTwoVowels = getStringWithTwoVowels(words[index]);
			if (isStringWithTwoVowels) {
				nameList.add(words[index]);
			}
		}
		return nameList;
	}

	public static void main(String[] args) {
		StringWithTwoVowels stringWithTwoVowels = new StringWithTwoVowels();
		String[] names = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };
		ArrayList<String> output = stringWithTwoVowels.getVowels(names);
		System.out.println("Words having more than 2 Vowels from given array is : " + output);

	}
}