/*Assignment - 29 : 27th April'2021

Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)*/

package simmi.assignment_29;

import java.util.Scanner;

public class DesiredOutput {

	String sum(String str) {
		int oddSum = 0;
		String upper = "";
		String lower = "";
		int evenSum = 0;
		String output = "";

		for (int index = 0; index < str.length(); index++) {
			int index1 = 0;
			if (Character.isDigit(str.charAt(index))) {
				output = output + str.charAt(index);
				index1 = index + 1;
				while (index1 < str.length() && Character.isDigit(str.charAt(index1))) {
					output = output + str.charAt(index1);
					index++;
					index1++;

				}
				if (Integer.parseInt(output) % 2 == 0) {
					evenSum = evenSum + Integer.parseInt(output);
					output = "";

				} else {
					oddSum = oddSum + Integer.parseInt(output);
					output = "";
				}
			}

			else if (Character.isUpperCase(str.charAt(index))) {
				upper = upper + str.charAt(index);

			} else if (Character.isLowerCase(str.charAt(index))) {
				lower = lower + str.charAt(index);

			}
		}
		String message = oddSum + upper + lower + evenSum;
		return message;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String to check");
		String output = scanner.next();
		DesiredOutput desiredOutput = new DesiredOutput();
		String msg = desiredOutput.sum(output);
		System.out.println("The output is " + msg);
		scanner.close();

	}
}
