/*Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e

output : e -> 2*/

package kapil.Scanner;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		CharCount charcount = new CharCount();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter word : ");
		String str = scanner.next();
		System.out.println("Word : " + str);
		System.out.println("Enter character for count : ");
		String input = scanner.next();
		char targetChar = input.charAt(0);
		System.out.println("Target character  : " + targetChar);
		{
			int count = 0;
			int length = str.length();
			for (int index = 0; index < str.length(); index++) {
				if (str.charAt(index) == targetChar)
					count++;
			}
			System.out.println("Target character count :" + count);
		}
	}
}
