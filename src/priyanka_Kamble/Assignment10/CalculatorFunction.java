package priyanka_Kamble.Assignment10;

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
Note : do not create any instance variable

 */
public class CalculatorFunction {
	
	int add(int num1, int num2) {
		return num1+num2;
	}
	int subtraction(int num1,int num2) {
		return num1-num2;
	}
	int division(int num1,int num2) {
		return num1/num2;
	}
	int multiplication(int num1,int num2) {
		return num1*num2;
	}
	int printTotalAnswer(int addition,int substaction, int division, int multiplication) {
		System.out.println("---------- Output for Assignment 10 ---------");
		System.out.println("\t Output of  add() method is " +addition);
		System.out.println("\t Output of  substraction() method is " +substaction);
		System.out.println("\t Output of  division() method is " +division);
		System.out.println("\t Output of  multiplication() method is " +multiplication);
		int addAllMethods = addition + substaction +division + multiplication;
		System.out.println(" Addition Of All Methods = " +addAllMethods);
		return 0;
	}
	public static void main(String[] args) {
		CalculatorFunction cal = new CalculatorFunction();
		//cal.add(10,20);
		//cal.subtraction(40,30);
		//cal.division(50, 5);
		//cal.multiplication(10,2);
		cal.printTotalAnswer(cal.add(10, 20), cal.subtraction(40,30), cal.division(50, 5), cal.multiplication(10,2));
		
	}
}
