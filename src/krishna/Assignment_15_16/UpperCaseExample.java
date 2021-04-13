package krishna.Assignment_15_16;
import java.util.Scanner;
/*
 Assignment - 16: 9th April'2021
Find the frequency of character from a given String array.
Note: Take String and character from the user.
Input : “technocredits”
char : e
output : e -> 2
 */

public class UpperCaseExample {
	void gitCharFrequesncy(String str, char targetchar) {
		int frequency = 0;
		int length = str.length();

		for (int i = 0; i < length; i++) {
			if (str.charAt(i) == targetchar) {
				frequency++;
			}
		}
		System.out.println("Frequency of " + targetchar + " is " + frequency + " in " + str);
	}

	public static void main(String[] args) {
		UpperCaseExample upperCaseExample = new UpperCaseExample();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word :");
		String str = scanner.next();
		System.out.println("Enter the character :");
		char targetchar = scanner.next().charAt(0);
		upperCaseExample.gitCharFrequesncy(str, targetchar);
	}
}
