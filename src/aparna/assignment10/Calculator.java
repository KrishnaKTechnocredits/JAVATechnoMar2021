/*Java Assignment-10 : 3rd April 2021
Write a class called calculator with following functionality.
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

package aparna.assignment10;

public class Calculator {

	int addition(int number1, int number2) {
		int additonResult = number1 + number2;
		System.out.println("Addition  of " + number1 + " and  " + number2 + "  is : " + additonResult);
		return additonResult;
	}

	int subtraction(int number1, int number2) {

		int subtractionResult = number1 - number2;
		System.out.println("Subtraction of " + number1 + " and  " + number2 + "  is : " + subtractionResult);
		return subtractionResult;
	}

	int multiplication(int number1, int number2) {
		int multiplicationResult = number1 * number2;
		System.out.println("Multiplication of " + number1 + " and  " + number2 + "  is : " + multiplicationResult);
		return multiplicationResult;
	}

	int division(int number1, int number2) {
		int divisionResult = number1 / number2;
		System.out.println("Division of " + number1 + " and  " + number2 + "  is : " + divisionResult);
		return divisionResult;
	}

	void printTotalAnswer(int sumAnswer, int sumSubtraction, int sumMultiplication, int sumDivision) {
		int totalResult = sumAnswer + sumSubtraction + sumMultiplication + sumDivision;
		System.out.println("The total Summation of all the above operation is : " + totalResult);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int sumAnswer = calculator.addition(2, 2);
		int sumSubtraction = calculator.subtraction(4, 2);
		int sumMultiplication = calculator.multiplication(4, 2);
		int sumDivision = calculator.division(10, 5);

		calculator.printTotalAnswer(sumAnswer, sumSubtraction, sumMultiplication, sumDivision);
	}

}
