/*Write a Calculator(Addition, Subtraction, Division, Multiplication) with Scanner*/

package sourabh.scannerExamples;

import java.util.Scanner;

public class Calculator {
	void addition(int firstNumber, int secondNumber) {		
		System.out.println("Addition : "+(firstNumber+secondNumber));	
	}
	void subtraction(int firstNumber, int secondNumber) {		
		System.out.println("Subtraction : "+(firstNumber-secondNumber));	
	}
	void division(double firstNumber, double secondNumber) {		
		System.out.println("Division : "+(firstNumber/secondNumber));	
	}
	void Multiplication(int firstNumber, int secondNumber) {		
		System.out.println("Multiplication : "+(firstNumber*secondNumber));	
	}
	public static void main(String[] args) {
		Calculator calculator= new Calculator();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter first number : ");
		int firstNumber=scanner.nextInt();
		System.out.println("Enter second number : ");
		int secondNumber= scanner.nextInt();
		calculator.addition(firstNumber,secondNumber);
		calculator.subtraction(firstNumber, secondNumber);
		calculator.division(firstNumber, secondNumber);
		calculator.Multiplication(firstNumber, secondNumber);
	}
}
