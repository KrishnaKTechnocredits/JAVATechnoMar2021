//Write a class called calculator with following functionality.
//a. add
//b. subtraction
//c. division
//d. multiplication
//e. printTotalAnswer.
//
//Method a,b,c,d should have 2 parameters and return int value.
//printTotalAnswer method should have 4 parameters and doesnt return anything.
//Note : do not create any instance variable.

package prashant;

public class CalculatorWithReturn {

	int add(int x, int y) {
		int addition = x + y;
		return addition;
	}

	int sub(int x, int y) {
		int substraction = x - y;
		return substraction;
	}

	int division(int x, int y) {
		int div = x / y;
		return div;
	}

	int multiplication(int x, int y) {
		int mul = x * y;
		return mul;
	}

	void PrintTotalAns(int addoutput, int suboutput, int divoutput, int muloutput) {
		int total = addoutput + suboutput + divoutput + muloutput;
		System.out.print("Total of Add,Sub,Div.and Multiplication is -: " + total);
	}

	public static void main(String[] arg) {

		CalculatorWithReturn calculator = new CalculatorWithReturn();

		int add = calculator.add(25, 20);
		int sub = calculator.sub(50, 40);
		int div = calculator.division(16, 8);
		int mul = calculator.multiplication(10, 20);
		calculator.PrintTotalAns(add, sub, div, mul);
	}
}
