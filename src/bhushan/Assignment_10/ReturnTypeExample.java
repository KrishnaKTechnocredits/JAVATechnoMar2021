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

package bhushan.Assignment_10;

public class ReturnTypeExample {

	int add(int x, int y) {
		int addAns = x + y;
		return addAns;
	}

	int sub(int x, int y) {
		int subAns = x - y;
		return subAns;
	}

	int mul(int x, int y) {
		int mulAns = x * y;
		return mulAns;
	}

	int div(int x, int y) {
		int divAns = x / y;
		return divAns;
	}

	void printTotalAnswer(int addAns, int subAns, int mulAns, int divAns) {

		int totalSumofFourMethods = addAns + subAns + mulAns + divAns;
		System.out.println("Addition of Return Values from Four Methods is: " + totalSumofFourMethods);

	}

	public static void main(String[] args) {
		ReturnTypeExample c1 = new ReturnTypeExample();
		int addAnswer = c1.add(5, 5);
		int subAnswer = c1.sub(25, 8);
		int mulAnswer = c1.mul(10, 6);
		int divanswer = c1.div(50, 5);
		c1.printTotalAnswer(addAnswer, subAnswer, mulAnswer, divanswer);

	}

}
