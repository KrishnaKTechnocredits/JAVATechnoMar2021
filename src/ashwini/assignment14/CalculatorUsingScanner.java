package ashwini.assignment14;
//Program 2:  Calculator program using Scanner class.

import java.util.Scanner;

public class CalculatorUsingScanner {
	
	int addition(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("Additon is : "+sum);
		return sum;
	}
	int subtraction(int num1, int num2) {
		int sub = num1-num2;
		System.out.println("subtraction is : "+sub);
		return sub;
	}
	double division(double num1,double num2) {
		double div =(num1/num2);
		System.out.println("Division is : "+div);
		return div;
	}
	int multiplication(int num1, int num2) {
		int mul = num1*num2;
		System.out.println("Multiplication is : "+mul);
		return mul;
	}

	public static void main(String[] args) {
		CalculatorUsingScanner calculatorUsingScanner = new CalculatorUsingScanner();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number :");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number :");
		int num2 = sc.nextInt();
		calculatorUsingScanner.addition(num1, num2);
		calculatorUsingScanner.subtraction(num1, num2);
		calculatorUsingScanner.division(num1, num2);
		calculatorUsingScanner.multiplication(num1, num2);

	}

}
