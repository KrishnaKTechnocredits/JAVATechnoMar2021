/* Java Assignment-10 : 3rd April 2021

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

package vaibhav.Assignment_10;

public class Calculator {

	int add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Addition       of " + num1 + " & " + num2 + " is " + sum);
		return sum;
	}

	int multiplication(int num1, int num2) {
		int multiplication = num1 * num2;
		System.out.println("Multiplication of " + num1 + " & " + num2 + " is " + multiplication);
		return multiplication;
	}

	int subtraction(int num1, int num2) {
		int sub;
		if (num1 == num2) {
			System.out.println("Subtraction    of " + num1 + " & " + num2 + " is 0");
			return 0;
		} else if (num1 > num2) {
			sub = num1 - num2;
			System.out.println("Subtraction    of " + num1 + " & " + num2 + " is " + sub);
			return sub;
		} else {
			sub = num2 - num1;
			System.out.println("Subtraction    of " + num1 + " & " + num2 + " is " + sub);
			return sub;
		}

	}

	int division(int num1, int num2) {
		int div;
		div = num1 / num2;
		System.out.println("Division       of " + num1 + " & " + num2 + " is " + div);
		return div;

		/*
		 * if (num1 == num2) { return 1; } 
		 * else if (num1 > num2) { div = num1 / num2;
		 * return div; } 
		 * else if (num2 > num1) { div = num2 / num1;
		 * return div; }
		 */

	}

	void printTotalAnswer(int addAns, int subAns, int mulAns, int divAns) {
		int totalAnswer = addAns + subAns + mulAns + divAns;
		System.out.println("");
		System.out.println("Total answer is : " + totalAnswer);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int addditionAns = calculator.add(10, 20);
		int subtractionAnswer = calculator.subtraction(10, 20);
		int multiplicationAnsweer = calculator.multiplication(5, 6);
		int divisionAnswer = calculator.division(100, 20);

		calculator.printTotalAnswer(addditionAns, subtractionAnswer, multiplicationAnsweer, divisionAnswer);
	}

}
