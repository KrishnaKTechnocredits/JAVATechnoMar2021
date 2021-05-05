package shashank_assignment_14;

import java.util.Scanner;

public class CalculatorScanner {
	int addition(int num1, int num2) {
		int add = 0;
		add = num1 + num2;
		return add;
	}

	int subtraction(int num1, int num2) {
		int subtraction = 0;
		subtraction = num1 - num2;
		return subtraction;
	}

	int multiplication(int num1, int num2) {
		int multiplication = 0;
		multiplication = num1 * num2;
		return multiplication;
	}

	int division(int num1, int num2) {
		int division = 0;
		division = num1 / num2;
		return division;
	}

	void printTotalAnswer(int addition, int subtraction, int multiplication, int division) {
		System.out.println("Addition of numbers is " + addition);
		System.out.println("Subtraction of numbers is " + subtraction);
		System.out.println("Multiplication of numbers is " + multiplication);
		System.out.println("Division of numbers is " + division);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorScanner calculatorScanner = new CalculatorScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 2 numbers:- ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int add = calculatorScanner.addition(num1, num2);
		int subtraction = calculatorScanner.subtraction(num1, num2);
		int multiplication = calculatorScanner.multiplication(num1, num2);
		int division = calculatorScanner.division(num1, num2);
		calculatorScanner.printTotalAnswer(add, subtraction, multiplication, division);
		scanner.close();
	}

}
