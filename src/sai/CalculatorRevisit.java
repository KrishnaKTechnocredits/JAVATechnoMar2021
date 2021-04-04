package sai;

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

class CalculatorRevisit{
	
	int add(int x, int y){
		return x+y;
	}
	
	int sub(int x, int y){
		return x-y;
	}
	
	int mul(int x, int y){
		return x*y;
	}
	
	int div(int x, int y){
		return x/y;
	}
	
	void printTotalAnswer(int add, int sub, int mul, int div){
		System.out.println("Sum of all the operations is " + add  + "+" + sub + "+" + mul + "+" +  div + "=" + (add+sub+mul+div));
	}
	
	public static void main (String[] args){
		
	CalculatorRevisit calculator = new CalculatorRevisit();
	calculator.add(20,10);
	calculator.sub(20,10);
	calculator.mul(20,10);
	calculator.div(20,10);	
	calculator.printTotalAnswer(calculator.add(20,10), calculator.sub(20,10), calculator.mul(20,10), calculator.div(20,10));
	}
}
