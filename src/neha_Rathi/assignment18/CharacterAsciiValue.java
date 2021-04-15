//Program 2:  Write a method which will return character of given Ascii value.

package neha_Rathi.assignment18;

import java.util.Scanner;

	public class CharacterAsciiValue {
		char getAsciiOfChar(int num) {
		return (char) num;
	}

	public static void main(String[] args) {
		CharacterAsciiValue characterAsciiValue = new CharacterAsciiValue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ASCII value for character:");
		int num = sc.nextInt();
		System.out.println("Character for ASCII value " + num + " is " + characterAsciiValue.getAsciiOfChar(num));
	}
}
