/*
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

package ami.Assignment_10;

public class Calculator {
	int add(int num1, int num2) {
		return num1 + num2;
	}

	int subtraction(int num1, int num2) {
		return num1 - num2;
	}

	int division(int num1, int num2) {
		return num1 / num2;
	}

	int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	void printTotalAnswer(int addSum, int subSum, int divSum, int mulSum) {
		int total = addSum + subSum + divSum + mulSum;
		System.out.println("sum of all methods output: " + total);
	}

	public static void main(String[] a) {
		Calculator calculator = new Calculator();
		int x = calculator.add(50, 40);
		int y = calculator.subtraction(50, 40);
		int z = calculator.division(30, 15);
		int q = calculator.multiplication(12, 10);
		calculator.printTotalAnswer(x, y, z, q);

	}

}
