package shivani.shivani_Assignment_10;

/*Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.
actually I was expecting to print only single value - addAnswer + subAnswer + divAnswer + mulAnswer*/
public class Calculator {

	int add(int n1, int n2) {
		return n1 + n2;
	}

	int subtraction(int s1, int s2) {
		return s1 - s2;
	}

	int multiplication(int m1, int m2) {
		return m1 * m2;
	}

	int division(int d1, int d2) {
		return d1 / d2;
	}

	void printTotalAnswer(int sum, int sub, int mul, int div) {

		System.out.println(" value is : " +sum+sub+mul+div);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int addResult = calculator.add(5, 3);
		int subResult = calculator.subtraction(10, 3);
		int mulResult = calculator.multiplication(5, 5);
		int divResult = calculator.division(5, 25);
		calculator.printTotalAnswer(addResult, subResult, mulResult, divResult);
	}
}
