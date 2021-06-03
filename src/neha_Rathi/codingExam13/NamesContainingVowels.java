/*Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
	//write your logic
}*/

package neha_Rathi.codingExam13;

import java.util.ArrayList;

public class NamesContainingVowels {

	static int getVowels(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		return count;
	}

	public static ArrayList<String> getVowels(String words[]) {
		ArrayList<String> list = new ArrayList<String>();
		for (String str : words) {
			if (getVowels(str) > 2)
				list.add(str);
		}
		return list;
	}

	public static void main(String[] args) {
		String[] input = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };
		System.out.println(getVowels(input));
	}
}
