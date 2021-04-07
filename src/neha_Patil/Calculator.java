package neha_Patil;

public class Calculator {
	int addition(int num1, int num2) {
		int add = num1+ num2;
		return add;
	}

	int substraction(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}

	int multiplication(int num1, int num2) {
		int multi =num1 * num2;
		return multi;
	}

	int division(int num1, int num2) {
		int div = num1 / num2;
		return div;
	}

	void printTotalAnswer(int add, int sub, int mul, int div) {
		int total = add +sub + mul + div;
		System.out.println("Sum  is: " + total );
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.addition(2, 8);
		calculator.substraction(12, 6);
		calculator.multiplication(2, 5);
		calculator.division(10, 2);
		calculator.printTotalAnswer(calculator.addition(2, 8), calculator.substraction(12, 6), calculator.multiplication(2, 5),
				calculator.division(10, 2));
	}

}
