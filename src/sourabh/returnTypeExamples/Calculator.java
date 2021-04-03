package sourabh.returnTypeExamples;

public class Calculator {
	int add(int firstNumber, int secondNumber) {
		return firstNumber+secondNumber;
	}
	int subtraction(int firstNumber, int secondNumber) {
		return firstNumber-secondNumber;
	}
	int division(int firstNumber, int secondNumber) {
		return firstNumber/secondNumber;
	}
	int multiplication(int firstNumber, int secondNumber) {
		return firstNumber*secondNumber;
	}
	void printTotalAnswer(int add, int subtraction, int division, int multiplication) {
		int totalAnswer= add+ subtraction+ division+ multiplication;
		System.out.println(totalAnswer);
	}
	public static void main(String[] args) {
		Calculator calculator =new Calculator();
		int add= calculator.add(10, 20);
		int subtraction= calculator.subtraction(20, 10);
		int division= calculator.division(10, 5);
		int multiplication= calculator.multiplication(2, 2);
		calculator.printTotalAnswer(add, subtraction, division, multiplication);
	}
}
