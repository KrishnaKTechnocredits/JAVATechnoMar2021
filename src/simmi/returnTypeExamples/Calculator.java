/*Java Assignment-10 : 3rd April 2021
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.*/


package simmi.returnTypeExamples;

public class Calculator {
	
	int add(int firstNumber, int secondNumber) {
		int sumAnswer = firstNumber + secondNumber;
		return sumAnswer;
	}
	
	int subtraction(int firstNumber, int secondNumber) {
		int subAnswer = firstNumber - secondNumber;
		return subAnswer;
	}
	
	int division(int firstNumber, int secondNumber) {
		int divisionAnswer = firstNumber/secondNumber;
		return divisionAnswer;
	}
	
	int multiplication(int firstNumber, int secondNumber) {
	int	multiplicationAnswer = firstNumber * secondNumber;
		return multiplicationAnswer;
	}

	
	void printTotalAnswer(int sumAnswer, int subAnswer, int divisionAnswer, int	multiplicationAnswer ) {
		int totalAnswer = sumAnswer + subAnswer + divisionAnswer + multiplicationAnswer;
		System.out.println("The total answer of the operation performed is : " + totalAnswer );
	}
	
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int sumAnswer = calculator.add(10,20);
		int subAnswer = calculator.subtraction(10,20);
		int divisionAnswer = calculator.division(0,20);
		int multiplicationAnswer = calculator.multiplication(10,20);
		
		calculator.printTotalAnswer(sumAnswer,subAnswer, divisionAnswer,multiplicationAnswer);
	}

}
