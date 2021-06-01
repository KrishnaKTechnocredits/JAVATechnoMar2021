package vaibhav.Assignment_14;

import java.util.Scanner;

public class CalculatorByScannerClass {

	void addition(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Addition  of     " + num1 + "  &  " + num2 + "  is   ===> " + sum);
		System.out.println("=========================================================");
	}

	void subtraction(int num1, int num2) {
		int sub;
		if (num1 == num2) {
			sub = 0;
			System.out.println("Subtraction  of     " + num1 + "  &  " + num2 + "  is   ===>"+  sub);
			System.out.println("=========================================================");
		} else if (num1 > num2) {
			sub = num1 - num2;
			System.out.println("Subtraction    of " + num1 + " & " + num2 + " is " + sub);
			System.out.println("=========================================================");
		} else {
			sub = num2 - num1;
			System.out.println("Subtraction    of " + num1 + " & " + num2 + " is " + sub);
			System.out.println("=========================================================");
		}

	}

	void multiplication(int num1, int num2) {
		int mul = num1 * num2;
		System.out.println("Multiplication    of " + num1 + " & " + num2 + " is " + mul);
		System.out.println("=========================================================");
	}
	
	void division(int num1, int num2) {
		int div;
		div = num1 / num2;
		System.out.println("Division       of " + num1 + " & " + num2 + " is " + div);
	}

	public static void main(String[] args) {
		CalculatorByScannerClass calculatorByScannerClass = new CalculatorByScannerClass();
		System.out.println("Please enter two numbers for addition : ");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		calculatorByScannerClass.addition(num1, num2);

		System.out.println("Please enter two numbers for subtraction : ");
		calculatorByScannerClass.subtraction(scanner.nextInt(), scanner.nextInt());

		System.out.println("Please enter two numbers for multiplication : ");
		calculatorByScannerClass.multiplication(scanner.nextInt(), scanner.nextInt());
		
		System.out.println("Please enter two numbers for division : ");
		calculatorByScannerClass.division(scanner.nextInt(), scanner.nextInt());
		
		scanner.close();
	}

}
