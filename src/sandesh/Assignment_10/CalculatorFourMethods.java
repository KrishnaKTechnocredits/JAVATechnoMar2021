/*Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.
*/

package sandesh.Assignment_10;

import java.util.Scanner;

public class CalculatorFourMethods {

	int getAddition(int num1, int num2) {
		return num1 + num2;
	}
	
	int getSubtraction(int num1, int num2) {
		return num1 - num2;
	}
	
	int getDivision(int num1, int num2) {
		return num1 / num2;
	}
	
	int getMultiplication(int num1, int num2) {
		return num1 * num2;
	}
	
	void printTotalAnswer(int additionResult, int subtractionResult, int divisionResult, int multiplicationResult) {
		System.out.println("The Result from Calculator is displayed below -: ");
		System.out.print("Addition of 2 numbers is -: " + additionResult);
		System.out.println();
		System.out.print("Subtraction of 2 numbers is -: " + subtractionResult);
		System.out.println();
		System.out.print("Division of 2 numbers is -: " + divisionResult);
		System.out.println();
		System.out.print("Multiplication of 2 numbers is -: " + multiplicationResult);
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter 2 numbers on which you want to perform mathematical calculations");
		System.out.println("Enter First number -: ");
		int num1 = sc1.nextInt();
		System.out.println("Enter Second number -: ");
		int num2 = sc1.nextInt();
		int additionResult = new CalculatorFourMethods().getAddition(num1, num2);
		int subtractionResult = new CalculatorFourMethods().getSubtraction(num1, num2);
		int divisionResult = new CalculatorFourMethods().getDivision(num1, num2);
		int multiplicationResult = new CalculatorFourMethods().getMultiplication(num1, num2);
		new CalculatorFourMethods().printTotalAnswer(additionResult, subtractionResult, divisionResult, multiplicationResult);
		sc1.close();
		
	}
}
