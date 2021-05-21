/*Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

package ashtha.Assignment20;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class CountCharacters {

	void characterCount(String input) {
		int digitCount = 0;
		int letterCount = 0;
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int specialCharacterCount = 0;
		
		for (int index=0; index<input.length();index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				digitCount++;
			}else if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			}else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}else
				specialCharacterCount++;
		}
		
		letterCount = upperCaseCount+lowerCaseCount;
		System.out.println("Output: ");
		System.out.println("Total digits : "+digitCount);
		System.out.println("Total Letters : "+letterCount);
		System.out.println("Total UpperCase : "+upperCaseCount);
		System.out.println("Total LowerCase : "+lowerCaseCount);
		System.out.println("Total Special Char : "+specialCharacterCount);
	}
	
	public static void main(String[] args) {
		CountCharacters countCharacters = new CountCharacters();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string");
		String inputString = scanner.next();
		countCharacters.characterCount(inputString);
		scanner.close();
	}
}
