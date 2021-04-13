package dhanshri.Assignment_14;

import java.util.Scanner;

public class Calculator {

	int add(int a, int b) {
		int c = a + b;
		return c;
	}

	int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	int div(int a, int b) {
		int c = a / b;
		return c;
	}

	int multiplication(int a, int b) {
		int c = a * b;
		return c;
	}

	void printTotal(int sum, int sub, int div, int mult) {
		int Total = sum + sub + div + mult;
		System.out.println("Total is = " + Total);
	}

	public static void main(String[] arg) {

		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input");
		int input = scanner.nextInt();
		int input1 = scanner.nextInt();
		scanner.close();
		int sumAns = calculator.add(input, input1);
		int subAns = calculator.sub(input, input1);
		int divAns = calculator.div(input, input1);
		int multiAns = calculator.multiplication(input, input1);
		calculator.printTotal(sumAns, subAns, divAns, multiAns);
	}
}
