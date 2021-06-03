/*Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]
*/

package shilpa.coding_exam_13;

import java.util.ArrayList;

public class FindStrWithTwoVowels {
	boolean getVowels(String word) {
		int cnt = 0;
		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == 'a' || word.charAt(index) == 'e' || word.charAt(index) == 'i'
					|| word.charAt(index) == 'o' || word.charAt(index) == 'u') {
				cnt++;
			}
		}
		if (cnt > 2)
			return true;
		else
			return false;
	}

	public ArrayList<String> getStrWithTwoVowels(String[] str) {
		ArrayList<String> outputList = new ArrayList<String>();
		for (String word : str) {
			if (getVowels(word) == true) {
				outputList.add(word);
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		FindStrWithTwoVowels findStrWithTwoVowels = new FindStrWithTwoVowels();
		String[] input = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };
		ArrayList<String> output = findStrWithTwoVowels.getStrWithTwoVowels(input);
		System.out.println("Words having more than two vowels from given array are\n");
		System.out.println(output);
	}
}