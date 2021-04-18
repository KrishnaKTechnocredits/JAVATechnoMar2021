package krishna;

import java.util.Scanner;

/*
Program 1: Write a method which will return "Techno" if Uppercase character count is higher than Lowercase character count, otherwise return "Credits". Print output in main method.
Input: TeCHnoSessionS
Output: Credits
*/
public class UpperLowerCase {
	static int uppercase = 0;
	static int lowercase = 0;

	void caseCount(String word) {
		for (int index = 0; index < word.length(); index++) {
			if (Character.isUpperCase(word.charAt(index))) {
				uppercase++;
			} else {
				lowercase++;
			}
		}
	}

	public static void main(String[] args) {
		UpperLowerCase upperLowerCase = new UpperLowerCase();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word :");
		String word = scanner.next();
		
		upperLowerCase.caseCount(word);
		if (uppercase > lowercase) {
			System.out.println("Output: Techno");
		} else {
			System.out.println("Output: Credits");
		}
	}
}
