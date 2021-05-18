package shivani.Assignment_29;

import java.util.Scanner;

/*Write a program to genrate output in below format
sum of all odd number +captital letter +small letter+sum of all even number
input: F12TT45ERT5cc56de111
output: 161FTTERTccde68*/
public class StringOp {
	String temp = "0";
	int oddSum = 0;
	String capsLetter = "";
	String smallLetter = "";
	int evenSum = 0;
	int num = 0;
	String output = "";

	void retrunFoamattedString(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
				num = Integer.parseInt(temp);
			} else {
				if (num % 2 == 0) {
					evenSum = evenSum + num;
				} else {
					oddSum = oddSum + num;
				}
				num = 0;
				temp = "0";

				if (Character.isLetter(ch)) {

					if (Character.isUpperCase(ch)) {
						capsLetter = capsLetter + ch;
					} else if (Character.isLowerCase(ch)) {
						smallLetter = smallLetter + ch;
					}
				}
			}

		}
		if (num % 2 == 0) {
			evenSum = evenSum + num;
		} else {
			oddSum = oddSum + num;
		}
		output = oddSum + capsLetter + smallLetter + evenSum;
		System.out.println("Sum " + output);
	}

	public static void main(String[] args) {
		StringOp stringOp = new StringOp();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String:");
		String input = scanner.next();
		stringOp.retrunFoamattedString(input);
	}

}
