package madhavi_Raut.Assignment_14;
import java.util.Scanner;
/*Assignment 14_Program 02 Write a class called calculator with following functionality using .
	a. add
	b. subtraction
	c. division
	d. multiplication
	e. printTotalAnswer.

	Method a,b,c,d should have 2 parameters and return int value.
	printTotalAnswer method should have 4 parameters and doesnt return anything.
	Note : do not create any instance variable.*/

public class CalculatorUsingScanner {

	int addition(int num1, int num2) {
		return num1 + num2;
	}

	int subtraction(int num1, int num2) {
		return num1 - num2;
	}

	int division(int num1, int num2) {
		return num1 / num2;
	}

	int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	void printTotalAnswer(int additionValue, int subtractionValue, int divisionValue, int multiplicationValue) {
		System.out.println("Total value is: " + (additionValue + subtractionValue + divisionValue + multiplicationValue));
	}

	public static void main(String[] args) {
		CalculatorUsingScanner calculator = new CalculatorUsingScanner();
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		//Taking user input whether they want to do calculation.
		while (flag) {
			System.out.println("Do you want to do calculation? Please enter yes/y or no/n");
			String input = scanner.nextLine();
			if (input.equals("yes") || input.equals("y")) {
				// Getting two numbers from user.
				System.out.println("Enter first number.");
				int num1 = scanner.nextInt();
				System.out.println("Enter second number.");
				int num2 = scanner.nextInt();
				// Performing addition, subtraction, division, multiplication and printing total
				// of it.
				int additionValue = calculator.addition(num1, num2);
				int subtractionValue = calculator.subtraction(num1, num2);
				int divisionValue = calculator.division(num1, num2);
				int multiplicationValue = calculator.multiplication(num1, num2);
				calculator.printTotalAnswer(additionValue, subtractionValue, divisionValue, multiplicationValue);
			} else if (input.equals("no") || input.equals("n")) {
				System.out.println("Bye!");
				flag = false;
				scanner.close();
			} else
				System.out.println("Incorrect input");
		}
	}
}
