/* Java Assignment-10 : 3rd April 2021
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.*/

package ashtha.Assignment10;

public class Calculator {

	int addTwoNumber(int num1, int num2) {
		int addition = num1+num2;
		return addition;		
	}
	
	int substractTwoNumber(int num1,int num2) {
		int substraction = num1-num2;
		return substraction;
	}
	
	int multiplyTwoNumber(int num1, int num2) {
		int multiplication = num1*num2;
		return multiplication;
	}
	
	int divideTwoNumber(int num1, int num2) {
		int division = num1/num2;
		return division;
	}
	
	void printTotalAnswer (int num1,int num2, int num3,int num4) {
		int totalAnswer = num1+num2+num3+num4;
		System.out.println("Total answer is : "+totalAnswer);
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int addedValue = calculator.addTwoNumber(5,5);
		int substractedValue = calculator.substractTwoNumber(20,10);
		int multipliedValue = calculator.multiplyTwoNumber(2,5);
		int divisionValue = calculator.divideTwoNumber(20,2);
		calculator.printTotalAnswer(addedValue, substractedValue, multipliedValue, divisionValue);
	}
}
