package pallavi.coding_exam_13;

import java.util.ArrayList;

/*2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]*/

public class ReturnVowel {

	public ArrayList<String> getVowels(String words[]) {
		ArrayList<String> output = new ArrayList<String>();
		for (String name : words) {
			int count = 0;
			for (int index = 0; index < name.length(); index++) {
				char ch = name.charAt(index);
				{
					if ((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U') || (ch == 'a')
							|| (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
						count++;
					}
				}
			}

			if (count > 2)
				output.add(name);
		}

		return output;

	}

	public static void main(String[] args) {
		String input[] = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };
		ArrayList<String> output=new ReturnVowel().getVowels(input);
		System.out.println(output);
	}

}
