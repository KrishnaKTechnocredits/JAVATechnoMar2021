package prachi.Assignment_10;

/*Java Assignment-10 : 3rd April 2021
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.


Can't play...communication between 2 classes...**part2 recording video
And Return type recordings....is anyone facing same issue??
Bhushan Shende, Today at 14:42*/


public class Calculator {

	int a;
	int b;
	int c;

	int add(int a, int b) {
		c = a+b;
		return c;
	}

	int sub(int a, int b) {
		c= a-b;
		return c;
	}

	int mul(int a, int b) {
		c= a*b;
		return c;
	}

	int div(int a, int  b) {
		c=a/b;
		return c;
	}

	void printTotalAnswer(int addResult, int subResult, int mulResult, int divResult) {
		int total = addResult+subResult+mulResult+divResult;
		System.out.println("Total of all calculator operation results is: "+total);
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int addResult = cal.add(30,10); //40
		int subResult = cal.sub(40,20); //20
		int mulResult = cal.mul(5,2);   //10
		int divResult = cal.div(20,2);  //10
		cal.printTotalAnswer(addResult, subResult, mulResult, divResult); //80
	}
}
