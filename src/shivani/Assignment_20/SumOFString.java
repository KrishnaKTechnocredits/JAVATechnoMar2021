package shivani.Assignment_20;
/*2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

public class SumOFString {

	void countAll(String str) {
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				sum = sum + Character.getNumericValue(str.charAt(i));

		}
		System.out.println("Sum of all digit is :"+ sum);
	}

	public static void main(String[] args) {

		SumOFString sumOFString = new SumOFString();
		sumOFString.countAll("J7yu9y8h1h8j4b7j3jjb6");

	}
}