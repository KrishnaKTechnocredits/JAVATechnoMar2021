/* Coding Exam - 2 : 26th April 2021

	Program 1 : 
	WAP to do sum of all the integer from the given string

	Input: String str = "12h14i4w8sdc15"

	Output: 12+14+4+8+15 = 53
	 */

package priyanka_Panat.coding_exam_2;

import java.util.Scanner;

public class SumOfNumInString {

	int printNum(String str) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				if (index < str.length() - 1 && Character.isDigit(str.charAt(index + 1))) {
					temp += str.charAt(index);
				} else {
					temp += str.charAt(index);
					sum += Integer.parseInt(temp);
					temp = "";
				}

			}

		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfNumInString sumOfNumInString = new SumOfNumInString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.next();
		int output = sumOfNumInString.printNum(str);
		System.out.println("Sum of numbers in a given string is : " + output);
		scanner.close();
	}

}
