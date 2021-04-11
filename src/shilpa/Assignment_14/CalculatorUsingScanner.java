//Assignment_14     8th April 2021
//Calculator program using Scanner class.

package shilpa.Assignment_14;

import java.util.Scanner;

public class CalculatorUsingScanner {
	int calc;

	void addition(int num1, int num2) {

		System.out.println("Addition - " + (num1 + num2));
	}

	void substract(int num1, int num2) {
		System.out.println("Substraction - " + (num1 - num2));
	}

	void multiplication(int num1, int num2) {
		int multi;
		if (num2 == 0) {
			multi = 0;
			System.out.println("Multiplication - " + multi);
		} else {
			multi = num1 * num2;
			System.out.println("Multiplication - " + multi);
		}
	}

	void division(int num1, int num2) {
		int div;
		if (num2 == 0)
			System.out.println("Cannot divide by 0");
		else {
			div = num1 / num2;
			System.out.println("Division - " + div);
		}
	}

	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		CalculatorUsingScanner cal = new CalculatorUsingScanner();
		System.out.println("Enter any two numbers:-");

		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		cal.addition(input1, input2);
		cal.substract(input1, input2);
		cal.multiplication(input1, input2);
		cal.division(input1, input2);
		scanner.close();
	}
}
