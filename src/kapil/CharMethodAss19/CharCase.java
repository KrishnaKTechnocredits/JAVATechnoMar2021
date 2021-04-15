/*----------------------------------------------------
Assignment 19: 14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits
---------------------------------------------------------------------
Assignment 20: 14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53

------------------------------------------------------------------------
Assignment 21: 14th April'2021
Assignment 20 (both program) without using Character class method.
*/

package kapil.CharMethod;

public class CharCase {

	void getCaseCount(String str) {
		int countUpperCase = 0;
		int countLowerCase = 0;
		int length = str.length();
		for (int index = 0; index < length; index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch))
				countUpperCase++;
			else
				countLowerCase++;
		}
		if (countUpperCase > countLowerCase)
            System.out.println("Techno");
		else
			System.out.println("Credits");
	}

	public static void main(String[] args) {
		CharCase charcase = new CharCase();
		String str = "TeCHnoSessionS";
		charcase.getCaseCount("str");
	}
}
