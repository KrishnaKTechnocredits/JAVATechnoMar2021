package madhavi_Raut.Assignment_10;
/*Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.*/
public class Calculator {
	
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
		System.out.println("Total value is: " +(additionValue+subtractionValue+divisionValue+multiplicationValue));
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int additionValue = calculator.addition(10, 5);
		int subtractionValue = calculator.subtraction(10, 5);
		int divisionValue = calculator.division(10, 5);
		int multiplicationValue = calculator.multiplication(10, 5);
		calculator.printTotalAnswer(additionValue, subtractionValue, divisionValue, multiplicationValue);
	}
}
