/*
 * Assignment - 14 : 8th April'2021

Calculator
 */


package neha_Rathi.assignment14;

import java.util.Scanner;

public class CalculatorUsingScanner {

	int add(int num1,int num2) {
		return (num1+num2);
	}

	int sub(int num1,int num2) {
		return (num1-num2);
	}

	int div(int num1,int num2) {
		return (num1/num2);
	}

	int mul(int num1,int num2) {
		return (num1*num2);
	}
	
	public static void main(String[] args) {
		CalculatorUsingScanner calculatorUsingScanner = new CalculatorUsingScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First no");
		int num1 =scanner.nextInt();
		System.out.println("Enter Second no");
		int num2 =scanner.nextInt();
		int resAdd=calculatorUsingScanner.add(num1, num2);
		System.out.println("Addition of no is: "+resAdd);
		int resSub=calculatorUsingScanner.sub(num1, num2);
		System.out.println("Subtraction of no is: "+resSub);
		int resDiv=calculatorUsingScanner.div(num1, num2);
		System.out.println("Division of no is: "+resDiv);
		int resMul=calculatorUsingScanner.mul(num1, num2);
		System.out.println("Multiplication of no is: "+resMul);
	}

}
