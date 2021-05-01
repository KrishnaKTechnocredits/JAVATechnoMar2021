/*Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)*/

package sangeeta.StringArrayPrograms;

import java.util.Scanner;

public class Assignment29 {
	String lowerCase = "";
	String upperCase = "";
	int evensum = 0;
	int oddsum = 0;
	String digit = "";

	void getString(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else {
				sumOfDigit();
			}
			if (Character.isLetter(ch)) {
				getLetter(ch);
			}
		}
		if (digit != "") {
			sumOfDigit();
		}
	}

	void sumOfDigit() {
		if (digit != "") {
			int num = Integer.parseInt(digit);
			if (num % 2 == 0) {
				evensum = evensum + num;
			} else
				oddsum = oddsum + num;
		}
		digit = "";
	}

	void getLetter(char ch) {

		if (Character.isLetter(ch)) {
			if (Character.isUpperCase(ch))
				upperCase = upperCase + (ch);
			else if (Character.isLowerCase(ch))
				lowerCase = lowerCase + (ch);
		}
	}

	void display() {
		System.out.println("output is :" + oddsum + upperCase + lowerCase + evensum);

	}

	public static void main(String[] a) {
		Assignment29 assignment29 = new Assignment29();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string ");
		String str = scanner.next();
		assignment29.getString(str);
		assignment29.display();
	}
}
