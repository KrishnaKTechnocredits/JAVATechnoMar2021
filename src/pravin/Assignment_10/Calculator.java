/*Assignment no 10
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

package pravin.Assignment_10;

class Calculator{

	int add(int x,int y){
		int z = x+y;
		return z;
	}	

	int sub(int x, int y){
		int z=x-y;
		return z;
	}

	int div(int x,int y){
		int z=x/y;
		return z;
	}

	int  multiplication(int x,int y){
		int z=x*y;
		return z;
	}
	void printTotal(int sum,int sub,int div,int mult) {
		int TotalAnswer = sum + sub + div + mult;
		System.out.println("TotalAnswer is= "+TotalAnswer);
	}
	public static void main (String[] arg ){

		Calculator calculator= new Calculator();

		int sum = calculator.add(10,30);
		int sub = calculator.sub(50,48);
		int div = calculator.div(20,10);
		int mult = calculator.multiplication(10,20);
		calculator.printTotal(sum, sub, div, mult);
	}
}
