/*Program 2:  Write a method which will return character of given Ascii value.*/

package rahul_Hiremath.assignment_18;

import java.util.Scanner;

public class Ass_18_2 {

	char getAsciiOfChar(int asciiValue) {
		char ch = (char) asciiValue;
		return ch;
	}

	public static void main(String[] args) {

		Ass_18_2 ass_18_2 = new Ass_18_2();
		System.out.println("Please enter number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		char ch = ass_18_2.getAsciiOfChar(num);
		System.out.println(ch + " ASCII value is " + num);
		scanner.close();
	}
}
