package meenu.assignment_16;

/*Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e
*/

import java.util.Scanner;

public class CharFrequency {
	
	int getFrequencyOfChar(String word, char ch) {
		int frequency = 0;
		for (int index = 0; index < word.length(); index++) {
			if (ch == word.charAt(index))
				frequency++;
		}
		return frequency;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String : ");
		String word = scanner.next();
		System.out.print("Enter character : ");
		String character = scanner.next();
		char ch = character.charAt(0);
		CharFrequency charFrequency = new CharFrequency();
		System.out.println("Frequency of "+ch+" in "+word+" is : "+(charFrequency.getFrequencyOfChar(word,ch)));
	}

}

	