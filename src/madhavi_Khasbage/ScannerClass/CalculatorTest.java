package madhavi_Khasbage.ScannerClass;

import java.util.Scanner;

public class CalculatorTest {

	void findResult(char operator, double number1, double number2) {
		double result;
		switch (operator) {
		case '+':
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;

		case '-':
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;

		case '*':
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;

		case '/':
			result = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + result);
			break;

		default:
			System.out.println("Invalid operator!");
			break;
		}
	}

	public static void main(String[] args) {
		CalculatorTest calculatortest1 = new CalculatorTest();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Choose an operator (+, -, *, or /) :");
		String str = scanner.next();
		char operator = str.charAt(0);
		
		System.out.print("Enter first number : ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Enter second number : ");
		double num2 = scanner.nextDouble();

		calculatortest1.findResult(operator,num1,num2);
	}
}
