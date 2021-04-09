package komal.assignment_14;

import java.util.Scanner;

public class CalculatorWithScanner {
	
	int add(int num1, int num2) {
		int sum = num1+num2;
		System.out.println("Summation : "+sum);
		return sum;
	}
	int subtraction(int num1, int num2) {
		int sub = num1-num2;
		System.out.println("subtraction : "+sub);
		return sub;
	}
	int division(int num1,int num2) {
		int div =(num1/num2);
		System.out.println("Division : "+div);
		return div;
	}
	int multiplication(int num1, int num2) {
		int mul = num1+num2;
		System.out.println("Multiplication : "+mul);
		return mul;
	}
	public static void main(String[] args){
		CalculatorWithScanner calculatorWithScanner = new CalculatorWithScanner();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number :");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number :");
		int num2 = sc.nextInt();
		calculatorWithScanner.add(num1, num2);
		calculatorWithScanner.subtraction(num1, num2);
		calculatorWithScanner.division(num1, num2);
		calculatorWithScanner.multiplication(num1, num2);

	}
}
