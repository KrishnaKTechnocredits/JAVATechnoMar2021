package neha_Rathi.assignment10;

public class Calculator {

	long add(int num1, int num2) {
		return (num1 + num2);
	}

	long sub(int num1, int num2) {
		return (num1 - num2);
	}

	double mul(double num1, double num2) {
		return (num1 * num2);
	}

	double div(double num1, double num2) {
		if(num2==0) {
			return 0;
		}
		return (num1 / num2);
	}

	void printTotalAnswer(long resAdd, long resSub, double resMul, double resDiv) {
		System.out.println("Sum of all operations is: " + resAdd + " + " + resSub + " + " + resMul + " + " + resDiv
				+ " = " + (resAdd + resSub + resMul + resDiv));
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(2, 8);
		calculator.sub(8, 6);
		calculator.mul(2.5d, 9);
		calculator.div(10, 4);
		calculator.printTotalAnswer(calculator.add(2, 8), calculator.sub(8, 6), calculator.mul(2.5d, 9),
				calculator.div(10, 2));
	}
}
