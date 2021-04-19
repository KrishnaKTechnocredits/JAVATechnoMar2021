package madhavi_Raut.Assignment_20_21;

/*Assignment 21: 
 Program 02- WAP to sum all the numbers in given string without using Character class.
Input: J7yu9y8h1h8j4b7j3jjb6
Output: Sum of all digits in String is: 53 */

public class FindSum {

	void findSumOfDigitsInString(String str) {
		int sumOfDigits = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch >= 48 && ch <= 57)
				sumOfDigits += Integer.parseInt(String.valueOf(str.charAt(index)));
		}
		System.out.println("Sum of all digits in String is: " + sumOfDigits);
	}

	public static void main(String[] args) {
		new FindSum().findSumOfDigitsInString("J7yu9y8h1h8j4b7j3jjb6");
	}
}
