/*
 Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e

output : e -> 2
 */

package paras.Assignment_16;

import java.util.Scanner;

public class CharacterFrequency {

	void charFrequency(String str, char ch) {
		int count = 0;
		String name = str.toLowerCase();
		char letter = Character.toLowerCase(ch);
		for(int index =0; index < str.length(); index++) {
			if(str.charAt(index)==ch)
			count++;
		}
		System.out.println("Frequency of Requested character " + ch + " is - " + count);
	}
	
	public static void main(String[] args) {
		CharacterFrequency characterFrequency = new CharacterFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter String");
		String str = scanner.nextLine();
		System.out.println("Please Enter letter whos frequency needs to be find from above String");
		char ch = scanner.next().charAt(0);
		characterFrequency.charFrequency(str, ch);
	}
}
