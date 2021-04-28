package anubhav.StringOperations;

/*
WAP to do sum of all the integer from the given string:-
		Input: String str = "12h14i4w8sdc15"
		Output: 12+14+4+8+15 = 53
 */

public class SumOfAllNumbersInAString {

	void sumOfNumbers(String input) {

		int sumNumbers = 0;
		int sumDigits = 0;
		int strsNumber = 0;
		int strNumber = 0;

		for (int index = 1; index < input.length(); index++) {
			String str = "";
			if (Character.isDigit(input.charAt(index - 1)) && Character.isDigit(input.charAt(index))) {
				str = str + input.charAt(index - 1) + input.charAt(index);
				strNumber = Integer.parseInt(str);
				sumNumbers = sumNumbers + strNumber;
			}
		}
		for (int digitIndex = 1; digitIndex < input.length(); digitIndex++) {
			String str1 = "";
			if (Character.isDigit(input.charAt(digitIndex)) && Character.isLetter(input.charAt(digitIndex - 1))
					&& Character.isLetter(input.charAt(digitIndex + 1))) {
				str1 = str1 + input.charAt(digitIndex);
				strsNumber = Integer.parseInt(str1);
				sumDigits = sumDigits + strsNumber;
			}
		}
		System.out.println(sumDigits + sumNumbers + " is the sum of numbers in the string. ");
	}

	public static void main(String[] args) {
		SumOfAllNumbersInAString sumOfAllNumbersInAString = new SumOfAllNumbersInAString();
		sumOfAllNumbersInAString.sumOfNumbers("12h14i4w8sdc15");
	}
}
