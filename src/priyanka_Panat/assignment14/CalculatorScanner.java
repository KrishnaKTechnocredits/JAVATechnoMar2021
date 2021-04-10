package priyanka_Panat.assignment14;

import java.util.Scanner;

public class CalculatorScanner {
	void add(int num1,int num2)
	{
	  int add=num1+num2;
	  System.out.println("Addition of " + num1 + " and " + num2  + " is " + add);
    }
	void sub(int num1,int num2)
	{
	  int sub=num1-num2;
	  System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + sub);
    }
	void mul(int num1,int num2)
	{
	  int mul=num1*num2;
	  System.out.println("Multiplication of " + num1 + " and " + num2  + " is " + mul);
    }
	void div(int num1,int num2)
	{
	  int div=num1/num2;
	  System.out.println("Division of " + num1 + " and " + num2 + " is " + div);
    }
	
	public static void main(String[] args) {
		CalculatorScanner calculatorscanner=new CalculatorScanner();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		calculatorscanner.add(a, b);
		calculatorscanner.sub(a, b);
		calculatorscanner.mul(a, b);
		calculatorscanner.div(a, b);
		}

}

