package shashank.assignment_6_11;

public class Calculator {
	int addition(int num1, int num2) {
		int add = 0;
		add = num1 + num2;
		return add;
	}

	int subtraction(int num1, int num2) {
		int subtraction = 0;
		subtraction = num1 - num2;
		return subtraction;
	}

	int multiplication(int num1, int num2) {
		int multiplication = 0;
		multiplication = num1 * num2;
		return multiplication;
	}

	int division(int num1, int num2) {
		int division = 0;
		division = num1 / num2;
		return division;
	}

	void printTotalAnswer(int addition, int subtraction, int multiplication, int division) {
		System.out.println("Addition of numbers is " + addition);
		System.out.println("Subtraction of numbers is " + subtraction);
		System.out.println("Multiplication of numbers is " + multiplication);
		System.out.println("Division of numbers is " + division);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		int num1 = 100, num2 = 20;
		int add = calculator.addition(num1, num2);
		int subtraction = calculator.subtraction(num1, num2);
		int multiplication = calculator.multiplication(num1, num2);
		int division = calculator.division(num1, num2);
		calculator.printTotalAnswer(add, subtraction, multiplication, division);
	}

}
