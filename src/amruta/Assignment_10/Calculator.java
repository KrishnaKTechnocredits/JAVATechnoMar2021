/*
 * Java Assignment-10 : 3rd April 2021
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.
 */

package amruta.Assignment_10;

public class Calculator {
	int addition(int num1, int num2) {
		return num1+num2;
	}
	int subtraction(int num1,int num2) {
		return num1-num2;
	}
	int division(int num1,int num2) {
		return num1/num2;
	}
	int multiplication(int num1,int num2) {
		return num1*num2;
	}
	int printTotalAnswer(int add,int sub, int div, int mul) {
		System.out.println("Addition : num1+num2 = " +add);
		System.out.println("\nSubstraction : num1-num2 = " +sub);
		System.out.println("\nDivision : num1/num2 = " +div);
		System.out.println("\nMultiplication : num1+num2 = " +mul);
		
		int addAllMethods = add + sub + div + mul;
		
		System.out.println("\nAddition Of All Methods = " +addAllMethods);
		return 0;
	}
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		//calculator.add(40,20);
		//calculator.subtraction(40,30);
		//calculator.division(10,2);
		//calculator.multiplication(8,8);
		calculator.printTotalAnswer(calculator.addition(40,20), calculator.subtraction(40,30), calculator.division(10,2), calculator.multiplication(8,8));
	}
}
