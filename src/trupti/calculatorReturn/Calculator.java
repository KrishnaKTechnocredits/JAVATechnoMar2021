package trupti.calculatorReturn;
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

public class Calculator {
	int add(int x,int y) {
		return x+y;
	}
	
	int subtraction(int x,int y) {
		return x-y;
	}
	
	int division(int x,int y) {
		return x/y;
	}
	
	int multiplication(int x,int y) {
		return x*y;
	}
	
	void printTotalAnswer(int addAnswer,int subtractionAnswer,int divisionAnswer,int multiplicationAnswer) {
		int totalAnswer=addAnswer+subtractionAnswer+divisionAnswer+multiplicationAnswer;
		System.out.println("Total answer is : "+totalAnswer);
	}
	
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		int x=calculator.add(10,2);
		int y=calculator.subtraction(20, 14);
		int z=calculator.division(9, 3);
		int a=calculator.multiplication(12, 12);
		calculator.printTotalAnswer(x, y, z, a);
		
		

	}

}
