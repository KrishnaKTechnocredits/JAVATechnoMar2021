/*
 2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53

 */

package ami.Assignment_20;

public class SumDigit {
	int sum;

	int sumStringreturn(String str) {
		char ch = ' ';
		int num = 0;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (ch >= 48 && ch <= 57) {
				num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumDigit sumDigit = new SumDigit();
		String str = "J7yu9y8h1h8j4b7j3jjb6";
		int totalSum = sumDigit.sumStringreturn(str);
		System.out.println("Total Sum: " + totalSum);
	}

}
