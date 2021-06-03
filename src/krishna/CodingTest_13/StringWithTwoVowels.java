package krishna.CodingTest_13;

import java.util.ArrayList;

/*
2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]
public ArrayList<String> getVowels(String words[]){
	//write your logic
}
 */
public class StringWithTwoVowels {
	public ArrayList<String> findVowels(String words[]) {
		boolean hasVowels;
		ArrayList<String> arr = new ArrayList<String>();
		for (int index = 0; index < words.length; index++) {
			hasVowels = getString(words[index]);
			if (hasVowels)
				arr.add(words[index]);
		}
		return arr;
	}

	static boolean getString(String name) {
		boolean isStringEligible = false;
		int count = 0;
		for (int index1 = 0; index1 < name.length(); index1++) {
			char ch = name.charAt(index1);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
				if (count >= 3) {
					isStringEligible = true;
					break;
				}
			}
		}
		return isStringEligible;
	}

	public static void main(String[] args) {
		StringWithTwoVowels stringWithTwoVowels = new StringWithTwoVowels();
		String[] input = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };
		ArrayList<String> output = stringWithTwoVowels.findVowels(input);
		System.out.println("Strings with more than two vowels " + output);
	}

}
