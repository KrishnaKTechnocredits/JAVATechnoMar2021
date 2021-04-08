/*Assignment_10
 * Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.
 */
package ashish_Vyas;

public class Calculator {
	//1st Method for Addition of two int
	int addition(int x, int y) {
		int z= x+y;
		return z;
	}
	
	//2nd Method for subtraction of two int
	int subtraction(int x, int y) {
		int z= x-y;
		return z;
	}
		
	//3rd Method for division of two int
	int division(int x, int y) {
		int z= x/y;
		return z;	
	}	

	//4rh Method for division of two int
		int multiplication(int x, int y) {
			int z= x*y;
			return z;	
		}

	// Method for division of two int
	void printTotalAnswer(int sumReturn, int subReturn, int divReturn, int mulReturn) {
		int total =sumReturn + subReturn + divReturn + mulReturn;
		System.out.println("TotalAnswer : "+total);
	}

	public static void main(String[] arg) {
		Calculator calculator =new Calculator();
		int sumReturn = calculator.addition(5,5);
		int subReturn = calculator.subtraction(20, 10);
		int divReturn = calculator.division(100,10);
		int mulReturn = calculator.multiplication(5, 2);
		calculator.printTotalAnswer(sumReturn, subReturn, divReturn, mulReturn);
	}
}
