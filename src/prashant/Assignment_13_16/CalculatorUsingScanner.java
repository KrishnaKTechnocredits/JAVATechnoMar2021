//Program -2 Calculator Programme using Scanner Class
package prashant.Assignment_13_16;

import java.util.Scanner;

public class CalculatorUsingScanner {
	int add(int x, int y) {
		int addition = x + y;
		return addition;
	}

	int sub(int x, int y) {
		int substraction = x - y;
		return substraction;
	}

	int division(int x, int y) {
		int div = x / y;
		return div;
	}

	int multiplication(int x, int y) {
		int mul = x * y;
		return mul;
	}

	void PrintTotalAns(int addoutput, int suboutput, int divoutput, int muloutput) {
		int total = addoutput + suboutput + divoutput + muloutput;
		System.out.print("Total of Add,Sub,Div.and Multiplication is -: " + total);
	}

	public static void main(String[] arg) {
		CalculatorUsingScanner calculator = new CalculatorUsingScanner();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		String Number1 = sc.nextLine();
		int number1 = Integer.parseInt(Number1);
		System.out.println("Enter Second number :");
		String Number2 = sc.nextLine();
		int number2 = Integer.parseInt(Number2);
		int add = calculator.add(number1, number2);
		System.out.println("Addition of two numbers is " + add);
		int sub = calculator.sub(number1, number2);
		System.out.println("Substarction of two numbers is " + sub);
		int multiplicate = calculator.multiplication(number1, number2);
		System.out.println("Multiplication of two numbers is " + multiplicate);
		int div = calculator.division(number1, number2);
		System.out.println("Division of two numbers is " + div);
		sc.close();
	}
}
