package rashmi.Scanner_Assignments;

import java.util.Scanner;

public class CalculatorScanner {

	int add(int num1, int num2) {
		return num1 + num2;
	}

	int sub(int num1, int num2) {
		return num1 - num2;
	}

	int mul(int num1, int num2) {
		return num1 * num2;
	}

	int div(int num1, int num2) {
		if (num2 >= 0) {
			return num1 / num2;
		} else {
			System.out.println("number cannot be divided by 0...");
			return 0;
		}
	}

	void printTotalAnswer(int addAns, int subAns, int mulAns, int divAns) {
		int total = addAns + subAns + mulAns + divAns;
		System.out.println("Total answer : " + total);
	}

	public static void main(String[] args) {

		CalculatorScanner calculatorScanner = new CalculatorScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first  number :");
		int a1 = scanner.nextInt();
		System.out.println("Enter second  number :");
		int a2 = scanner.nextInt();
		int addAns = calculatorScanner.add(a1, a2);
		int subAns = calculatorScanner.sub(a1, a2);
		int mulAns = calculatorScanner.mul(a1, a2);
		int divAns = calculatorScanner.div(a1, a2);
		calculatorScanner.printTotalAnswer(addAns, subAns, mulAns, divAns);
		scanner.close();

	}

}
