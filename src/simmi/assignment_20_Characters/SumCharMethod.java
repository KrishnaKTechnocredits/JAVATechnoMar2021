/*Assignment 20:  14th April'2021

2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

package simmi.assignment_20_Characters;

public class SumCharMethod {
	int sum;
	void sumChar(String str) {
		for(int index = 0; index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) 
				sum = sum + Character.getNumericValue(ch);
		}
		System.out.println("Sum of all digits in String is: "+sum);
	}
	public static void main(String[] args) {
		SumCharMethod sumCharMethod = new SumCharMethod();
		sumCharMethod.sumChar("J7yu9y8h1h8j4b7j3jjb6");
	}
}
