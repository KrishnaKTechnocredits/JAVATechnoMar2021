/*
 3rd April'2021

Java Assignment-10 : 3rd April 2021
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

package ankit.assignment_10;

public class MathFunctionReturnEx {
	
	int add(int num1, int num2) {
	int sum = num1+num2;
	System.out.println(sum);
	return sum;
	}
	int subtraction(int num1, int num2) {
		int sub = num1-num2;
		System.out.println(sub);
		return sub;	
	}
	double division(double num1, double num2) {
		double div = (num1/num2); // for division value I am getting value in decimal so I intentionally used double data type for division
		System.out.println(div);
		return div;
	}
	int multiplication(int num1, int num2) {
		int mul = num1+num2;
		System.out.println(mul);
		return mul;
	}
	void printTotalAnswer(int sum, int sub, double div, int mul) {
		double total = sum + sub + div + mul;
		System.out.println("Sum of All functions returns : "+total);
	}

	public static void main(String[] args) {
		MathFunctionReturnEx mathFunctionReturnEx = new MathFunctionReturnEx();
		int sum = mathFunctionReturnEx.add(5, 6);
		int sub = mathFunctionReturnEx.subtraction(5, 6); 
		double div = mathFunctionReturnEx.division(5, 10);
		int mul = mathFunctionReturnEx.multiplication(7, 8);
		System.out.println("****OUTPUT****");
		mathFunctionReturnEx.printTotalAnswer(sum, sub, div, mul);

	}

}


