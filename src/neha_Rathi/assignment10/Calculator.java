package neha_Rathi.assignment10;

public class Calculator {

	int add(int num1, int num2) {
		return (num1 + num2);
	}

	int sub(int num1, int num2) {
		return (num1 - num2);
	}

	int mul(int num1, int num2) {
		return (num1 * num2);
	}

	int div(int num1, int num2) {
		return (num1 / num2);
	}

	void printTotalAnswer(int resAdd, int resSub, int resMul, int resDiv) {
		System.out.println("Sum of all operations is: " + resAdd + " + " + resSub + " + " + resMul + " + " + resDiv
				+ " = " + (resAdd + resSub + resMul + resDiv));
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(2, 8);
		calculator.sub(8, 6);
		calculator.mul(2, 9);
		calculator.div(10, 2);
		calculator.printTotalAnswer(calculator.add(2, 8), calculator.sub(8, 6), calculator.mul(2, 9),
				calculator.div(10, 2));
	}
}
