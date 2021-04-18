package kangan.assignments.assignment10;

public class Calculator {

	int add(int x, int y) {
		int z=x+y;
		return z;
	}
	int subtraction(int x, int y) {
		int z=x-y;
		return z;
	}
	int division(int x, int y) {
		int z=x*y;
		return z;
	}
	int multiplication(int x, int y) {
		int z=x/y;
		return z;
	}
	void printTotalAnswer(int add, int subtraction, int division, int multiplication) {
		int total = add+subtraction+division+multiplication;
		System.out.println(total);
	}
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int add = calculator.add(10,30);
		int sub = calculator.subtraction(30,10);
		int div = calculator.division(30,10);
		int mul = calculator.multiplication(30,10);
		
		calculator.printTotalAnswer(add, sub, div, mul);
		
	}
}
