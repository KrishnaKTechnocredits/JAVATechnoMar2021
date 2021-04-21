/*
 2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
 */

package upasana.assignment_20;

import java.util.Scanner;

public class SumWithCharacterClassMethod {
	int sum = 0;

	void sumCal(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				sum =sum+Character.getNumericValue(str.charAt(index));
		}
		System.out.println("Sum of all digits in String "+str +" is: "+sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input");
		new SumWithCharacterClassMethod().sumCal(scanner.next());
		scanner.close();
	}
}
