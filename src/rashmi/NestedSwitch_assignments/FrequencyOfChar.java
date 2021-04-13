/*
Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e


output : e -> 2*/

package rashmi.NestedSwitch_assignments;

import java.util.Scanner;

public class FrequencyOfChar {

	int count;

	void charCnt(String str, char targetChar) {
		str = str.toUpperCase();
		targetChar = Character.toUpperCase(targetChar);

		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == targetChar) {
				count++;
			}
		}
			System.out.println("frequency of character " + targetChar + " from string " + str + " is " + count);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FrequencyOfChar frequencyOfChar = new FrequencyOfChar();
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		System.out.println("Enter the character you are looking for:");
		String chToCheck = sc.next();
		char targetChar = chToCheck.charAt(0);
		frequencyOfChar.charCnt(str, targetChar);
		sc.close();

	}

}
