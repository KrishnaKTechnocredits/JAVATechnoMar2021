/*Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]*/

package simmi.exam13;

import java.util.ArrayList;

public class Vowels {

	public ArrayList<String> getVowels(ArrayList<String> wordsList) {
		ArrayList<String> output = new ArrayList<String>();
		for (int index = 0; index < wordsList.size(); index++) {
			String str = wordsList.get(index);
			int count = 0;
			for (int innerIndex = 0; innerIndex < str.length(); innerIndex++) {
				if (str.charAt(innerIndex) == 'a' || str.charAt(innerIndex) == 'e' || str.charAt(innerIndex) == 'i'
						|| str.charAt(innerIndex) == 'o' || str.charAt(innerIndex) == 'u') {

					count++;
				}
			}
			if (count > 2) {
				output.add(wordsList.get(index));
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayList<String> wordsList = new ArrayList<String>();
		wordsList.add("aashay");
		wordsList.add("sandesh");
		wordsList.add("madhavi");
		wordsList.add("ankit");
		wordsList.add("priyanka");

		Vowels vowels = new Vowels();
		ArrayList<String> output = vowels.getVowels(wordsList);
		System.out.println(output);
	}
}
