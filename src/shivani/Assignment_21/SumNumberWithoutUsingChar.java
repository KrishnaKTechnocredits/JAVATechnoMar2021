package shivani.Assignment_21;
/*Assignment 21: 
Program 02- WAP to sum all the numbers in given string without using Character class.
Input: J7yu9y8h1h8j4b7j3jjb6
Output: Sum of all digits in String is: 53 */

public class SumNumberWithoutUsingChar {

	void countAll(String str) {
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {

				sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));

			}
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {

		SumNumberWithoutUsingChar sumNumber = new SumNumberWithoutUsingChar();

		sumNumber.countAll("J7yu9y8h1h8j4b7j3jjb6");
       }
}
