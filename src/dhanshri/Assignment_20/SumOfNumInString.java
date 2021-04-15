package dhanshri.Assignment_20;

public class SumOfNumInString {
	void sumNum(String input) {
		int sum = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				sum = sum + Character.getNumericValue(ch);
		}
		System.out.println("Sum of numbers in input string is :" + sum);
	}

	public static void main(String[] args) {
		SumOfNumInString sumOfNumInString = new SumOfNumInString();
		sumOfNumInString.sumNum("J7yu9y8h1h8j4b7j3jjb6c");

	}
}
