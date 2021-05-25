/*
 2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
	//write your logic
}
 */

package ami.Coding_Exam_13;

import java.util.ArrayList;

public class TwoVowelRetrun {
	int count = 0;

	public ArrayList<String> getVowels(String words[]) {
		ArrayList<String> output = new ArrayList<String>();
		for (String temp : words) {
			count = 0;
			for (int index = 0; index < temp.length(); index++) {
				char ch = temp.charAt(index);
				if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A')
						|| (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'))
					count++;
			}
			if (count > 2) {
				output.add(temp);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		TwoVowelRetrun twoVowelRetrun = new TwoVowelRetrun();
		String[] input = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };
		ArrayList<String> out = twoVowelRetrun.getVowels(input);
		System.out.println(out);
	}
}
