//2) WAP to sum all the numbers in given string.

package kapil.CharMethodAssi21;

import kapil.CharMethodAssi20.SumDigits;

public class SumDigit1 {

	void getSumDigit1(String str) {
		int sum = 0;
		int length = str.length();
		for (int index = 0; index < length; index++) {
			char ch = str.charAt(index);
			if (ch >= 48 && ch <= 57)
				sum = sum + (Character.getNumericValue(ch));
		}
		{
			System.out.println("Sum of digits : " + sum);
		}
	}

	public static void main(String[] args) {
		SumDigit1 sumdigit1 = new SumDigit1();
		sumdigit1.getSumDigit1("J7yu9y8h1h8j4b7j3jjb6");
	}
}

	

