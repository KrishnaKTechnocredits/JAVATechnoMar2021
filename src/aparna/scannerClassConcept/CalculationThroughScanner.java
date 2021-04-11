/*Assignment - 14 : 8th April'2021
Use Scanner Class for this Program
Write a class called CalculationThroughScanner with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.
 * 
 */
package aparna.scannerClassConcept;

import java.util.Scanner;

public class CalculationThroughScanner {

	double addition(double number1, double number2) {
		double additonResult = number1 + number2;
		System.out.println("Addition  of " + number1 + " and  " + number2 + "  is : " + additonResult);
		return additonResult;
	}

	double subtraction(double number1, double number2) {
		double subtractionResult = number1 - number2;
		System.out.println("Subtraction of " + number1 + " and  " + number2 + "  is : " + subtractionResult);
		return subtractionResult;
	}

	double multiplication(double number1, double number2) {
		double multiplicationResult = 0;
		if (number1 == 0) {
			multiplicationResult = 0;
			System.out.println("Multiplication of " + number1 + " and  " + number2 + "  is : " + multiplicationResult);

		} else {
			multiplicationResult = number1 * number2;
			System.out.println("Multiplication of " + number1 + " and  " + number2 + "  is : " + multiplicationResult);
		}
		return multiplicationResult;
	}

	double division(double number1, double number2) {
		double divisionResult = 0;
		if (number2 == 0) {
			System.out.println("Cannot divide by 0");
		} else {
			divisionResult = number1 / number2;
			System.out.println("Division of " + number1 + " and  " + number2 + "  is : " + divisionResult);
		}
		return divisionResult;
	}

	void printTotalAnswer(double sumAnswer, double sumSubtraction, double sumMultiplication, double sumDivision) {
		double totalResult = sumAnswer + sumSubtraction + sumMultiplication + sumDivision;
		System.out.println("The total Summation of all the above operation is : " + totalResult);
	}

	public static void main(String[] args) {
		CalculationThroughScanner calculationThroughScanner = new CalculationThroughScanner();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First Number :- ");
		double input1 = scanner.nextDouble();
		System.out.println("Enter Second Number :- ");
		double input2 = scanner.nextDouble();

		double addResult = calculationThroughScanner.addition(input1, input2);
		double subResult = calculationThroughScanner.subtraction(input1, input2);
		double mulResult = calculationThroughScanner.multiplication(input1, input2);
		double divideResult = calculationThroughScanner.division(input1, input2);
		calculationThroughScanner.printTotalAnswer(addResult, subResult, mulResult, divideResult);
		scanner.close();
	}

}
