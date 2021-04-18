/*Program 1:  Write a method which will return ascii value of given character.*/

package rahul_Hiremath.assignment_18;

import java.util.Scanner;

public class Ass_18_1 {

	int getAsciiOfChar(char ch) {
		int temp = ch;
		return temp;
	}

	public static void main(String[] args) {
		Ass_18_1 ass_18_1 = new Ass_18_1();
		System.out.println("Please enter a character");
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);
		int asciiValue = ass_18_1.getAsciiOfChar(ch);
		System.out.println("Ascii value of " + ch + " is " + asciiValue);
		scanner.close();
	}
}
