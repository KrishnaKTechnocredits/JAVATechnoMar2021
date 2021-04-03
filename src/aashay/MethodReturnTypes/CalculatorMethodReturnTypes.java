package aashay.MethodReturnTypes;
/*
 * 3rd April'2021

Java Assignment-10 : 3rd April 2021
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
public class CalculatorMethodReturnTypes{
	
	int add(int num1, int num2) {
		if(num1 >= 0 && num2 >= 0) {
			int num3 = num1+num2;
			return num3;
		}else {
			System.out.println("Enter a valid values");
			return 0;
		}
	}
	int subtraction(int num1, int num2) {
		if(num1  >0 && num2 >= 0) {
			int num3 = num1-num2;
			return num3;
		}else {
			System.out.println("Enter a valid values");
			return 0;
		}
	}
	int division(int num1, int num2) {
		if(num1 > 0 && num2 > 0) {
			int num3 = num1/num2;
			return num3;
		}else {
			System.out.println("Enter a valid values");
			return 0;
		}
	}
	int multiplication(int num1, int num2) {
		if(num1 > 0 && num2 > 0) {
			int num3 = num1*num2;
			return num3;
		}else {
			System.out.println("Enter a valid values");
			return 0;
		}
	}
	void printTotalAnswer(int num1, int num2, int num3, int num4) {
		int totalAnswer = num1+num2+num3+num4;
		 System.out.println("Total Answer is: "+totalAnswer+"\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorMethodReturnTypes calculatorMethodReturnTypes = new CalculatorMethodReturnTypes();
		int addition= calculatorMethodReturnTypes.add(2, 2);
		int subtract = calculatorMethodReturnTypes.subtraction(10, 5);
		int divide  = calculatorMethodReturnTypes.division(10, 5);
		int multiply = calculatorMethodReturnTypes.multiplication(10,2);
		calculatorMethodReturnTypes.printTotalAnswer(addition, subtract, divide, multiply);
		
		addition= calculatorMethodReturnTypes.add(-2, 2);
		subtract = calculatorMethodReturnTypes.subtraction(10,- 5);
		divide  = calculatorMethodReturnTypes.division(0,5);
		multiply = calculatorMethodReturnTypes.multiplication(10,0);
		calculatorMethodReturnTypes.printTotalAnswer(addition, subtract, divide, multiply);
		
		
	}

}
