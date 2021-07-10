package gauravk.Assignment_16;

import java.util.Scanner;

/*
 * After Lecture - 10th_April_Session-20_Array_Part2 Assignment - 16 : 9th April'2021
Find the frequency of character from a given String array.
Note: Take String and character from the user.
Input : technocredits
char : e
output : e -> 2
 */
public class FrequencyOfCharacterInString {
		
	int countingFrequencyOfCharacter(String word, char t) {
		int counter=0;
		for(int index=0; index<word.length(); index++) {
			if(Character.valueOf(word.charAt(index)).equals(t))
				counter++;
		}
		return counter;
	}
	
	public static void main(String[] a) {
		FrequencyOfCharacterInString frequencyOfCharacterInString1 = new FrequencyOfCharacterInString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string.");
		String s = sc.next();
		System.out.println("Enter a character to find its frquency.");
		char ch = sc.next().charAt(0);
		int targetCounter = frequencyOfCharacterInString1.countingFrequencyOfCharacter(s, ch);
		System.out.println("Presence of "+ch+" in word "+s+" is "+targetCounter);
	}

}