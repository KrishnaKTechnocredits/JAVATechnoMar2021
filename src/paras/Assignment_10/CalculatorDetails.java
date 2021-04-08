/*3rd April'2021

Java Assignment - 10 : 3rd April 2021
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.
*/

package paras.Assignment_10;

public class CalculatorDetails {

	int addition(int num1, int num2){
		int add = num1 + num2;
		return add;
	}
	
	int subtraction(int num1, int num2){
		int sub = num1 - num2;
		return sub;
	}
	
	int division(int num1, int num2){
		int  div = num1 / num2;
		return div;
	}
	
	int multiplication(int num1, int num2){
		int mul = num1 * num2;
		return mul;
	}
	
	void printTotalAnswer(int addAnswer, int subAnswer, int divAnswer, int mulAnswer){
		int total = addAnswer + subAnswer + divAnswer + mulAnswer;
		System.out.println("Total Answer is - " + total);
	}
	
	public static void main(String[] args){
		CalculatorDetails calculatordetails = new CalculatorDetails();
		int addAnswer = calculatordetails.addition(5,2);
		int subAnswer = calculatordetails.subtraction(10,8);
		int divAnswer = calculatordetails.division(10,5);
		int mulAnswer = calculatordetails.multiplication(5,2);
		calculatordetails.printTotalAnswer(addAnswer, subAnswer, divAnswer, mulAnswer);
	}
}