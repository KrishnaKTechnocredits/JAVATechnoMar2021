//Assignment 21
//2) WAP to sum all the numbers in given string.
//Input: J7yu9y8h1h8j4b7j3jjb6
//Ouput: Sum of all digits in String is: 53

package neha_Rathi.assignment21;

public class SumOfNumInString {

	void sumNumString(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch >= 48 && ch <= 57) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of all digits in String is: "+sum);
	}

	public static void main(String[] args) {
		SumOfNumInString sumOfNumInString = new SumOfNumInString();
		String input = "J7yu9y8h1h8j4b7j3jjb6";
		sumOfNumInString.sumNumString(input);
	}
}
