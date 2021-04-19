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

import java.util.Scanner;

public class CharFrequency {

	int oneChFreq(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		return count;

	}

	public static void main(String[] args) {
		CharFrequency charFrequency = new CharFrequency();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the word : ");
		String str = scanner.next(); // "technocredits"

		System.out.println("Please enter the character : ");
		String str1 = scanner.next();
		char ch = str1.charAt(0); // 'e';

		scanner.close();

		System.out.println(ch + " --> " + charFrequency.oneChFreq(str, ch) + " times in " + str);
	}

}
