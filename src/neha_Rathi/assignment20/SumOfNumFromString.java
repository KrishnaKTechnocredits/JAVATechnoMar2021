////Assignment 20
//2) WAP to sum all the numbers in given string.
//Input: J7yu9y8h1h8j4b7j3jjb6
//Ouput: Sum of all digits in String is: 53

package neha_Rathi.assignment20;

public class SumOfNumFromString {

	void sumNum(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + (Character.getNumericValue(ch));
			}
		}
		System.out.println("Sum of all digits in String is: " + sum);
	}

	public static void main(String[] args) {
		SumOfNumFromString sumOfNumFromString = new SumOfNumFromString();
		String input = "J7yu9y8h1h8j4b7j3jjb6";
		sumOfNumFromString.sumNum(input);
	}
}
