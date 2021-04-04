package pallavi.Assignment_10;

public class CalculatorWithReturnType {

	public static void main(String[] args) {

		CalculatorWithReturnType calculatorWithReturnType = new CalculatorWithReturnType();
		int addValue = calculatorWithReturnType.addition(50, 10);
		int subValue = calculatorWithReturnType.subtraction(30, 10);
		int mulVal = calculatorWithReturnType.multiplication(30, 2);
		int divValue = calculatorWithReturnType.division(80, 20);
		calculatorWithReturnType.printTotalAnswer(addValue, subValue, mulVal, divValue);

	}

	int addition(int num1, int num2) {
		return num1 + num2;
	}

	int subtraction(int num1, int num2) {
		return num1 - num2;
	}

	int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	int division(int num1, int num2) {
		return num1 / num2;
	}

	void printTotalAnswer(int add, int sub, int mul, int div) {
		int total = add + sub + mul + div;
		System.out.println("Total value is : " + total);
	}
}
