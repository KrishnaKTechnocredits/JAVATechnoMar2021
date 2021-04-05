/*3rd April'2021

Java Assignment-10 : 3rd April 2021
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.*/

package kapil.Returntype;

public class Calculation {
	
	int  add( int x , int y) {
	    int z = x+y;
		return z;
	}
	int  subs(int x ,int y) {
		int z =x-y;
		return z;
	}
	int div(int x,int y) {
		int z = x/y;
		return z;
	}
	int mul(int x, int y) {
		int z = x*y;
		return z;
	}
	
	void printTotalAnswer(int sumAns,int subsAns,int divAns, int mulAns) {
		int total = (sumAns + subsAns + divAns + mulAns);
		System.out.println(total);
	}
	
	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		int sumAns = calculation.add(10, 20);
		int subsAns= calculation.subs(40, 20);
		int divAns = calculation.div(40, 5);
	    int mulAns = calculation.mul(10, 50);	
	    calculation.printTotalAnswer(sumAns, subsAns, divAns, mulAns);


	}
}
