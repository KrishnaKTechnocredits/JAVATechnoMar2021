/*Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]*/

package krati_Shukla.Exam13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelCount {

	public ArrayList<String> getVowels(String[] words) {
		int count = 0;
		//List<String> list = Arrays.asList(words);
		// ArrayList<String> input = new ArrayList<String>(list);
		ArrayList<String> output = new ArrayList<String>();

		for (String temp : words) {
			count = 0;
			for (int index = 0; index < temp.length(); index++) {
				char ch = temp.charAt(index);
				if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'))
					count++;
			}
			if (count > 2) {
				output.add(temp);
				System.out.println(count);
			}
		}
		return output;
	}

	public static void main(String[] a) {
		VowelCount vowelCount = new VowelCount();
		String[] str = { "aashay", "sandesh","madhavi","ankit","ami","priyanka" };
		ArrayList<String> answer = vowelCount.getVowels(str);
		System.out.println(answer);
	}

}
