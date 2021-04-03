/*Java Assignment-10 : 3rd April 2021
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and does not return anything.
Note : do not create any instance variable.
*/

package rupali.Assignment10;

public class Calculator {
	
	int addition(int x,int y) {
		return x+y;
	}
	
	int subtraction(int x,int y) {
		return x-y;
	}
	
	int multiplication(int x,int y) {
		return x*y;
	}

	int division(int x,int y) {
		return x/y;
	}
	
	void printResultAnswer(int p,int q,int r,int s) {
		System.out.println("The total is "+ (p+q+r+s));
	}
	
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		int a,b,c,d;
		a=calculator.addition(10, 20);
		b=calculator.subtraction(25, 7);
		c=calculator.multiplication(5, 7);
		d=calculator.division(50, 10);
		calculator.printResultAnswer(a, b, c, d);
	}

}
