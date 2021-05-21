/*Java Assignment 16: 9th April 2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e

output : e -> 2
*/

package vaibhav.Assignment_16;

import java.util.Scanner;

public class CharFrequency {

	void getCharFreq(String str, char ch) {
		int charCnt = 0;
		for (int index =0; index<str.length();index++) {
			if (str.charAt(index)==ch)
				charCnt++;
		}
		System.out.println("Input string		: "+ str);
		System.out.println("Targeted character 	: " + ch);
		System.out.println("Frequency of targeted char in given string is : " + charCnt);
	}

	public static void main(String[] args) {
		CharFrequency charFrequency = new CharFrequency();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the input string : ");
		String targetString = scanner.next();
		
		System.out.println("Please enter the targeted charater to find frequency : ");
		String tempStr = scanner.next();
		char targetChar = tempStr.charAt(0);
		
		charFrequency.getCharFreq(targetString, targetChar);
		scanner.close();
	}
}
