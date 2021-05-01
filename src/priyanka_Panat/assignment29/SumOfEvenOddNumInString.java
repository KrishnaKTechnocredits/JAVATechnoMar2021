/*
	 Assignment - 29 : 27th April'2021

	Write the program to generate output in below format.
	-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
	input : F12TT45ERT5cc56de111
	output : 161FTTERTccde68

	Hint : (45+5+111)FTTERTccde(12+56)
	 */

package priyanka_Panat.assignment29;

import java.util.Scanner;

public class SumOfEvenOddNumInString {

	String printSumOfString(String str) {
		int evenSum = 0;
		int oddSum = 0;
		String capitalLtr = "";
		String smallLtr = "";
		String temp = "";
		int num = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				capitalLtr += ch;
			} else if (Character.isLowerCase(ch)) {
				smallLtr += ch;
			}
			if (Character.isDigit(ch)) {
				temp += ch;
			} else {
				if (!temp.equals("")) {
					num = Integer.parseInt(temp);
					if (num % 2 == 0) {
						evenSum += num;
					} else {
						oddSum += num;
					}
					temp = "";

				}
			}

		}
		if (!temp.equals("")) {
			num = Integer.parseInt(temp);
			if (num % 2 == 0) {
				evenSum += num;
			} else {
				oddSum += num;

			}

		}
		return oddSum + capitalLtr + smallLtr + evenSum;
	}

	public static void main(String[] args) {
		SumOfEvenOddNumInString stringSum = new SumOfEvenOddNumInString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		String result = stringSum.printSumOfString(str);
		System.out.println("Output is : " + result);
		sc.close();
	}
}
