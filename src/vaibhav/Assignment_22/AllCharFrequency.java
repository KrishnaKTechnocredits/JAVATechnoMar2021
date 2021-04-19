/*Java Assignment 22:  16th April'2021

b) Find all character frequency from given name.
Input: name - aakanksha
Output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1

*/

package vaibhav.Assignment_22;

public class AllCharFrequency {

	void oneChFreq(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		System.out.println(ch + " --> " + count + " times in " + str);
	}

	void allCharFreq(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			
		//// ******IMPORTTANT*******////
			
			if (index == str.indexOf(ch)) 
				oneChFreq(str, str.charAt(index));
		}
	}

	public static void main(String[] args) {
		AllCharFrequency allcharFrequency = new AllCharFrequency();
		String word = "aakanksha";
		allcharFrequency.allCharFreq(word);
	}

}
