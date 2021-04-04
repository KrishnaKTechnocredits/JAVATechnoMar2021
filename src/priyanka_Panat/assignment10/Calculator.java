package priyanka_Panat.assignment10;

/*
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


public class Calculator {
	int add(int num1,int num2){
		return num1+num2;
	}
	
	int sub(int num1,int num2){
		return num1-num2;
	}
	
	int mul(int num1,int num2){
		return num1*num2;
	}
	
	int div(int num1,int num2){
		return num1/num2;
	}
	
	void printTotalAnswer(int addTotal,int subTotal,int mulTotal,int divTotal){
		int total=addTotal+subTotal+mulTotal+divTotal;
		System.out.println("Total of all operations is : " + total);
	}
	
	public static void main(String[] args){
		Calculator calculator=new Calculator();
		int addT=calculator.add(10,20);
		int subT=calculator.sub(9,5);
		int mulT=calculator.mul(10,6);
		int divT=calculator.div(40,20);
		calculator.printTotalAnswer(addT,subT,mulT,divT);
	}
}
	

