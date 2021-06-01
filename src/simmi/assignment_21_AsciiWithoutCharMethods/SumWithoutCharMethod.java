/*Assignment 21:  14th April'2021
WAP to print the below statement without character method.

2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

package simmi.assignment_21_AsciiWithoutCharMethods;

public class SumWithoutCharMethod {
	int sum;
	void sumCharacter(String str) {
		for(int index =0; index<str.length();index++) {
			char ch = str.charAt(index);
			if(ch >= 48 && ch<=57)
				sum = sum+(ch-48);
		}
		System.out.println("Sum of all digits in String is: "+sum);
	}
public static void main(String[] args) {
	SumWithoutCharMethod sumVar = new SumWithoutCharMethod();
	sumVar.sumCharacter("J7yu9y8h1h8j4b7j3jjb6");
}
}
