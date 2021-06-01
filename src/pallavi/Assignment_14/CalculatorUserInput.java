package pallavi.Assignment_14;

import java.util.Scanner;

public class CalculatorUserInput {
	

	void add(double a , double b) {
		double add= a+b;
		System.out.println("Sum of two no is :" +add );
		}
	
	void sub(double a , double b) {
		double sub= a-b;
		System.out.println("Sub of two no is :" +sub );
	}
	
	void mul(double a , double b) {
		double mul= a*b;
		System.out.println("Mul of two no is :" +mul );
	}
	
	void div(double a , double b) {
		double div= a/b;
		System.out.println("Div of two no is : " + div);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		double firstNumber= sc.nextDouble();
		System.out.println("Enter Second number:");
		double secondNumber= sc.nextInt();
		CalculatorUserInput calculatorUserInput = new CalculatorUserInput();
		calculatorUserInput.add(firstNumber,secondNumber);
		calculatorUserInput.sub(firstNumber, secondNumber);
		calculatorUserInput.mul(firstNumber, secondNumber);
		calculatorUserInput.div(firstNumber, secondNumber);
	}

}
