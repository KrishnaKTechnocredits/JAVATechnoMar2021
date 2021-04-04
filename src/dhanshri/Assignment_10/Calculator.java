package dhanshri.Assignment_10;

public class Calculator {

	int add(int a, int b) {
		int c = a + b;
		return c;
	}

	int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	int div(int a, int b) {
		int c = a / b;
		return c;
	}

	int multiplication(int a, int b) {
		int c = a * b;
		return c;
	}

	void printTotal(int sum, int sub, int div, int mult) {
		int Total = sum + sub + div + mult;
		System.out.println("Total is = " + Total);
	}

	public static void main(String[] arg) {

		Calculator calculator = new Calculator();
		int sumAns = calculator.add(10, 30);
		int subAns = calculator.sub(50, 48);
		int divAns = calculator.div(20, 10);
		int multiAns = calculator.multiplication(10, 20);
		calculator.printTotal(sumAns, subAns, divAns, multiAns);
	}
}
