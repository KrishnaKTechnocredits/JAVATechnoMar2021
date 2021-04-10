/*Write below code Using scanner class. 
 
Java Assignment-14 : 3rd April 2021
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.*/

package simmi.assignment_14;

import java.util.Scanner;

public class Calculator {
	
	void add(int num1, int num2){
		System.out.println("Addition of two numbers is " + (num1 + num2));
	}
	
	void subtraction(int num1, int num2) {
		System.out.println("Subtraction of two numbers is " + (num1 - num2));
	}
	
	void multiplication(int num1, int num2) {
		System.out.println("Multiplication of two numbers is " + (num1 * num2));
	}
	
	void division(int num1, int num2) {
		System.out.println("Division of two numbers is " + (num1 / num2));
	}
	
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers to perform the operation");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		calculator.add(num1, num2);
		calculator.subtraction(num1, num2);
		calculator.division(num1, num2);
		calculator.multiplication(num1, num2);
		
	}

}
