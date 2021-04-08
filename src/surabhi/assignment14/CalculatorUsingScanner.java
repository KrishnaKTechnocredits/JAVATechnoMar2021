package surabhi.assignment14;

import java.util.Scanner;
/*
 * Assignment 14: Calculator using user input (using scanner Class)
 * */

public class CalculatorUsingScanner {

	void add(int num1, int num2) {
		System.out.println("Addition of two number is :" +(num1+num2)); 
	}

	void sub(int num1, int num2) {
		int sub;
		if(num1>num2) {
			sub=num1-num2;
		}else {
			sub=num2-num1;
		}
		System.out.println("Subtraction of two number is :"+sub);
	}

	void mul(int num1, int num2) {
		System.out.println("Multiplication of two number is :"+ (num1*num2));
	}

	void div(int num1, int num2) {
		System.out.println("Division of two number is :"+((double) num1/num2));
	}
	
	
	public static void main(String[] args) {
		int num1,num2;

		// TODO Auto-generated method stub
		CalculatorUsingScanner calculatorUsingScanner =new CalculatorUsingScanner();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers for addition :");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		if(num1<0||num2<0) {
			System.out.println("Negative numbers entered");
		} else {
			 calculatorUsingScanner.add(num1, num2);
		}
		
		System.out.println("Enter two numbers for Subtraction :");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		if(num1<0||num2<0) {
			System.out.println("Negative numbers entered");
		} else {
			 calculatorUsingScanner.sub(num1, num2);
		}
		
		System.out.println("Enter two numbers for Multiplication :");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		if(num1<0||num2<0) {
			System.out.println("Negative numbers entered");
		} else {
			 calculatorUsingScanner.mul(num1, num2);
		}
		
		System.out.println("Enter two numbers for Division :");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		if(num2<=0) {
			System.out.println("Number 2 should not be less than or equal to 0");
		} else {
			 calculatorUsingScanner.div(num1, num2);
		}
		

	}

}
