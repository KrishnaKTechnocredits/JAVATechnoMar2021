package prachi.Assignment_20;

/*2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

public class SumOfDigitsInString {

	static String input = "J7yu9y8h1h8j4b7j3jjb6";

	static void strDigitSum(String str) {
		int strDigitSum=0;
		for(int index=0; index<str.length(); index++) {
			char ch= str.charAt(index);
			if(Character.isDigit(ch))
				strDigitSum= strDigitSum+ Character.getNumericValue(ch);
		}
		System.out.println("Sum of all the digits present in string: " +input+ " = "+strDigitSum);
	}

	public static void main(String[] args) {
		SumOfDigitsInString.strDigitSum(input);
	}
}
