/* Assignment 14 : Program 2 : 3rd April'2021

Write a class called calculator with following functionality using scanner class.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.
*/

package paras.Assignment_14;

import java.util.Scanner;

public class CalculatorUsingScanner {
	
	void addition(int num1, int num2){
		int add = num1 + num2;
		System.out.println("Addition of " + num1 + " and " + num2 + " is: " + add);
	}
	
	void subtraction(int num1, int num2){
		int sub = num1 - num2;
		System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + sub);
	}
	
	void division(int num1, int num2){
		int  div = num1 / num2;
		System.out.println("Division of " + num1 + " and " + num2 + " is: " + div);
	}
	
	void multiplication(int num1, int num2){
		int mul = num1 * num2;
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + mul);
	}
	
	public static void main(String[] args) {
		CalculatorUsingScanner calculatorUsingScanner = new CalculatorUsingScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Two Number");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		calculatorUsingScanner.addition(number1,number2);
		calculatorUsingScanner.subtraction(number1,number2);
		calculatorUsingScanner.division(number1,number2);
		calculatorUsingScanner.multiplication(number1,number2);
	}
	
}
