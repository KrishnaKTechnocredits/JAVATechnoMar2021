package ashtha.Assignment14;

import java.util.Scanner;

public class Calculator {
	
	double answer;
	
	void calculation (String operation, double number1, double number2 ) {
		operation = operation.toUpperCase();
		switch (operation) {
			case "ADD": 
				answer = number1+number2;
				System.out.println("Addition of the numbers = "+answer);
				break;
			case "SUBSTRACT":
				answer = number1-number2;
				System.out.println("Subraction of the numbers = "+answer);
				break;
			case "MULTIPLY":
				answer = number1*number2;
				System.out.println("Multiplication of the numbers = "+answer);
				break;
			case "DIVIDE":
				answer = number1/number2;
				System.out.println("Division of the numbers = "+answer);
				break;
			default : 
				System.out.println("Please select a valid operation");
		}
	}
				
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the operation to perform : ");
		System.out.println("- Enter Add for addition");
		System.out.println("- Enter Substract for substraction");
		System.out.println("- Enter Multiply for multiplication");
		System.out.println("- Enter Divide for division");
		String selection = scanner.nextLine();
		System.out.println("Please enter two numbers to perform "+selection+" operation");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		if (num2 == 0) {
			System.out.println("cannot divide by zero. Enter number2 again");
			num2 = scanner.nextDouble();
		}
		calculator.calculation(selection,num1,num2);
	}	
}
