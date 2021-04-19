package sai.Assignment14;

import java.util.Scanner;

public class CalculatorScanner {

	void add(int x, int y) {
		System.out.println("Addition is " + (x+y));
	}

	void sub(int x, int y) {
		System.out.println("Substraction is " + (x-y));
	}

	void mul(int x, int y) {
		System.out.println("Multiplication is " + (x*y));
	}

	void div(int x, int y) {
		System.out.println("Division is " + (x/y));
	}
	
	public static void main (String[] args){
	
	Scanner scanner = new Scanner(System.in);
	CalculatorScanner calculatorScanner = new CalculatorScanner();
	System.out.println("Enter first number");
	int num1 = scanner.nextInt();
	System.out.println("Enter second number");
	int num2 = scanner.nextInt();
	calculatorScanner.add(num1,num2);
	calculatorScanner.sub(num1,num2);
	calculatorScanner.mul(num1,num2);
	calculatorScanner.div(num1,num2);
	scanner.close();
	}
}
