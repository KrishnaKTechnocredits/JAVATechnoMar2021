/**3rd April'2021*

*Java Assignment-10 : 3rd April 2021*
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.*/



package krati_Jain.Assignment10;

public class CalculatorAssignment10 {
	
	int add(int addNum1, int addNum2) {
		int addResult = addNum1 + addNum2;
		return addResult;
		
	}
	int subtraction(int subNum1, int subNum2) {
		int subResult = subNum1 - subNum2;
		return subResult;
		
	}
	int division(int divNum1, int divNum2) {
		
		int divResult = divNum1%divNum2;
		return divResult;
		
	}
	int multiplication(int mulNum1, int mulNum2) {
		
		
		int mulResult = mulNum1 * mulNum2;
		return mulResult;
	}
	void printTotalAnswer(int additionResult, int substractionResult, int divisionResult, int multiResult) {
		System.out.println("Add Answer = " + additionResult + ", Sub Answer = " + substractionResult + ", Division Answer = " + divisionResult + ", Multiplication Answer = " + multiResult);
		
	}
	
	public static void main(String[] args) {
		CalculatorAssignment10 calculatorAssignment10 = new CalculatorAssignment10();
		int additionResult = calculatorAssignment10.add(4, 10);
		int substractionResult = calculatorAssignment10.subtraction(10, 8);
		int divisionResult = calculatorAssignment10.division(60, 15);
		int multiResult = calculatorAssignment10.multiplication(4, 10);
		calculatorAssignment10.printTotalAnswer(additionResult, substractionResult, divisionResult, multiResult);
	}
	

}
