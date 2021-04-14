/*Assignment - 16 : 9th April'2021
Find the frequency of character from a given String array.
Note: Take String and character from the user.
Input : technocredits
char : e
output : e -> 2
*/
package neha_Rathi.assignment16;

import java.util.Scanner;

public class FrequencyChar {
	int cnt = 0;

	void calculateFreq(String input, String input1) {
		char ch = input1.charAt(0);
		for (int index = 0; index < input.length(); index++) {
			if (ch == input.charAt(index))
				cnt++;
		}
		System.out.println("Count of character "+ ch +" is "+cnt+" in "+input);
	}

	public static void main(String[] args) {
		FrequencyChar frequencyChar = new FrequencyChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
		String input = sc.nextLine();
		System.out.println("Enter character");
		String input1 = sc.nextLine();
		frequencyChar.calculateFreq(input, input1);
	}
}
