package shivani.Assignment_14;

import java.util.Scanner;

import shivani.shivani_Assignment_10.Calculator;

/* Using Scanner class
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.
actually I was expecting to print only single value - addAnswer + subAnswer + divAnswer + mulAnswer*/
public class Calculator_Scanner {
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

		System.out.println(" value is : " + sum + sub + mul + div);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Calculator_Scanner calculator1 = new Calculator_Scanner();

		System.out.println("enetr two number to perform addition");

		int add1 = scanner.nextInt();
		int add2 = scanner.nextInt();

		int addResult = calculator1.add(add1, add2);

		System.out.println("enetr two number to perform subtarction");
		int sub1 = scanner.nextInt();
		int sub2 = scanner.nextInt();

		int subResult = calculator1.subtraction(sub1, sub2);
		System.out.println("enter two number to perform multiplication ");
		int mul1 = scanner.nextInt();
		int mul2 = scanner.nextInt();

		int mulResult = calculator1.multiplication(mul1, mul2);
		System.out.println("enetr two number two perform in division");
		int div1 = scanner.nextInt();
		int div2 = scanner.nextInt();
		int divResult = calculator1.division(div1, div2);
		calculator1.printTotalAnswer(addResult, subResult, mulResult, divResult);

	}

}
