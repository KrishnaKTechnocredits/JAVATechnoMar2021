package gauravk.Assignment_10;

import java.util.Scanner;

/*
 * Java Assignment-10 : 3rd April 2021
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
public class CalculatorWithoutInstanceVar {
	
	int add(int n1, int n2) {
		return n1+n2;
	}
	
	int substraction(int n1, int n2) {
		return n1-n2;
	}
	
	int division(int n1, int n2) {
		return n1/n2;
	}
	
	int multiplication(int n1, int n2) {
		return n1*n2;
	}
	
	void printTotalAnswer(int a, int b, int c, int d) {
		System.out.println("Answers: "+"Addition = "+a+", Substration = "+b+", Division = "+c+", Multiplication = "+d);
		System.out.print("Total of all answers is: "+(a+b+c+d));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		CalculatorWithoutInstanceVar calculator1 = new CalculatorWithoutInstanceVar();
		int addAns = calculator1.add(num1, num2);
		int subAns = calculator1.substraction(num1, num2);
		int divAns = calculator1.division(num1, num2);
		int multAns = calculator1.multiplication(num1, num2);
		calculator1.printTotalAnswer(addAns, subAns, divAns, multAns);
	}

}