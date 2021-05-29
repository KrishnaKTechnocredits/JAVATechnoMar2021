/*Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
	write your logic*/
package prashant.coding_exam_13;

import java.util.ArrayList;

public class ArrListVowelcheck {
	public ArrayList<String> getVowels(String[] word) {
		int incrementIndex = 0;
		ArrayList<String> arrword = new ArrayList<String>();
		int Cnt = 0;
		for (int index = 0; index < word.length; index++) {
			String temp = word[index];
			for (int i = 0; i < temp.length(); i++) {
				if ('a' == temp.charAt(i) || 'e' == temp.charAt(i) || 'o' == temp.charAt(i) || 'u' == temp.charAt(i)
						|| 'i' == temp.charAt(i) || 'A' == temp.charAt(i) || 'E' == temp.charAt(i)
						|| 'O' == temp.charAt(i) || 'U' == temp.charAt(i) || 'I' == temp.charAt(i))
					Cnt++;
			}
			if (Cnt >= 3) {
				arrword.add(incrementIndex, word[index]);
				incrementIndex++;
			}
			Cnt = 0;
		}
		return arrword;
	}

	public static void main(String[] args) {
		ArrListVowelcheck test = new ArrListVowelcheck();
		String[] str = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };
		System.out.println("words having more than two vowels from given array  " + test.getVowels(str));
	}
}
