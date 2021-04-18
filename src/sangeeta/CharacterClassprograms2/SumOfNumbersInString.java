/* WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

package sangeeta.CharacterClassprograms2;

import java.util.Scanner;

public class SumOfNumbersInString {
	
	void addnumbersInString(String str) {
		int sum = 0;
		int num = 0;
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch))
				sum = sum + Character.getNumericValue(ch);
		}
			System.out.println("Sum of all digits in a string is "+sum);
	}
	
	public static void main(String[] a) {
		SumOfNumbersInString sumOfNumbersInString = new SumOfNumbersInString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string ");
		String str = scanner.next();
		sumOfNumbersInString.addnumbersInString(str);
	}

}
